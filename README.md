# Modul 8 : Polimorfisme

## Praktikum Pemrograman 2

<hr>

## Dasar Teori

`Polymorphism` (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. **Polimorfisme** ini terjadi pada saat suatu obyek bertipe `parent class`, akan tetapi pemanggilan constructornya melalui `subclass`. Contohnya deklarasi pernyataan berikut ini:

Pada contoh di bawah ini `Manager()` adalah konstruktor pada class Manager yang merupakan subclass dari class Employee.

```java
Employee employee=new Manager();
//<nama class> <variable bebas> = new <kontruktor>();
```


`Virtual Method Invocation (VMI)` bisa terjadi jika terjadi `polimorfisme` dan `overriding`. Pada saat obyek yang sudah dibuat tersebut memanggil `overridden method pada parent class`, kompiler Java akan melakukan `invocation` (pemanggilan) terhadap overriding method pada subclass, dimana yang seharusnya dipanggil adalah overridden method. Berikut contoh terjadinya VMI:

> Class Parent : [Link here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul8/src/modul8/percobaan/Parent.java)

```java
public class Parent {
    int x = 5;
    public void info() {
        System.out.println("Ini Class Parent");
    }
}
```

> Class Child : [Link here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul8/src/modul8/percobaan/Child.java)

```java
public class Child extends Parent {
    int x = 10;
    public void info() {
        System.out.println("Ini Class Chid");
    }
}
```

> Class Tes (Main) : [Link here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul8/src/modul8/percobaan/Tes.java)

```java
public class Tes {
    public static void main(String[] args) {
        Parent kelas = new Child();
        System.out.println(" Nilai x : " + kelas.x);
        kelas.info();
    }
}
```

> Hasil running program:

```
Nilai x : 5
Ini Class Chid

Process finished with exit code 0
```

`Polymorphic arguments` adalah tipe suatu parameter yang menerima suatu nilai yang bertipe subclass-nya. Berikut contoh dari polymorphics arguments:

```java
Class Pegawai {
....
}
Class Manajer extends Pegawai {
....
{
Class Test {
    public statis void main(String args[]) {
    Manajer man = new Manajer();
    Proses(main);
  }
}
```

Pernyataan instanceof sangat berguna untuk mengetahui tipe asal dari suatu polymorphic arguments. Untuk lebih jelasnya, misalnya dari contoh program sebelumnya, kita sedikit membuat modifikasi pada class Tes dan ditambah sebuah class baru Kurir, seperti yang tampak dibawah ini:

```java
class Kurir extends Pegawai {
  ...
}

public class Tes {
    public static void Proses(Pegawai peg) {
      if (peg instanceof Manajer) {
          //...lakukan tugas-tugas manajer...
      } else if (peg instanceof Kurir) {
          //...lakukan tugas-tugas kurir...
      } else {
          //...lakukan tugas-tugas lainnya...
      }
    }
    public static void main(String args[]) { Manajer man = new Manajer();
        Kurir kur = new Kurir(); Proses(man);
        Proses(kur);
    }
```

Seringkali pemakaian instanceof diikuti dengan casting object dari tipe parameter ke tipe asal. Misalkan saja program kita sebelumnya. Pada saat kita sudah melakukan instanceof dari tipe Manajer, kita dapat melakukan casting object ke tipe asalnya, yaitu Manajer. Caranya adalah seperti berikut:

```java
if (peg instanceof Manajer) { Manajer man = (Manajer) peg;
    //...lakukan tugas-tugas manajer...
}
```

<hr>

## Praktikum

**Virtual Method Invocation**

Soal : Buatlah 3 class dalam project kalian kemudian beri nama dan isi sebagai berikut:

+ Class Pegawai [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/Pegawai.java)

+ Class Gaji [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/Gaji.java)

+ Class VirtualDemo [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul8/src/modul8/latihan/VirtualDemo.java)


> Hasil running program pada class-class di atas:
```
Menyusun Pegawai
Memanggil mailCheck Berdasarkan Referensi Gaji --
Memeriksa kelas gaji dalam surat 
Surat tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan Referensi Pegawai--
Memeriksa kelas gaji dalam surat 
Surat tertuju untuk Ini nama dengan gaji 2500.0

Process finished with exit code 0
```

> Pertanyaan : Analisislah mengapa hasil akhirnya seperti ini !

Analisis hasil program di atas adalah:

Berdasarkan output di atas, dapat dijelaskan bahwa program mula-mula memanggil `class Pegawai` dimana keluarannya yaitu `"Menyusun Pegawai"` dalam artian mengecek susunan daftar pegawai. Selanjutnya memanggil `method mailCheck` yang berisi `"Memanggil mailCheck Berdasarkan Referensi Gaji --"` kemudian memanggil `method mailCheck` pada `class Gaji` dengan mengecek gaji pegawai pertama yaitu atas nama `"wahyu"` dengan total gaji `"5000.0"`. Kemudian memanggil kembali `method mailCheck` yang mengeluarkan data kedua atas nama `"ini nama"` dengan total gaji `"2500.0"`. Pada program di atas dapat memanggil `method mailCheck` yang berada pada class yang berbeda namun dapat di panggil satu kali secara bersamaan pada `class Test` di `method main`. Pada `Class Test` yang berisi `method main` program membuat objek terlebih dahulu untuk memanggil `method mailCheck` secara bersamaan, `method mailCheck` yang berada di `class pegawai` dipanggil dengan `e.mailCheck()` dan method mailCheck di `class Gaji` dipanggil dengan `s.mailCheck()`. Oleh karena itu `method mailCheck` dapat mengeluarkan output secara bersamaan. 
<hr>

## Kesimpulan

Kesimpulan dari Praktikum Polimorfisme ini yaitu:

+ Pada Class 'Pegawai' dan 'Gaji' memiliki method yang sama yaitu method 'mailCheck' yang dapat dijalankan pada Class 'Test' dengan mendeklarasikan object terlebih dahulu.
+ Polimorfise memiliki kesamaan dengan inheritance.
+ Polimorfisme merupakan suatu konsep yang menyatakan sesuatu yang sama dapat memiliki berbagai bentuk dan perilaku yang berbeda atau dapat dikatakan bahwa polymorphism adalah satu objek yang memiliki banyak bentuk.
+ Konsep dari Polimorfisme menggunakan dua metode. Metode pertama yaitu pewarisan yang menggunakan konsep overriding yaitu membuat method yang bernama dan berstruktur sama akan tetapi method berbeda pada class induk dan class anak. Metode yang kedua adalah overloading yaitu method bernama sama dengan method lain pada suatu class tetapi memiliki parameter yang berbeda.
