package Exercicio01;

public class Veiculo {
	

	    private String marca, modelo;
	    private double consumo;

	     public Veiculo(String marca, String modelo, double consumo) {

	          this.marca = marca;
	          this.modelo = modelo;
	          this.consumo = consumo;
	     }

	     public String getMarca() {
	          return this.marca;
	     }

	     public void setMarca(String marca) {
	          this.marca = marca;
	     }

	     public String getModelo() {
	          return this.modelo;
	     }

	     public void setModelo(String modelo) {
	          this.modelo = modelo;
	     }

	     public double getConsumo() {
	          return this.consumo;
	     }

	     public void setConsumo(double novoConsumo) {
	          this.consumo = novoConsumo;
	     }



	     public void mostrar(){

	          System.out.println("Marca = " + marca + " Modelo = " + modelo + " Consumo = " + consumo);

	     }

	}


