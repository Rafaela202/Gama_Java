package Exercicio03;

/* 
Escreva um programa que leia um n�mero inteiro digitado pelo usu�rio e exiba uma sequ�ncia de n�meros de 1 at� o valor digitado pelo usu�rio. 
Por exemplo, se o usu�rio digitar o n�mero 8, o programa deve mostrar
1 2 3 4 5 6 7 8

for ou if

*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limite;

        System.out.println("Digite o valor do limite:");
        limite = teclado.nextInt();

        for(int i=1; i <= limite; i++) {
            System.out.print(i + " ");
        }

        teclado.close();
    }
}