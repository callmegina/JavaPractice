package Multithread;


class myRunnable implements Runnable{
	public void run() {
		int i = 1;
		while(true) {
			System.out.println(i  + " hello");
			i++;
		}		
	}
}
public class ExerciseFive {

	public static void main(String[] args) {
	
		myRunnable r = new myRunnable();
		Thread t = new Thread(r);
		t.start();
		
		
		int i=1;
		while(true) {
			System.out.println(i + " world");
		}

	}

}
