package com.example.marcosf.toolbar;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;

import com.example.marcosf.toolbar.com.example.marcosf.fragments.Fragment1;

/**
 * Created by marcosf on 28/07/2016.
 */
public class MyTabListener implements ActionBar.TabListener {
    private Context context;
    private Fragment fragment;

    public MyTabListener(Context context, Fragment frag) {
        this.context = context;
        this.fragment = frag;
    }

    @Override
    public void onTabSelected(ActionBar.Tab tab, FragmentTransaction ft) {
            //Troca o fragment dinamicamente ao clicar na tab
        ft.replace(R.id.layoutfrag, this.fragment,null);
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction ft) {
        //faz algo aqui
    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, FragmentTransaction ft) {
        //faz outra coisa aqui
    }
}
