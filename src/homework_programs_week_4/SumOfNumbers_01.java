package homework_programs_week_4;

// 1.    Read 10 numbers from the console entered by the user and print the sum of those
//       numbers

/**-Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 *   -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 *   10 numbers.
 *  -Use the nextInt() method to get the number and add it to the sum.
 *  -Before the user enters each number, print the message Enter number #x: where x represents the
 *   count, i.e. 1, 2, 3, 4, etc.
 *  -For example, the first message printed to the user would be Enter number #1:, the next Enter number
 *   #2:, and so on.
 *
 */

import java.util.Scanner;

public class SumOfNumbers_01 {
    static boolean isArmstrong(int n)
    {
        int temp, digits=0, last=0, sum=0;
        //assigning n into a temp variable
        temp=n;
        //loop execute until the condition becomes false
        while(temp>0)
        {
            temp = temp/10;
            digits++;
        }
        temp = n;
        while(temp>0)
        {
            //determines the last digit from the number
            last = temp % 10;
            //calculates the power of a number up to digit times and add the resultant to the sum variable
            sum +=  (Math.pow(last, digits));
            //removes the last digit
            temp = temp/10;
        }
        //compares the sum with n
        if(n==sum)
            //returns if sum and n are equal
            return true;
            //returns false if sum and n are not equal
        else return false;
    }

    public static void main(String[] args)
    {
        int num;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number: ");
        //reads the limit from the user
        num=sc.nextInt();
        if(isArmstrong(num))
        {
            System.out.print("Armstrong ");
        }
        else
        {
            System.out.print("Not Armstrong ");
        }
    }
}
