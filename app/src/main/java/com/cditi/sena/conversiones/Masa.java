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

public class Masa extends AppCompatActivity
{
    EditText editOzAvdp;
    EditText editLibras;
    EditText editKg;
    EditText editGramos;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masa);

        editOzAvdp = (EditText) findViewById(R.id.editOzAvdp);
        editLibras = (EditText) findViewById(R.id.editLibras);
        editKg = (EditText) findViewById(R.id.editKg);
        editGramos = (EditText) findViewById(R.id.editGramos);

        //Conversion para el Campo OzAvdp
        editOzAvdp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opOzAvdp(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Libras
        editLibras.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLibras(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Kg
        editKg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKg(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Gramos
        editGramos.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opGramos(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opOzAvdp(CharSequence charSequence)
    {
        if(editOzAvdp.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editLibras.setText("");
                editKg.setText("");
                editGramos.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Libras
                editLibras.setText(df.format(valorIngresado * 0.0625).replace(",","."));
                //Convertir a Kg
                editKg.setText(df.format((valorIngresado * 28.38) / 1000).replace(",", "."));
                //Convertir a Gramos
                editGramos.setText(df.format(valorIngresado * 28.35).replace(",", "."));
            }
        }
    }

    public void opLibras(CharSequence charSequence)
    {
        if(editLibras.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editOzAvdp.setText("");
                editKg.setText("");
                editGramos.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a OzAvdp
                editOzAvdp.setText(df.format(valorIngresado * 16).replace(",","."));
                //Convertir a Kg
                editKg.setText(df.format((valorIngresado * 453.6) / 1000).replace(",", "."));
                //Convertir a Gramos
                editGramos.setText(df.format(valorIngresado * 453.6).replace(",", "."));
            }
        }
    }

    public void opKg(CharSequence charSequence)
    {
        if(editKg.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editOzAvdp.setText("");
                editLibras.setText("");
                editGramos.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a OzAvdp
                editOzAvdp.setText(df.format(valorIngresado / 0.02838).replace(",", "."));
                //Convertir a Libras
                editLibras.setText(df.format(valorIngresado / 0.4536).replace(",", "."));
                //Convertir a Gramos
                editGramos.setText(df.format(valorIngresado * 1000).replace(",", "."));
            }
        }
    }

    public void opGramos(CharSequence charSequence)
    {
        if(editGramos.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editOzAvdp.setText("");
                editLibras.setText("");
                editKg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a OzAvdp
                editOzAvdp.setText(df.format(valorIngresado * 0.03527).replace(",", "."));
                //Convertir a Libras
                editLibras.setText(df.format(valorIngresado * 0.0022).replace(",", "."));
                //Convertir a Kg
                editKg.setText(df.format(valorIngresado / 1000).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_masa, menu);
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
