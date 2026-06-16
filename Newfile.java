// package declaration removed to match expected default package

// import java.util.Stack;

// public class Newfile {

    // public static void main(String [] args){

    // Stack<Character> st = new Stack<>();
    // st.push(10);
    // st.push(20);
    // st.push(30);
    // st.push(40);

    // System.out.println(st);
    // System.out.println();

    // String str="hellooooo";
    // for(char ch : str.toCharArray()){
    // st.push(ch);
    // }
    // }

    // }

    // {

    // static boolean inValid

    // public static void main(String[] args) {

    // String str="(){}[]";
    // System.out.println(inValid(str));
    // }
    // }

    // public static String build(String str) {
    //     StringBuilder sb = new StringBuilder();
    //     for (char ch : str.toCharArray()) {
    //         if (ch != '#') {
    //             sb.append(ch);
    //         } else if (sb.length() > 0) {
    //             sb.deleteCharAt(sb.length() - 1);
    //         }
    //     }
    //     return sb.toString();
    // }

    // public static void main(String[] args) {
        // String s = "ab#c";
        // String t = "ad#c";
        // System.out.println(build(s).equals(build(t)));



//         String s="(())";
//         Stack<Integer> st =new Stack<>();
//         st.push(0);
//         for(char ch: s.toCharArray())
//         {
//             if(ch=='(')
//             {
//                 st.push(0);

//             }
//             else{
//                 int v=st.pop();
//                 int count=Math.max(2*v,1);
//                 st.push(st.pop()+count);
//             }
//         }
//         System.out.println(st.pop());
//     }
// }


// import java.util.Stack;

// public class Newfile {
//     public static void main(String[] args) {

//         String s="(())";
//         Stack<Integer> st =new Stack<>();
//         st.push(0);
//         for(char ch: s.toCharArray())
//         {
//             if(ch=='(')
//             {
//                 st.push(0);

//             }
//             else{
//                 int v=st.pop();
//                 int count=Math.max(2*v,1);
//                 st.push(st.pop()+count);
//             }
//         }
//         System.out.println(st.pop());
//     }
// }


import java.util.Stack;

public class Newfile {
    public static void main(String[] args) {

        String s="(())";
        Stack<Integer> st =new Stack<>();
        st.push(0);
        for(char ch: s.toCharArray())
        {
            if(ch=='(')
            {
                st.push(0);

            }
            else{
                int v=st.pop();
                int count=Math.max(2*v,1);
                st.push(st.pop()+count);
            }
        }
        System.out.println(st.pop());
    }
}