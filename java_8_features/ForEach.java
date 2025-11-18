package java_8_features;

import java.util.ArrayList;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(6);
		a.add(8);
		a.add(2);
		a.add(5);
		a.add(3);
		
		//--------------To Traverse-------------
		for(int n:a) {
			System.out.println(n);
		}
		
		//--------------ForEach Method Way-----------
		Consumer<Integer> con=new Consumer<Integer>() {
			@Override
			public void accept(Integer n) {
				System.out.println(n);
			}
		};
		
		a.forEach(con);
		
		//------------------Lambda-------------------
		
		/*a.forEach(new Consumer<Integer>() {
			@Override
			public void accept(Integer n) {
				System.out.println(n);
			}
		});
		*/
		
		a.forEach(n-> System.out.println(n));
		
		
	}
}
