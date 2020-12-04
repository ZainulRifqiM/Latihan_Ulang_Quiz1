/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan_ulang_quiz1;
import java.util.Scanner;
/**
 *
 * @author Zainul Rifqi
 * Nama : ZaeZain
 */
public class Latihan_Ulang_Quiz1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        Customer c = new Customer();
        String nama,email,member;
        int noPilih;
        
        System.out.println("====Program Kasir Rock n Roll Haircut");
        System.out.print("Customer Name : ");
        nama=s.nextLine();
        c.setName(nama);
        System.out.print("Customer Email : ");
        email=s.nextLine();
        c.setEmail(email);
        c.displayService();
        noPilih=s.nextInt();
        c.getPrice(noPilih);
        System.out.print("Are you member (yes/no) : ");
        member=s.next();
        c.checkMemberStatus(member);
        System.out.println();
        System.out.println();
        System.out.println("#**************************#");
        System.out.println("#*****CUSTOMER INVOICE*****#");
        System.out.println("Date Transaction : " + c.currentTime());
        System.out.println("Service Price : " + c.getPrice(noPilih));
        System.out.println("Discount : " + c.getSale(c.checkMemberStatus(member),c.getPrice(noPilih)));
        System.out.println("Total Pay : " + c.getTotalPay(c.getPrice(noPilih),c.getSale(c.checkMemberStatus(member),c.getPrice(noPilih))));
    }
    
}
