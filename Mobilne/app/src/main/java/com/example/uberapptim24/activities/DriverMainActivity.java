package com.example.uberapptim24.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.uberapptim24.R;
import com.example.uberapptim24.fragments.driver.DriverAccountFragment;
import com.example.uberapptim24.fragments.driver.DriverHomeFragment;
import com.example.uberapptim24.fragments.driver.DriverInboxFragment;
import com.example.uberapptim24.fragments.driver.DriverRideHistoryFragment;
import com.google.android.material.navigation.NavigationView;

public class DriverMainActivity extends AppCompatActivity
{
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    NavigationView navigation;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_main);

        //setup custom toolbar
        toolbar = findViewById(R.id.toolbar_driver);//custom toolbar
        setSupportActionBar(toolbar);

        //set home fragment as active
        replaceFragment(new DriverHomeFragment());
        toolbar.setTitle(R.string.nav_menu_home);//set toolbar title


        drawerLayout = findViewById(R.id.driver_main_drawer);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, R.string.nav_open, R.string.nav_close); //add tollbar button
        drawerLayout.addDrawerListener(actionBarDrawerToggle);  //set listener for the "hamburger menu" button
        actionBarDrawerToggle.syncState(); // not sure

        ActionBar actionBar = getSupportActionBar();
        if(actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true); //show the button
            actionBar.setHomeAsUpIndicator(R.drawable.ic_hamburger);//HAMBURGER HAMBURGER HAMBURGER custom icon for toolbar home button
        }

        navigation = findViewById(R.id.nav_menu_driver); //the menu inside the drawer
        navigation.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent;
                switch (item.getItemId()) {
                    case R.id.nav_acc_history:
                        Toast.makeText(DriverMainActivity.this, R.string.nav_menu_acc_history, Toast.LENGTH_SHORT).show();
                        toolbar.setTitle(R.string.nav_menu_acc_history);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        replaceFragment(new DriverAccountFragment());
                        break;
                    case R.id.nav_drive_history:
                        Toast.makeText(DriverMainActivity.this, R.string.nav_menu_drive_history, Toast.LENGTH_SHORT).show();
                        toolbar.setTitle(R.string.nav_menu_drive_history);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        replaceFragment(new DriverRideHistoryFragment());
                        break;
                    case R.id.nav_inbox:
                        Toast.makeText(DriverMainActivity.this, R.string.nav_menu_inbox, Toast.LENGTH_SHORT).show();
                        toolbar.setTitle(R.string.nav_menu_inbox);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        replaceFragment(new DriverInboxFragment());
                        break;
                    case R.id.nav_home:
                        Toast.makeText(DriverMainActivity.this, R.string.nav_menu_home, Toast.LENGTH_SHORT).show();
                        toolbar.setTitle(R.string.nav_menu_home);
                        drawerLayout.closeDrawer(GravityCompat.START);
                        replaceFragment(new DriverHomeFragment());
                        break;
                    case R.id.nav_logout:
                        Toast.makeText(DriverMainActivity.this, R.string.logout, Toast.LENGTH_SHORT).show();
                        finish();
                        break;
                }
                return true;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (actionBarDrawerToggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void replaceFragment(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.driver_main_layout, fragment);
        fragmentTransaction.commit();
    }

    @Override
    protected void onStart()
    {
        super.onStart();
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
    }

    @Override
    protected void onStop()
    {
        super.onStop();
    }

    @Override
    protected void onDestroy()
    {
        super.onDestroy();
    }
}