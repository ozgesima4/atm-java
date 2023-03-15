
package atm;

import java.util.Scanner;

public class Atm {

    public static void main(String[] args) {
        String kullanici,password;
        int hak=3,secim,bakiye=1000;
        Scanner input=new Scanner(System.in);
        
        System.out.println("Bankamiza hosgeldiniz!");
        while(hak>0){
             System.out.println("kullanici adiniz:");
        kullanici=input.nextLine();
        System.out.println("sifreniz:");
        password=input.nextLine();
        
        if(kullanici.equals("özge") && password.equals("123")){
            do{
            System.out.println("yapmak istediginiz islem:\n"+
                    "1.para yatirma\n"+
                    "2. para cekme\n"+
                    "3.cikis");
            secim=input.nextInt();
            switch (secim) {
                case 1: System.out.println("yatirilacak miktar:");
                int yatir=input.nextInt();
                bakiye+=yatir;
                    System.out.println("guncel bakiye: "+bakiye);
                    break;
                
                case 2: System.out.println("çekilecek miktar: ");
                int cek= input.nextInt();
                bakiye-=cek;
                System.out.println("guncel bakiye: "+bakiye);
                    break;
                    
                    
                default:
                    System.out.println("islem kismi kapandi");
            }
            }while(secim!=3) ;
            
            
        }
        else{
            hak--;
            System.out.println("HATALI");
            System.out.println("kullanici adini ve sifreyi bastan girin:");
            if(hak==0){
                System.out.println("kart blokelendi");
                break;
            }
        }
        
        }
       
        
        
        
    }
    
}
