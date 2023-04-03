package com.example.proyecto1.List;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.proyecto1.R;

import java.util.List;


public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {

    private List<ListElement> mdata;
    private final LayoutInflater mInflater;
    private final Context context;

    public ListAdapter(List<ListElement>itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context= context;
        this.mdata = itemList;
    }

    @Override
    public int getItemCount(){return mdata.size();}

    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ViewHolder(view);
    }

    public void onBindViewHolder(final ListAdapter.ViewHolder holder, final int position){
        holder.bindData(mdata.get(position));
    }

    public void setItem(List<ListElement> items){mdata=items;}

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView iconImage;
        TextView name,tipo, status;
        ViewHolder(View itemView){
            super(itemView);
            iconImage = itemView.findViewById(R.id.iconImagenView);
            name = itemView.findViewById(R.id.nameTextView);
            tipo = itemView.findViewById(R.id.tipoTextView);
            status = itemView.findViewById(R.id.statusTextView);
        }
        void bindData (final ListElement item){
            iconImage.setColorFilter(Color.parseColor(item.getColor()), PorterDuff.Mode.SRC_IN);
            name.setText(item.getName());
            tipo.setText(item.getTipo());
            status.setText(item.getStatus());
        }
    }

}
