package Exercicio01;

import java.util.Scanner;

public class Exercicio01{

     public static void main(String[] args) {

          Scanner teclado = new Scanner(System.in); //Entrada padr�o conectado
          double nota1, nota2, media;

          System.out.println("Digite a primeira nota: ");
          nota1 = teclado.nextDouble();

          System.out.println("Digite a segunda nota: ");
          nota2 = teclado.nextDouble();

          media = (nota1 + nota2) / 2;

          System.out.println("A m�dia �: " + media);

          teclado.close();//Desconecta

          
     }
     
}
