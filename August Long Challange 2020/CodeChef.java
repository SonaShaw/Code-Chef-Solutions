package codeChef;

/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodeChef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int t,h,p;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		while(t-- > 0){
		    h = sc.nextInt();
		    p = sc.nextInt();
		    
		    while(p>0 && h>0){
		        h = h-p;
		        p = p/2;
		    }
		    if(p!=0){
		        System.out.println(1);
		    }else
		        System.out.println(0);
		    
		}
		
	}
}

