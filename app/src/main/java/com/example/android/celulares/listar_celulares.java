package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class listar_celulares extends AppCompatActivity {
    private Resources resources;
    private String marca[];
    private String sistema[];
    private String color[];
    private TableLayout tabla;
    private ArrayList<celulares> p;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar_celulares);
        resources=this.getResources();
        tabla = (TableLayout) findViewById(R.id.tabla);
        p = datos.Obtener();
        marca=resources.getStringArray(R.array.marca);
        sistema=resources.getStringArray(R.array.sistema);
        color=resources.getStringArray(R.array.color);
        for(int i = 0 ; i< p.size();i++){
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            TextView c5 = new TextView(this);
            c1.setText(""+p.get(i).getPrecio());
            c2.setText(""+p.get(i).getCapacidad());
            c3.setText(""+color[p.get(i).getColor()]);
            c4.setText(""+sistema[p.get(i).getSistema()]);
            c5.setText(""+marca[p.get(i).getMarca()]);


            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);

            tabla.addView(fila);
        }
    }
}
