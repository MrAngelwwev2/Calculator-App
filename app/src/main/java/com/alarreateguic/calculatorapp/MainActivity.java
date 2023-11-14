package com.alarreateguic.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    TextView tvSolucion; /* TextView para mostrar la operación */
    TextView tvResultado; /* TextView para mostrar el resultado */
    MaterialButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9; /* Botones del 0 al 9 */
    MaterialButton btnC, btnAC;
    MaterialButton btnAbreParentesis, btnCierraParentesis, btnDivision, btnProducto, btnResta, btnSuma, btnIgual; /* Operaciones */
    MaterialButton btnPunto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSolucion = (TextView) findViewById(R.id.tvSolucion);
        tvResultado = (TextView) findViewById(R.id.tvResultado);
        btn0 = (MaterialButton) findViewById(R.id.btn0);
        btn1 = (MaterialButton) findViewById(R.id.btn1);
        btn2 = (MaterialButton) findViewById(R.id.btn2);
        btn3 = (MaterialButton) findViewById(R.id.btn3);
        btn4 = (MaterialButton) findViewById(R.id.btn4);
        btn5 = (MaterialButton) findViewById(R.id.btn5);
        btn6 = (MaterialButton) findViewById(R.id.btn6);
        btn7 = (MaterialButton) findViewById(R.id.btn7);
        btn8 = (MaterialButton) findViewById(R.id.btn8);
        btn9 = (MaterialButton) findViewById(R.id.btn9);
        btnC = (MaterialButton) findViewById(R.id.btn0);
        btnAC = (MaterialButton) findViewById(R.id.btn0);
        btnAbreParentesis = (MaterialButton) findViewById(R.id.btnAbreParentesis);
        btnCierraParentesis = (MaterialButton) findViewById(R.id.btnCierraParentesis);
        btnDivision = (MaterialButton) findViewById(R.id.btnDivision);
        btnProducto = (MaterialButton) findViewById(R.id.btnProducto);
        btnResta = (MaterialButton) findViewById(R.id.btnResta);
        btnSuma = (MaterialButton) findViewById(R.id.btnSuma);
        btnIgual = (MaterialButton) findViewById(R.id.btnIgual);
        btnPunto = (MaterialButton) findViewById(R.id.btnPunto);


    }
}