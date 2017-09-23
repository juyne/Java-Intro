public class Example{
	
	public static void main(String[] args) {
		System.out.println("Hello World!! I am Juyne");
		String name="June";
		int marks= 50;
		int sum=0;
		sum = add(20,50);

		System.out.println("sum "+sum);

		System.out.println(marks);

		move();
	}
	
	public static int add(int a,int b){
		int sum =0;
		sum = a+b;
		return sum;
	}
	
	public static void move(){
		System.out.println("I am moving!!");
	}
}
	