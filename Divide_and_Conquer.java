package Woche4;

import java.util.Random;

public class Divide_and_Conquer {                                     // main
    public static void main(String[] args) {

        int [] numbers = new int [10];
        Random r = new Random();


        System.out.println(" Array:");
        for (int i = 0; i < numbers.length; i++) {                  //filling array with random numbers (100)
                numbers[i] = r.nextInt(100);
                System.out.print(" " + numbers[i]);
            }
            System.out.println();

        System.out.println(" Highest number of array: " + findMaximum(0, numbers.length-1, numbers ));   // use method by input start and end of array including array


    }

    public static int findMaximum(int left, int right, int[] numbers){   //make method

        if (left == right){                                              //if only one box is, all others completely compared
            return(numbers[left]);                                       // return the left (or right one, is same box)
        }
        int mid = (left + right) / 2;                                    // int mid for middle of array


        int max1 = (findMaximum(left , mid,  numbers));                  //creating virtual array (left side) -> that is splited up again
        int max2 = (findMaximum(mid+1 , right, numbers));           //creating virtual array (right side) -> that is splited up again

        if (max1 > max2) {                                              // comparing max value for each virtual array
            return(max1);                                               // if max1 bigger than return that
        }
        else {
            return(max2);                                               // or else return other one
        }
    }

}
