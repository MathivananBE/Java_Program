package java_8_features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(6);
		a.add(8);
		a.add(2);
		a.add(5);
		a.add(3);
		
		//----------sorting data---------
		Stream<Integer> s=a.stream();
		Stream<Integer> SortedData=s.sorted();
		SortedData.forEach(n-> System.out.println(n));
		
		//------simple way---------
		
		a.stream().sorted().forEach(n->System.out.println(n));
		
		
		//----modify the data
		Stream<Integer> b=a.stream();
		Stream<Integer> m=b.map(n->n*2);
		m.forEach(n-> System.out.println(n));
		
		//------simple way---------
		a.stream().map(n->n*2).forEach(n->System.out.println(n));
		
	}
}
