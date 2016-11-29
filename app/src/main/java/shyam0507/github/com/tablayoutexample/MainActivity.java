package shyam0507.github.com.tablayoutexample;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TableLayout;

import java.util.ArrayList;
import java.util.List;

import shyam0507.github.com.tablayoutexample.fragments.FirstFragmnet;
import shyam0507.github.com.tablayoutexample.fragments.SecondFragmnet;
import shyam0507.github.com.tablayoutexample.fragments.ThirdFragmnet;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.viewPager);
        setupViewPager(viewPager);

        tab = (TabLayout) findViewById(R.id.tab);
        tab.setupWithViewPager(viewPager);
    }


    //method to set the view pager adapter
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //start adding the fragment to the adapter
        adapter.addFragment(new FirstFragmnet(), "First");
        adapter.addFragment(new SecondFragmnet(), "Second");
        adapter.addFragment(new ThirdFragmnet(), "Third");

        viewPager.setAdapter(adapter);//set the custom adapter for the view pager

    }

    /*
    Class for the view pager adapter
     */

    private class ViewPagerAdapter extends FragmentPagerAdapter {

        //list for the fragment and fragment title
        private List<Fragment> fragmentList = new ArrayList<>();
        private List<String> fragmentTitleList = new ArrayList<>();

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return fragmentList.get(position);
        }

        @Override
        public int getCount() {
            return fragmentList.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return fragmentTitleList.get(position);
        }

        //for add int data to the list
        private void addFragment(Fragment fragment, String title) {
            fragmentList.add(fragment);
            fragmentTitleList.add(title);
        }
    }
}
