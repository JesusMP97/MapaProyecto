package com.example.mapaproyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ImageView mapa;
    List<Mesa> mesas;
    ImageView m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15;
    ImageView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
    }

    private void initComponents() {
        m1 = findViewById(R.id.mesa1);
        m2 = findViewById(R.id.mesa2);
        m3 = findViewById(R.id.mesa3);
        m4 = findViewById(R.id.mesa4);
        m5 = findViewById(R.id.mesa5);
        m6 = findViewById(R.id.mesa6);
        m7 = findViewById(R.id.mesa7);
        m8 = findViewById(R.id.mesa8);
        m9 = findViewById(R.id.mesa9);
        m10 = findViewById(R.id.mesa10);
        m11 = findViewById(R.id.mesa11);
        m12 = findViewById(R.id.mesa12);
        m13 = findViewById(R.id.mesa13);
        m14 = findViewById(R.id.mesa14);
        m15 = findViewById(R.id.mesa15);

        b1 = findViewById(R.id.barra1);
        b2 = findViewById(R.id.barra2);
        b3 = findViewById(R.id.barra3);
        b4 = findViewById(R.id.barra4);
        b5 = findViewById(R.id.barra5);
        initMesas();
    }

    private void initMesas() {
        mesas = new ArrayList();
        mesas.add(new Mesa(Mesa.DOBLE_HORIZONTAL, m1));
        mesas.add(new Mesa(Mesa.DOBLE_HORIZONTAL, m2));
        mesas.add(new Mesa(Mesa.DOBLE_HORIZONTAL, m3));
        mesas.add(new Mesa(Mesa.DOBLE_HORIZONTAL, m4));
        mesas.add(new Mesa(Mesa.DOBLE_HORIZONTAL, m5));
        mesas.add(new Mesa(Mesa.DOBLE_HORIZONTAL, m6));
        mesas.add(new Mesa(Mesa.DOBLE_VERTICAL, m7));
        mesas.add(new Mesa(Mesa.DOBLE_VERTICAL, m8));
        mesas.add(new Mesa(Mesa.CUADRUPLE, m9));
        mesas.add(new Mesa(Mesa.CUADRUPLE, m10));
        mesas.add(new Mesa(Mesa.CUADRUPLE, m11));
        mesas.add(new Mesa(Mesa.CUADRUPLE, m12));
        mesas.add(new Mesa(Mesa.REDONDA, m13));
        mesas.add(new Mesa(Mesa.REDONDA, m14));
        mesas.add(new Mesa(Mesa.REDONDA, m15));

        mesas.add(new Mesa(Mesa.SILLA, b1));
        mesas.add(new Mesa(Mesa.SILLA, b2));
        mesas.add(new Mesa(Mesa.SILLA, b3));
        mesas.add(new Mesa(Mesa.SILLA, b4));
        mesas.add(new Mesa(Mesa.SILLA, b5));
    }

}
