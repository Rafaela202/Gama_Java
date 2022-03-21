package Exercicio02;

public class Horario {
	
	  public static void main(String[] args) {
          
	         Relogio relogio = new Relogio(23,59,59); 

	         boolean trocou = relogio.setHora(36);
	         if (trocou) {
	             System.out.println("Hora atualizada");
	         } else{
	             System.out.println("Erro na compilação");
	         }

	         System.out.println(relogio.getHoraAtual());

	  }

}
