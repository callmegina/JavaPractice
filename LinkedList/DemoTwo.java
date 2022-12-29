package LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

record Place(String name, int distance) {

	@Override
	public String toString() {
		return String.format("%s, (%d)", name, distance);

	}

}

public class DemoTwo {

	public static void main(String[] args) {

		LinkedList<Place> placeToVisit = new LinkedList<>();

		addPlace(placeToVisit, new Place("adelaide", 1374));
		addPlace(placeToVisit, new Place("Brisbane", 917));
		addPlace(placeToVisit, new Place("Perth", 3923));
		addPlace(placeToVisit, new Place("Alice Springs", 2771));
		addPlace(placeToVisit, new Place("Darwin", 3972));
		addPlace(placeToVisit, new Place("Melbourne", 877));

		placeToVisit.addFirst(new Place("Sydney", 0));

		System.out.println(placeToVisit);

		var iterator = placeToVisit.listIterator();
		Scanner scan = new Scanner(System.in);
		boolean quitloop = false;
		boolean forward = true;

		while (!quitloop) {
			
			if(!iterator.hasPrevious()) {
				System.out.println("Originating Place" + iterator.next());
				forward = true; 
			}
			
			if(!iterator.hasNext()) {
				System.out.println("Originating Place" + iterator.previous());
				forward = false; 
			}
			
			
			
			System.out.println("Enter value ");
			String menuItem = scan.nextLine().toUpperCase().substring(0, 1);

			switch (menuItem) {
				case "F":
					System.out.println("Go forward");
					if(!forward) { //reversing direction 
						forward = true;
						if(iterator.hasNext()) {  //adjust position forward 
							iterator.next();
						}
					}
					
					if(iterator.hasNext()) {
						System.out.println(iterator.next()); 
					}
					break;
	
				case "B":
					System.out.println("Go backwards");
					
					if(forward) { //reversing direction 
						forward = false;
						if(iterator.hasPrevious()) {  //adjust position backwards
							iterator.previous();
						}
					}
					
					
					if(iterator.hasPrevious()) {
						System.out.println(iterator.previous()); 
					}
					break;
					
				case "M":
					printMenu();
					break;
	
				case "L":
					System.out.println(placeToVisit);
					break;
	
				default:
					quitloop = true;
					break;
	
				}
		}

	}

	private static void addPlace(LinkedList<Place> list, Place place) {
//		if (list.contains(place)) {
//			System.out.println("Place already exists");
//			return;
//		}

		for (Place p : list) {
			if (p.name().equalsIgnoreCase(place.name())) {
				System.out.println("Duplicate found " + place.name());
				return;
			}
		}

		int matchedIndex = 0;
		for (var listPlace : list) {
			if (place.distance() < listPlace.distance()) {
				list.add(matchedIndex, place);
				return;
			}
			matchedIndex++;
		}

		list.add(place);

	}



	private static void printMenu() {
		String textBlock = """

				Available actions (select word or letter):

				(F)forward
				(B)ackward
				(L)ist Places
				(M)enu
				(Q)uit

				 """;
		System.out.print(textBlock + " ");
	}

}
