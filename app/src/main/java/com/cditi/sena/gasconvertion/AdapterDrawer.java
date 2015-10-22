package com.cditi.sena.gasconvertion;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin_Sena on 22/10/2015.
 */
public class AdapterDrawer extends ArrayAdapter
{
    public AdapterDrawer(Context context, List objects)
    {
        super(context, 0, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent)
    {
        if(convertView == null)
        {
            LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.menu_drawer, null);
        }

        ItemsDrawer itemsDrawer = (ItemsDrawer)getItem(position);

        ImageView icono = (ImageView)convertView.findViewById(R.id.imgIcono);
        TextView nombre = (TextView)convertView.findViewById(R.id.txtNombre);

        icono.setImageResource(itemsDrawer.getIcono());
        nombre.setText(itemsDrawer.getNombre());

        return convertView;
    }
}
