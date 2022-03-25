package controller;

import java.util.ArrayList;

import model.Conta;
import model.ContaCorrente;



public class gerenciarcontas {
	private ArrayList<Conta> Contas;

	public gerenciarcontas() {
		Contas = new ArrayList<>();
	}

	public void adicionar(Conta p) {
		Contas.add(p);
	}

	public String exibir(int numeroConta) {
		for (int i = 0; i < Contas.size(); i++) {
			if (Contas.get(i).getNumeroConta() == numeroConta) {
				return Contas.get(i).toString();
			}
		}
		return "N�o encontrado";
	}

	public boolean depositar(int numeroConta, double valor) {
		for (int i = 0; i < Contas.size(); i++) {
			if (Contas.get(i).getNumeroConta() == numeroConta) {
				Contas.get(i).depositar(valor);
				return Contas.get(i).depositar(valor);
			}
		}
		return false;
	}

	public boolean sacar(int numeroConta, double valor) {
		for (int i = 0; i < Contas.size(); i++) {
			if (Contas.get(i).getNumeroConta() == numeroConta) {
				Contas.get(i).sacar(valor);
				return Contas.get(i).sacar(valor);
			}
		}
		return false;
	}


	private int posicao(int numeroConta) {
		for (int i = 0; i < Contas.size(); i++) {
			if (Contas.get(i).getNumeroConta() == numeroConta) {
				return i;
			}
		}
		return -1; // retorna -1 se nao achou
	}

	public boolean remover(int numeroConta) {
		int posicao = posicao(numeroConta);
		if (posicao >= 0) { // se achou
			if (Contas.remove(posicao) != null) {
				return true;
			}
		}
		return false;
	}
}
