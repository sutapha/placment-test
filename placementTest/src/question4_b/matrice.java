package question4_b;

public class matrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer matrice[][] = new Integer[9][9];
		
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j <= i; j++) {
				if (j == 0 || (i == j)) {
					matrice[i][j] = 1;
				}
				else
				{
					matrice[i][j] = matrice[i-1][j] + matrice[i-1][j-1];
				}
			}
		}
		
		
		for (int i = 0; i < matrice.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(matrice[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}
