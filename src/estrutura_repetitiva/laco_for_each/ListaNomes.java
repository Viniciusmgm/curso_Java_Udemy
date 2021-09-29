package estrutura_repetitiva.laco_for_each;

public class ListaNomes {
	public static void main(String[] args) {
		String[] vect = new String[]{"Maria", "Bob", "Alex"};
		
		for(String nome : vect) {
			System.out.println(nome);
		}
	}
}
