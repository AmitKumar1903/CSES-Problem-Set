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