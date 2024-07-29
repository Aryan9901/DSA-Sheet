## Union of Two Sorted Arrays

## Description

Given two sorted arrays of size n and m respectively, find their union. The Union of two arrays can be defined as the common and distinct elements in the two arrays. Return the elements in sorted order.

## Examples

### Example 1

Input: `n = 5, arr1[] = {1, 2, 3, 4, 5}  
m = 5, arr2 [] = {1, 2, 3, 6, 7}` </br>
Output: `1 2 3 4 5 6 7` </br>
Explanation:

Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

### Example 2

Input: `n = 5, arr1[] = {2, 2, 3, 4, 5}  
m = 5, arr2[] = {1, 1, 2, 3, 4}` </br>
Output: `1 2 3 4 5` </br>
Explanation: </br>

Distinct elements including both the arrays are: 1 2 3 4 5.

### Example 3

Input: `n = 5, arr1[] = {1, 1, 1, 1, 1}
m = 5, arr2[] = {2, 2, 2, 2, 2}` </br>
Output: `1 2` </br>
Explanation: </br>

Distinct elements including both the arrays are: 1 2.

Expected Time Complexity: O(n+m).
Expected Auxiliary Space: O(n+m).

Constraints:

1 <= n, m <= 105 </br>
2 -109 <= arr1[i], arr2[i] <= 109 </br>
