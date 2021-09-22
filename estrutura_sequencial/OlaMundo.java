package estrutura_sequencial;
import java.util.Locale;

public class OlaMundo {

	public static void main(String[] args) {
		double x = 2.34566;
		
		//Pula uma linha ao final da impressão
		System.out.println("Olá Mundo!");
		
		//Não pula linha ao final da impressão
		System.out.print("Olá Mundo!");
		
		//Printa variáveis de ponto flutuante, ou seja, formata o que será printado
		System.out.printf("A variável x é %.4f \n", x);
		
		//Configuraa a localização do programa, nesse caso, troca a vírgula por ponto
		Locale.setDefault(Locale.US);
		System.out.printf("A variável x é %.4f \n", x);
		
		//Concatenação
		String nome = "Maria";
		int idade = 18;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais \n", nome, idade, renda);
	}

}
