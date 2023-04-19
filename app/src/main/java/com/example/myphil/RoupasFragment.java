package com.example.myphil;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;


public class RoupasFragment extends Fragment {

    ListView lstRoupa;

    String nomeRoupa[] = {"Roupa", "Roupa", "Roupa", "Roupa"};
    String descricaoRoupa[] = {
            "Tipo De Roupa: Boné  \nLocalizado em: Estação Autodrómo",
            "Tipo De Roupa: Blusa preta  \nLocalizado em: Estação Pinheiros",
            "Tipo De Roupa: Luva preta  \nLocalizado em: Estação Guarulhos",
            "Tipo De Roupa: Blusa branca  \nLocalizado em: Estação Primavera"
    };

    int imgRoupa[] = {
            R.drawable.bone, R.drawable.carteiratbl,
            R.drawable.cpf, R.drawable.tituloele
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_roupas, container, false);

        lstRoupa = view.findViewById(R.id.lstRoupa);

        AdapterRoupa adapterRoupa = new AdapterRoupa();

        lstRoupa.setAdapter(adapterRoupa);

        return view;

    }

    public class AdapterRoupa extends BaseAdapter{

        @Override
        public int getCount() {
            return imgRoupa.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            TextView txtNomeRoupa, txtDescricaoRoupa;
            ImageView imgModeloRoupa;

            View v = getLayoutInflater().inflate(R.layout.modeloroupa, null);

            txtNomeRoupa = v.findViewById(R.id.txtNomeRoupa);
            txtDescricaoRoupa = v.findViewById(R.id.txtDescricaoRoupa);
            imgModeloRoupa = v.findViewById(R.id.imgModeloRoupa);

            txtNomeRoupa.setText(nomeRoupa[i]);
            txtDescricaoRoupa.setText(descricaoRoupa[i]);
            imgModeloRoupa.setImageResource(imgRoupa[i]);

            return v;
        }
    }

}