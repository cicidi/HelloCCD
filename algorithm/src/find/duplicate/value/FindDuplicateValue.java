package find.duplicate.value;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDuplicateValue {
	public static void main(String[] args) {
		int[] array = { 6, 7, 3, 3, 3, 4,4,456,22,33,456,7,6,7,6,7,6, 5 };
		System.out.println(findDuplicate(array));
	}

	public static List findDuplicate(int[] array){
		boolean moreThanTwo = false;
		Arrays.sort(array);
		ArrayList<Integer> duplicate=new ArrayList<Integer>();
			for(int i=0; i<array.length-1;i++){
			if(array[i]==array[i+1]){
				if(moreThanTwo){
					duplicate.add(array[i+1]);
				  	}
				else{
					duplicate.add(array[i]);
					duplicate.add(array[i+1]);
					moreThanTwo=true;
				 } 	
				}
				else
				moreThanTwo=false;
			}
			return duplicate;
		}
}