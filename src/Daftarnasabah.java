package belajarjava5.bin;

// import belajarjava5.bin;
import java.math.BigDecimal;
import java.util.List;
import java.util.ArrayList;

public class Daftarnasabah{
	public static void main(String[] args){
		Nasabah dimas =
		new Nasabah("001", "dimas maryanto", new BigDecimal(10000)
			);
		System.out.println(dimas.toString());

		List<Nasabah> list = new ArrayList<>();
		list.add(
			new Nasabah("002", "Yusuf", new BigDecimal(1000000))
			);
		list.add(
			new Nasabah("003", "iqbal", new BigDecimal(40000))
			);
		list.add(
			new Nasabah("004", "dimas maryanto", new BigDecimal(150000))
			);
		for(Nasabah n: list){
			System.out.println(n.toString());
		}
	}
}