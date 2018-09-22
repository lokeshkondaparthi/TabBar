package tech.procon.tabbar;

import android.support.design.widget.TabLayout;
import android.support.v4.view.PagerTitleStrip;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager mViewPager;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.view_pager);
        tabLayout = findViewById(R.id.tabs);
        TabsAdapter adapter = new TabsAdapter(getSupportFragmentManager());
        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();
        adapter.addFragment(firstFragment, "TakeAway");
        adapter.addFragment(secondFragment, "On Delivery");
        mViewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(mViewPager);
    }


}
