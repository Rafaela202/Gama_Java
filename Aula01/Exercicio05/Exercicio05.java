package Exercicio05;

/* 
Escreva um programa que leia v�rios n�meros inteiros digitados pelo usu�rio, 
at� que o usu�rio digite zero. O zero termina o programa e exibe a soma de todos os valores 
digitados. 
*/

import java.util.Scanner;
public class Exercicio05 {
     
     public static void main(String[] args) {
          
          Scanner teclado = new  Scanner(System.in);

          int numero, soma;

          numero = 1;
          soma = 0;
          while(numero != 0){

               System.out.println("Digite um n�mero inteiro: ");
               numero = teclado.nextInt();
               soma = soma + numero;

          }
          System.out.println("Soma = " + soma);

          teclado.close();
     }      
}