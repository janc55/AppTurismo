package irpa.netti.oruro.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class OruroActivity extends AppCompatActivity {

    ImageView historia, carac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oruro);

        historia = findViewById(R.id.imageView2);
        carac = findViewById(R.id.imageView3);

        historia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OruroActivity.this,HistoriaActivity.class);
                startActivity(intent);
            }
        });
    }
}
