//This is the FIRST PAGE 1

package com.afiq520.foodhunter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainHome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

    //Button mybutton=(Button) findViewById(R.id.button2);
   // mybutton.setOnClickListener(new View.OnClickListener() {
       // @Override
       // public void onClick() {
        //    Intent myIntent=new Intent(this,SearchActivity.class);
         //   startActivity(myIntent);

       // }
   // });
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_home);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

}
