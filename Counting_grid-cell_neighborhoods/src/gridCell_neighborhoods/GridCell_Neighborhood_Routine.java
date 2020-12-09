package gridCell_neighborhoods;

import java.util.ArrayList;
import java.util.Arrays;


public class GridCell_Neighborhood_Routine {
	
	private static ArrayList<String> gridCount = new ArrayList<String>();
	@SuppressWarnings("unused")
	private static int positiveNumCount = 0;


	
	public static void gridRoutine(int[] N, int[][] gridArray, int init_X_Value, int init_Y_Value) {
		
		//***Takes each value in the N Array and attempts to find the grid***************
		//*******************************************************************************
		for(int arrCount=0; arrCount<N.length;arrCount++) {
			gridTask(N[arrCount], gridArray, init_X_Value, init_Y_Value);
		}
				
		
	}
	
	
	
	private static void gridTask(int N, int[][] gridArray, int init_X_Value, int init_Y_Value) {
		
		int new_X_Value;
		int new_Y_Value;

		//***Looping the X Coordinates**************************************************
		//******************************************************************************
for(int x=0; x<=N;x++) {
	

	for(int y=0; y<=N-x;y++) {
		
		//***Loops thru the cells on the right of the grid**************************
		//**************************************************************************
		new_X_Value = init_X_Value + x;
		new_Y_Value = init_Y_Value + y;
		taskLoop(gridArray, new_X_Value, new_Y_Value);
		
		new_Y_Value = init_Y_Value - y;
		taskLoop(gridArray, new_X_Value, new_Y_Value);
		
		
		//***Loops thru the cells on the left of the grid**************************
		//**************************************************************************
		new_X_Value = init_X_Value - x;
		new_Y_Value = init_Y_Value + y;
		taskLoop(gridArray, new_X_Value, new_Y_Value);
		
		new_Y_Value = init_Y_Value - y;
		taskLoop(gridArray, new_X_Value, new_Y_Value);
		
		
		
		
	}
	
			
		}
		
System.out.println(gridCount.toString());

	}
	
	private static void taskLoop(int[][] gridArray, int new_X_Value, int new_Y_Value) {

		String coord;
		coord = "("+Integer.toString(new_X_Value)+","+Integer.toString(new_Y_Value)+")";
		if(!gridCount.contains(coord) && new_X_Value >= 0 && new_Y_Value >= 0 && 
				new_X_Value < gridArray.length && new_Y_Value < gridArray[0].length) {
			gridCount.add(coord);
			if(gridArray[new_X_Value][new_Y_Value] >=0) {
				positiveNumCount++;
				//System.out.println(gridArray[new_X_Value][new_Y_Value]);
			}
		}
	}

}
