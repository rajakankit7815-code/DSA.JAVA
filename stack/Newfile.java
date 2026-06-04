package Stack;
import java.util.Stack;

public class Newfile {



    public static void main(String [] args){
         
    Stack<Character> st = new Stack<>();
    // st.push(10);
    // st.push(20);
    // st.push(30);
    // st.push(40);
    

    // System.out.println(st);
    // System.out.println();

    String str="hellooooo";
        for(char ch : str.toCharArray()){
            st.push(ch);
        }
    }
   
}



// {
    
//     static boolean inValid

//     public static void main(String[] args) {


//         String str="(){}[]";
//         System.out.println(inValid(str));
//     }
// }
