// public class  Even{
//     static int evensum(int [] arr , int i){
//         if(i==arr.length)return 0;
//         int val=(arr[i]%2==0)?arr[i]:0;
//         return val+evensum(arr,i+1);
//     }
    
//     public static void main(String[] args) {
//         int arr[]={2,3,5,4,5,4,6,3,3};
//         int i=0;
//         System.out.println(evensum(arr,i));
        
    
// }
// }




import java.util.Scanner;

public class Fibonacci {

    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);






    }

    public static void main(String[] args) {
        // int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n = ");
        int n=sc.nextInt();
        // int n=16;
        System.out.println(fibonacci(n));
        
    }
    
}