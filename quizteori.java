import java.util.Scanner;
public class quizteori {
	public static void main (String[] args) {
		Scanner input = new Scanner (System.in);
		String nama;
		int tipe, meteran, bayar, total, kembali;
		
		System.out.print("Nama : "); nama = input.nextLine();
		System.out.print("Tipe Rumah : "); tipe = input.nextInt();
		System.out.print("Jumlah Meteran Pemakaian : "); meteran = input.nextInt();
		System.out.print("Total Bayar : Rp "); bayar = input.nextInt();
		total = 0;
		switch (tipe) {
			case 31 : total = meteran * 100000; break;
			case 32 : total = meteran * 125000; break;
			case 33 : total = meteran * 450000; break;
			case 34 : total = meteran * 480000; break;
			case 35 : total = meteran * 500000; break;
			case 40 : total = meteran * 550000; break;
			default : System.out.println("Salah Tipe Rumah!!!");
		}
		
		kembali = bayar - total;
		System.out.println("Kembalian : Rp " +kembali);
	}
}