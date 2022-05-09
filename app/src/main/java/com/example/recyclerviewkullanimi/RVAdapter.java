package com.example.recyclerviewkullanimi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.CardViewTutucu> {

    private Context mContext;
    private List <String> disaridanGelenList;

    public RVAdapter(Context mContext, List<String> disaridanGelenList) {
        this.mContext = mContext;
        this.disaridanGelenList = disaridanGelenList;
    }


    public class CardViewTutucu extends RecyclerView.ViewHolder {


        public TextView satirYazi;
        public CardView cardView;

        public CardViewTutucu(View view){
            super (view);
            satirYazi = view.findViewById(R.id.satirYazi);
            cardView = view.findViewById(R.id.cardView);

        }


    }
    @NonNull
    @Override
    public CardViewTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_tasarim,parent,false);
        return new CardViewTutucu(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewTutucu holder, int position) {
            final String ulke = disaridanGelenList.get(position);
            holder.satirYazi.setText(ulke);
            holder.satirYazi.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(mContext,"Seçtiğiniz Ülke:"+ulke,Toast.LENGTH_LONG);
                }
            });
    }

    @Override
    public int getItemCount() {
        return disaridanGelenList.size();
    }
}
