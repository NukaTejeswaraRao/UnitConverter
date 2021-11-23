import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		System.out.println("hi mama");
		int n=scan.nextInt();
		int sum=0;
		ArrayList list=new ArrayList(n);
		int values[]=new int[n];
		for(int i=0;i<n;i++) {
			values[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			sum=values[i];
			for(int j=i;j<n;j++) {
				while(values[j]<values[j+1])sum=sum+values[j+1];
			} 
			list.add(i,sum);
		}
		System.out.println(Collections.max(list));

	}

}
