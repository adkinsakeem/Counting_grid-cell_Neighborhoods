package gridCell_neighborhoods;

import java.util.ArrayList;
import java.util.Arrays;


public class GridCell_Neighborhood_Routine {
	
	private static ArrayList<String> gridCount = new ArrayList<String>();
	@SuppressWarnings("unused")
	private static int positiveNumCount = 0;


	
	public static void gridRoutine(int[] N, int[][] gridArray, int init_X_Value, int init_Y_Value) {
		
		for(int arrCount=0; arrCount<N.length;arrCount++) {
			gridTask(N[arrCount], gridArray, init_X_Value, init_Y_Value);
		}
		
		
		
	}
	
	
	
	private static void gridTask(int N, int[][] gridArray, int init_X_Value, int init_Y_Value) {
		
		String coord;
		int new_X_Value;
		int new_X_Neg_Value;
		int new_Y_Value;
		
for(int x=0; x<=N;x++) {
	

	//new_X_Neg_Value = init_X_Value - x;
	for(int y=0; y<=N-x;y++) {
		new_X_Value = init_X_Value + x;
		new_Y_Value = init_Y_Value + y;
		coord = "("+Integer.toString(new_X_Value)+","+Integer.toString(new_X_Value)+")";
		if(!gridCount.contains(coord)) {
			gridCount.add(coord);
			if(gridArray[new_X_Value][new_Y_Value] >=0) {
				positiveNumCount++;
				//System.out.println(gridArray[new_X_Value][new_Y_Value]);
			}
		}
		new_Y_Value = init_Y_Value - y;
		coord = "("+Integer.toString(new_X_Value)+","+Integer.toString(new_X_Value)+")";
		if(!gridCount.contains(coord)) {
			gridCount.add(coord);
			if(gridArray[new_X_Value][new_Y_Value] >=0) {
				positiveNumCount++;
				//System.out.println(gridArray[new_X_Value][new_Y_Value]);
			}
		}
		
		new_X_Value = init_X_Value - x;
		new_Y_Value = init_Y_Value + y;
		coord = "("+Integer.toString(new_X_Value)+","+Integer.toString(new_X_Value)+")";
		if(!gridCount.contains(coord)) {
			gridCount.add(coord);
			if(gridArray[new_X_Value][new_Y_Value] >=0) {
				positiveNumCount++;
				//System.out.println(gridArray[new_X_Value][new_Y_Value]);
			}
		}
		new_Y_Value = init_Y_Value - y;
		coord = "("+Integer.toString(new_X_Value)+","+Integer.toString(new_X_Value)+")";
		if(!gridCount.contains(coord)) {
			gridCount.add(coord);
			if(gridArray[new_X_Value][new_Y_Value] >=0) {
				positiveNumCount++;
				//System.out.println(gridArray[new_X_Value][new_Y_Value]);
			}
		}
		
		
		
		
	}
	
			
		}
		
System.out.println(gridCount.toString());

	}

}
