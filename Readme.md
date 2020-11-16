# ArraySumProblem

### Problem Statement
Given an array of integers and an integer K, Find how many pairs exist such that their sum is lesser than K.

```
Example
arr = {7, 4, 13, 2, 3, 8}
K = 12
pairs = [(7, 4), (7, 2), (7, 3), (4, 2), (4, 3), (2, 3), (2, 8), (3, 8)]
Output : 8
```
### How to run
 
Run [Runner.main](https://github.com/ayushin78/ArraySumProblem/blob/main/src/com/ayushin78/Runner.java)

```
Enter length of array
6
Enter array elements
7 4 13 2 3 8
Enter K
12
Count of pairs with sum lesser than k(12) : 8
```

### How to run tests

Run [ArraySumTest](https://github.com/ayushin78/ArraySumProblem/blob/main/test/com/ayushin78/ArraySumTest.java) class. It uses jUnit library so will need to import the same to run the tests.

### Complexity
```
 Time Complexity : O(nlogn)
 Space Complexity : O(1)
```
