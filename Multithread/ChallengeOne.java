package Multithread;

import java.util.Scanner;

class Student extends Thread{
	
	Whiteboard wb;
	String msg;
	
	public Student(Whiteboard wb) {
	
		this.wb =wb;
	}
		
	public void run() {
		
		while(true) {
			msg= wb.read();
			System.out.println(msg);
		}
	}
	
}


class Teacher extends Thread{
	
	Whiteboard wb;
	String msg;
		
	public Teacher(Whiteboard wb) {
		this.wb = wb;
	}
	
	public void run() {
		while(true) {
			wb.write(msg);
		}	
	}
	
}



//common object
class Whiteboard{

	int studentNo;
	int count;
	boolean flag = true;
	String myMsg;


	
	synchronized public void write(String text) {
		
		
		while(flag !=true) {
			
			Scanner scan = new Scanner(System.in);
			myMsg = scan.nextLine();
			
			myMsg = text;
			flag = false;
			notify();
		}
	}
	
	synchronized public String read() {
		
		
		while(flag!=false) {
			int count;
			
			count = countAttendence();
			if(count % 3 == 0) {
				flag = true;
				notify();
			}	
		}
		return myMsg;
	}
	
	public int countAttendence() {
		return count++;
	}
	
	//write method (string in put) - wait/notify
	//string read - all students  - wait/notify
	//attendence method - all students will be called : to keep track of No.students
	
	
	
	
}

public class ChallengeOne {

	public static void main(String[] args) {
		Whiteboard wb = new Whiteboard();
		Student st = new Student(wb);
		Teacher t = new Teacher(wb);
		
		
		st.start();
		t.start();
		
		
		

	}

}
