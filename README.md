# PizzaCake (Ricky Lin, Kyle Tau, Thet Htay Zaw)
###### APCS2 pd 2
###### Lab 01 -- What Does the Data Say? 
###### 3-15-18

##Assessment of Big Oh Runtime Classification##
The worst case scenario for QuickSort would have to be O(n^2). For this to happen, every time a partition happens, the pivot point reaches the rightmost or leftmost boundary/value, causing the array to be split very evenly. You are only essentially removing one value at a time in this case. Since partition runs through the entire array by itself, and the actual splitting is going through every single value, the runtime would have to be O(n^2). 

For best case, the pivot would have to consistently reach the center/median value or close to it. This would result in an even splitting of the array and works similar to the splitting of mergesort. This act of spliting would have a run time of O(log n) and the act of partitioning would have a run time of O(n). Together, the best case should have a run time of O(nlogn). 

For average case, it should be safe to assume that neither best case or worst case will happen often. However, it is reasonable to assume  that the pivot would likely be placed in a position where the arrays are constantly split into two other arrays. So for an average case, the runtime should be more closer to O(nlog) due to the likeliness of the arrays constantly being split into two smaller arrays being  larger than having the array only remove one value at a time due to the pivot point being at a boundary. 


## Hypothesis ##

QuickSort will have a runtime of O(nlogn) in the best case scenario and a runtime of O(n^2) in the worst case scenario. In general, it runs in O(nlogn).

## Background ##

QuickSort takes an array and if the array is longer than 1 element, it will call partition on that array with the range (the left index to the right index) being the entire array and the pivot value being the rightmost index. This will create a left half of the array where the values are less than the pivot and a right half where the values are larger. We then run QuickSort recursively on both halves of the array, reducing the range to only include the left range and then the right range after each partition, while keeping track of the range. Once the range reaches zero, meaning you are only looking at one sorted element, the array is sorted and the algorithm stops running.  

## Methodology ##
For every case, we start off with an array the size of 1, and continuing until the array reaches a size of 10000, incrementing by values of 1. We start off by testing the average value. This uses random numbers (with a ceiling) and shuffles the array. We took the time it took for each array to be sorted. Next we tested the worst case scenarios. One worst case scenario has all of the values be identical. This is because in array where all the values are the same, partition will make the pivot value the last possible value (rightmost boundary). We also tested an array in which the data is already sorted. Because we start off by treating the rightmost value as the pivot value (which is also the greatest), QuickSort will only chop off one value at a time. Finally, we tested the "best case" scenario. We assumed that by trying to set the pivot to the median, we could reach the best case scenario. It was proving to be very hard to find a way to generate best case arrays as the arrays increased in size, so we thought this could be possible. 


## Results ## 

!(https://github.com/kyletau67/PizzaCake/blob/master/avgCase.png) 
!(https://github.com/kyletau67/PizzaCake/blob/master/worstDupCase.png)
!(https://github.com/kyletau67/PizzaCake/blob/master/worstSortCase.png)
!(https://github.com/kyletau67/PizzaCake/blob/master/bestCase.png) 

## Conclusions ##
