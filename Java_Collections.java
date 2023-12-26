import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        ArrayList<String> List = new ArrayList<>();
        HashSet<String> Set = new HashSet<>();
        HashMap<String, Integer> FrequencyMap = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            String input = scanner.nextLine();
            List.add(input);
            Set.add(input);
            FrequencyMap.put(input, FrequencyMap.getOrDefault(input, 0) + 1);
        }

        System.out.println("\nList Contains:");
        for (String str : List) {
            System.out.println(str);
        }

        System.out.println("\nSet Contains:");
        for (String str : Set) {
            System.out.println(str);
        }


        System.out.println("\nFrequency of the words:");
        for (Map.Entry<String, Integer> entry : FrequencyMap.entrySet()) {
            System.out.println("Word = " + entry.getKey() + ", Frequency = " + entry.getValue());
        }

     
	}
}
