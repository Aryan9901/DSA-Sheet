# Problem Statement: Subset Sum Problem

## Description

Given an array of non-negative integers, and a value sum, determine if there is a subset of the given set with sum equal to given sum.

## Examples

### Example 1

```bash
Input:
arr[] = {3, 34, 4, 12, 5, 2}, sum = 9

Output:
true

Explanation:
Here there exists a subset with sum = 9, 4+3+2 = 9.
```

Example 2

```bash
Input:
arr[] = {3, 34, 4, 12, 5, 2} , sum = 30

Output:
false

Explanation:
There is no subset with sum 30.
```

- Expected Time Complexity: O(sum\*n)
- Expected Auxiliary Space: O(sum\*n)

Constraints:-

1. <= n <= 200
2. <= arr[i] <= 200
3. <= sum <= 4\*104
