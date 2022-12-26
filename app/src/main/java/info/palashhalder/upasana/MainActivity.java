package info.palashhalder.upasana;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private Button btnIndex, btnGuruInvoke, btnToMind, btnHymn, btnPrayer, btnThanks, btnBow, btnSatyaDharma, btnWorship, btnSadhana, btnGuruLife, btnMessage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnIndex = findViewById(R.id.btnIndex);
        btnGuruInvoke = findViewById(R.id.btnGuruInvoke);
        btnToMind = findViewById(R.id.btnToMind);
        btnHymn = findViewById(R.id.btnHymn);
        btnPrayer = findViewById(R.id.btnPrayer);
        btnThanks = findViewById(R.id.btnThanks);
        btnBow = findViewById(R.id.btnBow);
        btnSatyaDharma = findViewById(R.id.btnSatyaDharma);
        btnWorship = findViewById(R.id.btnWorship);
        btnSadhana = findViewById(R.id.btnSadhana);
        btnGuruLife = findViewById(R.id.btnGuruLife);
        btnMessage = findViewById(R.id.btnMessage);

        btnIndex.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, IndexActivity.class);
                startActivity(intent);
            }
        });

        btnGuruInvoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, GuruInvokeActivity.class);
                startActivity(intent);
            }
        });

        btnToMind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondDayActivity.class);
                startActivity(intent);
            }
        });

        btnHymn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, ThirdDayActivity.class);
                startActivity(intent);
            }
        });
    }
}