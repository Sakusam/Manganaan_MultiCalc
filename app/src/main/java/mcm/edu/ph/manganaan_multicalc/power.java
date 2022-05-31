package mcm.edu.ph.manganaan_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class power extends AppCompatActivity implements View.OnClickListener {
    EditText wdp, ttp;
    Button cp;
    TextView rp;

    formulas formulas = new formulas();
    components components = new components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_power);

        cp = findViewById(R.id.cp);
        wdp = findViewById(R.id.wdp);
        ttp = findViewById(R.id.ttp);
        rp = findViewById(R.id.rp);

        cp.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cp:
                components.setWork(Double.parseDouble(wdp.getText().toString()));
                components.setTime(Double.parseDouble(ttp.getText().toString()));
                double answer = formulas.power(components.getWork(), components.getTime());
                rp.setText("" + answer);
                break;
        }
    }
}
