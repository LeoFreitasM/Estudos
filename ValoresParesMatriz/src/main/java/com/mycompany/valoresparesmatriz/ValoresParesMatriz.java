/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.valoresparesmatriz;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 */
public class ValoresParesMatriz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int par = 0;
        
        System.out.print("Quantas linhas? ");
        int l = sc.nextInt();
        
        System.out.print("Quantas colunas? ");
        int c = sc.nextInt();
        
        int mat[][] = new int[l][c];
        
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Digite o valor da posição [ " + i + " , " + j + " ]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("MATRIZ:");
        System.out.println("---------------");
         for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
               if(mat[i][j] % 2 == 0){ 
                System.out.print("{" + mat[i][j] + "}" + " ");
                par++;
               } else {
                   System.out.print(mat[i][j] + " ");
               }
            }
             System.out.println(" ");
        }
         
        System.out.println("Ao todo foram digitados " + par + " valores PARES");
        
    }
}
