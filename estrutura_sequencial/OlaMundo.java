package estrutura_sequencial;
import java.util.Locale;

public class OlaMundo {

	public static void main(String[] args) {
		double x = 2.34566;
		
		//Pula uma linha ao final da impress�o
		System.out.println("Ol� Mundo!");
		
		//N�o pula linha ao final da impress�o
		System.out.print("Ol� Mundo!");
		
		//Printa vari�veis de ponto flutuante, ou seja, formata o que ser� printado
		System.out.printf("A vari�vel x � %.4f \n", x);
		
		//Configuraa a localiza��o do programa, nesse caso, troca a v�rgula por ponto
		Locale.setDefault(Locale.US);
		System.out.printf("A vari�vel x � %.4f \n", x);
		
		//Concatena��o
		String nome = "Maria";
		int idade = 18;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais \n", nome, idade, renda);
	}

}
