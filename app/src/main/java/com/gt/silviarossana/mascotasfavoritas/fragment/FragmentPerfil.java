package com.gt.silviarossana.mascotasfavoritas.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gt.silviarossana.mascotasfavoritas.R;
import com.gt.silviarossana.mascotasfavoritas.adapter.MascotaAdaptador;
import com.gt.silviarossana.mascotasfavoritas.adapter.MascotaAdaptadorPerfil;
import com.gt.silviarossana.mascotasfavoritas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Silvia Rossana on 29/01/2017.
 */

public class FragmentPerfil extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);


        this.listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotasPerfil);
        /*LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);*/
        GridLayoutManager glm = new GridLayoutManager(getActivity(), 3);
        this.listaMascotas.setLayoutManager(glm);

            /*Bundle parametro = getIntent().getExtras();
            Toast.makeText(this, "Diste like a " + parametro, Toast.LENGTH_SHORT).show();
            if (getIntent().getExtras() != null) {
                mascotas = (ArrayList<Mascota>) getIntent().getSerializableExtra("arrayMascotas");
            } else {
                this.inicializarListaMascotas();
            }*/

        this.inicializarListaMascotas();
        this.inicializarAdaptador();
        //FloatingActionButton miFab = (FloatingActionButton) findViewById(R.id.fabMiFab);

        return v;

    }


    public void inicializarAdaptador(){

        MascotaAdaptadorPerfil adaptador = new MascotaAdaptadorPerfil(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }


    public void inicializarListaMascotas(){

        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "5"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "8"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "50"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "10"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "30"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "2"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "8"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "9"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "12"));
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "16"));
    }

}
