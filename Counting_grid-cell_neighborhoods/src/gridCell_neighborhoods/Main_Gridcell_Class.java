package gridCell_neighborhoods;

public class Main_Gridcell_Class {

	public static void main(String[] args) throws EnteredValueException {
		int N = 3;
		int[][] gridArray = getArrayValues();	
		int[][] init_X_Y_Value = {{4,5}};
		
		int positiveNumCount = GridCell_Neighborhood_Routine.gridRoutine(N, gridArray, init_X_Y_Value);
		
		System.out.println("The total number of cells within N=" 
			+ N + " steps of a positive value is " + positiveNumCount + ".");

	}
	
	
	private static int[][] getArrayValues(){
		//****This makes it easier to import the 2D Array*******************************
		//******************************************************************************
		int[][] returnArray = {
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
		};
		
		return returnArray;
	}

}