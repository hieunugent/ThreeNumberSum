# ThreeNumberSum
- write a function that take non empty array with distinct integer and the  target that is sum of any 3 number in the array
- the function should return all triplet array that sum equal the target
- the triplet array should return in ascending order with respect to the number that they hold.
# Solution:
- As each element of an array
- Make the input array is sorted
- As each time process left and right of the leftover array
- If there is potential in list add left potential right in the return list array
- Iterate the array and check if sum match with target
- Create the new array with the three possible
- Add it in the List of array
- if there is not equal and the result less than target, move the left node
- else move the right node.
- time complexity O(N^2)
- space O(N);
