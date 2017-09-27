package com.example.android.celulares;

import java.util.ArrayList;

/**
 * Created by android on 26/09/2017.
 */

public class datos {

    private static ArrayList<celulares> cel = new ArrayList<>();

    public static void Guardarcelulares(celulares p){
        cel.add(p);
    }

    public static ArrayList<celulares> Obtener(){
        return  cel;
    }

    public static String Obtener_precio_capacidad()
    {
        int sw =0 ;
String resultado = "";
        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==1 && cel.get(i).getColor()==0 && cel.get(i).getSistema()==0){
                resultado = resultado +  "celular No." + (i+1) + ": \nPrecio = " + cel.get(i).getPrecio() + ", \nCapacidad = " + cel.get(i).getCapacidad() + "\n\n";
            sw = 1;
            }
        }
        if (sw ==0){
            return "Sin Resultados";
        }
        return  resultado;
    }

    public static String Obtener_marca_apple()
    {
        int sw =0 ;

        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==3 && cel.get(i).getColor()==0){
                   sw = sw+1;
            }
        }

        return  "" + sw;
    }

    public static String celulares_precio_nokia()
    {
        double suma = 0;
        int sw =0 ;

        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==0){
                suma = suma + cel.get(i).getPrecio();
                sw = sw+1;
            }
        }
if (sw<1){
    return "Sin celulares Nokia";
}
        return  "" + (suma/sw);
    }
}
