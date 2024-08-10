package coding;
import java.util.Scanner;

public class shell {	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int []n=new int[a];
		for(int p=0;p<a;p++) {
			n[p]=sc.nextInt();
		}
	for (int interval = a/ 2; interval > 0; interval /= 2) {
	    for (int i = interval; i < a; i++) {
	      int temp = n[i];
	      int j;
	      for (j = i; j >= interval && n[j - interval] > temp; j -= interval) {
	        n[j] = n[j - interval];
	      }
	      n[j] = temp;
}
	}
	for(int q=0;q<a;q++) {
			System.out.println(n[q]);
		}
	}
}