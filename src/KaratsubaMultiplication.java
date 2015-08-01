
/*
 * gives the wrong answer for 1234 * 5678;
 * what about base cases?
 * it should be minimum of powers right? other the small term will get extra zeros added at the end
 * what about for uneven size of numbers?
 */
public class KaratsubaMultiplication {

	public static int multiply(int one, int two)
	{
		int a,b,c,d;
		String no1 = Integer.toString(one);
		String no2 = Integer.toString(two);
		int no1len = no1.length(), no2len = no2.length();
		if (no1len > 1 && no2len > 1)
		{
		a = Integer.parseInt(no1.substring(0,no1len/2));
		System.out.println(a);
		b = Integer.parseInt(no1.substring(no1len/2));
		System.out.println(b);
		c = Integer.parseInt(no2.substring(0,no2len/2));
		System.out.println(c);
		d = Integer.parseInt(no2.substring(no2len/2));
		System.out.println(d);
		int min = Math.min(no1len, no2len);
		int ac = multiply(a,c);
		int bd = multiply(b,d);
		int adbc = multiply(a + b, c + d) - ac - bd;
		return (int)Math.pow(10, min) * ac +
				(int)Math.pow(10, min / 2) * adbc + bd;
	
		}
		else
			return one * two;
	}
	
	public static void main(String[] args)
	{
		System.out.println(multiply(1234,5678));
	}
	
}
