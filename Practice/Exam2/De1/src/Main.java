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
				Package p = new Package(data[0], Integer.parseInt(data[1]));
				tree.insert(p);
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
		Node min = tree.findMin();
		System.out.println(min.getPackage().getPrice());

		// Cau 3
		System.out.println("Cau 3: ");
		double totalPrice = tree.totallyCountry("Vietnam");
		System.out.println(totalPrice);

		// Cau 4
		System.out.println("Cau 4: ");
		ArrayList<Node> packages = tree.findCountriesByPrice(900000);
		for (Node i : packages) {
			System.out.print(i.getPackage().getCountry() + " ");
		}
    }
}