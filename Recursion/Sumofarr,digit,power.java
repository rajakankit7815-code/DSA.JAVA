class Sumofarrdigitpower {
//     static int sumofarr(int arr[] ,int i){
//         if(i==arr.length)return 0;
//         return arr[i]+sumofarr(arr,i+1);
//     }

//     public static void main(String[] args) {


//         int arr[]={4,6,3,2,45,63,64,12,54};
//         int i=0;
//         System.out.println(sumofarr(arr,i));

//         // System.out.println(arr);

//     }
    
// }







//     static int sumofdigit(int n){
//         if(n==0){
//             return 0;
//         }
//         return n%10+sumofdigit(n/10);
//     }
//     public static void main(String[] args) {
//         int n = 787;
//         System.out.println(sumofdigit( n));

//     }
    
// }






//     static int power(int x,int n){
//         if(n==0) return 1;
//         // int ans=1;
//         // return x*(x-n);
//         return x*power(x,n-1);



//     }
//     // System.out.println(ans);
//     public static void main(String[] args) {
//         // xpowern(5, 5);
//         // System.out.println(ans);
//         int x=2;

//         int n=3;
//         System.out.println(power(x,n));

//     }
    
// }





// it is does not complete there aim


//     static void binary(int n,String s){
//         // base case 
//         if(n==0){
//             System.out.println(s);
//             return;
//         }
//         binary(n-1, s+"0");
//         binary(n-1, s+"1");

//     }

//     public static void main(String[] args) {
//         int n=12;
//         String s= "";
//         // System.out.println(n, " ");
//         binary(n, "");
//     }
// }

        



// package Recursion;


//      static int facto(int n){
//         // for(i=1;i<=n;i++);
//         if(n==1)return 1;
//         return n*facto(n-1);

        

//     }
//     public static void main(String[] args) {
//         // fact(5);
//         System.out.println(facto(5));

        
//     }
    
// }



// package Recursion;


    public static void printnum(int n){
        if(n>1){
            return;
        }
        System.out.println(n);
        printnum(n+1);
    }
    public static void main(String [] args){
        printnum(10);
        // System.out.println(p);

    }
}