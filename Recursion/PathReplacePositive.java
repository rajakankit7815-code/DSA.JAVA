public class PathReplacePositive {

    // static void path(String str,int n ,int m){

    // // base case
    // if(n==1 && m==1){
    // System.out.println(str);
    // return;
    // }

    // if(n>1) path(str+"D",n-1,m);
    // if(m>1) path(str+"R",n,m-1);

    // }

    // public static void main(String[] args) {
    // int n=3;
    // int m=3;
    // path("",n,m);

    // }

    // Replacearr
    public class ReplaceNumInArr {

        static void replacenum(int[] arr, int i) {
            if (i == arr.length)
                return;
            if (arr[i] == 2)
                arr[i] = 5;
            replacenum(arr, i + 1);
        }

        public static void main(String[] args) {
            int arr[] = { 6, 5, 3, 6, 7, 3, 244, 5, 2, 2, 2 };
            int i = 0;
            replacenum(arr, i);
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + " ");
            }
            System.out.println();

        }

    }

}