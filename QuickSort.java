//Ricky Lin, Kyle Tau, Thet Htay Zaw
//APCS2 pd2
//HW18 -- QuickSort
//2018-03-12
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): If the range of the array in question is more than 1, partition the entire array with the last value as the pvtVal. Then, recursively quicksort the left half of the array and then the right half. Each time you quicksort, look at the range. The recursion stops when the range is equal to 0.
 *
 * 2a. Worst pivot choice and associated runtime: 
 * If the array is sorted in descending order and we always pick the rightmost value as the pivot choice, the runtime will be O(n^2)
There will be n-1 passes of the quicksort algorithm, with each pass running at O(n) for partition. Together it will be O(n^2).
 *
 * 2b. Best pivot choice and associated runtime:
 * If each time the pivot choice happens to be the middle value of the array in question (either the original array or the smaller arrays we created with recursion), the runtime will be O(nlogn).
 Dividing the array in half each time gives O(log n) passes with partition in each pass running at O(n), which gives O(nlog n).
 *
 * 3. Approach to handling duplicate values in array:
 * The partition method handles the problem of duplicates because of the line 
arr[i] <= pvtVal, which considers dubplicate values. Quicksort will run over these values again even if they can be considered as in their final place. Duplicate values will change places with each other, but not with different values, which allows the array to stay sorted.
 *****************************************************/

public class QuickSort
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }

    public static int[] buildArrayIntegral(int s) {
	int[] retArr = new int[s];
	for(int i = 0; i < retArr.length; i++ )
	    retArr[i] = i;
	return retArr;
    }
    
    //--------------^  HELPER METHODS  ^--------------

    public static int partition( int[] arr, int left, int right, int pvtPos)
    {
	int pvtVal = arr[pvtPos];
	swap( pvtPos, right, arr);
	int storPos = left;

	for( int i = left; i < right; i++ )
	    {
		if ( arr[i] <= pvtVal)
		    {
			swap( i, storPos, arr );
			storPos++;}
	    }
	swap(storPos,right,arr);
	return storPos;
    }//end mysterion

    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d )
    { 
	qsort(d,0,d.length-1);
    }

    //you may need a helper method...
    public static void qsort(int[] arr, int left, int right) {
	if (left < right) {
	    int pvtPos = partition(arr,left,right,right);
	    qsort(arr,left,pvtPos-1);
	    qsort(arr,pvtPos+1,right);
	}
    }
    
    //main method for testing
    public static void main( String[] args )
    {
	
	//get-it-up-and-running, static test case:
	int [] arr1 = {7,1,5,12,3};
	System.out.println("\narr1 init'd to: " );
	printArr(arr1);

	qsort( arr1 );	
	System.out.println("arr1 after qsort: " );
	printArr(arr1);
	
	// randomly-generated arrays of n distinct vals
	int[] arrN = new int[10];
	for( int i = 0; i < arrN.length; i++ )
	arrN[i] = i;
       
	System.out.println("\narrN init'd to: " );
	printArr(arrN);

	shuffle(arrN);
	System.out.println("arrN post-shuffle: " );
	printArr(arrN);

	qsort( arrN );
	System.out.println("arrN after sort: " );
	printArr(arrN);

	//get-it-up-and-running, static test case w/ dupes:
	int [] arr2 = {7,1,5,12,3,7};
	System.out.println("\narr2 init'd to: " );
	printArr(arr2);

	qsort( arr2 );	
	System.out.println("arr2 after qsort: " );
	printArr(arr2);


	// arrays of randomly generated ints
	int[] arrMatey = new int[20];
	for( int i = 0; i < arrMatey.length; i++ )
	arrMatey[i] = (int)( 48 * Math.random() );
       
	System.out.println("\narrMatey init'd to: " );
	printArr(arrMatey);

	shuffle(arrMatey);
	System.out.println("arrMatey post-shuffle: " );
	printArr(arrMatey);

	qsort( arrMatey );
	System.out.println("arrMatey after sort: " );
	printArr(arrMatey);

    }//end main

}//end class QuickSort
