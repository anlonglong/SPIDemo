package com.aillen.spidemo.paintpractise;

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

import com.aillen.spidemo.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aillen
 */
public class PaintActivity extends AppCompatActivity {


    public static void startActivity(@NotNull Activity activity){
        activity.startActivity(new Intent(activity,PaintActivity.class));
    }

    List<PaintActivity.PageModel> getPageModels(){
        List<PaintActivity.PageModel> pageModels = new ArrayList<>();
        pageModels.add(new PaintActivity.PageModel("lineargrandient",R.layout.practice_line_gradient));
         return pageModels;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_custom);
            TabLayout tabLayout = getView(R.id.tl_tab_layout);
            ViewPager viewPager = getView(R.id.vp_custom_pager);
            final List<PaintActivity.PageModel> pageModels = getPageModels();
            viewPager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
                @Override
                public Fragment getItem(int position) {
                    return PaintFragment.newInstance(pageModels.get(position).practicesLayoutId);
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
            viewPager.setCurrentItem(pageModels.size(), true);
        }

        private <T extends View> T getView ( int id){
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
