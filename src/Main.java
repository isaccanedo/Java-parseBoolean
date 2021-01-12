import java.util.ArrayList;
import java.util.List;

public class Main {
	
	/*
	 * What is the output of this code?
	 * Qual é a saída deste código?
	 * 
	 * 1 - 2true
	 * 2 - 3true ==> correct
	 * 3 - A runtime exception is thrown
	 * 4 - 3false 
	 * 
	 */

	public static void main(String[] args) {
		
		List<Boolean> list = new ArrayList<Boolean>();
		
		list.add(true);
		list.add(Boolean.parseBoolean("False"));
		list.add(Boolean.TRUE);
		System.out.println(list.size());
		System.out.println(list.get(1)instanceof Boolean);

	}

}
