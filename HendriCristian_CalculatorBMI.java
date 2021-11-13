
package hendri.cristian_calculator.bmi;

import java.util.Scanner;


public class HendriCristian_CalculatorBMI {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int berat;
        double tinggi;
        double bmi;
        System.out.println("masukan berat : ");
        berat = input.nextInt();
        System.out.println("masukan tinggi");
        tinggi = input.nextDouble();
        tinggi/=100;
        bmi=berat/(tinggi*tinggi);
        System.out.println("BMI Anda Adalah "+bmi);
        
        if (bmi<18.5){
        System.out.println("berat badan anda kurang");
    }
        else if (bmi<24.9){
            System.out.println("berat badan anda Ideal");
        }
         else if (bmi<29.9){
              System.out.println("berat badan anda Lebih");
         }
        else {
             System.out.println("OBESITAS");
    }
    
}
