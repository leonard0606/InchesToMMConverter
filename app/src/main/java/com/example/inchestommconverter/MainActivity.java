package com.example.inchestommconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Declaring widgets
    TextView textView, textView2, textView3;
    EditText editTextNumber,editTextNumber2;
    Button button1,button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =findViewById(R.id.textView);
        textView2 =findViewById(R.id.textView2);
        textView3 =findViewById(R.id.textView3);
        editTextNumber =findViewById(R.id.editTextNumber);
        editTextNumber2 =findViewById(R.id.editTextNumber2);
        button1 =findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view ) {
                //conversion method
                convertfrommmtoinches();
//
//                double millimeters = Double.valueOf(editTextNumber.getText().toString());
//                double inches = millimeters * 0.0393701;
//
//               editTextNumber2.setText(String.valueOf(inches));

            }
        });

        button2 =findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
                System.exit(0);

            }
        });







    }

    private void convertfrommmtoinches() {

        String millimeters = editTextNumber2.getText().toString();

        double mm = Double.parseDouble(millimeters);

        double inches = mm /25.4;

        editTextNumber.setText(""+inches);

    }
}