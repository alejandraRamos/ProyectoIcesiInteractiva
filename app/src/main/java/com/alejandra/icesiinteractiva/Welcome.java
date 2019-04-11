package com.alejandra.icesiinteractiva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    private TextView tv_welcome;
    private Button btn_continuar_welcome;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        tv_welcome = findViewById(R.id.tv_welcome);

        tv_welcome.getBackground().setAlpha(79);

        btn_continuar_welcome = findViewById(R.id.btn_continuar_welcome);

        btn_continuar_welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), ProjectList.class);
                startActivity(intent);
            }
        });

    }
}
