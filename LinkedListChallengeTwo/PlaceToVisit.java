package LinkedListChallengeTwo;

import java.util.*;

public class PlaceToVisit {
	
	
record Place(String name, int distance) {

		@Override
		public String toString() {
			return String.format("%s, (%d)", name, distance);
		}
		
	}


	
	
	private static void addPlaceToVisit(LinkedList<Place> places,Place place) {
		
		if(places.contains(place)) {
			System.out.println(place + " already exits");
		}else {
			places.add(place);
			//System.out.println( place + " added");
		}
		
	}
	
	
	private static void printPlaceList(LinkedList<Place> places) {
		var iterator = places.iterator();
		while(iterator.hasNext()) {
			System.out.println("Listed Places are " + iterator.next());
		}
	}
	
	
	private static void printMenu() {

		System.out.println("""
				Available actions (select word or letter):
				            (F)orward
				            (B)ackwards
				            (L)ist Places
				            (M)enu
				            (Q)uit
				            """);

	}


	public static void main(String[]args) {
		
	boolean quit = false;
	boolean forward = true;
	
	
	
	LinkedList<Place> places = new LinkedList<>();
	Place sydeny = new Place ("Sydney", 100);
	Place melbourne = new Place("Melbourne", 200);
	Place perth = new Place("Perth", 400);
	Place adelaide = new Place("Adelaide", 340);
	Place hobart = new Place("Hobart", 100);
	
	addPlaceToVisit(places,sydeny);
	addPlaceToVisit(places,melbourne);
	addPlaceToVisit(places,perth);
	addPlaceToVisit(places,adelaide);
	addPlaceToVisit(places,hobart);
	
	var iterator = places.listIterator();
	Scanner scan = new Scanner(System.in);
	
	printMenu();
	
	while(!quit) {
		
		if(!iterator.hasPrevious()) {
			System.out.println("Need go forward now " + iterator.next());
			forward = true;		
		}
		
		if(!iterator.hasNext()) {
			System.out.println("Need go backwards now " + iterator.previous());
			forward = false;		
		}
		
		
		System.out.println("Enter value now");
		String options = scan.nextLine().toUpperCase().substring(0,1);
		
		switch(options) {
			case "F":
				if(!forward) {
					forward = true;
					if(iterator.hasNext()) {
						iterator.next();
					}
				}
				
				if(iterator.hasNext()) {
					System.out.println(iterator.next());
				}
				break;
			
			case"B":
				if(forward) {
					forward = false;
					if(iterator.hasPrevious()) {
						iterator.previous();
					}
				}
				
				if(iterator.hasPrevious()) {
					System.out.println(iterator.previous());
				}
				break; 
				
			case"M":
				printMenu();
				System.out.println("=================");
				break;
				
			case"L":
				System.out.println("=================");
				printPlaceList(places);
				break;
				
			default:
				quit=true;
				break;
				
	}

	}
		
	}

}
