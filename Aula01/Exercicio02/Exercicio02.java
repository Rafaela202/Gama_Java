/* 
A prefeitura do Rio de Janeiro abriu uma linha de crédito para os funcionários estatutários. 
Entretanto, o valor máximo da prestação não poderá ultrapassar 30% do salário bruto. 
Faça um programa que leia o salário bruto e o valor da prestação
 e informe se o empréstimo pode ou não ser concedido.
*/


package Exercicio02;

import java.util.Scanner;
public class Exercicio02 {
	
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double salario,  prestacao, limite;

        System.out.println("Digite o valor do salário: ");

        salario = teclado.nextDouble();

        System.out.println("Informe o valor da prestação: ");

        prestacao = teclado.nextDouble();
       limite =  0.3 * salario;

        if (prestacao <= limite) {
             System.out.println("Você pode receber o empréstimo: ");
        } else{
             System.out.println("Você não pode receber o empréstimo");
        }

        System.out.println("O valor maximo concedido de emprestimo é de: " + limite);

        teclado.close();

   }

}
