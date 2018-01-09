package belajarjava5.bin;
public class Array2{
    public static void main(String[] args){
        String [] persertaBootcamp = {
            "Dimas Maryanto",
            "Yusuf",
            "Gian",
            "Iqbal"
        };
        System.out.println(String.format("Peserta bootcamp index ke 2 adalah "+ persertaBootcamp[2]));
           for(int i=0; i< persertaBootcamp.length; i++){
           	System.out.print(persertaBootcamp[i]+", ");
           }
    }
}