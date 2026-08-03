
import java.util.Scanner;
class Sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ten numbers");
        int n,sum=0;
        for(int i=1;i<=10;i++){
            System.out.println("Enter "+(i)+" Number");
         n=sc.nextInt();
         sum=sum+n;
        }
       
        System.out.println(sum);
    }
}