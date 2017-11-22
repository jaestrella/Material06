package com.iesvirgendelcarmen.dam.material06;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Material06 extends AppCompatActivity {
    TabLayout tabLayout;
    Button annadirTabs;
    Button quitarTabs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material06);

        tabLayout=(TabLayout)findViewById(R.id.tabLayout);

        TabLayout.Tab primerTab=tabLayout.newTab();
        primerTab.setText("TAB 01");
        primerTab.setIcon(R.mipmap.ic_launcher);
        tabLayout.addTab(primerTab);

        TabLayout.Tab segundoTab=tabLayout.newTab();
        segundoTab.setText("TAB 02");
        segundoTab.setIcon(R.drawable.icono1);
        tabLayout.addTab(segundoTab);

        final TabLayout.Tab tercerTab=tabLayout.newTab();
        tercerTab.setText("TAB 03");
        tercerTab.setIcon(R.drawable.icono2);
        tabLayout.addTab(tercerTab,1,true);

        //tabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        //tabLayout.setTabMode(TabLayout.MODE_FIXED);
        //tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
        //tabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        //tabLayout.setTabTextColors(Color.RED,Color.WHITE);
        //tabLayout.setSelectedTabIndicatorColor(Color.GREEN);
        //tabLayout.setSelectedTabIndicatorHeight(20);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int elegida=tabLayout.getSelectedTabPosition();
                Toast.makeText(getApplicationContext(),"HA TOCADO LA "+elegida,Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        annadirTabs=(Button)findViewById(R.id.añadirTabs);
        annadirTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tabLayout.getTabCount()!=6){
                    tabLayout.addTab(tabLayout.newTab().setText("TAB"));
                }else {
                    Toast.makeText(getApplicationContext(), "NO PUEDE AÑADIR MAS TABS", Toast.LENGTH_SHORT).show();
                }
            }
        });

        quitarTabs=(Button)findViewById(R.id.quitarTabs);
        quitarTabs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(tabLayout.getTabCount()==2){
                    Toast.makeText(getApplicationContext(), "NO PUEDE ELIMINAR MAS TABS", Toast.LENGTH_SHORT).show();
                }else if(tabLayout.getTabCount()==6) {
                    tabLayout.removeTabAt(5);
                }else if(tabLayout.getTabCount()==5) {
                    tabLayout.removeTabAt(4);
                }else if(tabLayout.getTabCount()==4) {
                    tabLayout.removeTabAt(3);
                }else if(tabLayout.getTabCount()==3) {
                    tabLayout.removeTabAt(2);
                }
            }
        });
    }
}
