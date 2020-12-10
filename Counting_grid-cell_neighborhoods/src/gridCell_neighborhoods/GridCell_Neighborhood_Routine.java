package gridCell_neighborhoods;

import java.util.ArrayList;

public class GridCell_Neighborhood_Routine {
	
	private static ArrayList<String> gridCount = new ArrayList<String>();
	private static int positiveNumCount = 0;

	
	public static int gridRoutine(int N, int[][] gridArray, int[][] init_X_Y_Value) throws EnteredValueException {
		
		/*Checks the N and gridArray values entered for errors*/
		valueErrorChecking(N, gridArray);
		
		for(int XY_Arr_Count=0; XY_Arr_Count<init_X_Y_Value.length;XY_Arr_Count++) {
			
			/*Checks the init_X_Y_Value variable for errors*/
			initValueErrorChecking(N, gridArray, init_X_Y_Value[XY_Arr_Count][0], init_X_Y_Value[XY_Arr_Count][1]);
			
			/*Takes each value in the N Array and attempts to find the grid*/
			gridTask(N, gridArray, init_X_Y_Value[XY_Arr_Count][0], init_X_Y_Value[XY_Arr_Count][1]);
			
		}
		
		return positiveNumCount;
	}
	
	
	
	/*This function is in case a 1-D Array is passed instead of a 2-D Array*/
	public static int gridRoutine(int N, int[][] gridArray, int[] init_X_Y_Value) throws EnteredValueException {
		
		/*Checks the N and gridArray values entered for errors*/
		valueErrorChecking(N, gridArray);

		/*Checks the init_X_Y_Value variable for errors*/
		initValueErrorChecking(N, gridArray, init_X_Y_Value[0], init_X_Y_Value[1]);
		
		/*Takes each value in the N Array and attempts to find the grid*/
		gridTask(N, gridArray, init_X_Y_Value[0], init_X_Y_Value[1]);
		
		return positiveNumCount;
	}
	
	
	
	private static void gridTask(int N, int[][] gridArray, int init_X_Value, int init_Y_Value) {
		
		int new_X_Value;
		int new_Y_Value;

		//***Looping the X Coordinates**************************************************
		//******************************************************************************
		for(int x=0; x<=N;x++) {
			for(int y=0; y<=N-x;y++) {
				
		//***Checks the right side of the row X*************************************
		//**************************************************************************
				new_X_Value = init_X_Value + x;
				new_Y_Value = init_Y_Value + y;
				taskLoop(gridArray, new_X_Value, new_Y_Value);
				
				
		//***Checks the left side of the row X**************************************
		//**************************************************************************
				new_Y_Value = init_Y_Value - y;
				taskLoop(gridArray, new_X_Value, new_Y_Value);
				
				
		//***Checks the right side of the row -X************************************
		//**************************************************************************
				new_X_Value = init_X_Value - x;
				new_Y_Value = init_Y_Value + y;
				taskLoop(gridArray, new_X_Value, new_Y_Value);
				
				
		//***Checks the left side of the row -X************************************
		//**************************************************************************
				new_Y_Value = init_Y_Value - y;
				taskLoop(gridArray, new_X_Value, new_Y_Value);
				
			}
			
		}
		
//System.out.println(gridCount.toString());
	}
	
	
	private static void taskLoop(int[][] gridArray, int new_X_Value, int new_Y_Value) {

		String coord;
		
		/*Creates the coordinates of the current cell*/
		coord = "("+Integer.toString(new_X_Value)+","+Integer.toString(new_Y_Value)+")";
		
		//*Adds coordinates "gridCount" Array if qualifications are met*/
		if(!gridCount.contains(coord) && new_X_Value >= 0 && new_Y_Value >= 0 && 
			new_X_Value < gridArray.length && new_Y_Value < gridArray[0].length) {
			gridCount.add(coord);
		/*Adds to positive count if conditions are met*/
		positiveNumCount++;
	}
}


private static void valueErrorChecking(int N, int[][] gridArray) throws EnteredValueException {
	if(N < 0)
		throw new EnteredValueException("The N Value needs to be greater than 0");
	else if(N > gridArray.length || N > gridArray[0].length)
		throw new EnteredValueException("The N Value is too high. It needs to be less than the maximum height and width of the grid.");
	else if(gridArray.length <= 0 || gridArray[0].length <= 0)
		throw new EnteredValueException("The grid X and Y dimensions needs to be higher than 0.");
	
}

private static void initValueErrorChecking(int N, int[][] gridArray,  int init_X_Value, int init_Y_Value) throws EnteredValueException {
	if(init_X_Value < 0 || init_Y_Value < 0)
		throw new EnteredValueException("The initial value needs to be at least 0.");
	else if(init_X_Value >= gridArray.length)
		throw new EnteredValueException("The initial X value needs to less than the maximum grid length.");
	else if(init_Y_Value >= gridArray[0].length)
		throw new EnteredValueException("The initial Y value needs to less than the maximum grid height.");
	
}

}