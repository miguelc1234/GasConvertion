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

public class Volumen extends AppCompatActivity
{
    EditText editM3;
    EditText editPlg3;
    EditText editFt3;
    EditText editCm3;
    EditText editLt;
    EditText editGal;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumen);

        editM3 = (EditText) findViewById(R.id.editM3);
        editPlg3 = (EditText) findViewById(R.id.editPlg3);
        editFt3 = (EditText) findViewById(R.id.editFt3);
        editCm3 = (EditText) findViewById(R.id.editCm3);
        editLt = (EditText) findViewById(R.id.editLt);
        editGal = (EditText) findViewById(R.id.editGal);

        //Conversion para el Campo m3
        editM3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opM3(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo plg3

        editPlg3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opPlg3(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Ft3

        editFt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opFt3(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Cm3

        editCm3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opCm3(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Lt

        editLt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLt(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Gal

        editGal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opGal(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

    }

    public void opM3(CharSequence charSequence)
    {
        if(editM3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editPlg3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg3
                editPlg3.setText(df.format(valorIngresado * 61023.7).replace(",","."));
                //Convertir a Ft3
                editFt3.setText(df.format(valorIngresado * 35.314).replace(",", "."));
                //Convertir a Cm3
                editCm3.setText(df.format(valorIngresado * 1000000).replace(",", "."));
                //Convertir a Lt
                editLt.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Gal
                editGal.setText(df.format(valorIngresado * 264.17).replace(",", "."));
            }
        }
    }

    public void opPlg3(CharSequence charSequence)
    {
        if(editPlg3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg3
                editM3.setText(df.format(valorIngresado * 0.00001638).replace(",","."));
                //Convertir a Ft3
                editFt3.setText(df.format(valorIngresado * 0.0005787).replace(",", "."));
                //Convertir a Cm3
                editCm3.setText(df.format(valorIngresado * 16.38).replace(",", "."));
                //Convertir a Lt
                editLt.setText(df.format(valorIngresado * 0.01638).replace(",", "."));
                //Convertir a Gal
                editGal.setText(df.format(valorIngresado * 0.004329).replace(",", "."));
            }
        }
    }

    public void opFt3(CharSequence charSequence)
    {
        if(editFt3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editCm3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg3
                editM3.setText(df.format(valorIngresado * 0.02831).replace(",","."));
                //Convertir a Ft3
                editPlg3.setText(df.format(valorIngresado * 1728).replace(",", "."));
                //Convertir a Cm3
                editCm3.setText(df.format(valorIngresado * 28317).replace(",", "."));
                //Convertir a Lt
                editLt.setText(df.format(valorIngresado * 28.33).replace(",", "."));
                //Convertir a Gal
                editGal.setText(df.format(valorIngresado * 7.4805).replace(",", "."));
            }
        }
    }

    public void opCm3(CharSequence charSequence)
    {
        if(editCm3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editFt3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg3
                editM3.setText(df.format(valorIngresado * 0.000001).replace(",","."));
                //Convertir a Ft3
                editPlg3.setText(df.format(valorIngresado * 0.061).replace(",", "."));
                //Convertir a Cm3
                editFt3.setText(df.format(valorIngresado * 0.0000353).replace(",", "."));
                //Convertir a Lt
                editLt.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                //Convertir a Gal
                editGal.setText(df.format(valorIngresado * 0.0002642).replace(",", "."));
            }
        }
    }

    public void opLt(CharSequence charSequence)
    {
        if(editLt.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg3
                editM3.setText(df.format(valorIngresado * 0.001).replace(",","."));
                //Convertir a Ft3
                editPlg3.setText(df.format(valorIngresado * 61.023).replace(",", "."));
                //Convertir a Cm3
                editFt3.setText(df.format(valorIngresado * 0.0353).replace(",", "."));
                //Convertir a Lt
                editCm3.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Gal
                editGal.setText(df.format(valorIngresado * 0.2642).replace(",", "."));
            }
        }
    }

    public void opGal(CharSequence charSequence)
    {
        if(editGal.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editLt.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Plg3
                editM3.setText(df.format(valorIngresado * 0.003785).replace(",","."));
                //Convertir a Ft3
                editPlg3.setText(df.format(valorIngresado * 231).replace(",", "."));
                //Convertir a Cm3
                editFt3.setText(df.format(valorIngresado * 0.1337).replace(",", "."));
                //Convertir a Lt
                editCm3.setText(df.format(valorIngresado * 3785).replace(",", "."));
                //Convertir a Gal
                editLt.setText(df.format(valorIngresado * 3.785).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_volumen, menu);
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
