/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrizfourordem;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 * 
 * Preencher uma matriz de 4ª ordem
 * 
 */
public class MatrizFourOrdem {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int soma = 0;
        int produto = 1;
        int maiorValor = 0;
        
        System.out.print("Quantas linhas? ");
        int linhas = sc.nextInt();
        System.out.print("Quantas colunas? ");
        int colunas = sc.nextInt();
        
        int mat[][] = new int[linhas][colunas];
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print("Número Posição [ " + i + ", " + j + " ]: ");
                mat[i][j] = sc.nextInt();
             
               if(i == j){
                    soma += mat[i][j];
                }
               
               // uma lógica para mostrar o produto da segunda linha inteira
                /*  if(i == 1){
                    produto *= mat[i][j];
                }*/
            }
        }
        
        
        // outra lógica para mostrar o produto da segunda linha inteira
        for(int i = 1; i <= 1; i++){
            for(int j = 0; j < colunas; j++){
                produto *= mat[i][j];
            }
        }
        
        for(int i = 0; i < linhas; i++){
            for(int j = 2; j <= 2; j++){
                if(mat[i][j] > maiorValor){
                    maiorValor = mat[i][j];
                }
            }
        }
        
        
        System.out.println("----------------------------");
        
        for(int i = 0; i < linhas; i++){
            for(int j = 0; j < colunas; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println(" ");
        }
        
        
        
        System.out.println("----------------------");
        
        System.out.println("A soma dos valores da diagonal principal é: " + soma);
        System.out.println("O produto entre os valores da segunda linha é: " + produto);
        System.out.println("O maior valor da terceira coluna é: " + maiorValor);
        
        sc.close();
        
    }
}
