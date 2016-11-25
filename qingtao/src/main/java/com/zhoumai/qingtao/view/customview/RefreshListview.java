package com.zhoumai.qingtao.view.customview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.zhoumai.qingtao.R;

import java.text.SimpleDateFormat;
import java.util.Date;

import butterknife.BindView;


/**
 * 刷新功能的listview
 */
public class RefreshListview extends ListView {

    @BindView(R.id.pb_refresh_header_progress)
    ProgressBar pb_refresh_header_progress;
    @BindView(R.id.iv_refresh_header_arrow)
    ImageView iv_refresh_header_arrow;
    @BindView(R.id.tv_refresh_header_state)
    TextView tv_refresh_header_state;
    @BindView(R.id.tv_refresh_header_time)
    TextView tv_refresh_header_time;


    private int downY = -1;
    private int headerMeasuredHeight;
    private View header;


    /**
     * listview当前的状态
     */
    private static final int PULLDOWN_STATE = 0;// 下拉刷新状态
    private static final int RELEASE_STATE = 1;// 松开刷新状态
    private static final int REFRESHING_STATE = 2;// 松开刷新状态
    private int current_state = PULLDOWN_STATE;
    //动画效果
    private RotateAnimation up;
    private RotateAnimation down;
    private MyOnRefreshingListener listener;
    private View footer;
    private int footerMeasuredHeight;

    public RefreshListview(Context context, AttributeSet attrs) {
        super(context, attrs);
        addHeader();
        animation();
        addFooter();
    }

    private void addFooter() {
        footer = View.inflate(getContext(), R.layout.refresh_footer, null);
        // 测量脚布局
        footer.measure(0, 0);
        footerMeasuredHeight = footer.getMeasuredHeight();
        footer.setPadding(0, -footerMeasuredHeight, 0, 0);
        this.addFooterView(footer);
        // 监听Listview的滚动状态
        this.setOnScrollListener(new MyOnScrollListener());
    }

    private void animation() {
        up = new RotateAnimation(
                0, -180,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        up.setDuration(500);
        up.setFillAfter(true);
        down = new RotateAnimation(
                -180, -360,
                Animation.RELATIVE_TO_SELF, 0.5f,
                Animation.RELATIVE_TO_SELF, 0.5f);
        down.setDuration(500);
        down.setFillAfter(true);
    }

    private void addHeader() {
        header = View.inflate(getContext(), R.layout.refresh_header, null);
        // 隐藏头布局
        header.measure(0, 0);
        headerMeasuredHeight = header.getMeasuredHeight();
        header.setPadding(0, -headerMeasuredHeight, 0, 0);
        this.addHeaderView(header);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
//		System.out.println(getFirstVisiblePosition());
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                downY = (int) ev.getY();
                break;
            case MotionEvent.ACTION_MOVE:
                if (downY == -1) {
                    downY = (int) ev.getY();
                }
                int moveY = (int) ev.getY();
                // 计算手指移动的距离
                int diffY = moveY - downY;

                // 只要第一个条目完全展示时，才处理事件
                if (getFirstVisiblePosition() != 0) {
                    downY = (int) ev.getY();
                    break;
                }
                if (diffY > 0) {
                    // 计算topPadding
                    int topPadding = diffY - headerMeasuredHeight;
                    // 根据topPadding是否大于0
                    if (topPadding > 0 && current_state != RELEASE_STATE) {// 切换到松开刷新状态
                        System.out.println("切换到松开刷新状态");
                        current_state = RELEASE_STATE;
                        switchState(current_state);
                    } else if (topPadding < 0 && current_state != PULLDOWN_STATE) {// 切换到下拉刷新状态
                        System.out.println("切换到下拉刷新状态");
                        current_state = PULLDOWN_STATE;
                        switchState(current_state);
                    }

                    // 通过设置头布局的topPadding，实现头布局移动的效果
                    header.setPadding(0, topPadding, 0, 0);
                    return true;
                }
                break;
            case MotionEvent.ACTION_UP:
                downY = -1;
                if (current_state == RELEASE_STATE) {
                    System.out.println("切换到正在刷新状态");
                    current_state = REFRESHING_STATE;
                    switchState(current_state);
                    header.setPadding(0, 0, 0, 0);

                    // 调用外界处理刷新业务的方法
                    if (listener != null) {
                        listener.onRefreshing();
                    }
                } else if (current_state == PULLDOWN_STATE) {
                    header.setPadding(0, -headerMeasuredHeight, 0, 0);
                }
                break;

            default:
                break;
        }
        return super.onTouchEvent(ev);
    }

    private void switchState(int state) {
        switch (state) {
            case PULLDOWN_STATE:
                pb_refresh_header_progress.setVisibility(View.INVISIBLE);
                iv_refresh_header_arrow.setVisibility(View.VISIBLE);
                tv_refresh_header_state.setText("下拉刷新");
                iv_refresh_header_arrow.startAnimation(down);
                break;
            case RELEASE_STATE:
                tv_refresh_header_state.setText("松开刷新");
                iv_refresh_header_arrow.startAnimation(up);
                break;
            case REFRESHING_STATE:
                pb_refresh_header_progress.setVisibility(View.VISIBLE);
                iv_refresh_header_arrow.setVisibility(View.INVISIBLE);
                tv_refresh_header_state.setText("正在刷新");
                iv_refresh_header_arrow.clearAnimation();
                break;

            default:
                break;
        }
    }

    // 对外暴露接口
    public interface MyOnRefreshingListener {
        void onRefreshing();

        void onLoadingMore();
    }

    // 外界设置监听器
    public void setMyOnRefreshingListener(MyOnRefreshingListener listener) {
        this.listener = listener;
    }

    // 恢复Listview的状态
    public void refreshFinished(boolean b) {
        pb_refresh_header_progress.setVisibility(View.INVISIBLE);
        iv_refresh_header_arrow.setVisibility(View.VISIBLE);
        tv_refresh_header_state.setText("下拉刷新");
        current_state = PULLDOWN_STATE;
        header.setPadding(0, -headerMeasuredHeight, 0, 0);
        if (b) {
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = format.format(new Date());
            tv_refresh_header_time.setText("最后刷新时间：" + time);
        } else {
            Toast.makeText(getContext(), "网络不给力", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isLoadMore = false;// 当前是否已经处于加载更多

    class MyOnScrollListener implements OnScrollListener {

        @Override
        public void onScrollStateChanged(AbsListView view, int scrollState) {
            // 当处于停止状态或惯性停止状态时，
            if (scrollState == OnScrollListener.SCROLL_STATE_IDLE || scrollState == OnScrollListener.SCROLL_STATE_FLING) {
                // 是否Listview把所有数据都展示出来
                if (getLastVisiblePosition() == getCount() - 1 && !isLoadMore) {
                    isLoadMore = true;
                    // 展示脚布局
                    System.out.println("加载更多了");
                    footer.setPadding(0, 0, 0, 0);

                    // 让脚布局自动显示出来
                    setSelection(getCount());

                    // 调用外界传递进来的监听器的加载更多方法
                    if (listener != null) {
                        listener.onLoadingMore();
                    }
                }
            }
        }

        @Override
        public void onScroll(AbsListView view, int firstVisibleItem,
                             int visibleItemCount, int totalItemCount) {

        }

    }

    // 恢复加载更多状态
    public void loadMoreFinished() {
        isLoadMore = false;
        footer.setPadding(0, -footerMeasuredHeight, 0, 0);
    }
}
