package Exercicio04;

/* 
Escreva um programa que exiba a tabuada do n?mero digitado pelo usu?rio.
Por exemplo, se o usu?rio digitar o valor 5, deve mostrar a tabuada no n?mero 5, como est? listado abaixo.
5 x 0 = 0
5 x 1 = 5
5 x 2 = 10
continua at?
5 x 10 = 50

*/

import java.util.Scanner;

public class Exercicio04 {

     public static void main(String[] args) {
          
          Scanner teclado = new Scanner (System.in);

          int numero, contador, resultado;

          System.out.println("Digite a tabuada desejada:");
          numero = teclado.nextInt();

          System.out.println("Tabuada do " + numero);

          contador = 1;
          while (contador <= 10) {
		
			resultado = numero * contador;
			
			System.out.println(numero + "x" + contador + "=" + resultado);
			
			contador++;      
     }      
   }
}