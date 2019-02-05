package irpa.netti.oruro.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button oruro,carnaval,lugares,atrac,contactos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        oruro = findViewById(R.id.btOruro);
        carnaval = findViewById(R.id.btCarnaval);
        lugares = findViewById(R.id.btLugares);
        atrac = findViewById(R.id.btAtrac);
        contactos = findViewById(R.id.btContactos);

        oruro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, OruroActivity.class);
                startActivity(intent);
            }
        });

        carnaval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(MainActivity.this, Carnaval_Activity.class);
            startActivity(intent);
            }
        }
        );

    }
}
