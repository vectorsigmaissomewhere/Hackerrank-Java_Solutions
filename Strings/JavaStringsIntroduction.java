import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        String C=A.concat(B);
        System.out.println(C.length());
        if(A.length()>B.length()){
            System.out.println("No");
        }
        else if(A.length()<B.length()){
            System.out.println("Yes");
        }
        System.out.println(A.substring(0,1).toUpperCase()
        +A.substring(1)+" "+B.substring(0,1).toUpperCase()
        +B.substring(1));
    }
}

/*
Sample Input
hello
java

Sample Output
9
No
Hello Java
*/
