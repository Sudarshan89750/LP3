

public class DAA1 {
	public static int fibonacci(int n)
	{
		if(n<=1) {
			return n;
			
		}
		int last=0;
		int current=1;
		int next;
		
		for(int i=2;i<=n;i++) {
			System.out.println(last);
			int temp=current;
			current+=last;
			last=temp;
			
			
		}
		return last ;
		
	}
	
	
	public static void fib(int n) {
		int n1=0;
		int n2=1;
		for(int i=2;i<=n;i++) {
			int temp=n1;
			n1=n2;
			n2=temp+n1;
			System.out.println(n2);
		}
	}
	public static int fibRec(int n) {
		if (n<=1) {
			return n;
			
		}
		return fibRec(n-1)+fibRec(n-2);
	}
	public static void main(String[] args) {
//	fibonacci(5);
//		fib(5);
		System.out.println(fibRec(5));
}
}
