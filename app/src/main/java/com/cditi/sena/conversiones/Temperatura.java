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

public class Temperatura extends AppCompatActivity
{
    EditText editC;
    EditText editK;
    EditText editF;
    EditText editR;

    double valorIngresado = 0;
    String valorVacio = "";

    DecimalFormat df = new DecimalFormat("0.00000000");

    private DrawerLayout menuDrawer;
    private ActionBarDrawerToggle toggle;
    ListView listaDrawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperatura);

        editC = (EditText) findViewById(R.id.editC);
        editK = (EditText) findViewById(R.id.editK);
        editF = (EditText) findViewById(R.id.editF);
        editR = (EditText) findViewById(R.id.editR);

        //Conversion para el Campo C°
        editC.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opC(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo K°

        editK.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opK(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo F°

        editF.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opF(charSequence);
            }

            @Override
            public void afterTextChanged(Editable editable)
            {}
        });

        //Conversion para el Campo R°

        editR.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opR(charSequence);
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

        // Relacionar el adaptador y la escucha de la lista del drawer
        listaDrawer.setAdapter(new AdapterDrawer(this, items));

        //Activar icono del menu que se despliega
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

    public void opC(CharSequence charSequence)
    {
        if(editC.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editK.setText("");
                editF.setText("");
                editR.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editK.setText(df.format(valorIngresado + 273).replace(",","."));
                //Convertir a atm
                editF.setText(df.format((1.8 * valorIngresado) + 32).replace(",", "."));
                //Convertir a Psi
                editR.setText(df.format(valorIngresado * 1.8).replace(",", "."));
            }
        }
    }

    public void opK(CharSequence charSequence)
    {
        if(editK.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editC.setText("");
                editF.setText("");
                editR.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editC.setText(df.format(valorIngresado - 273).replace(",","."));
                //Convertir a atm
                editF.setText(df.format((1.8 * valorIngresado) + 32).replace(",", "."));
                //Convertir a Psi
                editR.setText(df.format(valorIngresado * 1.8).replace(",", "."));
            }
        }
    }

    public void opF(CharSequence charSequence)
    {
        if(editF.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editC.setText("");
                editK.setText("");
                editR.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editC.setText(df.format((valorIngresado - 32) / 1.8).replace(",","."));
                //Convertir a atm
                editK.setText(df.format(valorIngresado + 273).replace(",", "."));
                //Convertir a Psi
                editR.setText(df.format(valorIngresado + 469.67).replace(",", "."));
            }
        }
    }

    public void opR(CharSequence charSequence)
    {
        if(editR.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editC.setText("");
                editK.setText("");
                editF.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editC.setText(df.format((valorIngresado - 32) / 1.8).replace(",", "."));
                //Convertir a atm
                editK.setText(df.format(valorIngresado / 1.8).replace(",", "."));
                //Convertir a Psi
                editF.setText(df.format(valorIngresado - 469.67).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_temperatura, menu);
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
        Intent intent = new Intent(Temperatura.this,clase);
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