package gridCell_neighborhoods;

import java.util.Arrays;

public class Main_Gridcell_Class {

	public static void main(String[] args) {
		int N[] = {3};
		int[][] gridArray = getArrayValues();
		int init_X_Value = 5;
		int init_Y_Value = 5;
		
		//System.out.println(Arrays.deepToString(gridArray));
		GridCell_Neighborhood_Routine.gridRoutine(N, gridArray, init_X_Value, init_Y_Value);

	}
	
	
	private static int[][] getArrayValues(){
		//****This makes it easier to import the 2D Array*******************************
		//******************************************************************************
		int[][] returnArray = {
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10},
				{-1, -2, -3, -4, -5, -6, -7, -8, -9, -10}
		};
		//System.out.println(Arrays.toString(testArray));

		/*int[][] returnArray = {
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
				{1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
		};*/
		
		return returnArray;
	}

}
