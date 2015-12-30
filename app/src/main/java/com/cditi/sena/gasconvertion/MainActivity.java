package com.cditi.sena.gasconvertion;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.cditi.sena.codigo.Codigo;
import com.cditi.sena.codigo.CodigoActivacion;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        //Prefenrecias de la app
        Codigo.prefs = getSharedPreferences("MisPreferencias", Context.MODE_PRIVATE);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }

    public void Ingresar(View view)
    {
        Intent intent;
        String activacion = Codigo.prefs.getString("Activacion", "");

        switch (activacion)
        {
            case "":

                intent = new Intent(MainActivity.this, CodigoActivacion.class);
                startActivity(intent);

                break;

            case "Activado":

                intent = new Intent(MainActivity.this, MenuPrincipal.class);
                startActivity(intent);

                break;
        }
    }
}
