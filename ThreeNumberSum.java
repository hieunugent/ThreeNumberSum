import java.util.*;

class ThreeNumberSum{
  public static List<Integer[]> threeNumberSum(int[] array, int targetsum){
     Arrays.sort(array);
     List<Integer[]> triplets = new ArrayList<Integer[]>();
     for(int i = 0 ; i < array.length -2 ;i ++){
       int left = i+1;
       int right = array.length-1;
       while (left < right){
         int sumOfThree = array[i] +array[left] + array[right];
         if (sumOfThree == targetsum){
           Integer[] triplet = {array[i], array[left], array[right]};
           triplets.add(triplet);
           left++;
           right--;
         }else if (sumOfThree < targetsum){
           left++;
         }else if (sumOfThree > targetsum){
           right--;
         }
       }
     }
     return triplets;
  }
}
