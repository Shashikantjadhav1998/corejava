package model;

import java.util.Scanner;

public class agecheck {
public static void main(String[] args) {
	System.out.println("Application start.............!");
	
	Scanner sc=new Scanner(System.in);
	while(true) {
	System.out.println("Enter age ");
	
	int a=sc.nextInt();
	if(a>=18) {
		
		System.out.println("can be voiting ");
		
	}
	else {
		System.out.println("cant voiting......");
	}
}
}
}