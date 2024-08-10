package coding;
import java.util.*;

public class bubble {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int []n=new int[5];
	for(int i=0;i<5;i++) {
		n[i]=sc.nextInt();
	}
	int temp;
	for(int i=0;i<5;i++) {
		for(int j=i;j<5;j++) {
			if(n[i]>n[j]) {
				temp=n[i];
				n[i]=n[j];
				n[j]=temp;
			}
		}
	}
	for(int i=0;i<5;i++) {
		System.out.println(n[i]);
	}
	sc.close();
}
}
