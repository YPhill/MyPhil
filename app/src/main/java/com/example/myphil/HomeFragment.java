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

public class HomeFragment extends Fragment {

    ListView lstDoc;

    String nomeDoc[] = {"Documento", "Documento", "Documento", "Documento"};
    String descricaoDoc[] = {
            "Tipo De Documento: RG  \nLocalizado em: Estação Primavera",
            "Tipo De Documento: Carteira de trabalho  \nLocalizado em: Estação Luz",
            "Tipo De Documento: CPF  \nLocalizado em: Estação Pinheiros",
            "Tipo De Documento: Título de Eleitor  \nLocalizado em: Estação Lapa"
    };

    int imgDoc[] = {
            R.drawable.rg1, R.drawable.carteiratbl,
            R.drawable.cpf, R.drawable.tituloele
    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        lstDoc = view.findViewById(R.id.lstDoc);

        AdapterDoc adapterDoc = new AdapterDoc();

        lstDoc.setAdapter(adapterDoc);

        return view;
    }

    public class AdapterDoc extends BaseAdapter {


        @Override
        public int getCount() {
            return imgDoc.length;
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
            TextView txtNomeDoc, txtDescricaoDoc;
            ImageView imgModeloDoc;

            View v = getLayoutInflater().inflate(R.layout.modelocard,null);

            txtNomeDoc = v.findViewById(R.id.txtNomeDoc);
            txtDescricaoDoc = v.findViewById(R.id.txtDescricaoDoc);
            imgModeloDoc = v.findViewById(R.id.imgModeloDoc);

            txtNomeDoc.setText(nomeDoc[i]);
            txtDescricaoDoc.setText(descricaoDoc[i]);
            imgModeloDoc.setImageResource(imgDoc[i]);

            return v;
        }
    }

}