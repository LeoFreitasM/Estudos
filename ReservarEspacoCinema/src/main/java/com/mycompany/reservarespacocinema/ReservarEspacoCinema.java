/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.reservarespacocinema;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 *
 * Fazer um programa para reservar cadeiras da fileira B de um cinema
 *
 */
public class ReservarEspacoCinema {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] cadeiras = {"B1", "B2", "B3", "B4", "B5", "B6", "B7", "B8", "B9", "B10"};

        String dec = "";
        String aux = "";

        do {

            for (int i = 0; i < cadeiras.length; i++) {
               
                System.out.print("[ " + cadeiras[i] + " ] ");

            }

            System.out.println("\n----------------------------------------------------------------------");

            System.out.print("Reservar a cadeira: ");
            aux = sc.nextLine();
             String p = "";
            for ( int i = 0; i < cadeiras.length; i++) {
                 if(cadeiras[i].equals(aux)){
                    cadeiras[i] = aux;
                    p = cadeiras[i];
                     cadeiras[i] = "---";
                     
                 }
            }
                 if (aux.equals(p)) {
                    System.out.println("Cadeira " + aux + " RESERVADA!");
                    
                } else {
                    System.out.println("Essa cadeira já está reservada");
                } 
          
            
            System.out.print("Quer reservar outro? [S/N] ");
            dec = sc.nextLine();
            
            
            
        }while(dec.equals("S") || dec.equals("s"));
    }
}
