public class QuickSortTester{
    
    public static void main(String[] args) {
	for (int i = 0; i < 10000; i++) {
	    int[] arr = QuickSort.buildArray(i,500);
	    QuickSort.shuffle(arr);
	    double startTime = System.nanoTime();
	    QuickSort.qsort(arr);
	    double endTime = System.nanoTime();
	    System.out.println(endTime - startTime);
	}
    }
}
