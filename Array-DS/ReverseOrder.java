import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner sc = new Scanner(System.in);
        int numberOfInput = sc.nextInt();

        int[] myIntArray = new int[numberOfInput];
        for(int i = 0; i < numberOfInput; i++ ){
            myIntArray[i] = sc.nextInt();
        }
        for(int i= numberOfInput -1; i >=0; i--){
            System.out.print(myIntArray[i] + " ");
        }
    
        
    }
    
    
}
