package com.developercute.moviecatalogue;

import android.content.Context;
import android.content.Intent;
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

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MyViewHolder> {
    private Context context;
    private ArrayList<MovieModel> data;

    public MovieAdapter(Context context, ArrayList<MovieModel> data) {
        this.context = context;
        this.data = data;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list_movie, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        final MovieModel p = data.get(position);
        holder.foto.setImageResource(p.getPhoto());
        holder.judulTV.setText(p.getJudulTV());
        holder.deskTV.setText(p.getDescTV());
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, DetailMovie.class);
                intent.putExtra("foto",p.getPhoto());
                intent.putExtra("judulTV",p.getJudulTV());
                intent.putExtra("deskTV",p.getDescTV());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private CardView cardView;
        private ImageView foto;
        private TextView judulTV, deskTV;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            cardView = itemView.findViewById(R.id.cardView);
            foto = itemView.findViewById(R.id.foto);
            judulTV = itemView.findViewById(R.id.judulTV);
            deskTV = itemView.findViewById(R.id.deskTV);
        }
    }
}
