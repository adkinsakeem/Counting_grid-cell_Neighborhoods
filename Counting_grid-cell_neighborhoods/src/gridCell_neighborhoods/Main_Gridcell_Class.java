package gridCell_neighborhoods;

import java.util.Arrays;

public class Main_Gridcell_Class {

	public static void main(String[] args) {
		int N = 3;
		int[][] gridArray = getArrayValues();	
		int[][] init_X_Y_Value = {{0,0}, {2,7}, {9,9}};
		
		//System.out.println(Arrays.deepToString(gridArray));
		GridCell_Neighborhood_Routine.gridRoutine(N, gridArray, init_X_Y_Value);

	}
	
	
	private static int[][] getArrayValues(){
		//****This makes it easier to import the 2D Array*******************************
		//******************************************************************************
		int[][] returnArray = {
				{0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
				{10, 11, 12, 13, 14, 15, 16, 17, 18, 19},
				{20, 21, 22, 23, 24, 25, 26, 27, 28, 29},
				{30, 31, 32, 33, 34, 35, 36, 37, 38, 39},
				{40, 41, 42, 43, 44, 45, 46, 47, 48, 49},
				{50, 51, 52, 53, 54, 55, 56, 57, 58, 59},
				{60, 61, 62, 63, 64, 65, 66, 67, 68, 69},
				{70, 71, 72, 73, 74, 75, 76, 77, 78, 79},
				{80, 81, 82, 83, 84, 85, 86, 87, 88, 89},
				{90, 91, 92, 93, 94, 95, 96, 97, 98, 99}
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
