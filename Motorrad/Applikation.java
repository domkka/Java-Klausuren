import java.util.*;

public class Applikation{
	
	public static void main(String[] args){
		
		ArrayList<Motorrad> list = new ArrayList<Motorrad>();
		
		for (int i = 0; i < 7; i++){
			int randomW = (int) (Math.random() * (300-100)) + 100;
			double randomP = (double) (Math.random() * 190) + 10;
			list.add(new Motorrad(randomP, randomW,"Nr. " + (i+1)));
		}
		
		System.out.println("unsortierte Liste");
		
		for (Motorrad m: list){
			System.out.println(m.toString());
		}

		sortiere(list);
		System.out.println();
		System.out.println("sortierte Liste");
		for (Motorrad m: list){
			System.out.println(m.toString());
		}
	}
	
	public static void sortiere(ArrayList<Motorrad> liste){
		
		for (int j = 0; j < liste.size() - 1; j++){
			Motorrad max = liste.get(j);
			int index = j;
			for(int i = j + 1; i < liste.size(); i++){
				if (liste.get(i).getPower() > max.getPower()){
					max = liste.get(i);
					index = i;
				}
			}
			if (index != j){
				liste.set(index, liste.get(j));
				liste.set(j, max);
			}
		}
	}
	
}