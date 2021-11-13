
package hendri.critian_cli;

import java.util.Scanner;

public class HendriCritian_CLI {

    public static void main(String[] args) {
        ModuleUtama();  
    }
    public static void ModuleUtama(){
        Scanner s = new Scanner(System.in);
        System.out.println("pilihan");
        System.out.println("1.penjumlahan");
        System.out.println("2.pengurangan");
        System.out.println("3.perkalian");
        System.out.println("4.pembagian");
        System.out.print("Masukan Pilihan Anda: ");
        int choice = s.nextInt();
        switch (choice){
            case 1: ModuleTambah();break;
            case 2: ModuleKurang();break;
            case 3: ModuleKali();break;
            case 4: ModuleBagi();break;
        }
                
    }
     public static void ModuleTambah(){
         Scanner s = new Scanner(System.in);
          System.out.println("Penjumlahan");
          System.out.print("Masukan Nilai Pertama: ");
          double num1 = s.nextDouble();
          System.out.print("Masukan Nilai kedua: ");
          double num2 = s.nextDouble();
          System.out.println("maka hasil dari " + String.valueOf(num1) + "+" + String.valueOf(num2) + "adalah" + (num1 + num2));
          ModuleUtama();
          
    }
      public static void ModuleKurang(){
          Scanner s = new Scanner(System.in);
          System.out.println("Pengurangan");
          System.out.print("Masukan Nilai Pertama: ");
          double num1 = s.nextDouble();
          System.out.print("Masukan Nilai kedua: ");
          double num2 = s.nextDouble();
          System.out.println("maka hasil dari " + String.valueOf(num1)+ "-" + String.valueOf(num2)+"adalah" + (num1 - num2));
          ModuleUtama();
    }
       public static void ModuleKali(){
           Scanner s = new Scanner(System.in);
          System.out.println("Perkalia}");
          System.out.print("Masukan Nilai Pertama: ");
          double num1 = s.nextDouble();
          System.out.print("Masukan Nilai kedua: ");
          double num2 = s.nextDouble();
          System.out.println("maka hasil dari " + String.valueOf(num1) + "*" + String.valueOf(num2) + "adalah" + (num1 * num2));
          ModuleUtama();
    }
     public static void ModuleBagi(){
         Scanner s = new Scanner(System.in);
          System.out.println("Pembagian");
          System.out.print("Masukan Nilai Pertama: ");
          double num1 = s.nextDouble();
          System.out.print("Masukan Nilai kedua: ");
          double num2 = s.nextDouble();
          System.out.println("maka hasil dari " + String.valueOf(num1) + "/" + String.valueOf(num2)+ "adalah" + (num1 / num2));
          ModuleUtama();
    }
    
}
