package estrutura;

import java.util.Arrays;
import java.util.Scanner;

public class OrdenarPilha {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int[] pilha = new int[5];
		int[] pilhaOrdenada = new int[5];
		boolean continuar = true;
		int opcao, topo = -1, aux;
		
		while(continuar) {
			System.out.println("Escolha a opção: 1-Inserir  2-Excluir 3-Listar  4-Sair");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1: // Inserir
				if (topo == (pilha.length - 1)) {
					System.out.println("Pilha cheia!");					
				}else{
					System.out.println("Digite o número");
					topo++;
					pilha[topo] = entrada.nextInt();
				}		
				
				break;
				
			case 2: // Excluir
				if (topo == -1) {
					System.out.println("Pilha vazia!");					
				}else{
					pilha[topo] = 0;
					topo--;
				}				
				break;
				
			case 3: // Listar
				System.out.println("Pilha original");
				for(int i = topo; i > -1; i--) {
					System.out.println(pilha[i]);
				}
				
				// Pilha ordenada.
				//pilhaOrdenada = pilha; Faz as referencias apontarem para o mesmo lugar
				
				//pilhaOrdenada = Arrays.copyOf(pilha, pilha.length); Copia os valores
				
				for (int i = topo; i > -1; i--) {
					pilhaOrdenada[i] = pilha[i];					
				}
				
				//Arrays.sort(pilhaOrdenada);// Ordena a minha variavel pilhaOrdenada
				for(int i = topo; i > -1; i--){
					for(int j = (i-1); j > -1; j--) {
						if(pilhaOrdenada[j] > pilhaOrdenada[i]){
							aux = pilhaOrdenada[j];
							pilhaOrdenada[j] = pilhaOrdenada[i];
							pilhaOrdenada[i] = aux;							
						}						
					}					
				}				
				
				System.out.println("Pilha Ordenada:");
				for(int i = topo; i > -1; i--) {
					System.out.println(pilhaOrdenada[i]);
				}				
				
				break;
				
			case 4: // Sair
				continuar = false;				
				break;

			default:
				System.out.println("Opção inválida! Digite números de 1 a 4");
				break;
			}
			
		}
		


	}

}
