/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.turma;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 * 
 * Fazer a listagem dos alunos com suas notas e a média de suas notas
 * 
 */
public class Turma {

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos alunos? ");
        int alunos = sc.nextInt();
        
        String nomes[] = new String[alunos];
        double nota1[] = new double[alunos];
        double nota2[] = new double[alunos];
        double media[] = new double[alunos];
        
        for(int i = 0; i < nomes.length; i++){
            System.out.print("Nome: ");
            nomes[i] = sc.next();
            System.out.print("Primeira nota: ");
            nota1[i] = sc.nextDouble();
            System.out.print("Segunda nota: ");
            nota2[i] = sc.nextDouble();
        }
        
        System.out.println("---------------------------");
        
        for(int i = 0; i < nomes.length; i++){
            media[i] = (nota1[i] + nota2[i]) / 2;
            System.out.println("Média de " + nomes[i]+": " + media[i]);
        }
               
        sc.close();
    }
}
