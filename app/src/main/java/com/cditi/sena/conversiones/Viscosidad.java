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

public class Viscosidad extends AppCompatActivity
{
    EditText editP;
    EditText editCp;
    EditText editLbSft;
    EditText editLbfsFt2;
    EditText editLbHft;
    EditText editKgHm;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viscosidad);

        editP = (EditText) findViewById(R.id.editP);
        editCp = (EditText) findViewById(R.id.editCp);
        editLbSft = (EditText) findViewById(R.id.editLbSft);
        editLbfsFt2 = (EditText) findViewById(R.id.editLbfsFt2);
        editLbHft = (EditText) findViewById(R.id.editLbHft);
        editKgHm = (EditText) findViewById(R.id.editKgHm);

        //Conversion para el Campo NsM2
        editP.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opP(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Cp
        editCp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opCp(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo LbSft
        editLbSft.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLbSft(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo LbfsFt2
        editLbfsFt2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLbfsFt2(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo LbHft
        editLbHft.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLbHft(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo KgHm
        editKgHm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKgHm(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opP(CharSequence charSequence)
    {
        if(editP.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editCp.setText("");
                editLbSft.setText("");
                editLbfsFt2.setText("");
                editLbHft.setText("");
                editKgHm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editCp.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a atm
                editLbSft.setText(df.format(valorIngresado * 0.672).replace(",", "."));
                //Convertir a Psi
                editLbfsFt2.setText(df.format(valorIngresado * 0.0209).replace(",", "."));
                //Convertir a Psi
                editLbHft.setText(df.format(valorIngresado * 2420).replace(",", "."));
                //Convertir a Psi
                editKgHm.setText(df.format(valorIngresado * 3600).replace(",", "."));
            }
        }
    }

    public void opCp(CharSequence charSequence)
    {
        if(editCp.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editP.setText("");
                editLbSft.setText("");
                editLbfsFt2.setText("");
                editLbHft.setText("");
                editKgHm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editP.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                //Convertir a atm
                editLbSft.setText(df.format(valorIngresado * 0.000672).replace(",", "."));
                //Convertir a Psi
                editLbfsFt2.setText(df.format(valorIngresado * 0.000029).replace(",", "."));
                //Convertir a Psi
                editLbHft.setText(df.format(valorIngresado * 2.42).replace(",", "."));
                //Convertir a Psi
                editKgHm.setText(df.format(valorIngresado * 3.6).replace(",", "."));
            }
        }
    }

    public void opLbSft(CharSequence charSequence)
    {
        if(editLbSft.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editP.setText("");
                editCp.setText("");
                editLbfsFt2.setText("");
                editLbHft.setText("");
                editKgHm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editP.setText(df.format(valorIngresado * 1.49).replace(",", "."));
                //Convertir a atm
                editCp.setText(df.format(valorIngresado * 1490).replace(",", "."));
                //Convertir a Psi
                editLbfsFt2.setText(df.format(valorIngresado * 0.0311).replace(",", "."));
                //Convertir a Psi
                editLbHft.setText(df.format(valorIngresado * 3600).replace(",", "."));
                //Convertir a Psi
                editKgHm.setText(df.format(valorIngresado * 5350).replace(",", "."));
            }
        }
    }

    public void opLbfsFt2(CharSequence charSequence)
    {
        if(editLbfsFt2.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editP.setText("");
                editCp.setText("");
                editLbSft.setText("");
                editLbHft.setText("");
                editKgHm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editP.setText(df.format((valorIngresado * 0.000277778) * 14.882).replace(",", "."));
                //Convertir a atm
                editCp.setText(df.format((valorIngresado * 0.00041338) * 1000).replace(",", "."));
                //Convertir a Psi
                editLbSft.setText(df.format(valorIngresado * 0.00041338).replace(",", "."));
                //Convertir a Psi
                editLbHft.setText(df.format(valorIngresado / 3600).replace(",", "."));
                //Convertir a Psi
                editKgHm.setText(df.format(valorIngresado / 3600).replace(",", "."));
            }
        }
    }

    public void opLbHft(CharSequence charSequence)
    {
        if(editLbHft.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editP.setText("");
                editCp.setText("");
                editLbSft.setText("");
                editLbfsFt2.setText("");
                editKgHm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editP.setText(df.format(valorIngresado * 0.0004134).replace(",", "."));
                //Convertir a atm
                editCp.setText(df.format(valorIngresado * 0.4134).replace(",", "."));
                //Convertir a Psi
                editLbSft.setText(df.format(valorIngresado * 0.000278).replace(",", "."));
                //Convertir a Psi
                editLbfsFt2.setText(df.format(valorIngresado * 0.00000864).replace(",", "."));
                //Convertir a Psi
                editKgHm.setText(df.format(valorIngresado * 1.49).replace(",", "."));
            }
        }
    }

    public void opKgHm(CharSequence charSequence)
    {
        if(editKgHm.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editP.setText("");
                editCp.setText("");
                editLbSft.setText("");
                editLbfsFt2.setText("");
                editLbHft.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editP.setText(df.format(valorIngresado * 0.000278).replace(",", "."));
                //Convertir a atm
                editCp.setText(df.format(valorIngresado * 0.278).replace(",", "."));
                //Convertir a Psi
                editLbSft.setText(df.format(valorIngresado * 0.000187).replace(",", "."));
                //Convertir a Psi
                editLbfsFt2.setText(df.format(valorIngresado * 0.0000581).replace(",", "."));
                //Convertir a Psi
                editLbHft.setText(df.format(valorIngresado * 0.672).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_viscosidad, menu);
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
