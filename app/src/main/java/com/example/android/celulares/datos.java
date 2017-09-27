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
String resultado = "Resultado: ";
        for(int i = 0 ; i< cel.size();i++){
            if (cel.get(i).getMarca()==1 && cel.get(i).getColor()==0 && cel.get(i).getSistema()==1){
                resultado = resultado +  "celular No." + i + ": Precio = " + cel.get(i).getPrecio() + ", Capacidad = " + cel.get(i).getCapacidad() + "/n";
            sw = 1;
            }
        }
        if (sw ==0){
            return "Sin Resultados";
        }
        return  resultado;
    }
}
