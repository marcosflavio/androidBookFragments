package com.example.marcosf.toolbar.com.example.marcosf.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.marcosf.toolbar.R;

/**
 * Created by marcosf on 28/07/2016.
 */
public class Fragment2 extends android.support.v4.app.Fragment{

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2,container,false);

        //O fragment é livre para ter qualquer lógica aqui
        return view;
    }

}
