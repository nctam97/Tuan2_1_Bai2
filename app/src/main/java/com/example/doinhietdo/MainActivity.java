package com.example.doinhietdo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editdoc, editdof;
    Button btndoc, btndof, btnxoa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editdoc=(EditText)findViewById(R.id.editText_c);
        editdof=(EditText)findViewById(R.id.editText_f);
        btndoc=(Button)findViewById(R.id.button_c);
        btndof=(Button)findViewById(R.id.button_f);
        btnxoa=(Button)findViewById(R.id.button_xoa);
        btndoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nhietdo=editdof.getText().toString();
                double doF=Double.parseDouble(nhietdo);
                double DoC=(doF-32)*5/9;
                editdoc.setText(String.valueOf(DoC));
            }
        });
        btndof.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nhietdo2=editdoc.getText().toString();
                double doC=Double.parseDouble(nhietdo2);
                double DoF=doC*9/5+32;
                editdof.setText(String.valueOf(DoF));
            }
        });
        btnxoa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editdoc.setText("");
                editdof.setText("");
            }
        });

    }
}
