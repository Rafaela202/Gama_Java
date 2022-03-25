package model;

public abstract class Conta {
	
	private int numeroConta;
	private double saldo;

	
	public int getNumeroConta() { 
		return numeroConta;
   }

   public double getSaldo() {
		return saldo;
   }

   public Conta(int numeroConta, double saldo) {
		 if (numeroConta < 1|| saldo < 0) {
			 return;
		} 
	  this.numeroConta = numeroConta;
		this.saldo = saldo;
  }


  public boolean depositar(double valorDeposito) {
		if (valorDeposito < 0) {   
			 return false;            
		}
	   this.saldo += valorDeposito; 
		 return true;
  }

   public boolean sacar(double valorSaque) {
	  
		if (valorSaque < 0) {              
			 return false;
		} else {
			 this.saldo -= valorSaque;
			 return true;
		}
   }

   @Override
   public String toString() {
		return " Número da Conta: "
			 +numeroConta
			 +", \nsaldo em conta: R$ "
			 +String.format("%.2f", saldo);
		}




}