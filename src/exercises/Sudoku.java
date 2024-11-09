package exercises;

import java.util.HashSet;

public class Sudoku {
	
	static boolean checker(int[][] array) {
		
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> columns = new HashSet<Integer>();
		
		for (int i=0; i< 9;i++) {
			for (int j=0; j< 9;j++) {
				rows.add(array[i][j]);
				columns.add(array[j][i]);
			}
			if(columns.size()!=9 || rows.size()!=9) return false;

			columns.clear();
			rows.clear();
		}
		
		return true;
	}

	public static void main(String[] args) {

		int[][] boardgood = {
			    {5, 3, 4, 6, 7, 8, 9, 1, 2},
			    {6, 7, 2, 1, 9, 5, 3, 4, 8},
			    {1, 9, 8, 3, 4, 2, 5, 6, 7},
			    {8, 5, 9, 7, 6, 1, 4, 2, 3},
			    {4, 2, 6, 8, 5, 3, 7, 9, 1},
			    {7, 1, 3, 9, 2, 4, 8, 5, 6},
			    {9, 6, 1, 5, 3, 7, 2, 8, 4},
			    {2, 8, 7, 4, 1, 9, 6, 3, 5},
			    {3, 4, 5, 2, 8, 6, 1, 7, 9}
			};
		int[][] boardbad = {
			    {5, 5, 4, 6, 7, 8, 9, 1, 2},
			    {6, 7, 2, 1, 9, 5, 3, 4, 8},
			    {1, 9, 8, 3, 4, 2, 5, 6, 7},
			    {8, 5, 9, 7, 6, 1, 4, 2, 3},
			    {4, 2, 6, 8, 5, 3, 7, 9, 1},
			    {7, 1, 3, 9, 2, 4, 8, 5, 6},
			    {9, 6, 1, 5, 3, 7, 2, 8, 4},
			    {2, 8, 7, 4, 1, 9, 6, 3, 5},
			    {3, 4, 5, 2, 8, 6, 1, 7, 9}
			};
		
		int[][] invalid3 = {
			    {5, 3, 4, 6, 7, 8, 9, 1, 2},
			    {6, 7, 2, 1, 9, 5, 3, 4, 8},
			    {1, 9, 8, 3, 4, 2, 5, 6, 7},
			    {8, 5, 9, 7, 6, 1, 4, 2, 3},
			    {4, 2, 6, 8, 5, 3, 7, 9, 1},
			    {7, 1, 3, 9, 2, 4, 8, 5, 6},
			    {9, 6, 1, 5, 3, 7, 2, 8, 4},
			    {2, 8, 7, 4, 1, 9, 6, 3, 5},
			    {3, 4, 5, 2, 6, 6, 1, 7, 9} // Error: Repetición del 6 en el subcuadro inferior central
			};

		if(checker(invalid3)) System.out.println("Sudoku Válido");
		else System.out.println("Sudoku Inválido");
		

	}

}
