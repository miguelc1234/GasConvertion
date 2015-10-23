package com.cditi.sena.conversiones;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

import com.cditi.sena.gasconvertion.R;

import java.text.DecimalFormat;

public class Presion extends AppCompatActivity
{
    EditText editBar;
    EditText editN_m2;
    EditText editAtm;
    EditText editPsi;
    EditText editKgf;
    EditText editMmHg;
    EditText editPlgHg;

    double valorIngresado = 0;
    String valorVacio = "";
    int posicion = 0;
    double operacion = 0;

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_presion);

        editBar = (EditText) findViewById(R.id.editBar);
        editN_m2 = (EditText) findViewById(R.id.editN_m2);
        editAtm = (EditText) findViewById(R.id.editAtm);
        editPsi = (EditText) findViewById(R.id.editPsi);
        editKgf = (EditText) findViewById(R.id.editKgf);
        editMmHg = (EditText) findViewById(R.id.editMmHg);
        editPlgHg = (EditText) findViewById(R.id.editPlgHg);

        //Conversion para el Campo bar
        editBar.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opBar(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo N/m2

        editN_m2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opN_m2(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Atm

        editAtm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opAtm(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Psi

        editPsi.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opPsi(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Kgf

        editKgf.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKgf(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo MmHg

        editMmHg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opMmHg(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo PlgHg

        editPlgHg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opPlgHg(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }



    public void opBar(CharSequence charSequence)
    {
        if(editBar.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editN_m2.setText("");
                editAtm.setText("");
                editPsi.setText("");
                editKgf.setText("");
                editMmHg.setText("");
                editPlgHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editN_m2.setText(df.format(valorIngresado * 100000).replace(",","."));
                //Convertir a atm
                editAtm.setText(df.format( valorIngresado * 0.9869).replace(",", "."));
                //Convertir a Psi
                editPsi.setText(df.format(valorIngresado * 14.504).replace(",", "."));
                //Convertir a Kgf
                editKgf.setText(df.format(valorIngresado * 1.0197).replace(",", "."));
                //Convertir a MmHg
                editMmHg.setText(df.format(valorIngresado * 750.06).replace(",", "."));
                //Convertir a PlgHg
                editPlgHg.setText(df.format(valorIngresado * 29.526).replace(",", "."));
            }
        }
    }

    public void opN_m2(CharSequence charSequence)
    {
        if(editN_m2.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editBar.setText("");
                editAtm.setText("");
                editPsi.setText("");
                editKgf.setText("");
                editMmHg.setText("");
                editPlgHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editBar.setText(df.format(valorIngresado*0.00001).replace(",", "."));
                //Convertir a atm
                editAtm.setText(df.format(valorIngresado * 0.00000987).replace(",", "."));
                //Convertir a Psi
                editPsi.setText(df.format(valorIngresado * 0.00014504).replace(",", "."));
                //Convertir a Kgf
                editKgf.setText(df.format(valorIngresado * 0.000010197).replace(",", "."));
                //Convertir a MmHg
                editMmHg.setText(df.format(valorIngresado * 0.0075006).replace(",", "."));
                //Convertir a PlgHg
                editPlgHg.setText(df.format(valorIngresado * 0.0002952).replace(",","."));
            }
        }

    }

    public void opAtm(CharSequence charSequence)
    {
        if(editAtm.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editBar.setText("");
                editN_m2.setText("");
                editPsi.setText("");
                editKgf.setText("");
                editMmHg.setText("");
                editPlgHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Bar
                editBar.setText(df.format(valorIngresado*1.01325).replace(",", "."));
                //Convertir a N_m2
                editN_m2.setText(df.format(valorIngresado * 101325).replace(",", "."));
                //Convertir a Psi
                editPsi.setText(df.format(valorIngresado * 14.696).replace(",", "."));
                //Convertir a Kgf
                editKgf.setText(df.format(valorIngresado * 1.033).replace(",", "."));
                //Convertir a MmHg
                editMmHg.setText(df.format(valorIngresado * 760).replace(",", "."));
                //Convertir a PlgHg
                editPlgHg.setText(df.format(valorIngresado * 29.92).replace(",","."));
            }
        }
    }

    public void opPsi(CharSequence charSequence)
    {
        if(editPsi.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editBar.setText("");
                editN_m2.setText("");
                editAtm.setText("");
                editKgf.setText("");
                editMmHg.setText("");
                editPlgHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Bar
                editBar.setText(df.format(valorIngresado * 0.06894).replace(",", "."));
                //Convertir a N_m2
                editN_m2.setText(df.format(valorIngresado * 6894.7).replace(",", "."));
                //Convertir a Atm
                editAtm.setText(df.format(valorIngresado * 0.06804).replace(",", "."));
                //Convertir a Kgf
                editKgf.setText(df.format(valorIngresado * 0.07031).replace(",", "."));
                //Convertir a MmHg
                editMmHg.setText(df.format(valorIngresado * 51.715).replace(",", "."));
                //Convertir a PlgHg
                editPlgHg.setText(df.format(valorIngresado * 2.036).replace(",","."));
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
                editBar.setText("");
                editN_m2.setText("");
                editAtm.setText("");
                editPsi.setText("");
                editMmHg.setText("");
                editPlgHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Bar
                editBar.setText(df.format(valorIngresado * 0.9807).replace(",", "."));
                //Convertir a N_m2
                editN_m2.setText(df.format(valorIngresado * 98068).replace(",", "."));
                //Convertir a Atm
                editAtm.setText(df.format(valorIngresado * 0.9678).replace(",", "."));
                //Convertir a Kgf
                editPsi.setText(df.format(valorIngresado * 14.22).replace(",", "."));
                //Convertir a MmHg
                editMmHg.setText(df.format(valorIngresado * 735.6).replace(",", "."));
                //Convertir a PlgHg
                editPlgHg.setText(df.format(valorIngresado * 28.96).replace(",","."));
            }
        }
    }

    public void opMmHg(CharSequence charSequence)
    {
        if(editMmHg.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editBar.setText("");
                editN_m2.setText("");
                editAtm.setText("");
                editPsi.setText("");
                editKgf.setText("");
                editPlgHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Bar
                editBar.setText(df.format(valorIngresado * 0.001333).replace(",", "."));
                //Convertir a N_m2
                editN_m2.setText(df.format(valorIngresado * 133.32).replace(",", "."));
                //Convertir a Atm
                editAtm.setText(df.format(valorIngresado * 0.001315).replace(",", "."));
                //Convertir a Kgf
                editPsi.setText(df.format(valorIngresado * 0.01933).replace(",", "."));
                //Convertir a MmHg
                editKgf.setText(df.format(valorIngresado * 0.0013594).replace(",", "."));
                //Convertir a PlgHg
                editPlgHg.setText(df.format(valorIngresado * 0.03937).replace(",","."));
            }
        }
    }

    public void opPlgHg(CharSequence charSequence)
    {
        if(editPlgHg.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editBar.setText("");
                editN_m2.setText("");
                editAtm.setText("");
                editPsi.setText("");
                editKgf.setText("");
                editMmHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Bar
                editBar.setText(df.format(valorIngresado * 0.033864).replace(",", "."));
                //Convertir a N_m2
                editN_m2.setText(df.format(valorIngresado * 3386.4).replace(",", "."));
                //Convertir a Atm
                editAtm.setText(df.format(valorIngresado * 0.0334).replace(",", "."));
                //Convertir a Kgf
                editPsi.setText(df.format(valorIngresado * 0.49116).replace(",", "."));
                //Convertir a MmHg
                editKgf.setText(df.format(valorIngresado * 0.03453).replace(",", "."));
                //Convertir a PlgHg
                editMmHg.setText(df.format(valorIngresado * 25.4).replace(",","."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_presion, menu);
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
