// public class mulNumInString {
//     public static void main(String[] args) {
//         String a="12";
//         String b="5";
//         // String mul="";
//         // String s = "123";
//         int num = Integer.parseInt(a);
//         int mum=Integer.parseInt(b);
//         int mult=num*mum;
//         // int num = 100;
//         String mul = String.valueOf(mult); // "100"
//         System.out.println(mul);



//     }
    
// }


public class mulNumString {
    public static void main(String[] args) {
        String s="5";
        String t="16";
        int n=0;
        int m=0;
        for(int i=0;i<s.length();i++){
            n=n*10+(s.charAt(i)-'0');
        }
        for(int i=0;i<t.length();i++){
            m=m*10+(s.charAt(i)-'0');
        }
        System.out.println(m*n);
    }
    
}