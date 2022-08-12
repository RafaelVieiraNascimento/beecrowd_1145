package program;

/*
beecrowd | 1145 - Sequência Lógica 2

Escreva um programa que leia dois valores X e Y. A seguir,
mostre uma sequência de 1 até Y, passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco entre cada número,
conforme exemplo abaixo. Não deve haver espaço em branco após o último valor da linha.
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int X = sc.nextInt();
		int Y = sc.nextInt();
		
		for(int i = 1, j = 1; i <= Y; i++, j++) {
			System.out.print(i);
			if(j == X) {
				System.out.println();
				j = 0;
			}
			else System.out.print(" ");
		}
		sc.close();
	}
}
