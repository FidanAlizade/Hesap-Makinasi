package com.example.hesapmakinasi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.hesapmakinasi.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    EditText t1, t2;
    TextView textView;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        t1 = binding.numberFirst;
        t2 = binding.numberTwo;
        textView = binding.textView;


        binding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().matches("") || t2.getText().toString().matches("")){
                    textView.setText("Enter number!");
                }else{
                    int num1 = Integer.parseInt(t1.getText().toString());
                    int num2 = Integer.parseInt(t2.getText().toString());

                    int cem = 0;
                    cem = num1 + num2;

                    textView.setText(String.valueOf(cem));
                }
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().matches("") || t2.getText().toString().matches("")){
                    textView.setText("Enter number!");
                }else{
                    int num1 = Integer.parseInt(t1.getText().toString());
                    int num2 = Integer.parseInt(t2.getText().toString());

                    int ferq = 0;
                    ferq = num1 - num2;

                    textView.setText(String.valueOf(ferq));
                }
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().matches("") || t2.getText().toString().matches("")){
                    textView.setText("Enter number!");
                }else{
                    int num1 = Integer.parseInt(t1.getText().toString());
                    int num2 = Integer.parseInt(t2.getText().toString());

                    int hasil = 0;
                    hasil = num1 * num2;

                    textView.setText(String.valueOf(hasil));
                }
            }
        });

        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(t1.getText().toString().matches("") || t2.getText().toString().matches("")){
                    textView.setText("Enter number!");
                }else{
                    int num1 = Integer.parseInt(t1.getText().toString());
                    int num2 = Integer.parseInt(t2.getText().toString());

                    int qismet = 0;
                    qismet = num1 / num2;

                    textView.setText(String.valueOf(qismet));
                }
            }
        });
    }

}






