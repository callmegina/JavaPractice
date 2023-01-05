package Multithread;

class Test extends Thread{
	public void run() {
		int i =1;
		while(true)
		{
			System.out.println(i + "hello");
			i++;
		}
	}
}

public class ExerciseThree {

	public static void main(String[] args) {
	Test test = new Test();
	test.start();
	
	int i = 1;
	while(true) {
		System.out.println(i + " world");
	}
	}

}
