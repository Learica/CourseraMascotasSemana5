package com.dreamsense.courseramascotas.fragments;

import com.dreamsense.courseramascotas.adaptador.MascotaAdaptador;
import com.dreamsense.courseramascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Gabriel on 05/08/2016.
 */
public interface IRecyclerViewFragmentView {

    public void generarLinearLayoutVertical();

    public MascotaAdaptador crearAdaptador(ArrayList<Mascota> mascotas);

    public void inicializarAdaptadorRV(MascotaAdaptador adaptador);

}
