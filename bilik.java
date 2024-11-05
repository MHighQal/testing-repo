import java.util.Scanner;

public class bilik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.println("Jenis Bilik"); 
	System.out.println("Bilik T = Rm 125.00");
 	System.out.println("Bilik K = Rm 145.00");
 	System.out.println("Bilik S = Rm 180.00");
	
 	System.out.print("Masukkan nama anda:");
    	String nama = scanner.nextLine();

        System.out.print("Pilih jenis bilik:");
        char jenis = scanner.next().charAt(0);

	
        
        switch (jenis) {
            case 'T':
 	    case 't':
		System.out.print("Masukkan berapa hari:");
		int bil1 = scanner.nextInt();
                System.out.println(nama + " memilih bilik T");
		double jumlah1 = bil1 * 125;
 		System.out.println("Harga bilik T untuk " + bil1 + " hari adalah Rm" +  jumlah1);
                break;
	  	
            case 'K':
 	    case 'k':
		System.out.print("Masukkan berapa hari:");
		int bil2 = scanner.nextInt();
                 System.out.println(nama + " memilih bilik K");
		double jumlah2 = bil2 * 145;
 		System.out.println("Harga bilik K untuk " + bil2 + " hari adalah Rm" +  jumlah2);
                break;
	  	
	    case 'S':
            case 's':
		System.out.print("Masukkan berapa hari:");
		int bil3 = scanner.nextInt();
                System.out.println(nama + " memilih bilik S");
		double jumlah3 = bil3 * 180;
 		System.out.println("Harga bilik S untuk " + bil3 + " hari adalah Rm" +  jumlah3);
                break;
         default:
                System.out.println("Tiada Pilihan itu");
        }
 } while (choice != '4');

        
        scanner.close();
    }
}