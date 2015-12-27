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

public class CaudalVolumetrico extends AppCompatActivity
{
    EditText editFt3S;
    EditText editFt3H;
    EditText editGalS;
    EditText editGalH;
    EditText editM3S;
    EditText editM3H;
    EditText editCm3S;
    EditText editCm3H;
    EditText editLS;
    EditText editLH;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_caudal_volumetrico);

        editFt3S = (EditText) findViewById(R.id.editFt3S);
        editFt3H = (EditText) findViewById(R.id.editFt3H);
        editGalS = (EditText) findViewById(R.id.editGalS);
        editGalH = (EditText) findViewById(R.id.editGalH);
        editM3S = (EditText) findViewById(R.id.editM3S);
        editM3H = (EditText) findViewById(R.id.editM3H);
        editCm3S = (EditText) findViewById(R.id.editCm3S);
        editCm3H = (EditText) findViewById(R.id.editCm3H);
        editLS = (EditText) findViewById(R.id.editLS);
        editLH = (EditText) findViewById(R.id.editLH);

        //Conversion para el Campo Ft3S
        editFt3S.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opFt3S(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo Ft3H
        editFt3H.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opFt3H(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo GalS
        editGalS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opGalS(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo GalH
        editGalH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opGalH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo M3S
        editM3S.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opM3S(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo M3H
        editM3H.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opM3H(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo Cm3S
        editCm3S.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opCm3S(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo Cm3H
        editCm3H.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opCm3H(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo LS
        editLS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opLS(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo LH
        editLH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opLH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });
    }

    public void opFt3S(CharSequence charSequence)
    {
        if(editFt3S.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3H.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3H.setText(df.format(valorIngresado * 3600).replace(",","."));
                //Convertir a atm
                editGalS.setText(df.format(valorIngresado * 7.4805).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format((valorIngresado * 7.4805) * 3600).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format(valorIngresado * 0.028316).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format((valorIngresado * 0.028316) * 3600).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format((valorIngresado * 0.028316) * 1000000).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format((valorIngresado * 28316) * 3600).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format(valorIngresado * 28.31).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format((valorIngresado * 28.31) * 3600).replace(",", "."));
            }
        }
    }

    public void opFt3H(CharSequence charSequence)
    {
        if(editFt3H.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format(valorIngresado / 3600).replace(",","."));
                //Convertir a atm
                editGalS.setText(df.format((valorIngresado * 7.4805) / 3600).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format(valorIngresado * 7.4805).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format((valorIngresado * 0.028316) / 3600).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format(valorIngresado * 0.028316).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format((valorIngresado * 28316) / 3600).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format(valorIngresado * 28316).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format((valorIngresado * 28.31) / 3600).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format(valorIngresado * 28.31).replace(",", "."));
            }
        }
    }

    public void opGalS(CharSequence charSequence)
    {
        if(editGalS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format(valorIngresado * 0.1337).replace(",","."));
                //Convertir a atm
                editFt3H.setText(df.format((valorIngresado * 0.1337) * 3600).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format(valorIngresado * 3600).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format(valorIngresado * 0.003785).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format((valorIngresado * 0.003785) * 3600).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format(valorIngresado * 3785).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format((valorIngresado * 3785) * 3600).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format((valorIngresado * 3785) / 1000).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format((valorIngresado * 3.785) * 3600).replace(",", "."));
            }
        }
    }

    public void opGalH(CharSequence charSequence)
    {
        if(editGalH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalS.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format((valorIngresado * 0.1337) / 3600).replace(",","."));
                //Convertir a atm
                editFt3H.setText(df.format(valorIngresado * 0.1337).replace(",", "."));
                //Convertir a Psi
                editGalS.setText(df.format(valorIngresado / 3600).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format((valorIngresado * 0.003785) / 3600).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format(valorIngresado * 0.003785).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format(valorIngresado * 1.051).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format((valorIngresado * 1.051) * 3600).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format((valorIngresado * 0.001) / 3600).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format(valorIngresado * 0.001).replace(",", "."));
            }
        }
    }

    public void opM3S(CharSequence charSequence)
    {
        if(editM3S.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format(valorIngresado / 0.028316).replace(",", "."));
                //Convertir a atm
                editFt3H.setText(df.format((valorIngresado * 35.31572256) * 3600).replace(",", "."));
                //Convertir a Psi
                editGalS.setText(df.format(valorIngresado * 264.17).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format((valorIngresado * 264.17) * 3600).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format(valorIngresado * 3600).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format(valorIngresado * 1000000).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format((valorIngresado * 1000000) * 3600).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format((valorIngresado * 1000) * 3600).replace(",", "."));
            }
        }
    }

    public void opM3H(CharSequence charSequence)
    {
        if(editM3H.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format(valorIngresado / 11.9376).replace(",", "."));
                //Convertir a atm
                editFt3H.setText(df.format(valorIngresado * 35.314).replace(",", "."));
                //Convertir a Psi
                editGalS.setText(df.format((valorIngresado * 35.314) / 3600).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format((valorIngresado * 0.009809444) * 3600).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format(valorIngresado / 3600).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format((valorIngresado * 1000000) / 3600).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format((valorIngresado * 277.7778) * 3600).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format((valorIngresado *1000) / 3600).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format(valorIngresado * 1000).replace(",", "."));
            }
        }
    }

    public void opCm3S(CharSequence charSequence)
    {
        if(editCm3S.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3H.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format(valorIngresado * 0.0000353).replace(",", "."));
                //Convertir a atm
                editFt3H.setText(df.format(valorIngresado * 0.127133).replace(",", "."));
                //Convertir a Psi
                editGalS.setText(df.format(valorIngresado * 0.0002642).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format(valorIngresado * 0.951019).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format(valorIngresado * 0.000001).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format((valorIngresado * 0.000001) * 3600).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format(valorIngresado * 3600).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format((valorIngresado * 0.001) * 3600).replace(",", "."));
            }
        }
    }

    public void opCm3H(CharSequence charSequence)
    {
        if(editCm3H.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editLS.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format((valorIngresado * 0.0000353) / 3600).replace(",", "."));
                //Convertir a atm
                editFt3H.setText(df.format(valorIngresado * 0.0000353).replace(",", "."));
                //Convertir a Psi
                editGalS.setText(df.format((valorIngresado * 0.0002642) / 3600).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format(valorIngresado * 0.0002642).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format((valorIngresado * 0.000001) / 3600).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format(valorIngresado * 0.000001).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format(valorIngresado / 3600).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format((valorIngresado * 0.001) / 3600).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format(valorIngresado * 0.001).replace(",", "."));
            }
        }
    }

    public void opLS(CharSequence charSequence)
    {
        if(editLS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format(valorIngresado * 0.0353).replace(",", "."));
                //Convertir a atm
                editFt3H.setText(df.format((valorIngresado * 0.0353) * 3600).replace(",", "."));
                //Convertir a Psi
                editGalS.setText(df.format(valorIngresado * 0.2642).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format((valorIngresado * 0.2642) * 3600).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format((valorIngresado * 0.001) * 3600).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format((valorIngresado * 1000) * 3600).replace(",", "."));
                //Convertir a Psi
                editLH.setText(df.format(valorIngresado * 3600).replace(",", "."));
            }
        }
    }

    public void opLH(CharSequence charSequence)
    {
        if(editLH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editFt3S.setText("");
                editFt3H.setText("");
                editGalS.setText("");
                editGalH.setText("");
                editM3S.setText("");
                editM3H.setText("");
                editCm3S.setText("");
                editCm3H.setText("");
                editLS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editFt3S.setText(df.format((valorIngresado * 0.0353) / 3600).replace(",", "."));
                //Convertir a atm
                editFt3H.setText(df.format(valorIngresado * 0.0353).replace(",", "."));
                //Convertir a Psi
                editGalS.setText(df.format((valorIngresado * 0.2642) / 3600).replace(",", "."));
                //Convertir a Psi
                editGalH.setText(df.format(valorIngresado * 0.2642).replace(",", "."));
                //Convertir a Psi
                editM3S.setText(df.format((valorIngresado * 0.001) / 3600).replace(",", "."));
                //Convertir a Psi
                editM3H.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                //Convertir a Psi
                editCm3S.setText(df.format((valorIngresado * 1000) / 3600).replace(",", "."));
                //Convertir a Psi
                editCm3H.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Psi
                editLS.setText(df.format(valorIngresado / 3600).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_caudal_volumetrico, menu);
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
