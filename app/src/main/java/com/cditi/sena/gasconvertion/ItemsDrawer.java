package com.cditi.sena.gasconvertion;

/**
 * Created by Admin_Sena on 22/10/2015.
 */
public class ItemsDrawer
{
    public int icono;
    public String nombre;

    public ItemsDrawer(int icono, String nombre) {
        this.icono = icono;
        this.nombre = nombre;
    }

    public int getIcono() {
        return icono;
    }

    public void setIcono(int icono) {
        this.icono = icono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
