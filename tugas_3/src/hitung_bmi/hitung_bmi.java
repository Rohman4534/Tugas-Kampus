package hitung_bmi;

import java.util.Scanner;
public class hitung_bmi {
    public static void main(String[] args) {
        float berat,tinggi;

        Scanner input = new Scanner(System.in);
        kalkulator bmi = new kalkulator();  // membuat objek bmi dari class kalkulator

        System.out.println("Program Index Massa Tubuh (IMT)");
        System.out.print("Masukkan berat badan: ");
        berat = input.nextFloat();
        System.out.print("Masukkan tinggi badan: ");
        tinggi = input.nextFloat();

        bmi.hitung(berat, tinggi);  // memanggil fungsi hitung dalam objek bmi

    }
}
