package com.sap.csv;

public class SwitchExcercise {
	
	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter the DayNumber");
//		int dayNumber = scanner.nextInt();
//		System.out.println("Entered DayNumber" + dayNumber);
//		switch(dayNumber) {
//		case 1: System.out.println("Entered Day Number is Sunday");
//		break;
//		case 2: System.out.println("Entered Day Number is Monday");
//		break;
//		case 3: System.out.println("Entered Day Number is Tuesday");
//		break;
//		case 4: System.out.println("Entered Day Number is Wednesday");
//		break;
//		case 5: System.out.println("Entered Day Number is Thursday");
//		break;
//		case 6: System.out.println("Entered Day Number is Friday");
//		break;
//		case 7: System.out.println("Entered Day Number is Saturday");
//		break;
//		default :System.out.println("invalid Number");
//		break;
		
		
		System.out.println(detetmineNameOfTheWeek(1));
		System.out.println(detetmineNameOfTheMonth(10));
		System.out.println(isWeekDay(1));
		}
	
	public static String detetmineNameOfTheWeek(int dayOfTheWeek) {
		switch(dayOfTheWeek) {
		case 0 : return "Sunday";
		case 1 : return "Monday";
		case 2 : return "Tuesday";
		case 3 : return "Wednesday";
		case 4 : return "Thursday";
		case 5 : return "Friday";
		case 6 : return "Sunday";
		}
		
		return "invalid input";
		
	}

	
	public static String detetmineNameOfTheMonth(int dayOfTheMonth) {
		switch(dayOfTheMonth) {
		case 0 : return "January";
		case 1 : return "Febuary";
		case 2 : return "March";
		case 3 : return "April";
		case 4 : return "May";
		case 5 : return "June";
		case 6 : return "July";
		case 7 : return "August";
		case 8 : return "September";
		case 9 : return "October";
		case 10 : return "Novomber";
		case 11 : return "December";
		}
		
		return "invalid input";
		
	}
	
	public static boolean isWeekDay(int dayOfTheWeek) {
		switch(dayOfTheWeek) {
		case 0 : return false;
		case 1 : return true;
		case 2 : return true;
		case 3 : return true;
		case 4 : return true;
		case 5 : return true;
		case 6 : return false;
		}
		return false;
	}

		
	}

