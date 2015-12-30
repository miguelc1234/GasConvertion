package com.cditi.sena.conversiones;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;

import com.cditi.sena.gasconvertion.AdapterDrawer;
import com.cditi.sena.gasconvertion.ItemsDrawer;
import com.cditi.sena.gasconvertion.R;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class CoeficienteTransferenciaCalor extends AppCompatActivity
{
    EditText editWM2K;
    EditText editBtu;
    EditText editCal;
    EditText editWCm2C;
    EditText editKcalHm2;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    private DrawerLayout menuDrawer;
    private ActionBarDrawerToggle toggle;
    ListView listaDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coeficiente_transferencia_calor);

        editWM2K = (EditText) findViewById(R.id.editWM2K);
        editBtu = (EditText) findViewById(R.id.editBtu);
        editCal = (EditText) findViewById(R.id.editCal);
        editWCm2C = (EditText) findViewById(R.id.editWCm2C);
        editKcalHm2 = (EditText) findViewById(R.id.editKcalHm2);

        editWM2K.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opWM2K(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

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

        ActionBar actionBar = getSupportActionBar();

        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.invalidateOptionsMenu();
        actionBar.setTitle("Menu");

        menuDrawer = (DrawerLayout) findViewById(R.id.drawerlayout);
        listaDrawer = (ListView) findViewById(R.id.listaDrawer);

        String[] titulos = getResources().getStringArray(R.array.array_menu_drawer);

        ArrayList<ItemsDrawer> items = new ArrayList<ItemsDrawer>();
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[0]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[1]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[2]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[3]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[4]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[5]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[6]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[7]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[8]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[9]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[10]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[11]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[12]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[13]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[14]));
        items.add(new ItemsDrawer(R.mipmap.ic_launcher, titulos[15]));

        listaDrawer.setAdapter(new AdapterDrawer(this, items));

        toggle = new ActionBarDrawerToggle(this, menuDrawer, R.string.open, R.string.close);

        listaDrawer.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l)
            {
                switch (position)
                {
                    case 0:
                        abrirClase(Presion.class);
                        break;

                    case 1:
                        abrirClase(Temperatura.class);
                        break;

                    case 2:
                        abrirClase(Longitud.class);
                        break;

                    case 3:
                        abrirClase(Superficie.class);
                        break;

                    case 4:
                        abrirClase(Volumen.class);
                        break;

                    case 5:
                        abrirClase(Masa.class);
                        break;

                    case 6:
                        abrirClase(Energia.class);
                        break;

                    case 7:
                        abrirClase(Fuerza.class);
                        break;

                    case 8:
                        abrirClase(Potencia.class);
                        break;

                    case 9:
                        abrirClase(Viscosidad.class);
                        break;

                    case 10:
                        abrirClase(Densidad.class);
                        break;

                    case 11:
                        abrirClase(Cp.class);
                        break;

                    case 12:
                        abrirClase(CoeficienteTransferenciaCalor.class);
                        break;

                    case 13:
                        abrirClase(ConductividadTermica.class);
                        break;

                    case 14:
                        abrirClase(CaudalMasico.class);
                        break;

                    case 15:
                        abrirClase(CaudalVolumetrico.class);
                        break;
                }

                menuDrawer.closeDrawer(listaDrawer);
            }
        });
    }

    public void opWM2K(CharSequence charSequence)
    {
        if(editWM2K.isFocused())
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

                editBtu.setText(df.format(valorIngresado * 0.1761).replace(",","."));
                editCal.setText(df.format(valorIngresado * 0.00002388).replace(",", "."));
                editWCm2C.setText(df.format(valorIngresado * 0.0001).replace(",", "."));
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
                editWM2K.setText("");
                editCal.setText("");
                editWCm2C.setText("");
                editKcalHm2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editWM2K.setText(df.format(valorIngresado * 5.678).replace(",","."));
                editCal.setText(df.format(valorIngresado * 0.0001355).replace(",", "."));
                editWCm2C.setText(df.format(valorIngresado * 0.0005678).replace(",", "."));
                editKcalHm2.setText(df.format(valorIngresado * 4.882).replace(",", "."));
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
                editWM2K.setText("");
                editBtu.setText("");
                editWCm2C.setText("");
                editKcalHm2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editWM2K.setText(df.format(valorIngresado * 41870).replace(",","."));
                editBtu.setText(df.format(valorIngresado * 7373).replace(",", "."));
                editWCm2C.setText(df.format(valorIngresado * 4.187).replace(",", "."));
                editKcalHm2.setText(df.format(valorIngresado * 36000).replace(",", "."));
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
                editWM2K.setText("");
                editBtu.setText("");
                editCal.setText("");
                editKcalHm2.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editWM2K.setText(df.format(valorIngresado * 10000).replace(",","."));
                editBtu.setText(df.format(valorIngresado * 1.761).replace(",", "."));
                editCal.setText(df.format(valorIngresado * 0.2388).replace(",", "."));
                editKcalHm2.setText(df.format(valorIngresado * 8600).replace(",", "."));
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
                editWM2K.setText("");
                editBtu.setText("");
                editCal.setText("");
                editWCm2C.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editWM2K.setText(df.format(valorIngresado * 1.163).replace(",","."));
                editBtu.setText(df.format(valorIngresado * 0.2048).replace(",", "."));
                editCal.setText(df.format(valorIngresado * 0.00002778).replace(",", "."));
                editWCm2C.setText(df.format(valorIngresado * 0.0001163).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_coeficiente_transferencia_calor, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirClase (Class clase)
    {
        Intent intent = new Intent(CoeficienteTransferenciaCalor.this,clase);
        startActivity(intent);
        finish();
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        toggle.syncState();
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig)
    {
        super.onConfigurationChanged(newConfig);
        toggle.onConfigurationChanged(newConfig);
    }
}
