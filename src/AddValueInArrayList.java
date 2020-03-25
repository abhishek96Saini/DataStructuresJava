/*https://practice.geeksforgeeks.org/problems/java-arraylist/0

Given a ArrayList of n elements and a integer q defining the query number(which will be either 1or 2):
Query 1includes two integers p and r.Which means add a value r at and index p in the ArrayList
and print the whole updated ArrayList. Query 2includes one integer p.In this query print the index at which the value
p is last found in the ArrayList.If the value p is not found int he ArrayList then print"-1".

NOTE:Assume 0based indexing

Input:
First line of input file contains an integer T,denoting the number of test cases.Then T test case follow.
First line of each test case contains two integer n and q(space separated).
Second Line of each test case consists of n spaced integers.
Third line consists of 2integers if the value of q is 1otherwise consists of a single integer.

Output:
For each test case,print required output.*/

import java.util.ArrayList;
import java.util.Scanner;

public class AddValueInArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> intArr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int t, q, n, r;
//        First line of input 'T'
        t = scanner.nextInt();

        while (t != 0) {
//            First line of test case input 'N' and 'Q'
            n = scanner.nextInt();
            q = scanner.nextInt();

//            Second line of Test Case
//            Taking 'n' number of integers
            for (int i = 0; i < n; i++) {
                int in = scanner.nextInt();
                intArr.add(in);
            }

//            Third line of test case;
//            if the value of 'Q' is 1, then input 'P' and 'R'
//            insert element 'R' in list at index 'P'
//            if Q is 2, then find last found index of  element 'P'
            if (q == 1) {
                int p = scanner.nextInt();
                r = scanner.nextInt();
                intArr.add(p, r);
//                System.out.println(intArr);
                for (int i = 0; i <= intArr.size(); i++)
                    System.out.print(intArr.get(i) + " ");
                System.out.println("");
            } else {
                /*Find location of element*/
                int p = scanner.nextInt();
                if (intArr.contains(p)) {
                 /*   for (int i = intArr.size(); i > -1; i--) {
                        if (p == intArr.get(i))
                            System.out.println(i);
                    }*/
                    System.out.println(intArr.lastIndexOf(p));
                } else System.out.println(-1);
            }

            t--;
            intArr.clear();

        }
    }
}