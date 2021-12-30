/* problem link:

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.
 
Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1

Constraints:

    1 <= nums.length <= 3 * 104
    -3 * 104 <= nums[i] <= 3 * 104
    Each element in the array appears twice except for one element which appears only once.

Approach: Bit Manipulation

Concept
    If we take XOR of zero and some bit, it will return that bit
        a⊕0=aa \oplus 0 = aa⊕0=a
    If we take XOR of two same bits, it will return 0
        a⊕a=0a \oplus a = 0a⊕a=0
    a⊕b⊕a=(a⊕a)⊕b=0⊕b=ba \oplus b \oplus a = (a \oplus a) \oplus b = 0 \oplus b = ba⊕b⊕a=(a⊕a)⊕b=0⊕b=b

So we can XOR all bits together to find the unique number.
SOLUTION BELOW:
*/
class Solution{
  public int SingleNumber(int[] nums){
    int currentValue = 0;
    for(int arrayElement: nums){
      currentValue = currentValue^arrayElement;
    }
    return currentValue;
  }
}
