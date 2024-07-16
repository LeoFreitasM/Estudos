/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.preenchermatriz;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 * 
 * Preencher uma matriz bidimensional(3x2) com valores via teclado
 * 
 */
public class PreencherMatriz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantas linhas? ");
        int l = sc.nextInt();
        System.out.print("Quantas colunas? ");
        int c = sc.nextInt();
        
        int mat[][] = new int[l][c];
        
        for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                System.out.print("Digite a posição [ " + i + " , " + j + " ]: ");
                mat[i][j] = sc.nextInt();
            }
        }
        
         for(int i = 0; i < l; i++){
            for(int j = 0; j < c; j++){
                System.out.print(mat[i][j] + " ");
            }
             System.out.println(" ");
        }
        
         sc.close();
    }
}
