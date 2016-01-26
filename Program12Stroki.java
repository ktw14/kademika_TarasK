public class Program12Stroki {

	public static void main(String[] args) {
		String s = "Education is the most powerful weapon which you can use to change the world";
		String t = "An investment in knowledge pays the best interest";
		String none ="данное слово отсутствует в тексте";
		boolean a = s.contains("use");
		boolean b = t.contains("in knowledge");
		boolean c = s.contains("to change");
		boolean d = s.contains("the world");
		if (a) 
		{System.out.print("use ");} 
		else 
		{System.out.println(none);
			}
		if (b) 
		{System.out.print("in knowledge ");} 
		else 
		{System.out.println(none);
			}
		if (c) 
		{System.out.print("to change ");} 
		else 
		{System.out.println(none);
			}
		if (d) 
		{System.out.print("the world");} 
		else 
		{System.out.println(none);
			}
	}

}
