package com.example.bottomnavigationactivitytest;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        (5 - A) get reference
        BottomNavigationView bottomNav = findViewById(R.id.bottom_navigation);
        //        (5 - C)
        // make the home fragment selected by default
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container,// pass the container of our fragment
                        new HomeFragment()).commit();


        //        (5 - B)
        // react to clicks on the items
        bottomNav.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                   @Override
                   public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                       // find out what selected via switch statment
                       Fragment selectedFragment = null;

                       switch (item.getItemId()){
                           case R.id.nav_home:
                               selectedFragment = new HomeFragment();
                               break;
                           case R.id.nav_add:
                               selectedFragment = new AddFragment();
                               break;
                           case R.id.nav_logout:
                               selectedFragment = new LogoutFragment();
                               break;

                       }
                       // now the time to show them
                       getSupportFragmentManager()
                               .beginTransaction()
                               .replace(R.id.fragment_container,// pass the container of our fragment
                                       selectedFragment).commit();
                       return true; // this mean that we want to select the return item

                   }
               }
        );
    }


}
