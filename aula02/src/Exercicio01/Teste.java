package Exercicio01;

public class Teste {
    
    public static void main(String[] args) {
         
         Veiculo v1 = new Veiculo("Chevrolet",  "Cruize",  50);
         v1.mostrar();
         v1.setConsumo(65);

         System.out.println("Consumo =  " + v1.getConsumo());

    }

}