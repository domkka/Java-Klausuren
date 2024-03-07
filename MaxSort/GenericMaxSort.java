import java.util.*;

public class GenericMaxSort <T extends Comparable>{
	
	public void sort(ArrayList<T> array){
		
		int length = array.size();
		
		for(int i = 0; i < length; i++){
			
			T max = array.get(i);
			int maxpos = i;
			for(int j = i; j < length; j++){
				
				if(array.get(j).compareTo(max) > 0){
					max = array.get(j);
					maxpos = j;
				}
				
			}
			if(maxpos != i){
				T temp = max;
				array.set(maxpos,array.get(i));
				array.set(i,max);
			}
		}
	}
}

