package com.alphonso.finalproject;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
    }
    public void toastRecent(View v){

            final EditText editText = new EditText(this);
            AlertDialog.Builder inputDialog = new AlertDialog.Builder(this);
            inputDialog.setTitle("Search for your vehicle").setView(editText);
            inputDialog.setPositiveButton("Search", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    String word = editText.getText().toString().toLowerCase();
                    if (word.equalsIgnoreCase("audi")) {
                        Intent intent = new Intent(MainActivity.this, AudiActivity.class);
                        startActivity(intent);
                    }
                    if (word.equalsIgnoreCase("bmw")) {
                        Intent intent = new Intent(MainActivity.this, BmwActivity.class);
                        startActivity(intent);
                    }
                    if (word.equalsIgnoreCase("lexus")) {
                        Intent intent = new Intent(MainActivity.this, LexusActivity.class);
                        startActivity(intent);
                    }
                    if (word.equalsIgnoreCase("mercedes")) {
                        Intent intent = new Intent(MainActivity.this, MercActivity.class);
                        startActivity(intent);
                    }
                    if (word.equalsIgnoreCase("porsche")) {
                        Intent intent = new Intent(MainActivity.this, PorscheActivity.class);
                        startActivity(intent);
                    }
                    Toast.makeText(getApplicationContext(), editText.getText().toString().toLowerCase(), Toast.LENGTH_SHORT).show();
                }
            });
            inputDialog.setNegativeButton("Cancel", null).show();

        Toast.makeText(getApplicationContext(), "Search", Toast.LENGTH_SHORT).show();
    }
    public void toastBrowse(View v){
        Toast.makeText(getApplicationContext(), "Browse", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, BrowseActivity.class);
        startActivity(intent);

    }

    int choice = 0;
    public void singleChoiceDialog() {
        final String[] items = {"Yes", "No"};
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Do you like the app?");
        builder.setIcon(R.mipmap.ic_launcher);
        builder.setSingleChoiceItems(items, choice, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                choice = which;
            }
        });

        builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Thanks for your input!", Toast.LENGTH_SHORT).show();
            }
        });

        builder.show();
    }
    }

