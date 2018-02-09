import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    

    public static void insertIntoSorted(int[] ar) {
       
        int e=ar[ar.length-1];
        for(int i=2;i<=ar.length;i++){
            if(ar[ar.length-i]>e) 
            {
                ar[ar.length-i]=ar[ar.length-(i-1)];
                for(int j=0;j<ar.length;j++){System.out.println(ar[j]);}
            }
            else if (ar[ar.length-i]<e){
                ar[(ar.length-i)+1]=e;
                for(int j=0;j<ar.length;j++){System.out.println(ar[j]);}
                break;
            }
        }
        
    }
    
}
    
    