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

public class Volumen extends AppCompatActivity
{
    EditText editM3;
    EditText editPlg3;
    EditText editFt3;
    EditText editCm3;
    EditText editLt;
    EditText editGal;

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
        setContentView(R.layout.activity_volumen);

        editM3 = (EditText) findViewById(R.id.editM3);
        editPlg3 = (EditText) findViewById(R.id.editPlg3);
        editFt3 = (EditText) findViewById(R.id.editFt3);
        editCm3 = (EditText) findViewById(R.id.editCm3);
        editLt = (EditText) findViewById(R.id.editLt);
        editGal = (EditText) findViewById(R.id.editGal);

        editM3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opM3(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editPlg3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opPlg3(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editFt3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opFt3(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editCm3.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opCm3(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editLt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opLt(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        editGal.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opGal(charSequence);
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

    public void opM3(CharSequence charSequence)
    {
        if(editM3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editPlg3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editPlg3.setText(df.format(valorIngresado * 61023.7).replace(",","."));
                editFt3.setText(df.format(valorIngresado * 35.314).replace(",", "."));
                editCm3.setText(df.format(valorIngresado * 1000000).replace(",", "."));
                editLt.setText(df.format(valorIngresado * 1000).replace(",", "."));
                editGal.setText(df.format(valorIngresado * 264.17).replace(",", "."));
            }
        }
    }

    public void opPlg3(CharSequence charSequence)
    {
        if(editPlg3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM3.setText(df.format(valorIngresado * 0.00001638).replace(",","."));
                editFt3.setText(df.format(valorIngresado * 0.0005787).replace(",", "."));
                editCm3.setText(df.format(valorIngresado * 16.38).replace(",", "."));
                editLt.setText(df.format(valorIngresado * 0.01638).replace(",", "."));
                editGal.setText(df.format(valorIngresado * 0.004329).replace(",", "."));
            }
        }
    }

    public void opFt3(CharSequence charSequence)
    {
        if(editFt3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editCm3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM3.setText(df.format(valorIngresado * 0.02831).replace(",","."));
                editPlg3.setText(df.format(valorIngresado * 1728).replace(",", "."));
                editCm3.setText(df.format(valorIngresado * 28317).replace(",", "."));
                editLt.setText(df.format(valorIngresado * 28.33).replace(",", "."));
                editGal.setText(df.format(valorIngresado * 7.4805).replace(",", "."));
            }
        }
    }

    public void opCm3(CharSequence charSequence)
    {
        if(editCm3.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editFt3.setText("");
                editLt.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM3.setText(df.format(valorIngresado * 0.000001).replace(",","."));
                editPlg3.setText(df.format(valorIngresado * 0.061).replace(",", "."));
                editFt3.setText(df.format(valorIngresado * 0.0000353).replace(",", "."));
                editLt.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                editGal.setText(df.format(valorIngresado * 0.0002642).replace(",", "."));
            }
        }
    }

    public void opLt(CharSequence charSequence)
    {
        if(editLt.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editGal.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM3.setText(df.format(valorIngresado * 0.001).replace(",","."));
                editPlg3.setText(df.format(valorIngresado * 61.023).replace(",", "."));
                editFt3.setText(df.format(valorIngresado * 0.0353).replace(",", "."));
                editCm3.setText(df.format(valorIngresado * 1000).replace(",", "."));
                editGal.setText(df.format(valorIngresado * 0.2642).replace(",", "."));
            }
        }
    }

    public void opGal(CharSequence charSequence)
    {
        if(editGal.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editM3.setText("");
                editPlg3.setText("");
                editFt3.setText("");
                editCm3.setText("");
                editLt.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editM3.setText(df.format(valorIngresado * 0.003785).replace(",","."));
                editPlg3.setText(df.format(valorIngresado * 231).replace(",", "."));
                editFt3.setText(df.format(valorIngresado * 0.1337).replace(",", "."));
                editCm3.setText(df.format(valorIngresado * 3785).replace(",", "."));
                editLt.setText(df.format(valorIngresado * 3.785).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_volumen, menu);
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
        Intent intent = new Intent(Volumen.this,clase);
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