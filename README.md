# Modul 3 : Pengenalan Pemrograman Berorientasi Objek

## Dasar Teori

1. Pemrograman Berorientasi Objek </br>
OOP adalah merupakan kepanjangan dari Object Oriented Programming. OOP merupakan suatu metode pemrograman yang berorientasi kepada objek. Dalam bahasa Indonesia OOP dikenal dengan PBO (Pemrograman Berorientasi Objek). OOP bertujuan untuk mempermudah pengembangan sebuah program. Ia memiliki variabel dan fungsi yang  dibungkus ke dalam objek ataupun class. Keduanya dapat saling berinteraksi sehingga membentuk sebuah program.
</br>

2. Mendeklarasikan suatu Class </br>
Class bertugas untuk mengumpulkan prosedur/fungsi dan variabel dalam satu tempat. Class merupakan blueprint dari sebuah objek atau cetakan untuk membuat objek. Contoh class sebagai berikut ini.
```java
public class Car{ 
    // Body Class
}
```
</br>

3. Mendeklarasikan suatu Atribut </br>
Atribut merupakan bagian dari sebuah kelas yang masih berhubungan erat dari kelas tersebut. Atribut bisa juga disebut sebagai properti atau properties dari sebuah class.     Contohnya ketika memiliki sebuah class Motor, maka dapat menambahkan atribut seperti kecepatan motor, umur motor, ukuran, ban, warna dsb. Untuk lebih detailnya, contohkan pada program berikut:
```java
class Car {
    // Attribute
    int speed; 
    int tire;
}
```
<br>

4. Mendeklarasikan suatu Metode </br>
Method berperan menjelaskan bagaimana suatu atribut beraksi. Peran yang dimaksud berupa tingkah laku (behavior) yang dapat digambarkan oleh suatu method. Misal class Manusia. Manusia tentu memiliki method berupa tingkah laku, seperti berpikir, berjalan, berbicara, makan dll. Maka tentunya method dapat disesuaikan dengan program yang dibuat.
```java
<modifier>  <return_type>  <nama_metode> 
([daftar_argumen]) 
[<statement>] 
  } 
    Contoh : public void info()
    { 
      System.out.println(warna);
    }
```
</br>

5. Mengakses anggota suatu Objek </br>
Objek (Object) adalah sebuah variabel instance yang merupakan wujud dari class. Instance merupakan wujud dari sebuah kelas. Sebuah objek digambarkan dengan variable dan method.
```java
public class Mobil { 
public static void main(String args[]) 
  { 
    Mobil m=new Mobil();
    m.warna=”hitam”; 
    m.no_Plat=”KT 2837 UE”; 
    m.info(); 
  } 
}
```
<hr>

## Praktikum

### Soal
+ Mengimplementasikan UML class diagram dalam   program untuk 
class Tabungan

| Tabungan |
| ----------- |
| + saldo: int |
| + Tabungan(initsaldo : int) |
| + getSaldo() : int | 
| + simpanUang(jumlah : int) |
| + ambilUang(jumlah : int) : boolean |

Transformasikan class diagram di atas ke dalam bentuk program?

### Jawaban
- [x] Jawaban Soal [disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul3/src/modul3/latihan/Main.java)

Penjelasan:

Pada sintax di bawah ini adalah perintah dalam pemanggilan class MethodTabungan yang kemudian menjadi objek untuk dapat memanggil perintah di dalam class MethodTabungan. 
```java
MethodTabungan tabungan = new MethodTabungan(10000);
        System.out.println("Saldo awal\t: "+tabungan.getSaldo());
        tabungan.simpanUang(8000);
```

Kemudian, pada sintax di bawah ini yaitu suatu pengkondisian, dimana jika status bernilai benar artinya jika uang yang diambil tidak melebihi sisa saldo, maka kondisi menyatakan 'ok' sebaliknya jika uang yang diambil melebihi sisa saldo maka kondisi menyatakan 'gagal'.
```java
if (status) {
            System.out.println("ok");
        } else {
            System.out.println("gagal");
        }
```
<hr>

## Kesimpulan </br>

Kesimpulan dari Praktikum Pengenalan Pemrograman Berorientasi Objek adalah dengan menerapkan model OOP dapat meminimalisir dan membuat kode tertata rapi. Selain itu juga untuk mempercepat pembuatan program. OOP juga bertujuan untuk mempermudah pengembangan sebuah program. Ia memiliki variabel dan fungsi yang  dibungkus ke dalam objek ataupun class. Keduanya dapat saling berinteraksi sehingga membentuk sebuah program. Daripada secara procedural, karena jika program semakin besar maupun kompleks maka kode akan sulit di-maintenance, sebab teknik prosedural identik dengan menggabungkan seluruh kode. 😊
