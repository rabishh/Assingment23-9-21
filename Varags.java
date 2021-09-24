package SelfPractice;

public class Varags {

	public static void main(String []args) {

		int x=10;
		int y=20;
		rabish(x,y,6,7,3,4,56,78,234,78);

	}

	public static void rabish(int a,int b,int ...z) {
		int sum=0;
		for(int i=0;i<z.length;i++) {
			sum=sum+z[i];
		}
		int result=sum+a+b;
		System.out.println("Sum= "+result);
	}




}
