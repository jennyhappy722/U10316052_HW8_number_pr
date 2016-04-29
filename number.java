import java.math.BigDecimal;
public class number{
 
	int DEF_DIV_SCALE = 10;

	public double add(double v1,double v2){//add

		BigDecimal b1 = new BigDecimal(Double.toString(v1));

		BigDecimal b2 = new BigDecimal(Double.toString(v2));

		return b1.add(b2).doubleValue();

	}



	public double sub(double v1,double v2){

		BigDecimal b1 = new BigDecimal(Double.toString(v1));

                BigDecimal b2 = new BigDecimal(Double.toString(v2));

		return b1.subtract(b2).doubleValue();

	}

	public  double mul(double v1,double v2){

		BigDecimal b1 = new BigDecimal(Double.toString(v1));

		BigDecimal b2 = new BigDecimal(Double.toString(v2));

		return b1.multiply(b2).doubleValue();

	}
