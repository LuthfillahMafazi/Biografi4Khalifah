package co.example.lutfillahmafazi.biografi4khalifah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.myRecycle)
    RecyclerView myRecycle;

    String[] namaKhalifah,detailKhalifah;
    int[] gambarKhalifah;

    AdapterKhalifah adapterKhalifah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        namaKhalifah = getResources().getStringArray(R.array.khalifah);
        detailKhalifah = getResources().getStringArray(R.array.detail_khalifah);

        gambarKhalifah = new int[] {R.drawable.bakar,R.drawable.umar,R.drawable.utsman,R.drawable.ali};

        AdapterKhalifah adapterKhalifah = new AdapterKhalifah(this,namaKhalifah,detailKhalifah,gambarKhalifah);

        myRecycle.setHasFixedSize(true);
        myRecycle.setLayoutManager(new LinearLayoutManager(this));
        myRecycle.setAdapter(adapterKhalifah);
    }
}
