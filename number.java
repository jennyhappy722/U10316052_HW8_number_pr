import java.math.BigDecimal;
public class number{
 
	int DEF_DIV_SCALE = 10;


	public void add(String v1,String v2){//add
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		System.out.println("add:"+b1.add(b2));
	}


	public void sub(String v1,String v2){

		BigDecimal b1 = new BigDecimal(v1);
                BigDecimal b2 = new BigDecimal(v2);
		System.out.println("sub:"+b1.subtract(b2));

	}

	public void mul(String v1,String v2){

		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		System.out.println("mul:"+b1.multiply(b2));

	}
