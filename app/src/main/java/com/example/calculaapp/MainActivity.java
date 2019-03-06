package com.example.calculaapp;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity{

    int a;
    int b;
    TextView txtTextView1, txtTextView2, txtTextView3, txtTextView4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Mis_Resultados","Entro a onCreate");
        a = 10;
        b = 5;


        suma(a, b);
        resta(a, b);
        division(a, b);
        multiplicacion(a, b);


    }
        private void suma ( int x, int y){
            int resultadoSuma;
            resultadoSuma=x+y;

            String sumaString;
            sumaString = Integer.toString(resultadoSuma);

            Log.d("Mis_Resultados", sumaString.toString());
            txtTextView1 =  findViewById(R.id.textView3);
            txtTextView1.setText(sumaString);
        }

        private void resta ( int x, int y){
            int resultadoResta;
            resultadoResta = x-y;
            String restaString;

            restaString = Integer.toString(resultadoResta);
            Log.d("Mis_Resultados", restaString.toString());
            txtTextView2 = findViewById(R.id.textView4);
            txtTextView2.setText(restaString);
        }
        private void division ( int x, int y){

            int resultadoDivision;
            resultadoDivision = x / y;
            String divisionString;
            divisionString = Integer.toString(resultadoDivision);
            Log.d("Mis_Resultados", divisionString.toString());
            txtTextView3 =  findViewById(R.id.textView6);
            txtTextView3.setText(divisionString);
        }
        private void multiplicacion ( int x, int y){
            int resultadoMultiplicacion;
            resultadoMultiplicacion=x*y;
            String multiplicacionString;

            multiplicacionString = Integer.toString(resultadoMultiplicacion);

            Log.d("Mis_Resultados", multiplicacionString.toString());
            txtTextView4 =  findViewById(R.id.textView8);
            txtTextView4.setText(multiplicacionString);
        }

    }