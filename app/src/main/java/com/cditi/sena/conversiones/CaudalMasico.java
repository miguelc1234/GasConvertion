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

public class CaudalMasico extends AppCompatActivity
{

    EditText editKgH;
    EditText editKgS;
    EditText editGH;
    EditText editGS;
    EditText editLbH;
    EditText editLbS;

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
        setContentView(R.layout.activity_caudal_masico);

        editKgH = (EditText) findViewById(R.id.editKgH);
        editKgS = (EditText) findViewById(R.id.editKgS);
        editGH = (EditText) findViewById(R.id.editGH);
        editGS = (EditText) findViewById(R.id.editGS);
        editLbH = (EditText) findViewById(R.id.editLbH);
        editLbS = (EditText) findViewById(R.id.editLbS);

        //Conversion para el Campo KgH
        editKgH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opKgH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo KgS
        editKgS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opKgS(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo GH
        editGH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opGH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo GS
        editGS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opGS(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo LbH
        editLbH.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opLbH(charSequence);

            }

            @Override
            public void afterTextChanged(Editable editable) {
            }
        });

        //Conversion para el Campo LbS
        editLbS.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                opLbS(charSequence);

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
                        break;

                    case 15:
                        abrirClase(CaudalVolumetrico.class);
                        break;
                }

                menuDrawer.closeDrawer(listaDrawer);
            }
        });
    }

    public void abrirClase (Class clase)
    {
        Intent intent = new Intent(CaudalMasico.this,clase);
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

    public void opKgH(CharSequence charSequence)
    {
        if(editKgH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgS.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgS.setText(df.format(valorIngresado / 3600).replace(",","."));
                //Convertir a atm
                editGH.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format((valorIngresado * 1000) / 3600).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado / 0.453).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format((valorIngresado * 2.2075) * 0.0002778).replace(",", "."));
            }
        }
    }

    public void opKgS(CharSequence charSequence)
    {
        if(editKgS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado * 3600).replace(",","."));
                //Convertir a atm
                editGH.setText(df.format((valorIngresado * 1000) * 3600).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado * 1000).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado / 0.000125833).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado * 2.207505519).replace(",", "."));
            }
        }
    }

    public void opGH(CharSequence charSequence)
    {
        if(editGH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGS.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado / 1000).replace(",","."));
                //Convertir a atm
                editKgS.setText(df.format(valorIngresado / 3600000).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado / 3600).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format((valorIngresado / 1000) * 2.207505519).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado / 1630800).replace(",", "."));
            }
        }
    }

    public void opGS(CharSequence charSequence)
    {
        if(editGS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGH.setText("");
                editLbH.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format((valorIngresado / 1000) * 3600).replace(",", "."));
                //Convertir a atm
                editKgS.setText(df.format(valorIngresado / 1000).replace(",", "."));
                //Convertir a Psi
                editGH.setText(df.format(valorIngresado * 3600).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado / 0.126).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado / 452.938347).replace(",", "."));
            }
        }
    }

    public void opLbH(CharSequence charSequence)
    {
        if(editLbH.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbS.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado * 0.453).replace(",", "."));
                //Convertir a atm
                editKgS.setText(df.format((valorIngresado * 0.453) * 0.000277778).replace(",", "."));
                //Convertir a Psi
                editGH.setText(df.format(valorIngresado / 0.002207506).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado * 0.126).replace(",", "."));
                //Convertir a Psi
                editLbS.setText(df.format(valorIngresado / 3600).replace(",", "."));
            }
        }
    }

    public void opLbS(CharSequence charSequence)
    {
        if(editLbS.isFocused())
        {
            valorVacio = charSequence.toString();

            if(valorVacio.equalsIgnoreCase(""))
            {
                editKgH.setText("");
                editKgS.setText("");
                editGH.setText("");
                editGS.setText("");
                editLbH.setText("");
            }
            else
            {
                valorIngresado = Double.parseDouble(charSequence.toString());

                //Convertir a N/m2
                editKgH.setText(df.format(valorIngresado / 0.00061324).replace(",", "."));
                //Convertir a atm
                editKgS.setText(df.format(valorIngresado / 2.20750552).replace(",", "."));
                //Convertir a Psi
                editGH.setText(df.format((valorIngresado * 3600) * 453).replace(",", "."));
                //Convertir a Psi
                editGS.setText(df.format(valorIngresado / 0.002207806).replace(",", "."));
                //Convertir a Psi
                editLbH.setText(df.format(valorIngresado * 3600).replace(",", "."));
            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_caudal_masico, menu);
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
}
