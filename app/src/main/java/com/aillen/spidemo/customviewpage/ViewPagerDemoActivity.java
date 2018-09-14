package com.aillen.spidemo.customviewpage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.aillen.spidemo.R;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class ViewPagerDemoActivity extends AppCompatActivity {


    public static void startActivity(@NotNull Activity activity){
        activity.startActivity(new Intent(activity,ViewPagerDemoActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager_demo);
        System.out.println(isOdd(42));
        System.out.println(isOdd(43));
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(R.drawable.malin);
        integers.add(R.drawable.malin);
        integers.add(R.drawable.malin);
        integers.add(R.drawable.malin);
        integers.add(R.drawable.malin);
        ViewPager viewPager = findViewById(R.id.vp_view_pager);
        viewPager.setOffscreenPageLimit(2);
        viewPager.setPageMargin(30);
        viewPager.setAdapter(new MyPagerAdapter(integers));
        viewPager.setPageTransformer(false, new ViewPager.PageTransformer() {
            @Override
            public void transformPage(@NonNull View page, float position) {
                System.out.println("page = [" + page.getTag() + "], position = [" + position + "]");
                if (position < -1 || position > 1) {
                    page.animate().alpha(0.5f).setDuration(100).start();
                    page.animate().scaleY(0.8f).setDuration(100).start();
                    page.animate().scaleX(0.8f).setDuration(100).start();
                }else if (position <= 1){
                    if (position < 0) {
                        page.animate().scaleY(0.8f).setDuration(100).start();
                        page.animate().scaleX(0.8f).setDuration(100).start();
                    } else {
                        page.animate().alpha(1f).setDuration(100).start();
                        page.animate().scaleY(1f).setDuration(100).start();
                        page.animate().scaleX(1f).setDuration(100).start();
                    }
                }
            }
        });

    }

    String isOdd(int num) {
        return (Integer.parseInt(Integer.toBinaryString(num)) & 0b1) == 0 ? "偶数":"奇数";
    }

    public static class MyPagerAdapter extends PagerAdapter {

        ArrayList<Integer> integers;

        public MyPagerAdapter(ArrayList<Integer> integers) {
            this.integers = integers;
        }

        @Override
        public int getCount() {
            return integers.size();
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {
            ImageView imageView = new ImageView(container.getContext());
            imageView.setImageResource(integers.get(position));
            imageView.setTag(position);
            container.addView(imageView);
            return imageView;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
            return view == object;
        }
    }
}
