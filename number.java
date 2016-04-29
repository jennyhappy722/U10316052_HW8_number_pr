import java.math.BigDecimal;
public class number{
	int scale;//double   .xxxx
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

	public void div(String v1,String v2){
		BigDecimal b1 = new BigDecimal(v1);
		BigDecimal b2 = new BigDecimal(v2);
		System.out.println("div:"+b1.divide(b2,getscale(),BigDecimal.ROUND_HALF_UP));
	}		
	public void setscale(int nn){//After the decimal point  display
		scale=nn;
	} 
	public int getscale(){
		return scale;
	}

}
