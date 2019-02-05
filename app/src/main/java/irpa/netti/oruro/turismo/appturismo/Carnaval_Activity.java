package irpa.netti.oruro.turismo.appturismo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Carnaval_Activity extends AppCompatActivity {
    Button especialidades;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carnaval_);

        especialidades = findViewById(R.id.button);

        especialidades.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (Carnaval_Activity.this, Especialidades.class);
                startActivity(intent);
            }
        });

    }
}
