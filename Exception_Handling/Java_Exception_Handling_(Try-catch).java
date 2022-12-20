
import java.io.*;
import java.util.*;

import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        
        int c;
        try{
            try{
                int x,y;
        
                x=sc.nextInt();
                y=sc.nextInt();
                
                c=x/y;
                System.out.println(c);
            }
            catch(InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
    
}
