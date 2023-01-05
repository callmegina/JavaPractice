package Multithread;


//Thread Demo - within the same class using extend method

public class ExerciseOne extends Thread {
	
	public void run() {
		
		int i=1;
		while(true) {
			System.out.println(i + " hello");
			i++;
		}
	}

	public static void main(String[] args) {
		
		ExerciseOne one = new ExerciseOne();
		one.start();
		
		int i =1;
		while (true) {
			System.out.println(i + " world");
		}
}
}
