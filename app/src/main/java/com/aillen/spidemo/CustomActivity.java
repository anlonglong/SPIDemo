package com.aillen.spidemo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CustomActivity extends AppCompatActivity {

    public static void startActivity(@NotNull Activity activity){
        activity.startActivity(new Intent(activity,CustomActivity.class));
    }


    List<PageModel> getPageModels(){
        List<PageModel> pageModels = new ArrayList<>();
        pageModels.add(new PageModel("drawColor()",R.layout.practice_color));
        pageModels.add(new PageModel("drawCircle()",R.layout.practice_circle));
        pageModels.add(new PageModel("drawRec()",R.layout.practice_rec));
        pageModels.add(new PageModel("drawPoint()",R.layout.practice_point));
        pageModels.add(new PageModel("drawOval()",R.layout.practice_oval));
        pageModels.add(new PageModel("drawLine()",R.layout.practice_line));
        pageModels.add(new PageModel("drawRoundRec()",R.layout.practice_round_rec));
        pageModels.add(new PageModel("drawArc()",R.layout.practice_arc));
        pageModels.add(new PageModel("drawPath()",R.layout.practice_path));
        pageModels.add(new PageModel("柱状图",R.layout.practice_zhu));
        pageModels.add(new PageModel("饼状图",R.layout.practice_bing));
        pageModels.add(new PageModel("渐变",R.layout.practice_gradient));
        pageModels.add(new PageModel("bitmap渐变",R.layout.practice_bitmap));
        pageModels.add(new PageModel("Xfermod",R.layout.practice_xfermod));
        return pageModels;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom);
        TabLayout tabLayout = getView(R.id.tl_tab_layout);
        ViewPager viewPager = getView(R.id.vp_custom_pager);
        final List<PageModel> pageModels = getPageModels();
        viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return PagerFragment.newInstance(pageModels.get(position).practicesLayoutId);
            }

            @Override
            public int getCount() {
                return pageModels.size();
            }

            @Nullable
            @Override
            public CharSequence getPageTitle(int position) {
                return pageModels.get(position).title;
            }
        });
        tabLayout.setupWithViewPager(viewPager);
        viewPager.setCurrentItem(pageModels.size(),true);
    }

    private <T extends View> T getView(int id){
        return findViewById(id);
    }

    class PageModel {
        String title;
        int practicesLayoutId;

         PageModel(String title, int practicesLayoutId) {
            this.title = title;
            this.practicesLayoutId = practicesLayoutId;
        }
    }
}
