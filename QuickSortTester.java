public class QuickSortTester{
    
    public static void main(String[] args) {
	//average case: shuffled elements (with pivot at the rightmost value)
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  for (int i = 1; i < 10000; i++) {
	  int[] arr = QuickSort.buildArray(i,500);
	  QuickSort.shuffle(arr);
	  double startTime = System.nanoTime();
	  QuickSort.qsort(arr);
	  double endTime = System.nanoTime();
	  System.out.println(endTime - startTime);
	  }
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
	
	//worst case 1: all duplicate elements (with pivot at the rightmost value)
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  for (int i = 1; i < 10000; i++) {
	  int[] arr = QuickSort.buildArray(i,0);
	  double startTime = System.nanoTime();
	  QuickSort.qsort(arr);
	  double endTime = System.nanoTime();
	  System.out.println(endTime - startTime);
	  }
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	//worst case 2: already sorted array (with pivot at the rightmost value)
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  for (int i = 1; i < 10000; i++) {
	  int[] arr = QuickSort.buildArrayIntegral(i);
	  double startTime = System.nanoTime();
	  QuickSort.qsort(arr);
	  double endTime = System.nanoTime();
	  System.out.println(endTime - startTime);
	  }
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	//best case: already sorted array (with pivot in the center)
	/* 
	   The best case is tended such that the pivot point is going to be the median of the array. 
	   In a sorted array, the center value must be the median.
	*/

	//Noise tests to get running smoothly
	for (int j = 1; j < 6; j++) {
	    int[] arr = QuickSort.buildArrayIntegral(j);
	    QuickSort.qsort1(arr);
	}

	//Actual test
	for (int i = 1; i < 10000 ; i++ ) {
	    int[] arr = QuickSort.buildArrayIntegral(i);
	    long startTime = System.nanoTime();
	    QuickSort.qsort1(arr);
	    long endTime = System.nanoTime();
	    System.out.println(endTime - startTime);
	}
	
    }
}
