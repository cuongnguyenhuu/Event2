package com.nhc.cuongnguyen.event2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText txt_a ;
    EditText txt_b ;
    TextView kq  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         txt_a = (EditText) findViewById(R.id.so_a);
         txt_b = (EditText) findViewById(R.id.so_b);
         kq = (TextView) findViewById(R.id.txt_kq);
        Button btn_tong = (Button) findViewById(R.id.button_tong);

        btn_tong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(txt_a.getText().toString());
                int b = Integer.parseInt(txt_b.getText().toString());
                kq.setText((a+b)+"");
            }
        });
    }
}
