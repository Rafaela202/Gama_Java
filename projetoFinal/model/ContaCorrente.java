package model;

public class ContaCorrente extends Conta {
	
	private double saldo;
	public ContaCorrente(int numeroConta, double saldo) {

super(numeroConta, saldo);
this.saldo = saldo;
	}

	public boolean sacar(double valorSaque) {
        if (getSaldo() >= valorSaque) {
             return super.sacar(valorSaque);
        }
       return false;
	}
	
	@Override
	public String toString() {
		return super.toString() + "r$" + saldo;
	}
}
	
	
	
