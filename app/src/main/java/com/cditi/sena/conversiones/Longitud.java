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

public class Longitud extends AppCompatActivity
{
    EditText editM;
    EditText editPlg;
    EditText editFt;
    EditText editMilla;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);

        editM = (EditText) findViewById(R.id.editM);
        editPlg = (EditText) findViewById(R.id.editPlg);
        editFt = (EditText) findViewById(R.id.editFt);
        editMilla = (EditText) findViewById(R.id.editMilla);

        //Conversion para el Campo m
        editM.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opM(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo plg

        editPlg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opPlg(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Ft

        editFt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opFt(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo milla

        editMilla.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opMilla(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opM(CharSequence charSequence)
    {
        if(editM.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editPlg.setText("");
                editFt.setText("");
                editMilla.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editPlg.setText(df.format(valorIngresado * 39.37).replace(",","."));
                //Convertir a atm
                editFt.setText(df.format(valorIngresado * 3.2808).replace(",", "."));
                //Convertir a Psi
                editMilla.setText(df.format(valorIngresado * 0.0006214).replace(",", "."));
            }
        }
    }

    public void opPlg(CharSequence charSequence)
    {
        if(editPlg.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM.setText("");
                editFt.setText("");
                editMilla.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editM.setText(df.format(valorIngresado * 0.0254).replace(",","."));
                //Convertir a atm
                editFt.setText(df.format(valorIngresado * 0.08333).replace(",", "."));
                //Convertir a Psi
                editMilla.setText(df.format(valorIngresado * 0.0000158).replace(",", "."));
            }
        }
    }

    public void opFt(CharSequence charSequence)
    {
        if(editFt.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM.setText("");
                editPlg.setText("");
                editMilla.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editM.setText(df.format(valorIngresado * 0.3048).replace(",","."));
                //Convertir a atm
                editPlg.setText(df.format(valorIngresado * 12).replace(",", "."));
                //Convertir a Psi
                editMilla.setText(df.format(valorIngresado * 0.00018939).replace(",", "."));
            }
        }
    }

    public void opMilla(CharSequence charSequence)
    {
        if(editMilla.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM.setText("");
                editPlg.setText("");
                editFt.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editM.setText(df.format(valorIngresado * 1610).replace(",","."));
                //Convertir a atm
                editPlg.setText(df.format(valorIngresado * 63360).replace(",", "."));
                //Convertir a Psi
                editFt.setText(df.format(valorIngresado * 5280).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_longitud, menu);
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
