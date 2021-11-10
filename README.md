# Modul 5 : Mengelola Class
## Praktikum Pemrograman 2

<hr>

## Dasar Teori

  **1. Package**
  
   Package adalah sarana/cara pengelompokkan dan pengorganisasian kelas-kelas dan interface yang sekelompok menjadi suatu unit tunggal dalam library. Package juga mempengaruhi      mekanisme hak akses ke kelas-kelas di dalamnya. Yang perlu diperhatikan adalah biasanya nama class utama harus sama dengan nama package.
   Berikut ini contoh sintaks pengimplementasian package untuk meletakkan hasil kompilasi sebuah class dalam paket:
   
   ```java
   package nama-paket;
   <identifier> class <nama_class sama dengan package>
   Contoh : package Utama;
   public class Utama{ }
   ```
  </br> 
  
  **2. Import Class**
  
  Perintah import digunakan untuk memberitahukan kepada program untuk mengacu pada class-class yang terdapat dalam package tertentu, buka menjalankan class-class tersebut.
  Berikut ini contoh dari Deklarasi import Class:
  ```java
  import <nama_package>.*;
  Contoh : import matematik.*;
  ```
  
  Sedangkan untuk mengimpor class tertentu anda dapat menuliskan nama class setelah nama package. Deklarasi import :
  ```java
  import <nama_package>.<nama_class>;
  Contoh : import matematik.bilangan;
  ```
  
  Contoh penggunaan import (dengan implementasinya) sebagai berikut:
  ```java
  import matematik.bilangan;
    class Utama {
      public static void main(String[] args) {
        Bilangan x = new Bilangan(); 
        x.setDesimal(-44); 
        System.out.println("Bilangan biner dari " x.getDesimal() + " adalah "+ x.biner()); 
      }
    }
  ```
  </br>
  
   **3. Kata kunci This**
   
   Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci this sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. this      dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. Adapun format penulisannya adalah:
   
   |this.data_member |merujuk pada data member |
   | ----------- | ----------- |
   | this.function_member() | merujuk pada function member |
   | this() | merujuk pada konstruktor |
   
   <hr>
   
   ## Praktikum
   
   ### Soal
   
   Mengimplementasikan UML class diagram dalam program untuk package perbankan
   
   Transformasikan class diagram diatas ke dalam bentuk program! Tulislah listing program berikut ini sebagai pengetesan.
   
   > Package Perbankan
   
   | Nasabah |
   | ----------- |
   | - namaAwal : String |
   | - namaAkhir : String |
   | - tabungan : Tabungan |
   | + Nasabah (namaAwal : String, namaAkhir : String) |
   | + getNamaAwal() : String |
   | + getNamaAkhir () : String |
   | + getTabungan() : Tabungan |
   | + setTabungan (tabungan : tabungan) |
   
   > Has     
   
   | Tabungan |
   | ----------- |
   | - saldo : int |
   | + Tabungan(saldo : int) |
   | + getSaldo() : int |
   | + ambilUang(jumlah : int) : boolean |
   | + simpanUang(jumlah : int) |
   
   ```java
   package modul5.latihan;
import modul5.latihan.perbankan.*;

public class TesLatihan {
    public static void main(String[] args) {
        int tmp;
        boolean status;
        Nasabah nasabah = new Nasabah("Agus", "Daryanto");
        System.out.println("Nasabah atas nama\t: " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());

        nasabah.setTabungan(new Tabungan(5000));
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo awal\t: " + tmp);

        nasabah.getTabungan().simpanUang(3000);
        System.out.println("Jumlah uang yang disimpan\t: 3000");

        status = nasabah.getTabungan().ambilUang(6000);
        System.out.print("Jumlah uang yang diambil\t: 6000");

        if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");

        nasabah.getTabungan().simpanUang(3500);
        System.out.println("jumlah uang yang disimpan\t: 3500");

        status = nasabah.getTabungan().ambilUang(4000);
        System.out.print("Jumlah uang yang diambil\t: 4000");

        if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");

        status = nasabah.getTabungan().ambilUang(1600);
        System.out.print("Jumlah uang yang diambil\t: 1600");

        if (status)
            System.out.println(" ok");
        else
            System.out.println(" gagal");

        nasabah.getTabungan().simpanUang(2000);
        System.out.println("Jumlah uang yang disimpan\t: 2000");
        tmp = nasabah.getTabungan().getSaldo();
        System.out.println("Saldo Sekarang\t\t\t\t: " + tmp);
    }
}
   ```
  *Perintah Soal : Lakukan kompilasi pada program diatas dan jalankan. Jika tampilan di layar tampak seperti dibawah ini, maka program anda sudah benar. Jika tidak sama, benahi kembali program   anda dan lakukan hal yang sama seperti diatas*.
  
  ### Jawaban
  
  - [X] Jawaban Soal [disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/tree/modul5/src/modul5/latihan)

  Analisis Pada Soal:
  
  ```java
  public Nasabah(String namaAwal, String namaAkhir){
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
  ```
    
  > Pada Sintaks di atas merupakan kode yang terdapat pada Class Nasabah, dimana pada sintaks tersebut membuat sebuah objek 'Nasabah' yang sama dengan nama Class.

  ```java
  public Tabungan(int saldo){
        this.saldo = saldo;
    }
  ```
  
  > Pada sintaks di atas merupakan sebuah objek yang terdapat pada class Tabungan, dimana objek tersebut memiliki nama yang sama dengan class 'Tabungan'.

<hr>

## Kesimpulan

Kesimpulan dari Praktikum 'Mengelola Class" ini yaitu Class adalah struktur dasar dari OOP (Object Oriented Programming). Bahasa pemrograman Java merupakan salah satu OOP. Class terdiri dari dua tipe, yaitu field (attribut/properti) dan method (metode). Class terdiri atas metode-metode yang melakukan pekerjaan dan mengembalikan informasi setelah melakukan tugasnya. Objek-objek ada secara independen, mempunyai aturan-aturan berkomunikasi dengan objek lain dan untuk memerintahkan objek lain guna meminta informasi tertentu atau meminta objek lain mengerjakan sesuatu. Class bertindak sebagai modul sekaligus tipe. Cara mengetahui apa yang dideklasikasin, biasanya ditandai dengan sintak tertentu. Contohnya : class untuk Kelas, tipe data untuk atribut, void untuk metode, dan new untuk object.


    
    
  
  
   
   
   
