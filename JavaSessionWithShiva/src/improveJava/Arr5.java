package improveJava;

import java.util.Scanner;

public class Arr5 {

	public static void main(String[] args) {

		int [][]arr=new int [3][3];
		
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				Scanner sc=new Scanner(System.in);
				
				System.out.print("enter value: ");
				
				arr[i][j]=sc.nextInt();
			}
				
		}System.out.println();
		for(int i=0; i<3; i++) {
			
			for(int j=0; j<3; j++) {
				
				System.out.print(arr[i][j]+ " ");
				
				
			}System.out.println();
				
				
			}
			
		
	}

}
