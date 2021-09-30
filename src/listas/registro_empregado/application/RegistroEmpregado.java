package listas.registro_empregado.application;

import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import listas.registro_empregado.entities.Empregado;

public class RegistroEmpregado {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Empregado> listEmp = new ArrayList<>();
		
		//Registros de Empregados
		System.out.print("Quantos empregados serão registrados? ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.println("\nEmpregado #" + (i + 1));
			
			System.out.print("Id: ");
			int id = sc.nextInt();
			while(verificaId(listEmp, id) != null) {
				System.out.println("\nId já existente, tente novamente");
				System.out.print("Id: ");
				id = sc.nextInt();
			}
			
			System.out.print("Nome: ");
			String nome = sc.next();

			System.out.print("Salário: ");
			double salario = sc.nextDouble();

			listEmp.add(new Empregado(id, nome, salario));
		}
		
		//Aumento Salarial de Empregados
		System.out.print("\nQual o id do empregado que terá aumento? ");
		int id = sc.nextInt();
		Empregado empAumento = verificaId(listEmp, id);
		
		if(empAumento == null) {
			System.out.println("Esse id não existe!!!");
		}
		else {
			System.out.print("Qual será a porcentagem de aumento? ");
			double porcAumento = sc.nextDouble();
			empAumento.aumentoSalario(porcAumento);
		}
		
		//Listando Empregados
		System.out.println("\nLista de Empregados: ");
		for(Empregado emp : listEmp) {
			System.out.println(emp.toString());
		}
		
		sc.close();
	}
	
	//Verifica o Id do empregado
	public static Empregado verificaId(List<Empregado> listEmp, int id) {
		return listEmp.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
	}

}
