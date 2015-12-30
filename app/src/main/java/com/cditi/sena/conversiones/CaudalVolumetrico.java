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

    private DrawerLayout menuDrawer;
    private ActionBarDrawerToggle toggle;
    ListView listaDrawer;

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

                editFt3H.setText(df.format(valorIngresado * 3600).replace(",","."));
                editGalS.setText(df.format(valorIngresado * 7.4805).replace(",", "."));
                editGalH.setText(df.format((valorIngresado * 7.4805) * 3600).replace(",", "."));
                editM3S.setText(df.format(valorIngresado * 0.028316).replace(",", "."));
                editM3H.setText(df.format((valorIngresado * 0.028316) * 3600).replace(",", "."));
                editCm3S.setText(df.format((valorIngresado * 0.028316) * 1000000).replace(",", "."));
                editCm3H.setText(df.format((valorIngresado * 28316) * 3600).replace(",", "."));
                editLS.setText(df.format(valorIngresado * 28.31).replace(",", "."));
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

                editFt3S.setText(df.format(valorIngresado / 3600).replace(",","."));
                editGalS.setText(df.format((valorIngresado * 7.4805) / 3600).replace(",", "."));
                editGalH.setText(df.format(valorIngresado * 7.4805).replace(",", "."));
                editM3S.setText(df.format((valorIngresado * 0.028316) / 3600).replace(",", "."));
                editM3H.setText(df.format(valorIngresado * 0.028316).replace(",", "."));
                editCm3S.setText(df.format((valorIngresado * 28316) / 3600).replace(",", "."));
                editCm3H.setText(df.format(valorIngresado * 28316).replace(",", "."));
                editLS.setText(df.format((valorIngresado * 28.31) / 3600).replace(",", "."));
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

                editFt3S.setText(df.format(valorIngresado * 0.1337).replace(",","."));
                editFt3H.setText(df.format((valorIngresado * 0.1337) * 3600).replace(",", "."));
                editGalH.setText(df.format(valorIngresado * 3600).replace(",", "."));
                editM3S.setText(df.format(valorIngresado * 0.003785).replace(",", "."));
                editM3H.setText(df.format((valorIngresado * 0.003785) * 3600).replace(",", "."));
                editCm3S.setText(df.format(valorIngresado * 3785).replace(",", "."));
                editCm3H.setText(df.format((valorIngresado * 3785) * 3600).replace(",", "."));
                editLS.setText(df.format((valorIngresado * 3785) / 1000).replace(",", "."));
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

                editFt3S.setText(df.format((valorIngresado * 0.1337) / 3600).replace(",","."));
                editFt3H.setText(df.format(valorIngresado * 0.1337).replace(",", "."));
                editGalS.setText(df.format(valorIngresado / 3600).replace(",", "."));
                editM3S.setText(df.format((valorIngresado * 0.003785) / 3600).replace(",", "."));
                editM3H.setText(df.format(valorIngresado * 0.003785).replace(",", "."));
                editCm3S.setText(df.format(valorIngresado * 1.051).replace(",", "."));
                editCm3H.setText(df.format((valorIngresado * 1.051) * 3600).replace(",", "."));
                editLS.setText(df.format((valorIngresado * 0.001) / 3600).replace(",", "."));
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

                editFt3S.setText(df.format(valorIngresado / 0.028316).replace(",", "."));
                editFt3H.setText(df.format((valorIngresado * 35.31572256) * 3600).replace(",", "."));
                editGalS.setText(df.format(valorIngresado * 264.17).replace(",", "."));
                editGalH.setText(df.format((valorIngresado * 264.17) * 3600).replace(",", "."));
                editM3H.setText(df.format(valorIngresado * 3600).replace(",", "."));
                editCm3S.setText(df.format(valorIngresado * 1000000).replace(",", "."));
                editCm3H.setText(df.format((valorIngresado * 1000000) * 3600).replace(",", "."));
                editLS.setText(df.format(valorIngresado * 1000).replace(",", "."));
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

                editFt3S.setText(df.format(valorIngresado / 11.9376).replace(",", "."));
                editFt3H.setText(df.format(valorIngresado * 35.314).replace(",", "."));
                editGalS.setText(df.format((valorIngresado * 35.314) / 3600).replace(",", "."));
                editGalH.setText(df.format((valorIngresado * 0.009809444) * 3600).replace(",", "."));
                editM3S.setText(df.format(valorIngresado / 3600).replace(",", "."));
                editCm3S.setText(df.format((valorIngresado * 1000000) / 3600).replace(",", "."));
                editCm3H.setText(df.format((valorIngresado * 277.7778) * 3600).replace(",", "."));
                editLS.setText(df.format((valorIngresado *1000) / 3600).replace(",", "."));
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

                editFt3S.setText(df.format(valorIngresado * 0.0000353).replace(",", "."));
                editFt3H.setText(df.format(valorIngresado * 0.127133).replace(",", "."));
                editGalS.setText(df.format(valorIngresado * 0.0002642).replace(",", "."));
                editGalH.setText(df.format(valorIngresado * 0.951019).replace(",", "."));
                editM3S.setText(df.format(valorIngresado * 0.000001).replace(",", "."));
                editM3H.setText(df.format((valorIngresado * 0.000001) * 3600).replace(",", "."));
                editCm3H.setText(df.format(valorIngresado * 3600).replace(",", "."));
                editLS.setText(df.format(valorIngresado * 0.001).replace(",", "."));
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

                editFt3S.setText(df.format((valorIngresado * 0.0000353) / 3600).replace(",", "."));
                editFt3H.setText(df.format(valorIngresado * 0.0000353).replace(",", "."));
                editGalS.setText(df.format((valorIngresado * 0.0002642) / 3600).replace(",", "."));
                editGalH.setText(df.format(valorIngresado * 0.0002642).replace(",", "."));
                editM3S.setText(df.format((valorIngresado * 0.000001) / 3600).replace(",", "."));
                editM3H.setText(df.format(valorIngresado * 0.000001).replace(",", "."));
                editCm3S.setText(df.format(valorIngresado / 3600).replace(",", "."));
                editLS.setText(df.format((valorIngresado * 0.001) / 3600).replace(",", "."));
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

                editFt3S.setText(df.format(valorIngresado * 0.0353).replace(",", "."));
                editFt3H.setText(df.format((valorIngresado * 0.0353) * 3600).replace(",", "."));
                editGalS.setText(df.format(valorIngresado * 0.2642).replace(",", "."));
                editGalH.setText(df.format((valorIngresado * 0.2642) * 3600).replace(",", "."));
                editM3S.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                editM3H.setText(df.format((valorIngresado * 0.001) * 3600).replace(",", "."));
                editCm3S.setText(df.format(valorIngresado * 1000).replace(",", "."));
                editCm3H.setText(df.format((valorIngresado * 1000) * 3600).replace(",", "."));
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

                editFt3S.setText(df.format((valorIngresado * 0.0353) / 3600).replace(",", "."));
                editFt3H.setText(df.format(valorIngresado * 0.0353).replace(",", "."));
                editGalS.setText(df.format((valorIngresado * 0.2642) / 3600).replace(",", "."));
                editGalH.setText(df.format(valorIngresado * 0.2642).replace(",", "."));
                editM3S.setText(df.format((valorIngresado * 0.001) / 3600).replace(",", "."));
                editM3H.setText(df.format(valorIngresado * 0.001).replace(",", "."));
                editCm3S.setText(df.format((valorIngresado * 1000) / 3600).replace(",", "."));
                editCm3H.setText(df.format(valorIngresado * 1000).replace(",", "."));
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
        if (toggle.onOptionsItemSelected(item))
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void abrirClase (Class clase)
    {
        Intent intent = new Intent(CaudalVolumetrico.this,clase);
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
