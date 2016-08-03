package com.example.marcosf.toolbar.com.example.marcosf.view.pager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.marcosf.toolbar.R;

/**
 * Created by marcosf on 02/08/2016.
 */
public class ImagemPagerAdapter extends PagerAdapter {

    private Context context;
    private final int [] imagens;

    public ImagemPagerAdapter(Context context, int [] imagens){
        this.context = context;
        this.imagens = imagens;

    }

    //Quantidade de views do adapter
    @Override
    public int getCount() {
        return imagens !=null ? imagens.length : 0;
    }

    //Determina se a view informada é igual ao object retornado pelo instantiateItem
    @Override
    public boolean isViewFromObject(View view, Object object) {
        return view == object;
    }

    //Remove a view do Container
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        ((ViewPager) container).removeView((View)object);
    }

    //Infla a view

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        View view = LayoutInflater.from(this.context).inflate(R.layout.activity_view_pager,container,false);
        ImageView img = (ImageView) view.findViewById(R.id.img);
        img.setImageResource(imagens[position]);
        ((ViewGroup)container).addView(view); //adiciona ao layout viewgroup
        return view;
    }
}
