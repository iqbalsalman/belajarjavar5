package belajarjava5.bin;;
import java.util.Set;
import java.util.HashSet;

public class MahasiswaSet{

    public static void main(String[] args){
        Set siswa = new HashSet();
        siswa.add("dimas");
        siswa.add("dimas");
        siswa.add(1);
        siswa.add(2);
 

        siswa.remove(2);
        System.out.println(
        	String.format("Jumlah array d set adalah %s",siswa.size()
        		)
        	);

        Object obj = siswa.toArray()[0];
        System.out.println(
        	String.format("Nilai dari index 0 adalah %s ", obj ) 
        	);
        System.out.println("-----------");
        for(Object obj2 : siswa){
        	System.out.println(obj2);
        }

    }
}
