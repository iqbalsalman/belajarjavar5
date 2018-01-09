public class Array3 {
	
	public static void main(String[] args){
		Integer[][] values = new Integer[5][2];

		values[0][0] = 1;
		values[0][1] = 2;
		values[1][0] = 3;
		values[1][1] = 4;
		values[2][0] = 5;
		values[2][1] = 6;

		// menampilkan data pada index ke 0 dan 1
		System.out.println(values[0][1]);

		// menampilkan isi yang ada di array 2 dimention
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 2; j++){
				System.out.print(values[i][j]);
			}
			System.out.println();		
		}
	}
}