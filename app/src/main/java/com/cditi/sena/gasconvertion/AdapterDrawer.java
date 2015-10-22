package com.cditi.sena.gasconvertion;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

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
        return convertView;
    }
}
