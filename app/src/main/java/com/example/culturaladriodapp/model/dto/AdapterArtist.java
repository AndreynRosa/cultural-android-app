package com.example.culturaladriodapp.model.dto;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.culturaladriodapp.R;

import java.util.List;

public class AdapterArtist extends BaseAdapter {

    private LayoutInflater inflater;
    private List<Artist> listArtist;
    private Context context;

    public AdapterArtist(List<Artist> listArtist, Context context){
        this.listArtist =  listArtist;
        this.context = context;
        this.inflater  = LayoutInflater.from(context);
    }
    @Override
    public int getCount() {
        return listArtist.size();
    }

    @Override
    public Object getItem(int i) {
        return listArtist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return listArtist.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final  Artist artist = listArtist.get(i);

        view = inflater.inflate(R.layout.item_listview_artist, null);
        TextView tvNome = view.findViewById(R.id.tvNome);
        TextView tvSobreNome = view.findViewById(R.id.tvSobreNome);
        TextView tvCpf = view.findViewById(R.id.tvCpf);

       tvNome.setText(artist.getName());
       tvSobreNome.setText(artist.getLastName());
       tvCpf.setText(artist.getIndividualRegistration());
        return view;
    }

    public void add(Artist artist){
        listArtist.add(artist);
        this.notifyDataSetChanged();
    }
}
