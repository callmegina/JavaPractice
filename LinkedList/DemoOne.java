package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DemoOne {

	// print list
	private static void printList(LinkedList<String> places) {

		Iterator<String> iterator = places.iterator();
		
		while (iterator.hasNext()) {
			System.out.println("Now visiting " + iterator.next());
		}
	}

	// adding city in alphabetic order
	private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

		ListIterator<String> stringListIterator = linkedList.listIterator();

		while (stringListIterator.hasNext()) {
			// if newcity is in the list
			// if not in the list, add in aphabect order

		

				int comparison = stringListIterator.next().compareTo(newCity);
				// 0 means match
				if (comparison == 0) {
					System.out.println("New city already included");
					return false;
				} else if (comparison > 0) { // new city should come before curr ent city
					stringListIterator.previous();
					stringListIterator.add(newCity);
					return true;
				} else if (comparison < 0) { // new city comes after the current city
					
				}
			}
		
		stringListIterator.add(newCity);
		return true;
		}


	

	public static void main(String[] args) {

		LinkedList<String> placeToVisit = new LinkedList<>();

		addInOrder(placeToVisit, "Sydney");
		addInOrder(placeToVisit, "Darwin");
		addInOrder(placeToVisit, "Melbourne");
		addInOrder(placeToVisit, "Brisbane");
		addInOrder(placeToVisit, "Perth");

		
		printList(placeToVisit);
		
		

		
		
	}

}
