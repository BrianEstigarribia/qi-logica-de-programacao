package br.com.tecnicoqi.logica.aulas;

import java.util.Scanner;

public class ExecutaNumeroMenu {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numero;
		
		do{
			System.out.println("Informe um numero positivo: ");
			numero = ler.nextInt();
			
			if(numero<0){
				System.out.println("Voce pode apenas digitar numeros positivos.");
			}
		}while(numero<0);
		
		Numero n1 = new Numero(numero);
		int escolha; 
		
		do{
			
			System.out.println("1 - Visualizar o n�mero digitado");
			System.out.println("2 - Alterar o n�mero");
			System.out.println("3 - Visualizar Fatorial do n�mero");
			System.out.println("4 - Visualizar somat�rio do n�mero");
			System.out.println("5 - Visualizar quantidade de m�ltiplos do n�mero");
			System.out.println("6 - Ver se n�mero � primo");
			System.out.println("0 - Sair");
			System.out.print("->");
			
			escolha = ler.nextInt();
			
			switch(escolha){
				case 1: System.out.println("O valor digitado �: " +n1.getValor()); break;
				case 2: 
					int novoNumero;
					do{
						System.out.println("Informe o novo n�mero: ");
						novoNumero = ler.nextInt();
						if(novoNumero<0){
							System.out.println("APENAS DIGITE N�MEROS POSITIVOS");
						}
					}while(novoNumero<0);
					
					n1.setValor(novoNumero);
					System.out.println("N�mero alterado com sucesso.");
					break;
			    case 3: int fatorial = n1.calcularFatorial(); 
					System.out.println("O Fatorial de "+n1.getValor()+ " � " +fatorial);
					break;
			    case 4: int somatorio = n1.calcularSomatorio(); 
					System.out.println("O som�torio de "+n1.getValor()+ " � " +somatorio);
					break;
			    case 5: int quantidade = n1.contarMultiplos(); 
					System.out.println("A quantidade de multiplos �: "+quantidade);
					break;
			    case 6:  System.out.println("O N�mero "+n1.verificarPrimoOuComposto()); break;
			    case 0:  System.out.println("Sistema encerrado."); break;
			    default: System.out.println("Op��o Inv�lida.");
				}
		}while(escolha != 0);
		ler.close();
	}

}
