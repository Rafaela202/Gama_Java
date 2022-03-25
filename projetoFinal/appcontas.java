import java.util.Scanner;

import model.Conta;
import model.ContaCorrente;
import model.ContaEspecial;
import controller.gerenciarcontas;

public class appcontas {
	
		public static void main(String[] args){


		    Scanner teclado = new Scanner(System.in);
		    gerenciarcontas contas = new gerenciarcontas();
		    int opcao = 0;
		    int numeroConta;
		    double saldo, limite, valorSaque, valorDeposito;
		    Conta p;

		    while (opcao != 6) {
		      System.out.println("Escolha um tipo de conta ou servi�o");
		      System.out.println("------------------------------------");

	            System.out.println("1-Novo ContaCorrente");
	            System.out.println("2-Novo ContaEspecial");
	            System.out.println("3-Exibir");
	            System.out.println("4-Depositarr");
	            System.out.println("5-Sacar");
	            System.out.println("6-Saldo");
	            System.out.println("7-Sair");
	            
		      System.out.println("------------------------------------");
		      System.out.print("Informe a op��o desejada: ");
		      opcao = teclado.nextInt();
		      switch (opcao) {

		        case 1:
		          System.out.println("Informe o n�mero da Conta Corrente:");
		          numeroConta = teclado.nextInt();
		          System.out.println("Informe o saldo da Conta Corrente:");
		          saldo = teclado.nextInt();
		          p = new ContaCorrente(numeroConta, saldo);
		          contas.adicionar(p);
		          break;

		        case 2:
		          System.out.println("Informe o n�mero da Conta Especial: ");
		          numeroConta = teclado.nextInt();
		          System.out.println("Digite o saldo da Conta Especial: ");
		          saldo = teclado.nextDouble();
		          System.out.println("Informe o valor do limite Conta Especial:");
		          limite = teclado.nextDouble();
		          p = new ContaEspecial(numeroConta, saldo, limite);
		          contas.adicionar(p);
		          break;

		        case 3:
		          System.out.println("Digite o n�mero da conta para procurar");
		          numeroConta = teclado.nextInt();
		          System.out.println(contas.exibir(numeroConta));
		          break;

		        case 4:
		          System.out.println("Informe o n�mero da conta:");
		          numeroConta = teclado.nextInt();
		          System.out.println("Digite o valor a ser depositado:");  
		          valorDeposito = teclado.nextDouble();
		          contas.depositar(numeroConta, valorDeposito);
		          break;

		        case 5:
		          System.out.println("Informe o n�mero da conta:");
		          numeroConta = teclado.nextInt();
		          System.out.println("Informe o valor a Sacar:");
		          valorSaque = teclado.nextDouble();
		          contas.sacar(numeroConta, valorSaque);
		          break;

		        case 6:
		          System.out.println("Informe o n�mero da conta:");
		          numeroConta = teclado.nextInt();
		          System.out.println("Qual o valor deseja sacar:");
		          valorSaque = teclado.nextDouble();
		          System.out.println(contas.sacar(numeroConta,valorSaque));
		          break;

		        case 7:
		        System.out.println("Fim do programa.");
		          break;
		        default:
		          System.out.println("Opera��o inv�lida!");
		          break;
		      }
		    }

		    teclado.close();
		  
			}
			
		}
	


