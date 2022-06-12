Question link:-  https://www.codechef.com/JUNE221D/problems/CHAIRS_

import java.util.Scanner;
import java.lang.*;
import java.io.*;

 class CodeChef 
{
    public static void main(String[] args) throws java.lang.Exception
    {
        try {
             Scanner sc = new Scanner(System.in);
             int test=sc.nextInt();
             for(int i=0;i<=test;i++){
                 
                int x= sc.nextInt();//Numbers of Student
                int y= sc.nextInt();//Numbers of chairs
                if(x>y){
                    int z= x-y;//Chairs required;
                    System.out.println(z);
                }else{
                     System.out.println("0");
                }
             }
        } catch(Exception e) {
        }
    
       
    }
}