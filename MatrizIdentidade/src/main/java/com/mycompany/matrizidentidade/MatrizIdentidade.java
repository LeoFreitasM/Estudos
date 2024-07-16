/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrizidentidade;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 * 
 * Criar uma Matriz Identidade de 3ª ordem
 * 
 */
public class MatrizIdentidade {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        int mat[][] = new int[3][3];
        
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                if(i == j){
                    mat[i][j] = 1;
                } 
            }
        }
        
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        sc.close();
        
    }
}
