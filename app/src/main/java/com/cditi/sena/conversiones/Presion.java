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

public class Presion extends AppCompatActivity
{
    EditText editBar;
    EditText editN_m2;
    EditText editAtm;
    EditText editPsi;
    EditText editKgf;
    EditText editMmHg;
    EditText editPlgHg;
    EditText editInH2O;

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
        setContentView(R.layout.activity_presion);

        editBar = (EditText) findViewById(R.id.editBar);
        editN_m2 = (EditText) findViewById(R.id.editN_m2);
        editAtm = (EditText) findViewById(R.id.editAtm);
        editPsi = (EditText) findViewById(R.id.editPsi);
        editKgf = (EditText) findViewById(R.id.editKgf);
        editMmHg = (EditText) findViewById(R.id.editMmHg);
        editPlgHg = (EditText) findViewById(R.id.editPlgHg);
        editInH2O = (EditText) findViewById(R.id.editInH2O);

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

        editInH2O.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opInH2O(charSequence);
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
                editInH2O.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editN_m2.setText(df.format(valorIngresado * 100000).replace(",","."));
                editAtm.setText(df.format( valorIngresado * 0.9869).replace(",", "."));
                editPsi.setText(df.format(valorIngresado * 14.504).replace(",", "."));
                editKgf.setText(df.format(valorIngresado * 1.0197).replace(",", "."));
                editMmHg.setText(df.format(valorIngresado * 750.06).replace(",", "."));
                editPlgHg.setText(df.format(valorIngresado * 29.526).replace(",", "."));
                editInH2O.setText(df.format(valorIngresado * 401.463).replace(",", "."));
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
                editInH2O.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editBar.setText(df.format(valorIngresado*0.00001).replace(",", "."));
                editAtm.setText(df.format(valorIngresado * 0.00000987).replace(",", "."));
                editPsi.setText(df.format(valorIngresado * 0.00014504).replace(",", "."));
                editKgf.setText(df.format(valorIngresado * 0.000010197).replace(",", "."));
                editMmHg.setText(df.format(valorIngresado * 0.0075006).replace(",", "."));
                editPlgHg.setText(df.format(valorIngresado * 0.0002952).replace(",","."));
                editInH2O.setText(df.format(valorIngresado * 0.004015).replace(",","."));
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
                editInH2O.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editBar.setText(df.format(valorIngresado*1.01325).replace(",", "."));
                editN_m2.setText(df.format(valorIngresado * 101325).replace(",", "."));
                editPsi.setText(df.format(valorIngresado * 14.696).replace(",", "."));
                editKgf.setText(df.format(valorIngresado * 1.033).replace(",", "."));
                editMmHg.setText(df.format(valorIngresado * 760).replace(",", "."));
                editPlgHg.setText(df.format(valorIngresado * 29.92).replace(",","."));
                editInH2O.setText(df.format(valorIngresado * 406.781).replace(",","."));
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
                editInH2O.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editBar.setText(df.format(valorIngresado * 0.06894).replace(",", "."));
                editN_m2.setText(df.format(valorIngresado * 6894.7).replace(",", "."));
                editAtm.setText(df.format(valorIngresado * 0.06804).replace(",", "."));
                editKgf.setText(df.format(valorIngresado * 0.07031).replace(",", "."));
                editMmHg.setText(df.format(valorIngresado * 51.715).replace(",", "."));
                editPlgHg.setText(df.format(valorIngresado * 2.036).replace(",","."));
                editInH2O.setText(df.format(valorIngresado * 27.6799).replace(",","."));
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
                editInH2O.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editBar.setText(df.format(valorIngresado * 0.9807).replace(",", "."));
                editN_m2.setText(df.format(valorIngresado * 98068).replace(",", "."));
                editAtm.setText(df.format(valorIngresado * 0.9678).replace(",", "."));
                editPsi.setText(df.format(valorIngresado * 14.22).replace(",", "."));
                editMmHg.setText(df.format(valorIngresado * 735.6).replace(",", "."));
                editPlgHg.setText(df.format(valorIngresado * 28.96).replace(",","."));
                editInH2O.setText(df.format(valorIngresado * 393.7).replace(",","."));
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
                editInH2O.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editBar.setText(df.format(valorIngresado * 0.001333).replace(",", "."));
                editN_m2.setText(df.format(valorIngresado * 133.32).replace(",", "."));
                editAtm.setText(df.format(valorIngresado * 0.001315).replace(",", "."));
                editPsi.setText(df.format(valorIngresado * 0.01933).replace(",", "."));
                editKgf.setText(df.format(valorIngresado * 0.0013594).replace(",", "."));
                editPlgHg.setText(df.format(valorIngresado * 0.03937).replace(",","."));
                editInH2O.setText(df.format(valorIngresado * 0.53524).replace(",","."));
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
                editInH2O.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editBar.setText(df.format(valorIngresado * 0.033864).replace(",", "."));
                editN_m2.setText(df.format(valorIngresado * 3386.4).replace(",", "."));
                editAtm.setText(df.format(valorIngresado * 0.0334).replace(",", "."));
                editPsi.setText(df.format(valorIngresado * 0.49116).replace(",", "."));
                editKgf.setText(df.format(valorIngresado * 0.03453).replace(",", "."));
                editMmHg.setText(df.format(valorIngresado * 25.4).replace(",","."));
                editInH2O.setText(df.format(valorIngresado * 13.5951).replace(",","."));
            }
        }
    }

    public void opInH2O(CharSequence charSequence)
    {
        if(editInH2O.isFocused())
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
                editPlgHg.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editBar.setText(df.format(valorIngresado * 0.002491).replace(",", "."));
                editN_m2.setText(df.format(valorIngresado * 249.089).replace(",", "."));
                editAtm.setText(df.format(valorIngresado * 0.0024583).replace(",", "."));
                editPsi.setText(df.format(valorIngresado * 0.036127).replace(",", "."));
                editKgf.setText(df.format(valorIngresado * 0.00254).replace(",", "."));
                editMmHg.setText(df.format(valorIngresado * 1.86832).replace(",","."));
                editPlgHg.setText(df.format(valorIngresado * 0.073556).replace(",","."));
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
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirClase (Class clase)
    {
        Intent intent = new Intent(Presion.this,clase);
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