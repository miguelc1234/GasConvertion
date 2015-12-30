package com.cditi.sena.codigo;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.cditi.sena.gasconvertion.MenuPrincipal;
import com.cditi.sena.gasconvertion.R;

public class CodigoActivacion extends AppCompatActivity
{
    EditText editCodigoActivacion;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_codigo_activacion);

        editCodigoActivacion = (EditText) findViewById(R.id.editCodigoActivacion);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_codigo_activacion, menu);
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

    public void Activar(View view)
    {
        String codigo = editCodigoActivacion.getText().toString();

        if(codigo.equalsIgnoreCase(Codigo.codigo))
        {
            SharedPreferences.Editor editor = Codigo.prefs.edit();
            editor.putString("Activacion", "Activado");
            editor.commit();

            AlertDialog.Builder alerta = new AlertDialog.Builder(CodigoActivacion.this);
            alerta.setTitle("Activado");
            alerta.setMessage("El producto se ha activado satisfactoriamente");
            alerta.setPositiveButton("Aceptar", new DialogInterface.OnClickListener()
            {
                @Override
                public void onClick(DialogInterface dialogInterface, int i)
                {
                    Intent intent = new Intent(CodigoActivacion.this, MenuPrincipal.class);
                    startActivity(intent);
                    finish();
                }
            });
            alerta.setCancelable(false);
            alerta.show();


        }
        else
        {
            AlertDialog.Builder alerta = new AlertDialog.Builder(CodigoActivacion.this);
            alerta.setTitle("Código");
            alerta.setMessage("El código ingresado no es correcto, debe ingresar un código valido");
            alerta.setPositiveButton("Aceptar", null);
            alerta.setCancelable(false);
            alerta.show();
        }
    }
}
