package belajarjava5.bin;

import java.util.List;
import java.util.ArrayList;


public class Array4{
	public static void main(String[] args){
	List<Integer> values = new ArrayList();
	values.add(1);
	values.add(2);
	values.add(3);
	values.add(4);
	values.add(5);
	values.add(6);


for(int i = 0; i < values.size(); i++){
            System.out.println(values.get(i));
 
     }
}
}