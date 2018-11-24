package co.example.lutfillahmafazi.biografi4khalifah;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterKhalifah extends RecyclerView.Adapter<AdapterKhalifah.ViewHolder> {

    Context context;
    String[] namaKhalifah,detailKhalifah;
    int[] gambarKhalifah;

    public AdapterKhalifah(Context context, String[] namaKhalifah, String[] detailKhalifah, int[] gambarKhalifah) {
        this.context = context;
        this.namaKhalifah = namaKhalifah;
        this.detailKhalifah = detailKhalifah;
        this.gambarKhalifah = gambarKhalifah;
    }

    @NonNull
    @Override
    public AdapterKhalifah.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_khalifah,viewGroup,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterKhalifah.ViewHolder viewHolder, final int i) {
        viewHolder.txtKhalifah.setText(namaKhalifah[i]);
        Glide.with(context).load(gambarKhalifah[i]).into(viewHolder.imgKhalifah);

        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,DetailKhalifah.class);
                intent.putExtra("nk",namaKhalifah[i]);
                intent.putExtra("dk",detailKhalifah[i]);
                intent.putExtra("gk",gambarKhalifah[i]);

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return gambarKhalifah.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView txtKhalifah;
        ImageView imgKhalifah;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            txtKhalifah = itemView.findViewById(R.id.txtlist);
            imgKhalifah = itemView.findViewById(R.id.imglist);

        }
    }
}
