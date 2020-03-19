import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.Collections;
import java.util.HashSet;

public class PopulationCheck {

	public static void main(String[] args) {
		List<Integer> results = computeYearWithReducedPopulation();
		for (Integer i : results) {
			System.out.println(i);// prints all the elements available in the above list
		}
	}

	/*Class Name: PopulationCheck
	Author: Shifa Ameena 
	Functions/Method: computeYearWithReducedPopulation
	Parameters: No Paramater required
	ReturnType: List<integer>
	Example: PopulationCheck.computeYearWithReducedPopulation()*/
	
	private static List<Integer> computeYearWithReducedPopulation() {
		List<Integer> result = new ArrayList<Integer>();//Create a new ArrayList to add the values and return the list
		List<String> input = new ArrayList<String>(); // create new array list to add the input data
		// use add() method to add elements in the list 
		input.add("1902:1991");
		input.add("1941:1978");
		input.add("2004:");
		input.add("1957:");
		input.add("1989:2008");
		input.add("1909:2005");
		input.add("1918:");
		input.add("1913:2010");
		input.add("1979:");
		input.add("1961:2002");
		input.add("1977:2003");
		input.add("1909:1991");
		List<Person> data = new ArrayList<Person>();//Create a arrayList with Type Person
		for (String s : input) {
			try {
				data.add(new Person(s));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		List<Integer> birthYear = new ArrayList<Integer>();//Create a Array to get BirthYear
		for (Person p : data) { // loop to extract birthyear from the List
			birthYear.add(p.born); // List of birth year is added
		}

		for (Person p : data) {
			if (p.died != null) {//Condition to check only based on died year
				if (!birthYear.contains(p.died + 1)) { // Checking if incremented died year value is exists in birthyear Array
					result.add(p.died + 1);//If incremented died year doesn't exists, add value to results 
				}
			}
		}

		Set<Integer> uniqueResults = new HashSet<>(result); // To remove the duplicate element
		result.clear();
		result.addAll(uniqueResults);// Add the Results to an array
		Collections.sort(result); // Sort in Ascending order
		return result;
	}
}

class Person {
	Integer born = null;
	Integer died = null;

	public Person(String input) throws Exception {
		String[] values = input.split(":");// To Split the input values ex:"1902:1991"
		if (values.length == 2) { //If String array contains 2 values
			born = Integer.parseInt(values[0]); 
			died = Integer.parseInt(values[1]);
		} else if (values.length == 1) { // If String array contains 1 value
			born = Integer.parseInt(values[0]);
		} else {
			throw new Exception("incorrect input");
		}

	}

}
