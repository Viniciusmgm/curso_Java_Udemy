package matrizes.ocorrencia_valor;

import java.util.Scanner;

public class OcorrenciaValMat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Qual será o número de linhas? ");
		int m = sc.nextInt();
		
		System.out.print("Qual será o número de colunas? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		//Adiciona os valores a matriz
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("\nDe qual número vc quer saber as informações? ");
		int num = sc.nextInt();
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] == num) {
					System.out.printf("\nPosição: (%d, %d)", i, j);
					
					if((j - 1) >= 0) {
						System.out.printf("\nEsquerda: %d", mat[i][j - 1]);
					}
					
					if((j + 1) < mat[i].length) {
						System.out.printf("\nDireita: %d", mat[i][j + 1]);
					}
					
					if((i - 1) >= 0) {
						System.out.printf("\nAcima: %d", mat[i - 1][j]);
					}
					
					if((i + 1) < mat.length) {
						System.out.printf("\nAbaixo: %d", mat[i + 1][j]);
					}
				}
			}
		}
		
		sc.close();
	}

}
