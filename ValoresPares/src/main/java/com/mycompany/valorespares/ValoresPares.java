/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.valorespares;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 * 
 *  Ler 7 valores e mostrar quantos são PARES e mostrar as posições dos valores
 * 
 */
public class ValoresPares {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos valores serão digitados? ");
        int valDigitado = sc.nextInt();
        
        int vet[] = new int [valDigitado];
        
        for(int i = 0; i < valDigitado; i++){
            System.out.print("Digite o " + i + "º número: ");
            vet[i] = sc.nextInt();
        }
        
        int totalPar = 0;  
        
        for(int i = 0; i < vet.length; i++){
            if(vet[i] % 2 == 0){
                totalPar++;
                System.out.println("Valor PAR na Posição: " + i);
            }
            
        }
        System.out.print("O total de pares foi: " + totalPar);
        
        
        sc.close();
        
    }
}
