package LinkedListExercise;

import java.util.*;

/**
 * This is exercise from Abdul course
 */

public class ExerciseTwo {

	public static void main(String[] args) {
		LinkedList<Integer> al1=new LinkedList<>();
        
		LinkedList<Integer> al2=new LinkedList<>(List.of(50,60,70,80,90));
        
        al1.add(10);
        al1.add(0,5);
        //al1.addAll(al2);
        al1.addAll(1,al2);
        al1.add(5,70);
        al1.set(6,100);
        
        
        System.out.println(al1);
        System.out.println(al1.peek());
        System.out.println(al1.peekFirst());
        System.out.println(al1.peekLast());
        
        
        System.out.println(al1.pollFirst());
        System.out.println(al1);
        
        System.out.println(al1.poll());
        System.out.println(al1);
        
        System.out.println(al1.pop());
        System.out.println(al1);
        
        
        System.out.println(al1.pollLast());
        System.out.println(al1);
        
        
        
	}

}
