/* 
A prefeitura do Rio de Janeiro abriu uma linha de cr�dito para os funcion�rios estatut�rios. 
Entretanto, o valor m�ximo da presta��o n�o poder� ultrapassar 30% do sal�rio bruto. 
Fa�a um programa que leia o sal�rio bruto e o valor da presta��o
 e informe se o empr�stimo pode ou n�o ser concedido.
*/


package Exercicio02;

import java.util.Scanner;
public class Exercicio02 {
	
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double salario,  prestacao, limite;

        System.out.println("Digite o valor do sal�rio: ");

        salario = teclado.nextDouble();

        System.out.println("Informe o valor da presta��o: ");

        prestacao = teclado.nextDouble();
       limite =  0.3 * salario;

        if (prestacao <= limite) {
             System.out.println("Voc� pode receber o empr�stimo: ");
        } else{
             System.out.println("Voc� n�o pode receber o empr�stimo");
        }

        System.out.println("O valor maximo concedido de emprestimo � de: " + limite);

        teclado.close();

   }

}
