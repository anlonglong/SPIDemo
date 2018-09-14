package com.aillen.spidemo.drawtext

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentPagerAdapter
import com.aillen.spidemo.PagerFragment
import com.aillen.spidemo.R
import kotlinx.android.synthetic.main.activity_draw_text.*

class DrawTextActivity : AppCompatActivity() {

    companion object {
        fun start(ctx: Context) {
            ctx.startActivity(Intent(ctx, DrawTextActivity::class.java))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_draw_text)
        vp_custom_pager.adapter = object : FragmentPagerAdapter(supportFragmentManager) {
            override fun getItem(position: Int): Fragment {
                return PagerFragment.newInstance(getPageModels()[position].practicesLayoutId)
            }

            override fun getCount(): Int {
                return getPageModels().size
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return getPageModels()[position].title
            }
        }
        tl_tab_layout.setupWithViewPager(vp_custom_pager)
        vp_custom_pager.setCurrentItem(getPageModels().size, true)
    }

    fun getPageModels() : MutableList<PageModel> {
        val list = mutableListOf<PageModel>()
        list.add(PageModel("draw文字",R.layout.practice_draw_text))
        return list
    }

     inner class PageModel(var title: String, var practicesLayoutId: Int)
}
