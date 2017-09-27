package com.example.android.celulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class reportes extends AppCompatActivity {
    private String reporte[];
    private Resources resources;
    private Spinner reporte_spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        reporte_spinner=(Spinner) findViewById(R.id.cbxreporte);
        reporte=resources.getStringArray(R.array.reporte);
        ArrayAdapter<String> adapter_reporte = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,reporte);
        reporte_spinner.setAdapter(adapter_reporte);
    }
}
