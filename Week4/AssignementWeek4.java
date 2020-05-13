import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();

		Set<String> s1 = new HashSet<String>();
		s1.add("GoodMorning");
		s1.add("Shubhodaya");
		s1.add("Shubhohday");
		s1.add("Bonjour");
		map.put("GoodMorning", s1);

		Set<String> s2 = new HashSet<String>();
		s2.add("good Evening");
		s2.add("Shubha sange");
		s2.add("susandhya");
		s2.add("Bonsoir");
		map.put("GoodEvening", s2);

		String input = scn.nextLine();
		if (map.containsKey(input)) {
			System.out.println(map.get(input));
		} else {
			System.out.println("Do you want to add String " + input + " to the list: ");
			char option = scn.nextLine().charAt(0);
			if (option == 'Y') {
				Set<String> s3 = new HashSet<String>();
				String input2 = scn.nextLine();
				while (!input2.equals("")) {
					s3.add(input2);
					input2 = scn.nextLine();
				}
				map.put(input, s3);
				System.out.println(map.get(input));
			}
		}
	}
}
