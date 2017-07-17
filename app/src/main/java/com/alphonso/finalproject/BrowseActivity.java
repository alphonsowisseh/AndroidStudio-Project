package com.alphonso.finalproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BrowseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browse);
    }

    public void toastAudi(View v){
        Toast.makeText(getApplicationContext(), "Audi A8", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, AudiActivity.class);
        startActivity(intent);
    }

    public void toastBmw(View v){
        Toast.makeText(getApplicationContext(), "BMW 750i", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, BmwActivity.class);
        startActivity(intent);
    }
    public void toastLexus(View v){
        Toast.makeText(getApplicationContext(), "Lexus LS 500", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, LexusActivity.class);
        startActivity(intent);
    }
    public void toastMerc(View v){
        Toast.makeText(getApplicationContext(), "Mercedes-Benz S500", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, MercActivity.class);
        startActivity(intent);
    }
    public void toastPorsche(View v){
        Toast.makeText(getApplicationContext(), "Porsche Panamera", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(this, PorscheActivity.class);
        startActivity(intent);
    }
}
