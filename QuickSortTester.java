public class QuickSortTester{
    
    public static void main(String[] args) {
	//average case: shuffled elements
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
	
	//worst case 1: all duplicate elements
	/*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  for (int i = 1; i < 10000; i++) {
	  int[] arr = QuickSort.buildArray(i,0);
	  double startTime = System.nanoTime();
	  QuickSort.qsort(arr);
	  double endTime = System.nanoTime();
	  System.out.println(endTime - startTime);
	  }
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

	//worst case 2: already sorted array
        /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	  for (int i = 1; i < 10000; i++) {
	  int[] arr = QuickSort.buildArrayIntegral(i);
	  double startTime = System.nanoTime();
	  QuickSort.qsort(arr);
	  double endTime = System.nanoTime();
	  System.out.println(endTime - startTime);
	  }
	  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
    }
}
