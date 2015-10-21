package sortAlgorithms;

public class BubbleSort {
	
	int[] theArray = {4,2,1,6,3,5,4};
	
	public void bubbleSort() {
	    for (int i = theArray.length - 1; i > 1; i--) {
	        for (int j = 0; j < i; j++) {
	            if( theArray[j] > theArray[j+1]) {
	                swapValues(j, j+1);
	            }
	        }
	     }
	}
	
	public void swapValues(int indexOne, int indexTwo) {

		   int temp = theArray[indexOne];
		   theArray[indexOne] = theArray[indexTwo];
		   theArray[indexTwo] = temp;

	}
	
    public static void main( String[] args )
    {
    	//BubbleSort.bubbleSort();
        System.out.println( "Bubble Sort Complete" );
    }

}
