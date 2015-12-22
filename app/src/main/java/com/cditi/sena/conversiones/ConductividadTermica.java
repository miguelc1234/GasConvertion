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

public class ConductividadTermica extends AppCompatActivity
{
    EditText editWM2Cm;
    EditText editBtu;
    EditText editCal;
    EditText editWCm2C;
    EditText editKcalHm2;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conductividad_termica);

        editWM2Cm = (EditText) findViewById(R.id.editWM2Cm);
        editBtu = (EditText) findViewById(R.id.editBtu);
        editCal = (EditText) findViewById(R.id.editCal);
        editWCm2C = (EditText) findViewById(R.id.editWCm2C);
        editKcalHm2 = (EditText) findViewById(R.id.editKcalHm2);

        //Conversion para el Campo WM2K
        editWM2Cm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opWM2Cm(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo Btu
        editBtu.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opBtu(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo Cal
        editCal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opCal(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo WCm2C
        editWCm2C.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opWCm2C(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo KcalHm2
        editKcalHm2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opKcalHm2(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    public void opWM2Cm(CharSequence charSequence)
    {
        if(editWM2Cm.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editBtu.setText("");
                editCal.setText("");
                editWCm2C.setText("");
                editKcalHm2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editBtu.setText(df.format(valorIngresado * 0.5779).replace(",","."));
                //Convertir a atm
                editCal.setText(df.format(valorIngresado * 0.002388).replace(",", "."));
                //Convertir a Psi
                editWCm2C.setText(df.format(valorIngresado * 0.01).replace(",", "."));
                //Convertir a Psi
                editKcalHm2.setText(df.format(valorIngresado * 0.86).replace(",", "."));
            }
        }
    }

    public void opBtu(CharSequence charSequence)
    {
        if(editBtu.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editWM2Cm.setText("");
                editCal.setText("");
                editWCm2C.setText("");
                editKcalHm2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editWM2Cm.setText(df.format(valorIngresado * 1.731).replace(",","."));
                //Convertir a atm
                editCal.setText(df.format(valorIngresado * 0.004134).replace(",", "."));
                //Convertir a Psi
                editWCm2C.setText(df.format(valorIngresado * 0.01731).replace(",", "."));
                //Convertir a Psi
                editKcalHm2.setText(df.format(valorIngresado * 1.488).replace(",", "."));
            }
        }
    }

    public void opCal(CharSequence charSequence)
    {
        if(editCal.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editWM2Cm.setText("");
                editBtu.setText("");
                editWCm2C.setText("");
                editKcalHm2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editWM2Cm.setText(df.format(valorIngresado * 418.7).replace(",","."));
                //Convertir a atm
                editBtu.setText(df.format(valorIngresado * 241.9).replace(",", "."));
                //Convertir a Psi
                editWCm2C.setText(df.format(valorIngresado * 4.187).replace(",", "."));
                //Convertir a Psi
                editKcalHm2.setText(df.format(valorIngresado * 360).replace(",", "."));
            }
        }
    }

    public void opWCm2C(CharSequence charSequence)
    {
        if(editWCm2C.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editWM2Cm.setText("");
                editBtu.setText("");
                editCal.setText("");
                editKcalHm2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editWM2Cm.setText(df.format(valorIngresado * 100).replace(",","."));
                //Convertir a atm
                editBtu.setText(df.format(valorIngresado * 57.79).replace(",", "."));
                //Convertir a Psi
                editCal.setText(df.format(valorIngresado * 0.2388).replace(",", "."));
                //Convertir a Psi
                editKcalHm2.setText(df.format(valorIngresado * 86).replace(",", "."));
            }
        }
    }

    public void opKcalHm2(CharSequence charSequence)
    {
        if(editKcalHm2.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editWM2Cm.setText("");
                editBtu.setText("");
                editCal.setText("");
                editWCm2C.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editWM2Cm.setText(df.format(valorIngresado * 1.163).replace(",","."));
                //Convertir a atm
                editBtu.setText(df.format(valorIngresado * 0.672).replace(",", "."));
                //Convertir a Psi
                editCal.setText(df.format(valorIngresado * 0.002778).replace(",", "."));
                //Convertir a Psi
                editWCm2C.setText(df.format(valorIngresado * 0.01163).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conductividad_termica, menu);
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
