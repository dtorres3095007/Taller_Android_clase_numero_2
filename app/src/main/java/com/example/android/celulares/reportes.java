package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class reportes extends AppCompatActivity {
    private String reporte[];
    private EditText res;
    private Resources resources;
    private Spinner reporte_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        resources=this.getResources();
        reporte_spinner=(Spinner) findViewById(R.id.cbxreporte);
        reporte=resources.getStringArray(R.array.reporte);
        ArrayAdapter<String> adapter_reporte = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,reporte);
        reporte_spinner.setAdapter(adapter_reporte);
        res=(EditText)findViewById(R.id.txtresultado);
    }
    public void Generar_Reporte(View v){
        int sel_reporte = reporte_spinner.getSelectedItemPosition();
        if (sel_reporte==0){
      res.setText(datos.Obtener_precio_capacidad());
        }else if(sel_reporte==1){
            res.setText(datos.Obtener_marca_apple());
        }else{
            res.setText(datos.celulares_precio_nokia());
        }
    }



}
