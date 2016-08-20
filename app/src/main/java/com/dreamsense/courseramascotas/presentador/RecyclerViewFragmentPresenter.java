package com.dreamsense.courseramascotas.presentador;

import android.content.Context;

import com.dreamsense.courseramascotas.db.ConstructorMascotas;
import com.dreamsense.courseramascotas.fragments.IRecyclerViewFragmentView;
import com.dreamsense.courseramascotas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Gabriel on 05/08/2016.
 */
public class RecyclerViewFragmentPresenter implements IRecyclcerViewFragmentPresenter {

    private IRecyclerViewFragmentView iRecyclerViewFragmentView;
    private Context context;
    private ConstructorMascotas constructorMascotas;
    private ArrayList<Mascota> mascotas;

    public RecyclerViewFragmentPresenter(IRecyclerViewFragmentView iRecyclerViewFragmentView, Context context) {
        this.iRecyclerViewFragmentView = iRecyclerViewFragmentView;
        this.context = context;
        obtenerMascotasBaseDatos();
    }

    @Override
    public void obtenerMascotasBaseDatos() {
        constructorMascotas =  new ConstructorMascotas(context);
        mascotas = constructorMascotas.obtenerDatos();
        mostrarMascotasRV();
    }

    @Override
    public void mostrarMascotasRV() {
        iRecyclerViewFragmentView.inicializarAdaptadorRV(iRecyclerViewFragmentView.crearAdaptador(mascotas));
        iRecyclerViewFragmentView.generarLinearLayoutVertical();
    }
}
