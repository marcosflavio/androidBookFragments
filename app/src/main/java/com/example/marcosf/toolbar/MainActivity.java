package com.example.marcosf.toolbar;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.example.marcosf.toolbar.com.example.marcosf.fragments.Fragment1;
import com.example.marcosf.toolbar.com.example.marcosf.fragments.Fragment2;
import com.example.marcosf.toolbar.com.example.marcosf.fragments.Fragment3;

public class MainActivity extends AppCompatActivity {

    @SuppressWarnings("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_layout);
        //Aqui é a mágica, a toobar será a action bar
//        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
//        toolbar.setTitle("Titulo");
//        setSupportActionBar(toolbar);
            ActionBar actionBar = getSupportActionBar();
            actionBar.setTitle("Título");
            actionBar.setSubtitle("Sub-título");
            actionBar.setIcon(R.mipmap.ic_launcher);


        actionBar.setNavigationMode(android.app.ActionBar.NAVIGATION_MODE_TABS);

        //TAB1
        ActionBar.Tab tab1 = actionBar.newTab().setText("Tab 1");
        tab1.setTabListener(new MyTabListener(this,new Fragment1()));
        actionBar.addTab(tab1);



        //TAB 2
        ActionBar.Tab tab2 = actionBar.newTab().setText("Tab 2");
        tab2.setTabListener(new MyTabListener(this,new Fragment2()));
        actionBar.addTab(tab2);

        //TAB 3
        ActionBar.Tab tab3 = actionBar.newTab().setText("Tab 3");
        tab3.setTabListener(new MyTabListener(this,new Fragment3()));
        actionBar.addTab(tab3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);

    }
}
