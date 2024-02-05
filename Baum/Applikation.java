import java.util.*;

 class Applikation{
	
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		Tree tree = new Tree(null);
		
		while(true){
			System.out.println("Aktueller Baum: " + tree.inOrder(tree.root));
			System.out.println("Element hinzufügen");
			tree.add(tree.getRoot(),scanner.nextLine());
		}
		
	}
	
}