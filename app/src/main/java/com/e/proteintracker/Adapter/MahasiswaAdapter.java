package com.e.proteintracker.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.e.proteintracker.Model.Mahasiswa;
import com.e.proteintracker.R;

import java.util.ArrayList;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaAdapter.ViewHolder>{
    ArrayList<Mahasiswa> mahasiswaArrayList;

    public MahasiswaAdapter(ArrayList<Mahasiswa>mahasiswaArrayList){
        this.mahasiswaArrayList = mahasiswaArrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =
                LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.card_view,
                parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {   //menghubungkan data, data dari konstruktor .
        holder.txtNama.setText(mahasiswaArrayList.get(position).getNama());
        holder.txtNim.setText(mahasiswaArrayList.get(position).getNim());
        holder.txtNoHp.setText(mahasiswaArrayList.get(position).getNohp());


    }

    @Override
    public int getItemCount() {
        return (mahasiswaArrayList !=null)? mahasiswaArrayList.size() :0;   //jika array mhs 0 maka akan kmbli ke ukuran array list awal
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        private TextView txtNim, txtNama, txtNoHp,  Imgx;

        public ViewHolder(View view){
            super(view);
            txtNama = view.findViewById(R.id.txtNama2);
            txtNim = view.findViewById(R.id.txtNim);
            txtNoHp = view.findViewById(R.id.txtNoHp);
            Imgx = view.findViewById(R.id.img);
        }

    }
}



