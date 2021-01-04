import java.util.Scanner;

public class Login {
	public boolean login (Hesap hesap) {
		Scanner scan=new Scanner(System.in);
		String kullanici_adi;
		String parola;
		System.out.print("KULLANICI ADI:");
		kullanici_adi=scan.nextLine();
		System.out.print("PAROLA:");
		parola=scan.nextLine();
		 
		if(hesap.getKullaniciAdi().equals(kullanici_adi)&&hesap.getParola().equals(parola))
		{
			return true;
		}
		
		else {
			return false;
		
		}
		
		}
	}


