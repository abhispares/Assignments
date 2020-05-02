import java.util.Scanner;

public class AssignementWeek3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the name: ");
		String name = scn.next();
		String[][] map = { { "A", "1" }, { "B", "2" }, { "C", "3" }, { "D", "5" }, { "E", "7" }, { "F", "B" },
				{ "G", "D" }, { "H", "11" }, { "I", "13" }, { "J", "17" }, { "K", "1D" }, { "L", "1F" }, { "M", "25" },
				{ "N", "29" }, { "O", "2B" }, { "P", "2F" }, { "Q", "35" }, { "R", "3B" }, { "S", "3D" }, { "T", "43" },
				{ "U", "47" }, { "V", "49" }, { "W", "4F" }, { "X", "53" }, { "Y", "59" }, { "Z", "61" } };

		String resultString = "";
		for (int i = 0; i < name.length(); i++) {
			if (i < name.length() - 1)
				resultString += (map[name.charAt(i) - 'A'][1]) + ",";
			else
				resultString += (map[name.charAt(i) - 'A'][1]);
		}
		resultString.replace(",", " ");
		System.out.println(resultString);
		scn.close();
	}
}
