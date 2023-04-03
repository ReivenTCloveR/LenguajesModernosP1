package com.example.proyecto1.List;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.example.proyecto1.R;
import java.util.List;

public class ListAdapter1 extends RecyclerView.Adapter<ListAdapter1.ViewHolder> {

    private List<ListElementR>mdatar;
    private final LayoutInflater mInflater;
    private final Context context;

    public ListAdapter1(List<ListElementR>itemList, Context context){
        this.mInflater = LayoutInflater.from(context);
        this.context= context;
        this.mdatar = itemList;
    }

    public int getItemCount(){return mdatar.size();}

    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = mInflater.inflate(R.layout.list_element, null);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ListAdapter1.ViewHolder holder, final int position){
        holder.bindData(mdatar.get(position));
    }

    public void setItem(List<ListElementR> items){mdatar=items;}

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView iconImage;
        TextView name, dia, hora, status;

        ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.nameTextView);
            dia = itemView.findViewById(R.id.tipoTextView);
            hora = itemView.findViewById(R.id.tipoTextView);
            status = itemView.findViewById(R.id.statusTextView);
        }

        void bindData(final ListElementR item) {
            name.setText(item.getName());
            dia.setText(item.getDia());
            hora.setText(item.getHora());
            status.setText(item.getStatus());
        }
    }
}
