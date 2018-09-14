package com.aillen.spidemo;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

/**
 * @author anlonglong on 2018/8/14.
 * Email： 940752944@qq.com
 */
public class PagerFragment extends Fragment {

    private static final String PRACTICES_LAYOUT_ID = "plid";
    private @LayoutRes int mLayoutId;

    public static PagerFragment newInstance(int practicesLayoutId) {
        Bundle args = new Bundle();
        args.putInt(PRACTICES_LAYOUT_ID, practicesLayoutId);
        PagerFragment fragment = new PagerFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle arguments = getArguments();
        if (null != arguments) {
            mLayoutId = arguments.getInt(PRACTICES_LAYOUT_ID);
        }
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pager_fragment, container,false);
        ViewStub viewStub = view.findViewById(R.id.vs_view_stub);
        viewStub.setLayoutResource(mLayoutId);
        viewStub.inflate();
        return view;
    }
}
