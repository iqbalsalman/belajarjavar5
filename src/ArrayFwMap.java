package belajarjava5.bin;

import java.util.Map;
import java.util.HashMap;


public class ArrayFwMap{

	public static void main(String[] args){
  Map berkas = new HashMap();

        berkas.put(1 , "Dimas Maryanto");
        berkas.put(2 , "Hadi Siswanto");
        berkas.put(3 , "Hadi Siswanto");

  System.out.println(berkas.get("Laporan2018"));
// for(Map.)

  berkas.forEach( (kunci,nilai)-> {
  	System.out.println(
      String.format("Kata kunci  %s dan nilainya adalah %s",kunci, nilai
      	   )
  		);
  } );
}

}