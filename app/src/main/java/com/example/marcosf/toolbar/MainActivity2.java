package com.example.marcosf.toolbar;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.widget.Toast;

import com.example.marcosf.toolbar.com.example.marcosf.view.pager.ImagemPagerAdapter;

/**
 * Created by marcosf on 02/08/2016.
 */
public class MainActivity2 extends Activity {
    //Planetas
    private int [] imagenes = {R.drawable.mercurio,R.drawable.venu,R.drawable.terra,
            R.drawable.marte,R.drawable.jupiter,R.drawable.saturno,R.drawable.urano,
            R.drawable.netuno,R.drawable.plutao};

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        ViewPager g = (ViewPager)findViewById(R.id.viewpager);
        g.setAdapter(new ImagemPagerAdapter(this,imagenes));
        g.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            //informa que determinada pagina foi selecionada
            @Override
            public void onPageSelected(int position) {
                Toast t = Toast.makeText(getBaseContext(), "Imagem "+ position, Toast.LENGTH_SHORT);
                t.show();
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
