package com.zhoumai.qingtao.goodslayout;

import android.content.Context;
import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {

    private ISlideCallback mISlideCallback;

    public BaseFragment() {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (!(context instanceof ISlideCallback)) {
            throw new IllegalArgumentException("Your activity must be implements ISlideCallback");
        }
        mISlideCallback = (ISlideCallback) context;
    }

    protected void open(boolean smooth) {
        mISlideCallback.openDetails(smooth);
    }

    protected void close(boolean smooth) {
        mISlideCallback.closeDetails(smooth);
    }

}