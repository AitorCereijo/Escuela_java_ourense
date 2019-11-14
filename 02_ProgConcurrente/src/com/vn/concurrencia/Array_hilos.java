/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vn.concurrencia;

import java.util.HashSet;

/**
 * EJERCICIO ARRAY DE HILOS
 *
 * @author Equipo 4
 */
public class Array_hilos {

    HiloA[] hilo_array;

    public Array_hilos() {

        this.hilo_array = new HiloA[20];
        
    }

    class HiloA implements Runnable {

        @Override
        public void run() {

            for (int i = 0; i < 8; i++) {

                System.out.println("Instruccion A :" + i);

            }

        }
    }

    public void ejecutarHilosArray() {

        System.out.println("*******START*********");


        for (int i = 0; i < hilo_array.length; i++) {

            hilo_array[i]=new HiloA();
            Thread proceso = new Thread(hilo_array[i]);

            proceso.start();

        }

    }
}
