package Multithread;

public class ExerciseFour implements Runnable {
	
	public void run() {
		int i =1;
		while(true) {
			System.out.println(i + " hello");
			i++;
		}
		
	}

	public static void main(String[] args) {
		ExerciseFour four = new ExerciseFour();
		Thread t = new Thread(four);
		t.start();
		
		int i=1;
		while(true) {
			System.out.println(i + " world");
		}
	}

}
