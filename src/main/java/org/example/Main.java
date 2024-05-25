package org.example;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Alberto
 */
public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);


        getN(sn.nextInt());

    }


    public static boolean esPerfecto(int n) {
        int suma = 0;

        for (int i = 1; i < n - 1; i++) {
            if (n % i == 0) {
                suma = suma + i;
                if (suma == n) {
                    return true;

                }
            }
        }
        return false;
    }

    public static ArrayList<Integer> getN(int N) {
        ArrayList<Integer> siesPerfecto = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (esPerfecto(i)) {
                siesPerfecto.add(i);
            }
        }
        System.out.println("Esta es la lista compa = " + siesPerfecto);
        return siesPerfecto;
    }

}
