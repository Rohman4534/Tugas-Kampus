package Kelompok_4;
import java.util.Scanner;
class Program {
    String kalimat;
    void programInput(){
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat : ");
        kalimat = input.nextLine();
    }

    String programBalik(){
        programInput();
        int i;
        String balik="";
        char[] data= new char [kalimat.length()];

        kalimat.getChars(0,kalimat.length(),data,0);

        for (i=data.length-1; i>=0;i--){
            balik +=data[i];
        }
        return balik;
    }

     void programBanding(){
        String balik = programBalik();

        System.out.println("kalimat yang dibalik : "+balik);
        System.out.println("kalimat aslinya      : "+kalimat+"\n");

        if (balik.equals(kalimat)){
            System.out.println("kalimat " +kalimat+ " adalah palindrome");
        }else {
            System.out.println("kalimat " +kalimat+ " bukanlah palindrome");
        }
    }

    void programTampil(){
        programBanding();
    }


}