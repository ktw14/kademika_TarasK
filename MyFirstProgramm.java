public class MyFirstProgramm {

	public static void main(String[] args) {
        int s = 60; //количество секунд в одной минуте
        int m = 60; //количество минут в одном часу
        int h = 24; //количество часов в одном дне
        int d = 21; //3 недели = 21 день
		System.out.println(((s*m)*h)*d); //Вычесление результата и вывод его на экран
	}

}
