package com.gt.silviarossana.mascotasfavoritas.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.gt.silviarossana.mascotasfavoritas.MascotasFavoritas;
import com.gt.silviarossana.mascotasfavoritas.R;
import com.gt.silviarossana.mascotasfavoritas.adapter.MascotaAdaptador;
import com.gt.silviarossana.mascotasfavoritas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Silvia Rossana on 29/01/2017.
 */

public class FragmentHome extends Fragment {

    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_home, container, false);


        this.listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        /*GridLayoutManager glm = new GridLayoutManager(this, 2);*/
        this.listaMascotas.setLayoutManager(llm);

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

        MascotaAdaptador adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }


    public void inicializarListaMascotas(){

        mascotas = new ArrayList<>();
        mascotas.add(new Mascota("Pochito", R.drawable.perritouno, "5"));
        mascotas.add(new Mascota("Perla", R.drawable.perritodos, "8"));
        mascotas.add(new Mascota("Estrella", R.drawable.perritotres, "50"));
        mascotas.add(new Mascota("Puppy", R.drawable.perritocuatro, "10"));
        mascotas.add(new Mascota("Blaqui", R.drawable.perritocinco, "30"));
    }

    public void irMascotasFavoritas(View view){

        Intent intent = new Intent(getActivity(), MascotasFavoritas.class);
        //intent.putExtra("arrayMascotas", mascotas);

        startActivity(intent);

    }

}
