//Problem Link : https://www.hackerrank.com/challenges/java-strings-introduction/problem?isFullScreen=true

import java.io.*;
import java.util.*;

public class JavaStringIntroduction {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int len=A.length();
        int len1=B.length();
        System.out.println(len+len1);
        
        System.out.println((A.compareTo(B)>0)?"Yes":"No");
        
        String str1=A.substring(0,1).toUpperCase()+A.substring(1);
        String str2=B.substring(0,1).toUpperCase()+B.substring(1);
        
        System.out.println(str1+" "+str2);
        
        
    }
}
