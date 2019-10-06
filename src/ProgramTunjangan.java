/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author
 * NAMA   : Naufal Asha
 * KELAS  : IF-2
 * NIM    : 10118063
 */
public class ProgramTunjangan {

    /**
     * @param args
     */
      public static void main(String[] args){
          Scanner scanner = new Scanner (System.in);
          
          System.out.println("======== Program Tunjangan ========");
          System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
          double gapok = scanner.nextDouble();
          double tunjangan = 0.0;
          System.out.print("Status Anda? (Menikah/Belum): ");
          if (scanner.next().equals("Menikah")){
              tunjangan = gapok*0.35;
          }
          System.out.println("===== Hasil Perhitungan Gaji Anda =====");
          System.out.println("Gaji Pokok\t\t: Rp. " + gapok);
          System.out.println("Tunjangan\t\t: Rp. " + tunjangan);
          System.out.println("Total Gaji\t\t: Rp. " + (gapok+tunjangan));
          
    }
}
