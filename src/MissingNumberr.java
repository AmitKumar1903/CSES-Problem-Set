import java.util.*;
public class MissingNumberr{
    public static void main(String [] args )
    {
        Scanner sc = new Scanner (System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        long act_sum=0;
        long exp_sum=(long)len*(len+1)/2;
        for(int i=0;i<len-1;i++){
            arr[i]=sc.nextInt();
            act_sum+=arr[i];
        }
  System.out.println(exp_sum-act_sum);
    }
}
