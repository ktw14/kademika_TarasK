/* У вас есть переменная double value = 
 * Которая может содержать любое значение.
 * Напишите код, которій выведет на экран целю и дробную часть числа.
 * 
 * Пример: value = 25.6 25
 * 						6
 * */
public class Program11DoubleValue {

	public static void main(String[] args) {
		double a =145.5;
		int res1 =(int)a;
		double res2 = a - res1;
		double res3 = res2*10;
		System.out.println(String.valueOf((int)a));
		System.out.println(String.valueOf((int)res3));		
	}

}
