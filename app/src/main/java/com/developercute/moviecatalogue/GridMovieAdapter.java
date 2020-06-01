package com.developercute.moviecatalogue;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class GridMovieAdapter extends RecyclerView.Adapter<GridMovieAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<MovieModel> data;

    public GridMovieAdapter(Context context, ArrayList<MovieModel> data) {
        this.context = context;
        this.data = data;
    }

    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_grid_movie, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final MovieModel p = data.get(position);
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context, p.getJudulTV(), Toast.LENGTH_SHORT).show();
            }
        });
        holder.foto.setImageResource(p.getPhoto());
        holder.judulTV.setText(p.getJudulTV());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView foto;
        private TextView judulTV;
        private CardView cardView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardview);
            foto = itemView.findViewById(R.id.foto);
            judulTV = itemView.findViewById(R.id.judulTV);
        }
    }
}
