/*
Given an array of integers nums, write a method that returns the "pivot" index of this array.

We define the pivot index as the index where the sum of the numbers to the left of the index is equal to the sum of the numbers to the right of the index.

If no such index exists, we should return -1. If there are multiple pivot indexes, you should return the left-most pivot index.

Example:
Input: 
nums = [1, 7, 3, 6, 5, 6]
Output: 3
Explanation: 
The sum of the numbers to the left of index 3 (nums[3] = 6) is equal to the sum of numbers to the right of index 3.
Also, 3 is the first index where this occurs.

*/

import java.io.*;
import java.util.List;
import java.util.ArrayList;
public class Pivot{
 public static void main (String args[])throws IOException{
DataInputStream dis = new DataInputStream(System.in);

List nums = new ArrayList();
String input;
while((input = dis.readLine()){
System.out.println(input);
}
//nums.add(Integer.parseInt());
  //System.out.println("Please enter list of numbers press X to Exit");


 }

}