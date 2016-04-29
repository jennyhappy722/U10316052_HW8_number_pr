//u10316052
import java.util.*;
public class Test{
	public static void main(String[] args){
		number Number=new number();
		Scanner scanner=new Scanner(System.in);
		System.out.println("please input two number\n Two number will add and sub and mul and div");
		String a=scanner.nextLine();
		String b=scanner.nextLine();
		System.out.println("please input you div After the Decimal point display x ? ");
		int c=scanner.nextInt();
		Number.setscale(c);
		Number.add(a,b);
		Number.sub(a,b);
		Number.mul(a,b);
		Number.div(a,b);
	}
}
