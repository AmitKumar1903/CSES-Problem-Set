/*
 * Problem: Beautiful Permutation
 * 
 * A permutation of integers 1, 2, ..., n is called a "beautiful" permutation if there are no adjacent 
 * elements whose difference is 1.
 * 
 * Given an integer n, construct a beautiful permutation if such a permutation exists.
 * 
 * Input:
 * - The only input line contains an integer n (1 ≤ n ≤ 10^6).
 * 
 * Output:
 * - Print a beautiful permutation of integers 1, 2, ..., n. 
 * - If there are several solutions, you may print any of them. 
 * - If there are no solutions, print "NO SOLUTION".
 * 
 * Example 1:
 * 
 * Input:
 * 5
 * 
 * Output:
 * 2 4 1 3 5
 * 
 * Example 2:
 * 
 * Input:
 * 3
 * 
 * Output:
 * NO SOLUTION
 * 
 * Notes:
 * - For n = 1 or n = 2, there is no way to form a beautiful permutation, so the output should be "NO SOLUTION".
 * - For other values of n, the solution involves printing even numbers first, followed by odd numbers to ensure the 
 *   difference between adjacent elements is not 1.
 */
import java.util.*;
public class Permutations{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        StringBuilder sb=new StringBuilder();
        if (n==1){
            System.out.println(n);
        }
        else if(n==2 || n==3){
            System.out.println("NO SOLUTION");
            
        }
        else if (n>3){
                 
            
            for(int i =2;i<=n;i+=2){
                sb.append(i).append(" ");
            }
            for(int i =1;i<=n;i+=2){
            sb.append(i+" ");                
           
        }
        }
        System.out.println(sb.toString().trim());
        
    }
}
