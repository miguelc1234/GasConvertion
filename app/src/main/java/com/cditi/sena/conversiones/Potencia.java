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

public class Potencia extends AppCompatActivity
{

    EditText editW;
    EditText editKcalH;
    EditText editBtuH;
    EditText editHp;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_potencia);

        editW = (EditText) findViewById(R.id.editW);
        editKcalH = (EditText) findViewById(R.id.editKcalH);
        editBtuH = (EditText) findViewById(R.id.editBtuH);
        editHp = (EditText) findViewById(R.id.editHp);

        editW.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opW(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editKcalH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKcalH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editBtuH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opBtuH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editHp.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opHp(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opW(CharSequence charSequence)
    {
        if(editW.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKcalH.setText("");
                editBtuH.setText("");
                editHp.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editKcalH.setText(df.format(valorIngresado * 0.8604).replace(",","."));
                editBtuH.setText(df.format(valorIngresado * 3.413).replace(",", "."));
                editHp.setText(df.format(valorIngresado * 0.001341).replace(",", "."));
            }
        }
    }

    public void opKcalH(CharSequence charSequence)
    {
        if(editKcalH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editW.setText("");
                editBtuH.setText("");
                editHp.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editW.setText(df.format(valorIngresado * 1.1611).replace(",","."));
                editBtuH.setText(df.format(valorIngresado * 3.9657).replace(",", "."));
                editHp.setText(df.format(valorIngresado * 0.001555).replace(",", "."));
            }
        }
    }

    public void opBtuH(CharSequence charSequence)
    {
        if(editBtuH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editW.setText("");
                editKcalH.setText("");
                editHp.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editW.setText(df.format(valorIngresado * 0.2926).replace(",","."));
                editKcalH.setText(df.format(valorIngresado * 0.2522).replace(",", "."));
                editHp.setText(df.format(valorIngresado * 0.0003929).replace(",", "."));
            }
        }
    }

    public void opHp(CharSequence charSequence)
    {
        if(editHp.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editW.setText("");
                editKcalH.setText("");
                editBtuH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editW.setText(df.format(valorIngresado * 745.7).replace(",","."));
                editKcalH.setText(df.format(valorIngresado * 641.62).replace(",", "."));
                editBtuH.setText(df.format(valorIngresado * 2545).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_potencia, menu);
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
