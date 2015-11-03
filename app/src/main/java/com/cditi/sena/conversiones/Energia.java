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

public class Energia extends AppCompatActivity
{
    EditText editJoule;
    EditText editKwh;
    EditText editKcal;
    EditText editCal;
    EditText editBtu;
    EditText editHphr;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energia);

        editJoule = (EditText) findViewById(R.id.editJoule);
        editKwh = (EditText) findViewById(R.id.editKwh);
        editKcal = (EditText) findViewById(R.id.editKcal);
        editCal = (EditText) findViewById(R.id.editCal);
        editBtu = (EditText) findViewById(R.id.editBtu);
        editHphr = (EditText) findViewById(R.id.editHphr);

        //Conversion para el Campo Joule
        editJoule.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opJoule(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Kwh
        editKwh.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKwh(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Kcal
        editKcal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKcal(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Cal
        editCal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opCal(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Btu
        editBtu.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opBtu(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo Hp.Hr
        editHphr.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opHphr(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });
    }

    public void opJoule(CharSequence charSequence)
    {
        if(editJoule.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKwh.setText("");
                editKcal.setText("");
                editCal.setText("");
                editBtu.setText("");
                editHphr.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Kwh
                editKwh.setText(df.format(valorIngresado * 0.0000002777).replace(",","."));
                //Convertir a Kcal
                editKcal.setText(df.format(valorIngresado * 0.00023901).replace(",", "."));
                //Convertir a Cal
                editCal.setText(df.format((valorIngresado * 0.00023901) * 1000).replace(",", "."));
                //Convertir a Btu
                editBtu.setText(df.format(valorIngresado * 0.0009478).replace(",", "."));
                //Convertir a Hphr
                editHphr.setText(df.format(valorIngresado * 0.0000003728).replace(",", "."));
            }
        }
    }

    public void opKwh(CharSequence charSequence)
    {
        if(editKwh.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editJoule.setText("");
                editKcal.setText("");
                editCal.setText("");
                editBtu.setText("");
                editHphr.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Joule
                editJoule.setText(df.format(valorIngresado * 3600000).replace(",","."));
                //Convertir a Kcal
                editKcal.setText(df.format(valorIngresado * 860.4).replace(",", "."));
                //Convertir a Cal
                editCal.setText(df.format((valorIngresado * 860.4) * 1000).replace(",", "."));
                //Convertir a Btu
                editBtu.setText(df.format(valorIngresado * 3412.2).replace(",", "."));
                //Convertir a Hphr
                editHphr.setText(df.format(valorIngresado * 1.341).replace(",", "."));
            }
        }
    }

    public void opKcal(CharSequence charSequence)
    {
        if(editKcal.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editJoule.setText("");
                editKwh.setText("");
                editCal.setText("");
                editBtu.setText("");
                editHphr.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Joule
                editJoule.setText(df.format(valorIngresado * 4184).replace(",","."));
                //Convertir a Kwh
                editKwh.setText(df.format(valorIngresado * 0.0011622).replace(",", "."));
                //Convertir a Cal
                editCal.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Btu
                editBtu.setText(df.format(valorIngresado * 3.9657).replace(",", "."));
                //Convertir a Hphr
                editHphr.setText(df.format(valorIngresado * 0.001558).replace(",", "."));
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
                editJoule.setText("");
                editKwh.setText("");
                editKcal.setText("");
                editBtu.setText("");
                editHphr.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Joule
                editJoule.setText(df.format(valorIngresado / 0.23901).replace(",", "."));
                //Convertir a Kwh
                editKwh.setText(df.format(valorIngresado / 860400).replace(",", "."));
                //Convertir a Kcal
                editKcal.setText(df.format(valorIngresado / 1000).replace(",", "."));
                //Convertir a Btu
                editBtu.setText(df.format(valorIngresado / 252.2).replace(",", "."));
                //Convertir a Hphr
                editHphr.setText(df.format(valorIngresado / 641620).replace(",", "."));
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
                editJoule.setText("");
                editKwh.setText("");
                editKcal.setText("");
                editCal.setText("");
                editHphr.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Joule
                editJoule.setText(df.format(valorIngresado * 1055).replace(",", "."));
                //Convertir a Kwh
                editKwh.setText(df.format(valorIngresado * 0.000293).replace(",", "."));
                //Convertir a Kcal
                editKcal.setText(df.format(valorIngresado * 0.2522).replace(",", "."));
                //Convertir a Cal
                editCal.setText(df.format((valorIngresado * 0.2522) * 1000).replace(",", "."));
                //Convertir a Hphr
                editHphr.setText(df.format(valorIngresado * 0.00039302).replace(",", "."));
            }
        }
    }

    public void opHphr(CharSequence charSequence)
    {
        if(editHphr.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editJoule.setText("");
                editKwh.setText("");
                editKcal.setText("");
                editCal.setText("");
                editBtu.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a Joule
                editJoule.setText(df.format(valorIngresado * 2684500).replace(",", "."));
                //Convertir a Kwh
                editKwh.setText(df.format(valorIngresado * 0.7457).replace(",", "."));
                //Convertir a Kcal
                editKcal.setText(df.format(valorIngresado * 641.62).replace(",", "."));
                //Convertir a Cal
                editCal.setText(df.format((valorIngresado * 641.62) * 1000).replace(",", "."));
                //Convertir a Hphr
                editBtu.setText(df.format(valorIngresado * 2544.5).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_energia, menu);
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
