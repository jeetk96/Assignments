// Name: Jeet Kumar
// Class Section: IS 147
// Instructor: Benjamin Houdeshell
// Date: 4/18/2016
// Description: This program will read in ten integers invoke a method to eliminate
// duplicate values and display the result.

import java.util.Scanner;
import java.util.Arrays;

public class EliminateDuplicates{
   public static void main(String args[]){
   
   Scanner input = new Scanner(System.in);
   System.out.print("Enter ten numbers: ");
   
   int[] myList = new int[10];
   int[] list = new int[10];
    
   // append numbers into myList 
   for(int a = 0; a < myList.length; a++){
      myList[a] = input.nextInt();
   }
   
   eliminateDuplicates(list, myList);
   }
   
   
   public static int[] eliminateDuplicates(int[] list, int[] myList){
   
   // this nested for loop will compare all numbers two at a time
   for (int a = 0; a < list.length; a++){
      for (int b = 0; b < myList.length; b++){
         if (list[a] == myList[b]){
            list = ArrayUtils.remove(myList[b]);   
   }      
   }
 }
 // print the distinct numbers
 System.out.print("The distinct nmubers are: " + list);
 }
 }