package com.pupup.viewpager2

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout : TabLayout = findViewById(R.id.tabLayout)  // get reference to TabLayout
        val viewPager : ViewPager = findViewById(R.id.viewPager)    // get reference to ViewPager

        // make  a object to ViewPagerAdatpter class and after that assign value in its property
        val pagerAdapter = ViewPagerAdapter(supportFragmentManager)
        pagerAdapter.fragment.add(Fragment1()) // add Fragment
        pagerAdapter.fragment.add(Fragment2()) // add Fragment
        pagerAdapter.fragment.add(Fragment3()) // add Fragment
        pagerAdapter.fragment.add(Fragment4()) // add Fragment



//
//        pagerAdapter.tittle.add("Tab 1")    // add tittle
//        pagerAdapter.tittle.add("Tab 2")    // add tittle
//        pagerAdapter.tittle.add("Tab 3")    // add tittle
//        pagerAdapter.tittle.add("Tab 4")

        viewPager.adapter = pagerAdapter  // assign pager adapter in ViewPager element
        tabLayout.setupWithViewPager(viewPager)

        tabLayout.getTabAt(0)?.setIcon(R.drawable.baseline_store_mall_directory_24)
        tabLayout.getTabAt(1)?.text = "Tab 2"
        tabLayout.getTabAt(2)?.text = "Tab 3"
        tabLayout.getTabAt(3)?.text = "Tab 4"
    }
}