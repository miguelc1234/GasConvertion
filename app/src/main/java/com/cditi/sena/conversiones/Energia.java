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

public class Energia extends AppCompatActivity
{
    EditText editJoule;
    EditText editKwh;
    EditText editKcal;
    EditText editCal;
    EditText editBtu;
    EditText editHphr;
    EditText editMjH;

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
        setContentView(R.layout.activity_energia);

        editJoule = (EditText) findViewById(R.id.editJoule);
        editKwh = (EditText) findViewById(R.id.editKwh);
        editKcal = (EditText) findViewById(R.id.editKcal);
        editCal = (EditText) findViewById(R.id.editCal);
        editBtu = (EditText) findViewById(R.id.editBtu);
        editHphr = (EditText) findViewById(R.id.editHphr);
        editMjH = (EditText) findViewById(R.id.editMjH);

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

        editMjH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opMjH(charSequence);

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
                editMjH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editKwh.setText(df.format(valorIngresado * 0.0000002777).replace(",","."));
                editKcal.setText(df.format(valorIngresado * 0.00023901).replace(",", "."));
                editCal.setText(df.format((valorIngresado * 0.00023901) * 1000).replace(",", "."));
                editBtu.setText(df.format(valorIngresado * 0.0009478).replace(",", "."));
                editHphr.setText(df.format(valorIngresado * 0.0000003728).replace(",", "."));
                editMjH.setText(df.format(valorIngresado * 0.000001).replace(",", "."));
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
                editMjH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editJoule.setText(df.format(valorIngresado * 3600000).replace(",","."));
                editKcal.setText(df.format(valorIngresado * 860.4).replace(",", "."));
                editCal.setText(df.format((valorIngresado * 860.4) * 1000).replace(",", "."));
                editBtu.setText(df.format(valorIngresado * 3412.2).replace(",", "."));
                editHphr.setText(df.format(valorIngresado * 1.341).replace(",", "."));
                editMjH.setText(df.format(valorIngresado * 3.6).replace(",", "."));
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
                editMjH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editJoule.setText(df.format(valorIngresado * 4184).replace(",","."));
                editKwh.setText(df.format(valorIngresado * 0.0011622).replace(",", "."));
                editCal.setText(df.format(valorIngresado * 1000).replace(",", "."));
                editBtu.setText(df.format(valorIngresado * 3.9657).replace(",", "."));
                editHphr.setText(df.format(valorIngresado * 0.001558).replace(",", "."));
                editMjH.setText(df.format(valorIngresado * 0.0041868).replace(",", "."));
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
                editMjH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editJoule.setText(df.format(valorIngresado / 0.23901).replace(",", "."));
                editKwh.setText(df.format(valorIngresado / 860400).replace(",", "."));
                editKcal.setText(df.format(valorIngresado / 1000).replace(",", "."));
                editBtu.setText(df.format(valorIngresado / 252.2).replace(",", "."));
                editHphr.setText(df.format(valorIngresado / 641620).replace(",", "."));
                editMjH.setText(df.format(valorIngresado * 238845.9).replace(",", "."));
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
                editMjH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editJoule.setText(df.format(valorIngresado * 1055).replace(",", "."));
                editKwh.setText(df.format(valorIngresado * 0.000293).replace(",", "."));
                editKcal.setText(df.format(valorIngresado * 0.2522).replace(",", "."));
                editCal.setText(df.format((valorIngresado * 0.2522) * 1000).replace(",", "."));
                editHphr.setText(df.format(valorIngresado * 0.00039302).replace(",", "."));
                editMjH.setText(df.format(valorIngresado * 0.001055056).replace(",", "."));
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
                editMjH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editJoule.setText(df.format(valorIngresado * 2684500).replace(",", "."));
                editKwh.setText(df.format(valorIngresado * 0.7457).replace(",", "."));
                editKcal.setText(df.format(valorIngresado * 641.62).replace(",", "."));
                editCal.setText(df.format((valorIngresado * 641.62) * 1000).replace(",", "."));
                editBtu.setText(df.format(valorIngresado * 2544.5).replace(",", "."));
                editMjH.setText(df.format(valorIngresado * 2.68452).replace(",", "."));
            }
        }
    }

    public void opMjH(CharSequence charSequence)
    {
        if(editMjH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editJoule.setText("");
                editKwh.setText("");
                editKcal.setText("");
                editCal.setText("");
                editBtu.setText("");
                editHphr.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editJoule.setText(df.format(valorIngresado * 1000000).replace(",", "."));
                editKwh.setText(df.format(valorIngresado * 0.277778).replace(",", "."));
                editKcal.setText(df.format(valorIngresado * 238.8459).replace(",", "."));
                editCal.setText(df.format(valorIngresado * 238845.9).replace(",", "."));
                editBtu.setText(df.format(valorIngresado * 947.8171).replace(",", "."));
                editHphr.setText(df.format(valorIngresado * 0.3725061).replace(",", "."));
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
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirClase (Class clase)
    {
        Intent intent = new Intent(Energia.this,clase);
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