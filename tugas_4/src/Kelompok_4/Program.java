package Kelompok_4;
import java.util.Scanner;
class Program {
    String programInput(){
        Scanner input = new Scanner(System.in);
        String kalimat;
        System.out.print("Masukkan kalimat :");
        kalimat = input.nextLine();
        return kalimat;
    }


    String programBalik(){
        String kalimat = programInput();

        int i;
        String balik="";
        char[] data= new char [kalimat.length()];

        kalimat.getChars(0,kalimat.length(),data,0);

        for (i=data.length-1; i>=0;i--){
            balik +=data[i];
        }return balik;
    }

     void programBanding(){
        String kalimat = programInput();
        String balik = programBalik();

        System.out.println("kalimat yang dibalik : "+balik);
        System.out.println("kalimat aslinya      : "+kalimat);

        if (balik.equals(kalimat)){
            System.out.println("kalimat palindrome");
        }else {
            System.out.println("bukan kalimat palindrome");
        }
    }


}