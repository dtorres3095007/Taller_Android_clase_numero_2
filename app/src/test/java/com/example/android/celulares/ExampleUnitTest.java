package com.example.android.celulares;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
// TEST CON RESULTADOS CORRECTOS
    @Test
    public void Probando_reporte1_obtener_precio_capacidad_correcto() throws Exception {
        celulares c1 = new celulares(50,4,1,0,0);
        celulares c2 = new celulares(30,4,1,0,1);
        celulares c3 = new celulares(20,4,1,0,0);
        ArrayList<celulares> cel = new ArrayList<>();
        cel.add(c1);
        cel.add(c2);
        cel.add(c3);
        ArrayList<celulares> reporte1 = new ArrayList<>();
        reporte1.add(c1);
        reporte1.add(c3);
        assertEquals(reporte1,datos.Obtener_precio_capacidad(cel));

    }
    @Test
    public void Probando_reporte4_Obtener_marca_apple_correcto() throws Exception {
        celulares c1 = new celulares(50,4,3,0,0);
        celulares c2 = new celulares(30,4,3,0,1);
        celulares c3 = new celulares(20,4,1,0,0);
        ArrayList<celulares> cel = new ArrayList<>();
        cel.add(c1);
        cel.add(c2);
        cel.add(c3);
        assertEquals(2,datos.Obtener_marca_apple(cel));

    }
    @Test
    public void Probando_reporte5_celulares_precio_nokia_correcto() throws Exception {
        celulares c1 = new celulares(5,4,0,0,0);
        celulares c2 = new celulares(5,4,0,0,1);
        celulares c3 = new celulares(5,4,0,0,0);
        celulares c4 = new celulares(20,44,1,0,0);
        ArrayList<celulares> cel = new ArrayList<>();
        cel.add(c1);
        cel.add(c2);
        cel.add(c3);
        cel.add(c4);
        assertEquals(5,datos.celulares_precio_nokia(cel),0);

    }
    // TEST CON RESULTADOS INCORRECTOS
    @Test
    public void Probando_reporte1_obtener_precio_capacidad_incorrecto() throws Exception {
        celulares c1 = new celulares(50,4,1,0,0);
        celulares c2 = new celulares(30,4,1,0,1);
        celulares c3 = new celulares(20,4,1,0,0);
        ArrayList<celulares> cel = new ArrayList<>();
        cel.add(c1);
        cel.add(c2);
        cel.add(c3);
        ArrayList<celulares> reporte1 = new ArrayList<>();
        reporte1.add(c1);
        reporte1.add(c2);
        assertNotEquals(reporte1,datos.Obtener_precio_capacidad(cel));

    }
    @Test
    public void Probando_reporte4_Obtener_marca_apple_incorrecto() throws Exception {
        celulares c1 = new celulares(50,4,3,0,0);
        celulares c2 = new celulares(30,4,3,0,1);
        celulares c3 = new celulares(20,4,1,0,0);
        ArrayList<celulares> cel = new ArrayList<>();
        cel.add(c1);
        cel.add(c2);
        cel.add(c3);
        assertNotEquals(3,datos.Obtener_marca_apple(cel));

    }
    @Test
    public void Probando_reporte5_celulares_precio_nokia_incorrecto() throws Exception {
        celulares c1 = new celulares(5,4,0,0,0);
        celulares c2 = new celulares(5,4,0,0,1);
        celulares c3 = new celulares(5,4,0,0,0);
        celulares c4 = new celulares(20,44,1,0,0);
        ArrayList<celulares> cel = new ArrayList<>();
        cel.add(c1);
        cel.add(c2);
        cel.add(c3);
        cel.add(c4);
        assertNotEquals(80,datos.celulares_precio_nokia(cel),0);

    }

}