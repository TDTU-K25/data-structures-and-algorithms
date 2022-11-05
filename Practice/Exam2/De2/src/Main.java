import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void readFromInput(String path, BST tree) {
		File myFile = new File("data.inp");
		try (Scanner scanner = new Scanner(myFile)) {
			while (scanner.hasNextLine()) {
				String[] data = scanner.nextLine().split(",");
				Student s = new Student(Integer.parseInt(data[0]), data[1], Integer.parseInt(data[2]));
				tree.insert(s);
			}
			scanner.close();
		} catch (NumberFormatException | FileNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void main(String args[]) {
		BST tree = new BST();
		String path = "data.inp";
		// Cau 1
		readFromInput(path, tree);

		// Cau 2
		System.out.println("Cau 2: ");
		Node maxId = tree.findMaxId();
		System.out.println(maxId.getStudent().getScore());

		// Cau 3
		System.out.println("Cau 3: ");
		double avergareScore = tree.findAverage();
		System.out.println(avergareScore);

		// Cau 4
		System.out.println("Cau 4: ");
		ArrayList<Node> students = tree.findStudentsByName("Khoa");
		for (Node i : students) {
			System.out.print(i.getStudent().getId() + " ");
		}

	}
}