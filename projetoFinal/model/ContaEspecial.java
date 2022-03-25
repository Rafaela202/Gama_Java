package model;

public class ContaEspecial extends Conta {
	
	private double limite;


	public ContaEspecial(int numeroConta, double saldo, double limite) {
		super(numeroConta, saldo); {
			if (limite < 0) {
				return;			
			}
			this.limite = limite;
		}
	}



     public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public double calculaSaldo(double saldo,double valorSaque) {
		return super.getSaldo() - valorSaque;
	}

	
	public boolean sacar (double valorSaque){
		if (getSaldo() + limite >= valorSaque) {
			return super.sacar(valorSaque);		
		}
		return false;
	}

	@Override
    public String toString() {
        return "O limite da sua Conta Especial � de: " + super.toString() + " limite: " + limite;
    }

}
