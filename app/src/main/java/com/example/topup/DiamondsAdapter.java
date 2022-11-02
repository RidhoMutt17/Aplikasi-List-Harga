package com.example.topup;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DiamondsAdapter extends RecyclerView.Adapter<DiamondsAdapter.DiamondsViewHolder> {
    ArrayList<Diamonds> arrayListDiamonds;

    public DiamondsAdapter(ArrayList<Diamonds> arrayListDiamonds) {
        this.arrayListDiamonds = arrayListDiamonds;
    }

    @NonNull
    @Override
    public DiamondsAdapter.DiamondsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new DiamondsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DiamondsAdapter.DiamondsViewHolder holder, int position) {
        final Diamonds diamonds = arrayListDiamonds.get(position);

        holder.textViewdiamonds.setText(diamonds.getDiamonds());
        holder.textViewbonus.setText(diamonds.getBonus());
        holder.textViewharga.setText(diamonds.getHarga());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailMobileLegendsActivity.class);
                intent.putExtra("Diamonds", diamonds);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayListDiamonds.size();
    }

    public class DiamondsViewHolder extends RecyclerView.ViewHolder {
        TextView textViewdiamonds, textViewbonus, textViewharga;
        public DiamondsViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewdiamonds = itemView.findViewById(R.id.diamonds);
            textViewbonus = itemView.findViewById(R.id.bonus);
            textViewharga = itemView.findViewById(R.id.harga);
        }
    }
}
