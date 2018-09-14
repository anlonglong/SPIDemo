package com.aillen.spidemo.paintpractise;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;

import com.aillen.spidemo.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PaintFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class PaintFragment extends Fragment {

    private static final String BUNDLE_ARG_PARAM = "layoutId";
    private Integer mLayoutId;

    public PaintFragment() { }


    public static PaintFragment newInstance(Integer layputResId) {
        PaintFragment fragment = new PaintFragment();
        Bundle args = new Bundle();
        args.putInt(BUNDLE_ARG_PARAM, layputResId);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mLayoutId = getArguments().getInt(BUNDLE_ARG_PARAM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_paint, container, false);
        ViewStub viewStub = view.findViewById(R.id.vs_view_stub);
        viewStub.setLayoutResource(mLayoutId);
        viewStub.inflate();
        return view;
    }

}
