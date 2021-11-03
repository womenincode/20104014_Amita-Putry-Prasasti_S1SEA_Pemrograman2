# Modul 4 : Dasar Pemrograman Berorientasi Objek

## Praktikum Pemrograman 2

<hr>

## Dasar Teori
+ **Information Hiding** </br>
Information Hiding adalah menyembunyikan attribute suatu objek dari objek lain. Informasi dari 'class' disembunyikan dari anggota-anggota lainnya agar 'class' lain tidak dapat   mengaksesnya. Contohnya:
  ```java
  private int nilai;
  ```
  </br>
  
 + **Encapsulation (Enkapsulasi)** </br>
 Encapsulation (Enkapsulasi) adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:
 
   a. Information Hiding </br>
   b. Menyediakan suatu perantara atau method untuk mengakses data.
 
   Seperti Contoh:
   ```java
   public class Siswa(){
    private int nilai;
    public void setnilai (int n){
      nilai  = n;
    }
   }
   ```
   </br>
   
 + **Constructor** </br>
   Contructor (konstruktor) adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk       menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek. Beberapa karakteristik yang dimiliki oleh constructor:
   
   
    a. Method constructor harus memiliki nama yang sama dengan nama class. </br>
    b. Tidak mengembalikan suatu nilai (tidak ada keyword return). </br>
    c. Satu class memiliki lebih dari satu constructor (overloading constructor). </br>
    d. Dapat ditambah access modifier public, private, protected maupun default. </br>
    e. Suatu constructor bisa dipanggil oleh constructor lain dalam satu class. Struktur dari konstruktor yaitu :
  
     ```java
        Class Nama_kelas {
        Nama_kelas() //ini adalah constructor
       {
          //isi konstruktor
       }
         //isi dari kelas 
       }
     ```
     
     Seperti Contoh:
     
     ```java
     public class Siswa {
        private int nilai;
        private String nama;
        public Siswa(int n, String m) {
            nilai= n;
            nama= m;
        }
     }
     ```
     </br>
     
 + ***Overloading Constructor*** </br>
     Overloading Constructor merupakan suatu class yang mempunyai lebih dari 1 constructor dengan syarat daftar parameternya tidak boleh ada yang sama. Contoh :
     
      ```java
      public class Siswa(){
        private int nilai;
          public Siswa() {
            nilai=0;
          }
          public Siswa(int n) {
            nilai=n;
          }
      }
      ```
      
      Catatan : Constructor tidak dapat dipanggil secara langsung, namun harus dipanggil dengan menggunakan operator new pada pembentukan sebuah class.
      
<hr>

# Praktikum

### Soal

+ ***Student Record***
Buatlah 2 class dalam project kalian kemudia beri nama dan isi sebagai berikut :

> Class StudentRecord
```java
package modul4.latihan;

public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static  int studentCount;

    public String getName(){
        return name;
    }

    public void setName( String temp ){
        name = temp;
    }

    public double getAverage(){
        double result = 0;
        result = (mathGrade+englishGrade+scienceGrade) / 3;
        return result;
    }

    public  static int getStudentCount() {
        return studentCount;
    }
}

```

> Class StudentRecordExample
```java
package modul4.latihan;

public class StudentRecordExample {
    public static void main(String[] args) {
        StudentRecord wahyu = new StudentRecord();
        StudentRecord ini = new StudentRecord();
        StudentRecord Nama = new StudentRecord();

        wahyu.setName("Wahyu");
        ini.setName("Ini");
        Nama.setName("Nama");

        //System.out.println( getName()); => kode yang berada di soal 'salah'
        System.out.println(wahyu.getName());
        System.out.println("Hitung = " + StudentRecord.getStudentCount());
    }
}

```

> Hasil Running dari program di atas

```
Wahyu
Hasil = 0
```
***Perintah soal : Analisislah dan tentukan konsep apa saja yang digunakan (dari modul ini) serta mengapa hasil akhirnya seperti itu !***



### Jawaban
- [x] Jawaban Soal [disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/tree/modul4/src/modul4/latihan)

Analisis Pada Soal: </br>
+ Konsep yang digunakan pada kode program, yaitu:
 > konsep Information Hiding, dimana terdapat method "private"  yang menyembunyikan atribut di class 'StudentRecord'terdapat pada kode soal di bawah ini:
 ```java
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static  int studentCount;
 ```
 
 + Mengapa hasil akhir seperti itu? </br>
 > Pada class 'StudentRecord'di line 14 code:
 ```java
 System.out.println(wahyu.getName());
 ```
 Kode tersebut adalah memanggil wahyu.getName(), Penjelasannya sebagai berikut: </br>
 ➡️ 'wahyu' merupakan sebuah objek yang memanggil method 'getName' pada class StudentRecord
 
 ➡️ Pada method 'getName' terdapat return 'name', yang kemudian variabel 'name' di inisialisasikan pada variabel 'temp' yang terdapat pada method 'setName'
 
 ➡️ Kemudian, pada method 'setName' melakukan inisialisasi variabel 'name' yang berisi variabel 'temp' dan di panggil pada class 'RecordStudentExample' yaitu 'wahyu.setName("Wahyu");
 
 ➡️ Pada class StudentRecordExample line 9 (wahyu.setName("Wahyu")) program akan mengirimkan paramater "Wahyu" kedalam method setName() pada class StudentRecord(), sehingga menghasilkan output "Wahyu".
 
 ➡️ Kemudian pada kode di line 15 yaitu:
 ```java
 System.out.println("Hitung = " + StudentRecord.getStudentCount());
 ```
 
 ↪️ Pada kode tersebut menghasilkan output "Hitung = 0" karena program memanggil StudentRecord.getStudentCount() dimana method getStudentCount() melakukan return variabel studentCount yang berisi 0. Seperti pada kode di line 27 class "StudentRecord" ini:
 ```java
 public  static int getStudentCount() {
        return studentCount;
    }
 ```

<hr>

# Kesimpulan

Kesimpulan pada Praktikum Dasar Pemrograman Berorientasi Objek ini adalah Pemrograman berorientasi objek (Object Oriented Programming atau disingkat OOP) adalah paradigma pemrograman yang berorientasikan kepada objek yang merupakan suatu metode dalam pembuatan program, dengan tujuan untuk menyelesaikan kompleksnya berbagai masalah program yang terus meningkat. Objek adalah entitas yang memiliki atribut, karakter (bahavour) dan kadang kala disertai kondisi (state). Konsep *Information Hiding, Enkapsulasi, Constructor dan Overloading constructor* sangat bermanfaat di terapkan pada kode yang berorientasi Objek, menggunakan konsep tersebut membuat kode terlebih terstruktur dan mudah untuk dikembangkan. 
