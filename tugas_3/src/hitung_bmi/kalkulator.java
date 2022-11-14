package hitung_bmi;
public class kalkulator {
    float hitung(float paramberat, float paramtinggi) {
        float tinggi1,tinggi2,hasil;

        tinggi1=paramtinggi / 100;  // ukuran tinggi1 dalam satuan cm dibagi 100 sehingga akan menjadi m
        tinggi2 = tinggi1 * tinggi1; // tinggi1 dalam satuan m akan dikuadratkan
        hasil = paramberat / tinggi2;  // berat dibagi tinggi2

        if (hasil < 18.5) {
            System.out.println("\nSkor IMT anda: "+hasil+"\nAnda Kurang berat badan");
        } else if (hasil >= 18.5 && hasil <= 22.9) {
            System.out.println("\nSkor IMT anda: "+hasil+"\nAnda Normal");
        } else if (hasil >= 23 && hasil<=24.9){
            System.out.println("\nSkor IMT anda: "+hasil+"\nAnda Kelebihan berat badan");
        }else if (hasil >= 25 && hasil <= 29.9){
            System.out.println("\nSkor IMT anda: "+hasil+"\nAnda obesitas tingkat 1");
        }else if (hasil >30 ) {
            System.out.println("\nSkor IMT anda: "+hasil+"\nAnda Obesitas tingkat 2");
        }
        return hasil;
    }
}