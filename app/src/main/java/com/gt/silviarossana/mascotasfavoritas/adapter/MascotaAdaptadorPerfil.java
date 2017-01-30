package com.gt.silviarossana.mascotasfavoritas.adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.gt.silviarossana.mascotasfavoritas.R;
import com.gt.silviarossana.mascotasfavoritas.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by Silvia Rossana on 29/01/2017.
 */

public class MascotaAdaptadorPerfil extends RecyclerView.Adapter<MascotaAdaptadorPerfil.MascotaAdaptadorPerfilViewHolder>{

    ArrayList<Mascota> mascotas;
    Activity activity;


    public MascotaAdaptadorPerfil(ArrayList<Mascota> mascotas, Activity activity){
        this.mascotas = mascotas;
        this.activity = activity;
    }

    @Override
    public MascotaAdaptadorPerfil.MascotaAdaptadorPerfilViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascota_perfil, parent, false);
        return new MascotaAdaptadorPerfil.MascotaAdaptadorPerfilViewHolder(v);
    }


    @Override
    public void onBindViewHolder(final MascotaAdaptadorPerfil.MascotaAdaptadorPerfilViewHolder holder, int position) {


        final Mascota mascota = mascotas.get(position);
        holder.imgFotoPerfil.setImageResource(mascota.getFoto());
        //holder.tvNombreMascotaCV.setText(mascota.getNombre());
        holder.tvLikeMascotaCVPerfil.setText(mascota.getNumLike());

        /*holder.btnLike.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "Diste like a " + mascota.getNombre(), Toast.LENGTH_SHORT).show();
                //Aumentar el número de likes
                holder.tvLikeMascotaCV.setText((Integer.parseInt(mascota.getNumLike())+1)+"");
                mascota.setNumLike((Integer.parseInt(mascota.getNumLike())+1)+"");
            }
        });*/

    }


    @Override
    public int getItemCount() {
        return this.mascotas.size();
    }


    public static class MascotaAdaptadorPerfilViewHolder extends RecyclerView.ViewHolder{

        private ImageView imgFotoPerfil;
        //private TextView tvNombreMascotaCV;
        private TextView tvLikeMascotaCVPerfil;
        private ImageButton btnCantLikePerfil;

        public MascotaAdaptadorPerfilViewHolder(View itemView) {
            super(itemView);

            this.imgFotoPerfil = (ImageView)itemView.findViewById(R.id.imgFotoPerfil);
            //this.tvNombreMascotaCV = (TextView)itemView.findViewById(R.id.tvNombreMascotaCV);
            this.tvLikeMascotaCVPerfil = (TextView)itemView.findViewById(R.id.tvLikeMascotaCVPerfil);
            this.btnCantLikePerfil = (ImageButton)itemView.findViewById(R.id.btnCantLikePerfil);
        }
    }

}

