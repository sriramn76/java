package coding;

import java.util.Scanner;

public class insertion {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []n=new int[5];
	for(int i=0;i<5;i++) {
		n[i]=sc.nextInt();
	}
	int i,key,j;
	for(i=1;i<5;i++) {
		key=n[i];
	j=i-1;
	while(j>=0 && n[j]>key) {
		n[j+1]=n[j];
		j--;
	}
	n[j+1]=key;
	}
	for(i=0;i<5;i++) {
		System.out.println(n[i]);
	}
}
}