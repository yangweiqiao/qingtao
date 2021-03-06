package com.zhoumai.qingtao.view.adapter;

import java.util.List;
  
import android.content.Context;  
import android.support.v7.widget.RecyclerView;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.View.OnClickListener;  
import android.view.ViewGroup;  
import android.widget.ImageView;  
import android.widget.TextView;

import com.zhoumai.qingtao.R;

public class GalleryAdapter extends  
        RecyclerView.Adapter<GalleryAdapter.ViewHolder>  
{  
  
    /** 
     * ItemClick的回调接口 
     * @author ywq
     * 
     */  
    public interface OnItemClickLitener  
    {  
        void onItemClick(View view, int position);  
    }  
  
    private OnItemClickLitener mOnItemClickLitener;  
  
    public void setOnItemClickLitener(OnItemClickLitener mOnItemClickLitener)  
    {  
        this.mOnItemClickLitener = mOnItemClickLitener;  
    }  
  
    private LayoutInflater mInflater;  
    private List<?> mDatas;
  
    public GalleryAdapter(Context context, List<?> datats)
    {  
        mInflater = LayoutInflater.from(context);  
        mDatas = datats;  
    }  
  
    public static class ViewHolder extends RecyclerView.ViewHolder  
    {  
        public ViewHolder(View arg0)  
        {  
            super(arg0);  
        }  
  
        ImageView mImg;  
        TextView mTxt;  
    }  
  
    @Override  
    public int getItemCount()  
    {  
        return mDatas.size();  
    }  
  
    @Override  
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i)  
    {  
        View view = mInflater.inflate(R.layout.item_recyclerview,
                viewGroup, false);  
        ViewHolder viewHolder = new ViewHolder(view);  
  
        viewHolder.mImg = (ImageView) view  
                .findViewById(R.id.id_index_gallery_item_image);

        viewHolder.mTxt= (TextView) view.findViewById(R.id.id_index_gallery_item_text);
        return viewHolder;  
    }  
  
    @Override  
    public void onBindViewHolder(final ViewHolder viewHolder, final int i)  
    {  
        viewHolder.mTxt.setText(String.valueOf(mDatas.get(i)) );
  
        //如果设置了回调，则设置点击事件  
        if (mOnItemClickLitener != null)  
        {  
            viewHolder.itemView.setOnClickListener(new OnClickListener()  
            {  
                @Override  
                public void onClick(View v)  
                {  
                    mOnItemClickLitener.onItemClick(viewHolder.itemView, i);  
                }  
            });  
  
        }  
  
    }  
  
}  