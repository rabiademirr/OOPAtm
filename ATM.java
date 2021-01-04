import java.util.Scanner;

public class ATM {
	public void calis(Hesap hesap) {
		Login login=new Login();
		Scanner scan=new Scanner(System.in);
		System.out.println("Bankamiza Hosgeldiniz..");
		System.out.println("-----------------------");
		System.out.println("Kullanici Girisi");
		System.out.println("-----------------------");
		int girishakki=3;
		while(true) {
			if(login.login(hesap)) {
				System.out.println("Basarili Giris...");
				break;
			}
			else {
				System.out.println("Basarisiz Giris!!!");
				girishakki -=1;
				System.out.println("Kalan giris hakkiniz:"+girishakki);
			}
			if(girishakki==0) {
				System.out.println("Giris hakkiniz dolmustur!!!!");
				return;
			}
		}
		      System.out.println("-----------------------");
		      String islemler="1.Bakiye sorgulama:\n"
		                       +"2.Para Yatirma\n"
		    		           +"3.Para Cekme\n"+"0:Cikis";
		      System.out.println(islemler);
		      System.out.println("-----------------------");
		      System.out.print("Lütfen yapmak istediðiniz islemi girin:");
		      int islem=scan.nextInt();
		     
		      switch(islem) {
		      case 1: {
		    	  System.out.println("Bakiyeniz:"+hesap.getBakiye());
		    	
		      }
		      case 2: {
		    	  System.out.print("Lütfen yatirmak istediðiniz tutari giriniz:");
		    	  int tutar=scan.nextInt();
		    	hesap.paraYatir(tutar);
		    	
		      }
		      case 3: {
		    	  System.out.print("Lütfen cekmek istediðiniz tutari giriniz:");
		    	  int tutar=scan.nextInt();
		    	  hesap.paraCek(tutar);
		    
		    	  
		      }
		      case 4: {
		    	  System.out.println("Sistemden cikiyor....");
		    	  break;
		      }
		     
		      
		      }
		      
		      
		
		
	}

}
