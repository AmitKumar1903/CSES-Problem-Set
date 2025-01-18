import java.util.*;
public class Repetitions{
     public static void main(String [] args )
    {
        Scanner sc = new Scanner (System.in);
        String n=sc.nextLine();
	n+="X";
        int res=1,curr=1;
        for (int i=0;i<n.length()-1;i++){
            if(n.charAt(i)!=n.charAt(i+1)){
                res=Math.max(res,curr);
                curr=1;
            }
	else{
            curr++;
        }
}
        System.out.println(res);
        
    }
}
