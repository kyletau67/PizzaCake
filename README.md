# PizzaCake (Ricky Lin, Kyle Tau, Thet Htay Zaw)
# APCS2 pd 2
# Lab 01 -- What Does the Data Say? 
# 3-15-18

## Hypothesis ##

QuickSort will have a runtime of O(nlogn) in the best case scenario and a runtime of O(n^2) in the worst case scenario. In general, it runs in O(nlogn).

## Background ##

QuickSort takes an array and if the array is longer than 1 element, it will call partition on that array with the range (the left index to the right index) being the entire array and the pivot value being the rightmost index. This will create a left half of the array where the values are less than the pivot and a right half where the values are larger. We then run QuickSort recursively on both halves of the array, reducing the range to only include the left range and then the right range after each partition, while keeping track of the range. Once the range reaches zero, meaning you are only looking at one sorted element, the array is sorted and the algorithm stops running.  

## Methodology ##



## Results ## 



## Conclusions ##
