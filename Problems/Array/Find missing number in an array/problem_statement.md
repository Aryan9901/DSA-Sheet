## Find missing number in an array

## Description

Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

## Examples

### Example 1

Input: `nums = [3,0,1]` </br>
Output: `2` </br>
Explanation:

n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

### Example 2

Input: `nums = [0,1]` </br>
Output: `2` </br>
Explanation: </br>

n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.

### Example 3

Input: `nums = [9,6,4,2,3,5,7,0,1]` </br>
Output: `8` </br>
Explanation: </br>

n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.

Constraints:

1 n == nums.length </br>
2 1 <= n <= 104 </br>
3 0 <= nums[i] <= n </br>
4 All the numbers of nums are unique.
