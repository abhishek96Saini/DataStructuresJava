/*https://practice.geeksforgeeks.org/problems/java-hashmap/0

Given n key - value pairs and a seperate key in next line.
If this key is found in the previous n keys then print its value otherwise print "-1".

Input:  First line of input contains a single integer T which denotes the number of test cases. T test cases follows,
        first line of each test case contains a integer n.
        Second line of each test case consists of n key(String)-value(Integer) pairs space separated.
        Third and last line of each test case consists of a single key(String).

Output: If the key is found in the HashMap print its value otherwise print "-1".*/

import java.util.HashMap;
import java.util.Scanner;

public class GFG_HashMapFindKeyExist {

    public static void main(String[] args) {
        HashMap<String, Integer> myStringIntHashMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        //  first line of input. T as number of test cases
        //  first line of test case 'n' as number of key-value pairs
        int numberOfTestCases = scanner.nextInt();

        //  test case input
        while (numberOfTestCases > 0) {
            int n = scanner.nextInt(); // line 1
            String bufferClear = scanner.nextLine(); // clear buffer
            String input = scanner.nextLine(); // string input
            String[] splitInput = input.split("\\s"); // split element

            int i = 0, j = 1, x = 0;
            while (x < n) {
                myStringIntHashMap.put(splitInput[i], Integer.parseInt(splitInput[j])); // input key-value pair into hash map
                i += 2;
                j += 2;
                x++;
            }

            String findKey = scanner.nextLine();
            System.out.println("findkey: " + findKey);

            if (myStringIntHashMap.containsKey(findKey)) {
                System.out.println(myStringIntHashMap.get(findKey));
            } else System.out.println(-1);


            numberOfTestCases--;
        }

    }
}
