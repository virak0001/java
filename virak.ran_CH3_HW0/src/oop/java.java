package oop;
public class java {

	public static void main(String[] args) {
		/*1 Given a string of even length, return the first half. Ex: if the string �1234� is given it should*/
		String numbers = "1234";
		String half = numbers.substring(0, numbers.length()/2);
		System.out.println(half + " is the first half of "+ numbers);
		
		String programing = "programing";
		String strPro = programing.substring(0,programing.length()/2);
		System.out.println(strPro+" is the first half of "+ programing);
		
		String homework = "homework";
		String strHom = homework.substring(0,homework.length()/2);
		System.out.println(strHom+" is the first half of "+ homework);
		
		String marker = "marker";
		String strMar = marker.substring(0,marker.length()/2);
		System.out.println(strMar +" is the first half of "+ marker);
		
		/*2 Make the last three digit of the string into Uppercase letter. Ex: a string �welcome� is given so
		the output is �welcOME�. */
		String welcome="welcome";
		String upperThreeLast = (welcome.substring(0,welcome.length()-3)+welcome.substring(welcome.length()-3).toUpperCase());
		System.out.println(upperThreeLast);
		///////////////////Document////////////////////////
		/*welcome.substring(0,welcome.length-3) : Count from index[0] of string but minus three last of the length.
		output is "welc"  becuase the last three "welcome" has been remove "ome"
		welcome.substring(welcome.length()-3) : select the last three of "welcome" is "ome".
		output is "ome" */
		
		
		
		/* 3 Given a string �www.google.com/�. Try to check the last digit of this string if it ends with �/�
		output �www.google.com/wep2020� to the console otherwise output �this string doesn�t end
		with /�*/
		
		String URL = "www.google.com/";
		boolean isSlash = false;
		if(URL.lastIndexOf("/") == URL.length()-1) {
		isSlash = true;
		}
		if(isSlash == true) {
		System.out.println(URL+"wep2020");
		}else {
		System.out.println(URL.substring(0, URL.length()) + " don't end with /");
		}
		System.out.println(URL.lastIndexOf("/"));
		
		/* 4 Count how many letter �o� in this sentence �this is the most common way.�*/
		String strText = "this is the most common way";
		int count = 0;
		for (int i = 0; i < strText.length(); i++) {
			if(strText.charAt(i) == 'o') {
				count++;
			}
		}
		System.out.println("There are " +count+ " later o in This most common way");
		
		/*We have string �This is the most common way of creating string�. Replace all the words string to
		STRING.*/
		String strReplace = "This is the most common way of creating string";
		System.out.println(strReplace.replace("string", "STRING"));
		
	}

}
