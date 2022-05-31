package mcm.edu.ph.manganaan_multicalc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bd, ba, bw, bp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bd = findViewById(R.id.bd);
        ba = findViewById(R.id.ba);
        bw = findViewById(R.id.bw);
        bp = findViewById(R.id.bp);

        bd.setOnClickListener(this);
        ba.setOnClickListener(this);
        bw.setOnClickListener(this);
        bp.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bd:
                Intent intent=new Intent(MainActivity.this,density.class);
                startActivity(intent);
                break;
            case R.id.ba:
                Intent intent1=new Intent(MainActivity.this,area.class);
                startActivity(intent1);
                break;
            case R.id.bw:
                Intent intent2=new Intent(MainActivity.this,weight.class);
                startActivity(intent2);
                break;
            case R.id.bp:
                Intent intent3=new Intent(MainActivity.this,power.class);
                startActivity(intent3);
                break;
            default:
                
        }
    }
}