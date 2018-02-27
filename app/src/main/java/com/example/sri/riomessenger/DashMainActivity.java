package com.example.sri.riomessenger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.design.widget.TabLayout.OnTabSelectedListener;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DashMainActivity extends AppCompatActivity {
    public boolean isFABOpen=false;
    FloatingActionButton cam_fab;
    FloatingActionButton gall_fab;
        private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dash_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout =  findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));
        tabLayout.setTabTextColors(ContextCompat.getColorStateList(this, R.color.colorPrimaryLight));



        FloatingActionButton fab = findViewById(R.id.post);
        cam_fab=findViewById(R.id.camera);
        gall_fab=findViewById(R.id.gallery);
        cam_fab.setVisibility(View.INVISIBLE);
        gall_fab.setVisibility(View.INVISIBLE);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!isFABOpen){
                    showFABMenu();
                }else{
                    closeFABMenu();
                }
            }
        });

        //for animating floating action button
        tabLayout.addOnTabSelectedListener(new OnTabSelectedListener() {
            FloatingActionButton call_btn=findViewById(R.id.call);
            FloatingActionButton chat_btn=findViewById(R.id.chat_fab);
            FloatingActionButton post_btn=findViewById(R.id.post);
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int position = tab.getPosition();
                switch (position) {
                    case 0:
                        mViewPager.setCurrentItem(tab.getPosition());
                        cam_fab.setVisibility(View.INVISIBLE);
                        gall_fab.setVisibility(View.INVISIBLE);
                        post_btn.show();
                        call_btn.hide();
                        chat_btn.hide();
                        break;

                    case 1:

                        mViewPager.setCurrentItem(tab.getPosition());
                        cam_fab.setVisibility(View.INVISIBLE);
                        gall_fab.setVisibility(View.INVISIBLE);
                        post_btn.hide();
                        call_btn.hide();
                        chat_btn.show();
                        break;


                    case 2:

                        mViewPager.setCurrentItem(tab.getPosition());
                        cam_fab.setVisibility(View.INVISIBLE);
                        gall_fab.setVisibility(View.INVISIBLE);
                        chat_btn.hide();
                        post_btn.hide();
                        call_btn.show();
                        break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {


            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
    private void showFABMenu(){
        isFABOpen=true;
        cam_fab.animate().translationY(-getResources().getDimension(R.dimen.standard_55));
        gall_fab.animate().translationY(-getResources().getDimension(R.dimen.standard_105));
        cam_fab.setVisibility(View.VISIBLE);
        gall_fab.setVisibility(View.VISIBLE);

    }

    private void closeFABMenu(){
        isFABOpen=false;
        cam_fab.animate().translationY(0);
        gall_fab.animate().translationY(0);
        cam_fab.setVisibility(View.INVISIBLE);
        gall_fab.setVisibility(View.INVISIBLE);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_dash_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();


        if (id == R.id.add_friend) {
            /*Intent intent=new Intent(this,add_friend.class);
            startActivity(intent);
            return true;*/

        }

        return super.onOptionsItemSelected(item);

    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch(position){
                case 0:
                    return new postTab();

                case 1:
                    return new messageTab();

                case 2:
                    return new callTab();

                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 3;
        }
    }
}
