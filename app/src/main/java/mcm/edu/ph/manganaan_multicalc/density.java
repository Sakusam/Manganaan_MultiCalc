package mcm.edu.ph.manganaan_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class density extends AppCompatActivity implements View.OnClickListener {
    EditText m, v;
    Button cd;
    TextView rd;

    formulas formulas = new formulas();
    components components = new components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_density);

        v = findViewById(R.id.v);
        m = findViewById(R.id.m);
        cd = findViewById(R.id.cd);
        rd = findViewById(R.id.rd);

        cd.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cd:
                components.setMass(Double.parseDouble(m.getText().toString()));
                components.setVolume(Double.parseDouble(v.getText().toString()));
                double answer = formulas.density(components.getMass(), components.getVolume());
                rd.setText("" + answer);
                break;

        }
    }
}

