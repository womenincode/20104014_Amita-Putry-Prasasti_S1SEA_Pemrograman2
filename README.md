# Modul 9 : Exception

## Praktikum Pemrograman 2

<hr>

## Dasar Teori
`Exception` adalah suatu kondisi `abnormal` yang terjadi pada saat menjalankan program. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa saat menjalankan operasi normal dalam program dinamakan ```Exception Handling.``` Karena dalam Java segala sesuatu merupakan ```objek```, maka exception juga direpresentasikan dalam sebuah objek yang menjelaskan tentang exception tersebut. Contoh Exception adalah pembagian bilangan dengan 0, pengisian elemen array di luar ukuran array, kegagalan koneksi database, file yang akan dibuka tidak ada, dan mengakses objek yang belum diinisialisasi. Terdapat dua penanganan exception yaitu:

1. Menangani sendiri exception tersebut.
2. Meneruskannya ke luar dengan cara membuat objek tentang exception tersebut dan melemparkannya (throw) keluar agar ditangani oleh kode yang memanggil method atau ```method yang di dalamnya terdapat exception``` tersebut.

Ada lima ```keyword``` yang digunakan oleh Java untuk menangani Exception yaitu ```try```, ```catch```, ```finally```, ```throw``` dan ```throws```.

</br>

+ Tipe-tipe Exception

Pada exception, ```superclass tertinggi``` adalah ```class Throwable```, tetapi para programmer hampir tidak pernah menggunakan class ini secara langsung. Di bawah class Throwable terdapat dua ```Subclass``` yaitu ```class Error``` dan ```class Exception```.

</br>

+ Penggunaan Blok try-catch

Untuk menangani Exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya ```exception``` di dalam ``blok try``, diikuti dengan `blok catch` yang menentukan jenis exception yang ingin ditangani. Contoh;

> Class Percobaan [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul9/src/modul9/percobaan/Percobaan.java)

```java
package modul9.percobaan;

public class Percobaan {
    public static void main(String[] args) {
        int a[] = new int[5];
        try {
            a[5] = 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Indeks array melebihi batas");
        }catch (ArithmeticException e) {
            System.out.println("Tidak boleh membagi bilangan dengan 0");
        }
    }
}
```

> Output

```
Indeks array melebihi batas

Process finished with exit code 0
```

Dapat terjadi kode yang terdapat dalam `blok try` mengakibatkan lebih dari satu `exception`. Dalam hal ini, dapat dituliskan lebih dari satu `block catch`. Contoh :

```java
public class Percobaan5 {
    public static void main(String[] args) {
          int bil=10;
          String b[] = {"a","b","c"};
      try{
          System.out.println(bil/0);
          System.out.println(b[3]);
      }catch(ArithmeticException e){
          System.out.println("Error Aritmetik");
      }catch(ArrayIndexOutOfBoundsException e){
          System.out.println("Error Kapasitas Array Melebihi Batas");
      }catch(Exception e){
          System.out.println("Terdapat Error");
      }
    }
}
```

</br>

+ Menggunakan Keyword "finally"

Terdapat kode yang harus dijalankan walaupun terjadi atau tidak terjadi `exception`, misalkan membuka file, hal ini memungkinkan terjadinya exception misal file tidak ada atau file tidak bisa di buka, selanjutnya yang harus dilakukan adalah menutup file tersebut.

Contoh penerapan pada kode program yaitu:

```java
package modul9.percobaan;

public class ExceptTest {
    public static void main(String[] args) {
        int a[] = new int[2];
        try {
            System.out.println("Access element three : " + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throw : " + e);
        } finally {
            a[0] = 6;
            System.out.println("First element value : " + a[0]);
        }
    }
}
```

</br>

+ Menggunakan Keyword "Throw" dan "Throws"

Secara eksplisit, kita dapat melempar atau `throw exception` dari program menggunakan keyword `throw`. Jika exception tersebut adalah `checked exception`, maka pada method harus ditambahkan throws. Namun, jika exception tersebut adalah `unchecked exception`, maka pada method tidak perlu ditambahkan throws.

```java
public class Percobaan6 {
    public static void method1() throws
        FileNotFoundException{
          throw new FileNotFoundException("File Tidak Ada");
        } public static void main(String[] args) {
        try {
          method1();
        } catch (FileNotFoundException ex) {
          System.out.println(ex.getMessage());
        }
    }
}
```
<hr>

## Praktikum

1. Latihan "1" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/Latihan1.java)

**Method yang melempar checked exception:**

> Class Latihan1

```java
package modul9.latihan;
import java.io.FileNotFoundException;

public class Latihan1 {
    public static void method1() throws FileNotFoundException {
        throw new FileNotFoundException("File Tidak Ada");
    }

    public static void main(String[] args) {
        try {
            method1();
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
```

> Output 

```
File Tidak Ada

Process finished with exit code 0
```

**Analisis Kode Program di atas yaitu:**

Pada program di atas menggunakan kata kunci ekpensi yaitu `throw`, `try`, dan `catch`. Dimana output dari program di atas menyatakan `"File Tidak Ada"`, hal itu dikarenakan pada  `blok-try` yang berisi `method1` tidak ada data yang dimasukkan atau file yang diletakkan pada method tersebut, sehingga program melemparkan eksepsi ke `blok-catch` dan program mengeluarkan pesan output `File Tidak Ada` berdasarkan perintah di dalam `catch` yaitu `FileNotFoundException ex`.

