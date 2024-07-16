/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.jogodavelha;

import java.util.Scanner;

/**
 *
 * @author Leonardo Freitas
 */
public class JogoDaVelha {

    private static char simbolo = 'X';
    private static int posicao = 0;
    private static char aux = 0;
    private static char mat[][] = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}

    };

    public static void main(String[] args) {

        boolean r = false;

        while (r == false) {

            jogada();

            r = ganhador();

        }

    }

    public static void exibirTabuleiro() {
        for (int i = 0; i < 3; i++) {
            System.out.println("+---+---+----+");
            for (int j = 0; j < 3; j++) {

                System.out.print("| " + mat[i][j] + "| ");
            }
            System.out.println(" ");
        }
        System.out.println("+---+---+----+");
    }

    public static void mudarJogador() {
        if (simbolo == 'X') {
            simbolo = 'O';
        } else {
            simbolo = 'X';
        }
    }

    public static int jogada() {
        Scanner sc = new Scanner(System.in);

        exibirTabuleiro();

        System.out.print("Vai jogar [" + simbolo + "] em qual posição? ");
        posicao = sc.next().charAt(0);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] == posicao) {
                    mat[i][j] = simbolo;
                    mudarJogador();
                } /*else {
                    System.out.println("Está posição já está ocupada. Escolha outra");
                }*/

            }
        }
        return posicao;
    }

    public static boolean ganhador() {

        boolean ver = false;

        for (int i = 0; i < 3; i++) {
            if ((mat[i][0] == mat[i][1]) && mat[i][1] == mat[i][2]) {
                exibirTabuleiro();
                System.out.println("JOGO FINALIZADO!");
                ver = true;
            }
        }

        for (int i = 0; i < 3; i++) {
            if (mat[0][i] == mat[1][i] && mat[1][i] == mat[2][i]) {
                exibirTabuleiro();
                System.out.println("JOGO FINALIZADO!");
                ver = true;
            }
        }

        if (mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2]) {
            exibirTabuleiro();
            System.out.println("JOGO FINALIZADO!");
            ver = true;
        }
        if (mat[2][0] == mat[1][1] && mat[1][1] == mat[0][2]) {
            exibirTabuleiro();
            System.out.println("JOGO FINALIZADO!");
            ver = true;

        }

        int s = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (mat[i][j] == simbolo) {
                    s++;
                }
                if (s == 8) {
                    System.out.println("JOGO FINALIZADO!");
                    ver = true;
                }
            }

        }

        return ver;
    }

}
