package com.BasicTest4;

public class Ambiguity
{	
    void sum(long a,int b)
    {
    	System.out.println("Sum of int and long is=>"+(a+b));
    }
    
    void sum(int a,long b)
    {
    	System.out.println("Sum of int and long is=>"+(a+b));
    }
    
    public static void main(String[] args) {
		Ambiguity ambiguity=new Ambiguity();
		ambiguity.sum(29, 39l);
		ambiguity.sum(12l, 38);

	}

}