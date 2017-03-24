package reversi;

public class tabuleiro {

	static int [] [] tab ={
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,1,2,0,0,0},
		{0,0,0,2,1,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0},
		{0,0,0,0,0,0,0,0} };
	public static int[] contapontos(){
		
		int placar[] = new int[3];
		
				for(int i=0;i<8;i++){
		for(int j=0;j<8;j++){
			
			if(tab[i][j]==0){
				placar[0]+=1;
			}
		
			if (tab[i][j]==1){
				placar[1]+=1;
			}
				
			if(tab[i][j]==2){
				placar[2]+=1;
			}
		}
	}
		
	System.out.println("Casas em Branco = "+placar[0]);	
	System.out.println("Pontos Jogador 1 = "+placar[1]);	
	System.out.println("Pontos Jogador 2 = "+placar[2]);	
		
		return placar;
	}
	
	public static void atualizarTabuleiro(){
		
		System.out.println("       0   1   2   3   4   5   6   7 ");
		System.out.println("   +---------------------------------+");
		for (int i = 0;i<8;i++){
			System.out.printf("%d  | ",i);
			for(int j = 0;j<8;j++){
				switch (tab[i][j]){
					case 0:
						System.out.print("  . ");
					break;
					case 1:
						System.out.print("  x ");
					break;
					case 2:
						System.out.print("  o ");
					break;
					default:
						System.out.println("ERRO!");
						
				}
			}
			System.out.println("|");
		}
		System.out.println("   +---------------------------------+");
		System.out.println("       0   1   2   3   4   5   6   7 ");
		contapontos();
	}
		
		

		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