</br>

2. Latihan "2" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/Latihan2.java)

**Method yang melempar unchecked exception:**

> Class Latihan2

```java
package modul9.latihan;

import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Masukkan Angka : ");
            int num = sc.nextInt();
            if (num > 10) throw new Exception();
            System.out.println("Angka kurang dari atau sama dengan 10");
        } catch (Exception s) {
            System.out.println("Angka lebih dari 10");
            System.out.println("Selesai");
        }
    }
}
```

> Output

`Running ke-1`
```
Masukkan Angka : 9
Angka kurang dari atau sama dengan 10

Process finished with exit code 0
```

`Running ke-2`

```
Masukkan Angka : 20
Angka lebih dari 10
Selesai

Process finished with exit code 0

```


**Analisis Kode Program di atas yaitu:**

Pada program di atas menggunakan kata kunci Exception yaitu `try` dan `catch`. Yang membedakan antara `Latihan1` adalah program ini menggunakan percabangan `if`. Dimana program ini melakukan sebuah pengkondisian dengan melibatkan `try-catch`. Berdasarkan output di atas, dapat di analisis bahwa `blok-try` berfungsi untuk menampung pengkondisian yang pertama, dimana jika kita memasukkan angka di bawah 10 (angka < 10) maka keluaran dari program di atas yaitu `"Angka kurang dari atau sama dengan 10"`. Sedangkan pengkondisian kedua terdapat di `blok-catch` yang menampung kondisi jika angka yang dimasukkan lebih dari 10 (angka > 10) maka keluaran dari program di atas yaitu `"Angka lebih dari 10 Selesai"`. Pada kasus ini try-catch juga berguna pada suatu pengkondisian dengan melakukan eksepsi.

</br>

3. Latihan "3" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul9/src/modul9/latihan/Latihan3.java)

**Menggunakan konsep Inheritance untuk membuat superclass dan subclass exception. Program menangani exception dengan menangkap subclass exception dengan superclass.**

> Class Latihan3

```java
package modul9.latihan;
import javax.swing.*;
class ExceptionA extends Exception {}
class ExceptionB extends ExceptionA {}
class ExceptionC extends ExceptionB {}
public class Latihan3 {
    public static void main(String[] args) {
        try {
            throw new ExceptionC();
        } catch (ExceptionA a) {
            JOptionPane.showMessageDialog( null, a.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        }
        try {
            throw new ExceptionB();
        } catch (ExceptionA b) {
            JOptionPane.showMessageDialog(null, b.toString(), "Exception", JOptionPane.INFORMATION_MESSAGE);
        } System.exit(0);
    }
}
```

**Analisis Kode Program di atas yaitu :**

Pada program di atas menggunakan kata kunci `try`, `catch`, dan `throw`. Seperti yang dilihat, kode diatas juga melakukan `inheritance` atau pewarisan pada 3 class, yaitu `class ExceptionA`, `class ExceptionB`, dan `class ExceptionC`. Pada masing-masing class dimasukkan ke dalam `blok-catch` untuk melakukan eksekusi. Pada `blok-try` yang pertama program melakukan eksekusi pada `class ExceptionC` dimana jika class tersebut memiliki throuble maka akan di lemparkan ke  `blok-catch` sehingga mengeluarkan `INFORMATION_MESSAGE` yaitu "ExceptionC". Fungsi dari pada `INFORMATION_MESSAGE` adalah untuk memuncul sebuah `message box` seperti pop-up yang mengeluarkan pesan peringatan. Blok-try yang pertama berlaku juga bagi `blok-try` yang kedua, dimana class `ExceptionB` yang melakukan eksepsi.

<hr>

## Kesimpulan

Kesimpulan dari Praktikum `Exception` ini adalah : Dalam java, `runtime error` atau kesalahan-kesalahan yang terjadi pada saat program sedang berjalan di representasikan dengan `exception`. Exception terjadi ketika program sudah pada tahap `eksekusi`, bukan saat tahap `compile`.  Sebuah exception terjadi karena beberapa penyebab misalnya : user memasukkan daya yang tidak valid, file yang akan dibuka tidak ditemukan, koneksi yang belum tersambung atau tiba-tiba terputus di tengah proses.

Java menyediakan lima buah kata kunci untuk menangani eksepsi, yaitu: `try`, `catch`, `throw`, `throws`, dan `finally`.

+ Kata kunci `try` digunakan untuk membuat blok yang berisi statetment yang mungkin menimbulkan eksepsi.
+ Apabila dalam proses eksekusi runtunan statement tersebut terjadi sebuah eskpensi, maka ekspensi akan dilempar ke bagian blok penangkap yang dibuat dengan kata kunci `catch`.
+ Pada kasus tertentu, terkadang juga ingin melempar ekspensi secara manual. Untuk melakukan hal tersebut maka menggunakan kata kunci `throws`.
+ Apabila ingin membangkitkan sebuah ekspensi tanpa menuliskan blok `try`, maka perlu menambahkan kata kunci `throws` pada saat mendeklarasikan method.
+ Dalam mendefinisikan blok `try` juga di izinkan menulis statement tambahan yaitu kata kunci `finally`.
