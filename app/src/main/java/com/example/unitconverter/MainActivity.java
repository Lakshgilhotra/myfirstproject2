package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {
    Spinner from;
    Spinner to;
    EditText input;
    Button converter;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        from=findViewById(R.id.from_spinner);
        to=findViewById(R.id.to_spinner);
        input=findViewById(R.id.inputvalue);
        converter=findViewById(R.id.button);
        result=findViewById(R.id.result);

        converter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String selectitemfrom=from.getSelectedItem().toString();
                String selectitemto=to.getSelectedItem().toString();

                if (selectitemfrom.equals("meter")&& selectitemto.equals("Centimeter"))
                {
                    Double Result_C=Double.parseDouble(input.getText().toString())*100;
                            result.setText(String.valueOf(Result_C)+"Centimetre");
                }
                else if (selectitemfrom.equals("meter")&& selectitemto.equals("foot")) {
                    Double Result_F = Double.parseDouble(input.getText().toString()) * 3.28084;
                    result.setText(Double.toString(Result_F) + "Foot");
                }
                else if (selectitemfrom.equals("meter")&& selectitemto.equals("Inch")) {
                    Double Result_I = Double.parseDouble(input.getText().toString()) * 39.37;
                    result.setText(Double.toString(Result_I) + "Inch");

                } else if (selectitemfrom.equals("celsius") && selectitemto.equals("Fahrenheit")) {
                    Double Result_f = (Double.parseDouble(input.getText().toString()) * 1.8) + 32;
                    result.setText(Double.toString(Result_f) + "Fahrenheit");

                } else if (selectitemfrom.equals("celsius") && selectitemto.equals("Kelvin")) {
                    Double Result_K=Double.parseDouble(input.getText().toString())+273.15;
                    result.setText(Double.toString(Result_K)+"Kelvin");

                } else if (selectitemfrom.equals("kilogram") && selectitemto.equals("Gram")) {
                    Double Result_G=Double.parseDouble(input.getText().toString())*1000;
                    result.setText(Double.toString(Result_G)+"Gram");

                } else if (selectitemfrom.equals("kilogram") && selectitemto.equals("Ounce")) {
                    Double Result_O=Double.parseDouble(input.getText().toString())*35.274;
                    result.setText(Double.toString(Result_O)+"Ounce");

                } else if (selectitemfrom.equals("kilogram") && selectitemto.equals("pound")) {
                    Double Result_P=Double.parseDouble(input.getText().toString())*2.2;
                    result.setText(Double.toString(Result_P)+"Pound");

                }
                else {
                    Toast.makeText(MainActivity.this,"Invaid!",Toast.LENGTH_LONG).show();
                    result.setText("Wrong Unit Selected!\nTry Again");


            }
                Toast.makeText(MainActivity.this,"Converted",Toast.LENGTH_LONG).show();
            }
        });
    }
}