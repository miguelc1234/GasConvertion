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

    private DrawerLayout menuDrawer;
    private ActionBarDrawerToggle toggle;
    ListView listaDrawer;

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

                editCp.setText(df.format(valorIngresado * 1000).replace(",", "."));
                editLbSft.setText(df.format(valorIngresado * 0.672).replace(",", "."));
                editLbfsFt2.setText(df.format(valorIngresado * 0.0209).replace(",", "."));
                editLbHft.setText(df.format(valorIngresado * 2420).replace(",", "."));
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

                editP.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                editLbSft.setText(df.format(valorIngresado * 0.000672).replace(",", "."));
                editLbfsFt2.setText(df.format(valorIngresado * 0.000029).replace(",", "."));
                editLbHft.setText(df.format(valorIngresado * 2.42).replace(",", "."));
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

                editP.setText(df.format(valorIngresado * 1.49).replace(",", "."));
                editCp.setText(df.format(valorIngresado * 1490).replace(",", "."));
                editLbfsFt2.setText(df.format(valorIngresado * 0.0311).replace(",", "."));
                editLbHft.setText(df.format(valorIngresado * 3600).replace(",", "."));
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

                editP.setText(df.format((valorIngresado * 0.000277778) * 14.882).replace(",", "."));
                editCp.setText(df.format((valorIngresado * 0.00041338) * 1000).replace(",", "."));
                editLbSft.setText(df.format(valorIngresado * 0.00041338).replace(",", "."));
                editLbHft.setText(df.format(valorIngresado / 3600).replace(",", "."));
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

                editP.setText(df.format(valorIngresado * 0.0004134).replace(",", "."));
                editCp.setText(df.format(valorIngresado * 0.4134).replace(",", "."));
                editLbSft.setText(df.format(valorIngresado * 0.000278).replace(",", "."));
                editLbfsFt2.setText(df.format(valorIngresado * 0.00000864).replace(",", "."));
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

                editP.setText(df.format(valorIngresado * 0.000278).replace(",", "."));
                editCp.setText(df.format(valorIngresado * 0.278).replace(",", "."));
                editLbSft.setText(df.format(valorIngresado * 0.000187).replace(",", "."));
                editLbfsFt2.setText(df.format(valorIngresado * 0.0000581).replace(",", "."));
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
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirClase (Class clase)
    {
        Intent intent = new Intent(Viscosidad.this,clase);
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