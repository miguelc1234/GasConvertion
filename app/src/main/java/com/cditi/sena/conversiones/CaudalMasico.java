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

public class CaudalMasico extends AppCompatActivity
{

    EditText editKgH;
    EditText editKgS;
    EditText editGH;
    EditText editGS;
    EditText editLbH;
    EditText editLbS;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caudal_masico);

        editKgH = (EditText) findViewById(R.id.editKgH);
        editKgS = (EditText) findViewById(R.id.editKgS);
        editGH = (EditText) findViewById(R.id.editGH);
        editGS = (EditText) findViewById(R.id.editGS);
        editLbH = (EditText) findViewById(R.id.editLbH);
        editLbS = (EditText) findViewById(R.id.editLbS);

        //Conversion para el Campo KgH
        editKgH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opKgH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo KgS
        editKgS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opKgS(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo GH
        editGH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opGH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo GS
        editGS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opGS(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo LbH
        editLbH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opLbH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo LbS
        editLbS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opLbS(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    public void opKgH(CharSequence charSequence)
    {
        if(editKgH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgS.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgS.setText(df.format(valorIngresado / 3600).replace(",","."));
                //Convertir a atm
                editGH.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format((valorIngresado * 1000) / 3600).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado / 0.453).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format((valorIngresado * 2.2075) * 0.0002778).replace(",", "."));
            }
        }
    }

    public void opKgS(CharSequence charSequence)
    {
        if(editKgS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado * 3600).replace(",","."));
                //Convertir a atm
                editGH.setText(df.format((valorIngresado * 1000) * 3600).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado / 0.000125833).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado * 2.207505519).replace(",", "."));
            }
        }
    }

    public void opGH(CharSequence charSequence)
    {
        if(editGH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGS.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado / 1000).replace(",","."));
                //Convertir a atm
                editKgS.setText(df.format(valorIngresado / 3600000).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado / 3600).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format((valorIngresado / 1000) * 2.207505519).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado / 1630800).replace(",", "."));
            }
        }
    }

    public void opGS(CharSequence charSequence)
    {
        if(editGS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGH.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format((valorIngresado / 1000) * 3600).replace(",", "."));
                //Convertir a atm
                editKgS.setText(df.format(valorIngresado / 1000).replace(",", "."));
                //Convertir a Psi
                editGH.setText(df.format(valorIngresado * 3600).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado / 0.126).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado / 452.938347).replace(",", "."));
            }
        }
    }

    public void opLbH(CharSequence charSequence)
    {
        if(editLbH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado * 0.453).replace(",", "."));
                //Convertir a atm
                editKgS.setText(df.format((valorIngresado * 0.453) * 0.000277778).replace(",", "."));
                //Convertir a Psi
                editGH.setText(df.format(valorIngresado / 0.002207506).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado * 0.126).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado / 3600).replace(",", "."));
            }
        }
    }

    public void opLbS(CharSequence charSequence)
    {
        if(editLbS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado / 0.00061324).replace(",", "."));
                //Convertir a atm
                editKgS.setText(df.format(valorIngresado / 2.20750552).replace(",", "."));
                //Convertir a Psi
                editGH.setText(df.format((valorIngresado * 3600) * 453).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado / 0.002207806).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado * 3600).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_caudal_masico, menu);
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
