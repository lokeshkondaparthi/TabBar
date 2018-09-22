package tech.procon.tabbar;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class TabsAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    private List<String> fragmenTitletList;

    public TabsAdapter(FragmentManager fm) {
        super(fm);
        fragmentList = new ArrayList<>();
        fragmenTitletList = new ArrayList<>();
    }

    @Override
    public Fragment getItem(int i) {
        return fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        fragmentList.add(fragment);
        fragmenTitletList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmenTitletList.get(position);
    }
}
