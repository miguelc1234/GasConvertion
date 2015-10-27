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

public class Temperatura extends AppCompatActivity
{
    EditText editC;
    EditText editK;
    EditText editF;
    EditText editR;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        editC = (EditText) findViewById(R.id.editC);
        editK = (EditText) findViewById(R.id.editK);
        editF = (EditText) findViewById(R.id.editF);
        editR = (EditText) findViewById(R.id.editR);

        //Conversion para el Campo C°
        editC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opC(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo K°

        editK.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opK(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo F°

        editF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opF(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo R°

        editR.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opR(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opC(CharSequence charSequence)
    {
        if(editC.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editK.setText("");
                editF.setText("");
                editR.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editK.setText(df.format(valorIngresado + 273).replace(",","."));
                //Convertir a atm
                editF.setText(df.format((1.8 * valorIngresado) + 32).replace(",", "."));
                //Convertir a Psi
                editR.setText(df.format(valorIngresado * 1.8).replace(",", "."));
            }
        }
    }

    public void opK(CharSequence charSequence)
    {
        if(editK.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editC.setText("");
                editF.setText("");
                editR.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editC.setText(df.format(valorIngresado - 273).replace(",","."));
                //Convertir a atm
                editF.setText(df.format((1.8 * valorIngresado) + 32).replace(",", "."));
                //Convertir a Psi
                editR.setText(df.format(valorIngresado * 1.8).replace(",", "."));
            }
        }
    }

    public void opF(CharSequence charSequence)
    {
        if(editF.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editC.setText("");
                editK.setText("");
                editR.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editC.setText(df.format((valorIngresado - 32) / 1.8).replace(",","."));
                //Convertir a atm
                editK.setText(df.format(valorIngresado + 273).replace(",", "."));
                //Convertir a Psi
                editR.setText(df.format(valorIngresado + 469.67).replace(",", "."));
            }
        }
    }

    public void opR(CharSequence charSequence)
    {
        if(editR.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editC.setText("");
                editK.setText("");
                editF.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editC.setText(df.format((valorIngresado - 32) / 1.8).replace(",", "."));
                //Convertir a atm
                editK.setText(df.format(valorIngresado / 1.8).replace(",", "."));
                //Convertir a Psi
                editF.setText(df.format(valorIngresado - 469.67).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperatura, menu);
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
