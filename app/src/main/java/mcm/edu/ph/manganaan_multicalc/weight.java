package mcm.edu.ph.manganaan_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weight extends AppCompatActivity implements View.OnClickListener {
    EditText massw, gravityw;
    Button cw;
    TextView rw;

    formulas formulas = new formulas();
    components components = new components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        massw = findViewById(R.id.massw);
        gravityw = findViewById(R.id.gravityw);
        cw = findViewById(R.id.cw);
        rw = findViewById(R.id.rw);

        cw.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.cp:
                components.setGravity(Double.parseDouble(gravityw.getText().toString()));
                components.setMass1(Double.parseDouble(massw.getText().toString()));
                double answer = formulas.weight(components.getMass1(), components.getGravity());
                rw.setText("" + answer);
                break;
        }
    }
}
