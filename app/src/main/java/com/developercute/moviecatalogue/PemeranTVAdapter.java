package com.developercute.moviecatalogue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class PemeranTVAdapter extends RecyclerView.Adapter<PemeranTVAdapter.MyViewHolder>{
    private Context context;
    private List<PemeranModel> data;

    public PemeranTVAdapter(Context context, List<PemeranModel> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_pemeran, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final PemeranModel p = data.get(position);
        holder.foto.setImageResource(p.getPhoto());
        holder.pemeran.setText(p.getPemeran());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView foto;
        private TextView pemeran;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            foto = itemView.findViewById(R.id.foto);
            pemeran = itemView.findViewById(R.id.pemeran);
        }
    }
}

