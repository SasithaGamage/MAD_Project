package com.example.homeadmin1;


import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewpager.widget.ViewPager;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.navigation.NavigationView;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ViewProduct extends AppCompatActivity {

    Button update;
    Button p;
    DrawerLayout drawerLayout;
    ActionBarDrawerToggle toggle;
    NavigationView navigationView;

    ViewPager viewPager;
    TabLayout nTabLayout;
    TabItem firstItem,secondItem,thirdItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_product);

        update = findViewById(R.id.edit);

        p = (Button) findViewById(R.id.dlt1);

        p.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ViewProduct.this,Pop.class));
            }
        });
        Toolbar toolbar = findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        //viewPager = findViewById(R.id.viewpager);
        nTabLayout = findViewById(R.id.tablayout);
        firstItem = findViewById(R.id.tabitem1);
        secondItem = findViewById(R.id.tabitem2);
        thirdItem = findViewById(R.id.tabitem3);

        drawerLayout = findViewById(R.id.drawer);
        navigationView = findViewById(R.id.nav_view);

        toggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        //drawerLayout.addDrawerListener(toggle);
        toggle.setDrawerIndicatorEnabled(true);
        //toggle.syncState();
    }
    @Override
    protected void onResume() {

        super.onResume();
        update.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(ViewProduct.this,Update.class);
                startActivity(intent);
            }
        });
    }
}