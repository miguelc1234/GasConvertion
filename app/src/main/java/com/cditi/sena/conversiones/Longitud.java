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

public class Longitud extends AppCompatActivity
{
    EditText editM;
    EditText editPlg;
    EditText editFt;
    EditText editMilla;
    EditText editCm;

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
        setContentView(R.layout.activity_longitud);

        editM = (EditText) findViewById(R.id.editM);
        editPlg = (EditText) findViewById(R.id.editPlg);
        editFt = (EditText) findViewById(R.id.editFt);
        editMilla = (EditText) findViewById(R.id.editMilla);
        editCm = (EditText) findViewById(R.id.editCm);

        editM.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opM(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editPlg.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opPlg(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editFt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opFt(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editMilla.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opMilla(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editCm.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opCm(charSequence);
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

    public void opM(CharSequence charSequence)
    {
        if(editM.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editPlg.setText("");
                editFt.setText("");
                editMilla.setText("");
                editCm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editPlg.setText(df.format(valorIngresado * 39.37).replace(",","."));
                editFt.setText(df.format(valorIngresado * 3.2808).replace(",", "."));
                editMilla.setText(df.format(valorIngresado * 0.0006214).replace(",", "."));
                editCm.setText(df.format(valorIngresado * 100).replace(",", "."));
            }
        }
    }

    public void opPlg(CharSequence charSequence)
    {
        if(editPlg.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM.setText("");
                editFt.setText("");
                editMilla.setText("");
                editCm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM.setText(df.format(valorIngresado * 0.0254).replace(",","."));
                editFt.setText(df.format(valorIngresado * 0.08333).replace(",", "."));
                editMilla.setText(df.format(valorIngresado * 0.0000158).replace(",", "."));
                editCm.setText(df.format(valorIngresado * 2.54).replace(",", "."));
            }
        }
    }

    public void opFt(CharSequence charSequence)
    {
        if(editFt.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM.setText("");
                editPlg.setText("");
                editMilla.setText("");
                editCm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM.setText(df.format(valorIngresado * 0.3048).replace(",","."));
                editPlg.setText(df.format(valorIngresado * 12).replace(",", "."));
                editMilla.setText(df.format(valorIngresado * 0.00018939).replace(",", "."));
                editCm.setText(df.format(valorIngresado * 30.48).replace(",", "."));
            }
        }
    }

    public void opMilla(CharSequence charSequence)
    {
        if(editMilla.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM.setText("");
                editPlg.setText("");
                editFt.setText("");
                editCm.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM.setText(df.format(valorIngresado * 1610).replace(",","."));
                editPlg.setText(df.format(valorIngresado * 63360).replace(",", "."));
                editFt.setText(df.format(valorIngresado * 5280).replace(",", "."));
                editCm.setText(df.format(valorIngresado * 160934.4).replace(",", "."));
            }
        }
    }

    public void opCm(CharSequence charSequence)
    {
        if(editCm.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM.setText("");
                editPlg.setText("");
                editFt.setText("");
                editMilla.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM.setText(df.format(valorIngresado * 0.01).replace(",","."));
                editPlg.setText(df.format(valorIngresado * 0.393701).replace(",", "."));
                editFt.setText(df.format(valorIngresado * 0.0328083).replace(",", "."));
                editMilla.setText(df.format(valorIngresado * 0.0000062).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_longitud, menu);
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
        Intent intent = new Intent(Longitud.this,clase);
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