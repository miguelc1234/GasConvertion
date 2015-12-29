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

public class Potencia extends AppCompatActivity
{

    EditText editW;
    EditText editKcalH;
    EditText editBtuH;
    EditText editHp;
    EditText editKw;

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
        setContentView(R.layout.activity_potencia);

        editW = (EditText) findViewById(R.id.editW);
        editKcalH = (EditText) findViewById(R.id.editKcalH);
        editBtuH = (EditText) findViewById(R.id.editBtuH);
        editHp = (EditText) findViewById(R.id.editHp);
        editKw = (EditText) findViewById(R.id.editKw);

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

        editKw.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {}

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                opKw(charSequence);

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
                editKw.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editKcalH.setText(df.format(valorIngresado * 0.8604).replace(",","."));
                editBtuH.setText(df.format(valorIngresado * 3.413).replace(",", "."));
                editHp.setText(df.format(valorIngresado * 0.001341).replace(",", "."));
                editKw.setText(df.format(valorIngresado * 0.001).replace(",", "."));
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
                editKw.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editW.setText(df.format(valorIngresado * 1.1611).replace(",","."));
                editBtuH.setText(df.format(valorIngresado * 3.9657).replace(",", "."));
                editHp.setText(df.format(valorIngresado * 0.001555).replace(",", "."));
                editKw.setText(df.format(valorIngresado * 0.00116263888888889).replace(",", "."));
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
                editKw.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editW.setText(df.format(valorIngresado * 0.2926).replace(",","."));
                editKcalH.setText(df.format(valorIngresado * 0.2522).replace(",", "."));
                editHp.setText(df.format(valorIngresado * 0.0003929).replace(",", "."));
                editKw.setText(df.format(valorIngresado * 0.0002928104).replace(",", "."));
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
                editKw.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editW.setText(df.format(valorIngresado * 745.7).replace(",","."));
                editKcalH.setText(df.format(valorIngresado * 641.62).replace(",", "."));
                editBtuH.setText(df.format(valorIngresado * 2545).replace(",", "."));
                editKw.setText(df.format(valorIngresado * 0.7456999).replace(",", "."));
            }
        }
    }

    public void opKw(CharSequence charSequence)
    {
        if(editKw.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editW.setText("");
                editKcalH.setText("");
                editBtuH.setText("");
                editHp.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                editW.setText(df.format(valorIngresado * 1000).replace(",","."));
                editKcalH.setText(df.format(valorIngresado * 860.112).replace(",", "."));
                editBtuH.setText(df.format(valorIngresado * 3415.179).replace(",", "."));
                editHp.setText(df.format(valorIngresado * 1.341022).replace(",", "."));
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
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirClase (Class clase)
    {
        Intent intent = new Intent(Potencia.this,clase);
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