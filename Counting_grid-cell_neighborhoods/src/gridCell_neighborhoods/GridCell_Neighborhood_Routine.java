package gridCell_neighborhoods;

import java.util.ArrayList;
import java.util.Arrays;


public class GridCell_Neighborhood_Routine {
	
	private static ArrayList<String> gridCount = new ArrayList<String>();
	@SuppressWarnings("unused")
	private static int positiveNumCount = 0;


	
	public static void gridRoutine(int N, int[][] gridArray, int[][] init_X_Y_Value) {
		
		//***Takes each value in the N Array and attempts to find the grid***************
		//*******************************************************************************
		for(int XY_Arr_Count=0; XY_Arr_Count<init_X_Y_Value.length;XY_Arr_Count++) {
			gridTask(N, gridArray, init_X_Y_Value[XY_Arr_Count][0], init_X_Y_Value[XY_Arr_Count][1]);
		}
				
		
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
		
System.out.println(gridCount.toString());

	}
	
	private static void taskLoop(int[][] gridArray, int new_X_Value, int new_Y_Value) {

		String coord;
		
		/*Creates the coordinates of the current cell*/
		coord = "("+Integer.toString(new_X_Value)+","+Integer.toString(new_Y_Value)+")";
		
		//*Adds coordinates "gridCount" Array if qualifications are met*/
		if(!gridCount.contains(coord) && new_X_Value >= 0 && new_Y_Value >= 0 && 
				new_X_Value < gridArray.length && new_Y_Value < gridArray[0].length) {
			gridCount.add(coord);
			if(gridArray[new_X_Value][new_Y_Value] >=0) {
				
				/*Adds to positive count if conditions are met*/
				positiveNumCount++;
				//System.out.println(gridArray[new_X_Value][new_Y_Value]);
			}
		}
	}

}
