/*
 *  UCF COP3330 Fall 2021 Assignment 38 Solution
 *  Copyright 2021 Ihosvany Marquez
 */

package Exercise38;

import java.util.Scanner;
import java.util.*;

public class Solution38
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String input = scan.nextLine();

        String[] list = input.split(" ");
        Integer[] evenList = FilterEven(list);

        System.out.print("The even numbers are: ");

        for(int i = 0 ; i < evenList.length ; i++)
        {
            if(i < evenList.length - 1)
            {
                System.out.print(evenList[i] + " ");
            }
            else
            {
                System.out.print(evenList[i] + ".");
            }
        }
    }

    public static Integer[] FilterEven(String[] list)
    {
        ArrayList<Integer> outputList = new ArrayList<>();

        for (String s : list)
        {
            int consoleNumbers = Integer.parseInt(s);
            if (consoleNumbers % 2 == 0) {
                outputList.add(consoleNumbers);
            }
        }
        Integer[] array = new Integer[outputList.size()];
        array = outputList.toArray(array);
        return array;
    }
}
