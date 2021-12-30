/* problem link: https://leetcode.com/problems/single-number/
Approach: Bitwise XOR
Time Complexity: O(n)
Space Complexity: O(1) */

var singleNumber = function(nums) {
    let currentValue = 0;
    nums.forEach(arrayElement => {
        currentValue = currentValue^arrayElement;
    })
    return currentValue;
};
