import java.util.*;
public class Test{


	public static void main(String[] args){

		number Number=new number();
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input two number\n Two number will add and sub and mul and div");
		double a=scanner.nextDouble();
		double b=scanner.nextDouble();
		
		System.out.println("add:"+Number.add(a,b));
		System.out.println("sub:"+Number.sub(a,b));
		System.out.println("mul:"+Number.mul(a,b));		
		//System.out.println("div:"+Number.add(a,b));


	}
}
