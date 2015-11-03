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

public class Fuerza extends AppCompatActivity
{
    EditText editN;
    EditText editKgf;
    EditText editLbf;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fuerza);

        editN = (EditText) findViewById(R.id.editN);
        editKgf = (EditText) findViewById(R.id.editKgf);
        editLbf = (EditText) findViewById(R.id.editLbf);

        //Conversion para el Campo N
        editN.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opN(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Kgf

        editKgf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opKgf(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo Lbf

        editLbf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opLbf(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    public void opN(CharSequence charSequence)
    {
        if(editN.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgf.setText("");
                editLbf.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editKgf.setText(df.format(valorIngresado * 0.10198).replace(",","."));
                editLbf.setText(df.format(valorIngresado * 0.2246).replace(",", "."));
            }
        }
    }

    public void opKgf(CharSequence charSequence)
    {
        if(editKgf.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editN.setText("");
                editLbf.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editN.setText(df.format(valorIngresado * 9.806).replace(",","."));
                editLbf.setText(df.format(valorIngresado * 2.202).replace(",", "."));
            }
        }
    }

    public void opLbf(CharSequence charSequence)
    {
        if(editLbf.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editN.setText("");
                editKgf.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editN.setText(df.format(valorIngresado * 4.4519).replace(",","."));
                editKgf.setText(df.format(valorIngresado * 0.454).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fuerza, menu);
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
