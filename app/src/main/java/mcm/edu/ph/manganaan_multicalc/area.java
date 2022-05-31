package mcm.edu.ph.manganaan_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class area extends AppCompatActivity implements View.OnClickListener {
    TextView ra;
    Button ca;
    EditText L, W;

    formulas formulas = new formulas();
    components components = new components();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        ca = findViewById(R.id.ca);
        L= findViewById(R.id.L);
        W= findViewById(R.id.W);
        ra= findViewById(R.id.ra);


        ca.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.ca:
                components.setWidth(Double.parseDouble(W.getText().toString()));
                components.setLength(Double.parseDouble(L.getText().toString()));
                double answer = formulas.area(components.getWidth(), components.getLength());
                ra.setText("" + answer);
                break;
        }
    }
}
