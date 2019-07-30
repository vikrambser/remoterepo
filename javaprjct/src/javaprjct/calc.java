package javaprjct;

import java.util.*;





public class calc {
	//addition
	
	public static int Add(int x , int y)
	{
	  return x+y;	
	  
	}
//mult
	public static int Mul(int x, int y)
	{
	  return x*y;	
	}

//sub
	public static int Sub(int x, int y)
	{
	  return x-y;	
	}
//divide
	public static int Div(int x, int y)
	{
	  return x/y;	
	}
	
	
	
	public static void main(String[] args) {
	
	int x=5,y=2;
	Scanner In =  new Scanner(System.in);
	System.out.println("Addition");
	int A = Add(x,y);
	System.out.println(A);
	System.out.println("Substractionnnnn");
	int S = Sub(x,y);
	System.out.println(S);
	System.out.println("Multiplication");
	int M = Mul(x,y);
	System.out.println(M);
	System.out.println("Division");
	int D = Div(x,y);
	System.out.println(D);
	
	}

}
