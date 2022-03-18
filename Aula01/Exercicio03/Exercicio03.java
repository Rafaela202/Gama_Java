package Exercicio03;

/* 
Escreva um programa que leia um número inteiro digitado pelo usuário e exiba uma sequência de números de 1 até o valor digitado pelo usuário. 
Por exemplo, se o usuário digitar o número 8, o programa deve mostrar
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