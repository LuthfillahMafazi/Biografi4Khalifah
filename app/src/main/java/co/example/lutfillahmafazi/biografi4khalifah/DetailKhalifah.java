package co.example.lutfillahmafazi.biografi4khalifah;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailKhalifah extends AppCompatActivity {

    @BindView(R.id.imgDetail)
    ImageView imgDetail;
    @BindView(R.id.txtNamaDetail)
    TextView txtNamaDetail;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_khalifah);
        ButterKnife.bind(this);

        txtNamaDetail.setText(getIntent().getStringExtra("nk"));
        txtDetail.setText(getIntent().getStringExtra("dk"));
        Glide.with(this).load(getIntent().getIntExtra("gk",0));
    }
}
