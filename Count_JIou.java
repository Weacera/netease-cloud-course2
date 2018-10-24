package hello;

import java.util.Scanner;

public class Count_JIou {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number,count1=0,count2=0;
		Scanner in = new Scanner(System.in);
		number = in.nextInt();
		while(number!=-1) {
			
			if(number%2!=0) {
				count1+=1;
			}
			else
			{	
				count2+=1;
			}
			number = in.nextInt();
			}
		System.out.println(count1+" "+count2);
		}
	}

