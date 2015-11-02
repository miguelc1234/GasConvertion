package com.cditi.sena.conversiones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

import com.cditi.sena.gasconvertion.R;

import java.text.DecimalFormat;

public class Superficie extends AppCompatActivity
{
    EditText editM2;
    EditText editPlg2;
    EditText editFt2;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_superficie);

        editM2 = (EditText) findViewById(R.id.editM2);
        editPlg2 = (EditText) findViewById(R.id.editPlg2);
        editFt2 = (EditText) findViewById(R.id.editFt2);

        //Conversion para el Campo m2
        editM2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opM2(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo plg2

        editPlg2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opPlg2(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Ft2

        editFt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opFt2(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opM2(CharSequence charSequence)
    {
        if(editM2.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editPlg2.setText("");
                editFt2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg2
                editPlg2.setText(df.format(valorIngresado * 1550).replace(",","."));
                //Convertir a Ft2
                editFt2.setText(df.format(valorIngresado * 10.764).replace(",", "."));
            }
        }
    }

    public void opPlg2(CharSequence charSequence)
    {
        if(editPlg2.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM2.setText("");
                editFt2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg2
                editM2.setText(df.format(valorIngresado * 0.0006451).replace(",","."));
                //Convertir a Ft2
                editFt2.setText(df.format(valorIngresado * 0.006944).replace(",", "."));
            }
        }
    }

    public void opFt2(CharSequence charSequence)
    {
        if(editFt2.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM2.setText("");
                editPlg2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg2
                editM2.setText(df.format(valorIngresado * 0.0929).replace(",","."));
                //Convertir a Ft2
                editPlg2.setText(df.format(valorIngresado * 144).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_superficie, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
