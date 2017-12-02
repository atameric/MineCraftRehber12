package com.example.atame.minecraftrehber;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    SectionsPageAdapter sectionsPageAdapter;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());








    }


    private  void setıpPAger(ViewPager viewPager){

      SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
      adapter.addFragment(new FragmentCrafting(),"Crafting");
      adapter.addFragment(new FragmentRedstone(),"RedStone");
      adapter.addFragment(new FragmentHamachi(),"Hamachi");
      viewPager.setAdapter(adapter);
    }

}
