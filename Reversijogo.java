package reversi;
import java.util.Scanner;
public class Reversijogo {

	
	public static void main(String[] args) {
		int l=0,c=0, w=0;
		
		
		
		Scanner ler= new Scanner(System.in);
		Scanner ler2= new Scanner(System.in);
tabuleiro tab = new tabuleiro();



tab.atualizarTabuleiro();
	while(w!=10){
	System.out.println("O Jogador O joga :");
	System.out.println("Insira o numero da linha =");
	l = ler.nextInt();
	System.out.println("Insira o numero da coluna =");
	c = ler2.nextInt();
	
	tab.tab[l][c] = 1;
	
	System.out.println("O Jogador X joga :");
	System.out.println("Insira o numero da linha =");
	l = ler.nextInt();
	System.out.println("Insira o numero da coluna =");
	c = ler2.nextInt();
	
	tab.tab[l][c] = 2;
	
	
	
	}
	}
	}