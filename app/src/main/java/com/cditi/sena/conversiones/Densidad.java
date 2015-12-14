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

public class Densidad extends AppCompatActivity
{
    EditText editKgM3;
    EditText editLbFt3;
    EditText editLbPlg3;
    EditText editGCm3;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_densidad);

        editKgM3 = (EditText) findViewById(R.id.editKgM3);
        editLbFt3 = (EditText) findViewById(R.id.editLbFt3);
        editLbPlg3 = (EditText) findViewById(R.id.editLbPlg3);
        editGCm3 = (EditText) findViewById(R.id.editGCm3);

        //Conversion para el Campo KgM3
        editKgM3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKgM3(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo LbFt3
        editLbFt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLbFt3(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo LbPlg3
        editLbPlg3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLbPlg3(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo GCm3
        editGCm3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opGCm3(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opKgM3(CharSequence charSequence)
    {
        if(editKgM3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editLbFt3.setText("");
                editLbPlg3.setText("");
                editGCm3.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editLbFt3.setText(df.format(valorIngresado / 16.019).replace(",","."));
                //Convertir a atm
                editLbPlg3.setText(df.format((valorIngresado / 1000) * 0.03612717).replace(",", "."));
                //Convertir a Psi
                editGCm3.setText(df.format(valorIngresado / 1000).replace(",", "."));
            }
        }
    }

    public void opLbFt3(CharSequence charSequence)
    {
        if(editLbFt3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgM3.setText("");
                editLbPlg3.setText("");
                editGCm3.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgM3.setText(df.format(valorIngresado * 16.019).replace(",","."));
                //Convertir a atm
                editLbPlg3.setText(df.format((valorIngresado * 0.016019) * 0.03612717).replace(",", "."));
                //Convertir a Psi
                editGCm3.setText(df.format(valorIngresado / 62.42586).replace(",", "."));
            }
        }
    }

    public void opLbPlg3(CharSequence charSequence)
    {
        if(editLbPlg3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgM3.setText("");
                editLbFt3.setText("");
                editGCm3.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgM3.setText(df.format(valorIngresado / 0.0000361272).replace(",","."));
                //Convertir a atm
                editLbFt3.setText(df.format(valorIngresado / 0.00057872).replace(",", "."));
                //Convertir a Psi
                editGCm3.setText(df.format(valorIngresado * 27.68).replace(",", "."));
            }
        }
    }

    public void opGCm3(CharSequence charSequence)
    {
        if(editGCm3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgM3.setText("");
                editLbFt3.setText("");
                editLbPlg3.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgM3.setText(df.format(valorIngresado * 1000).replace(",","."));
                //Convertir a atm
                editLbFt3.setText(df.format((valorIngresado * 1000) * 0.06242586).replace(",", "."));
                //Convertir a Psi
                editLbPlg3.setText(df.format(valorIngresado / 27.68).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_densidad, menu);
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
