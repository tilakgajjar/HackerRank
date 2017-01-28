import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution.
        */
        Scanner scanner = new Scanner(System.in);
        int numberOfInput = scanner.nextInt();

        int[] myIntArray = new int[numberOfInput];
        for(int i = 0; i < numberOfInput; i++ ){
            myIntArray[i] = scanner.nextInt();
        }
        for(int i=3; i > -1; i--){
            System.out.print(myIntArray[i] + " ");
        }
    
        
    }
    
    
}
