# Modul 5 : Konsep Inheritance

## Praktikum Pemrograman 2

<hr>

## Dasar Teori

**<li>Pengertian Inheritance</li>**

Inheritance merupakan salah satu dari 4 konsep Pemrograman Java yang fundamental selain dari Encapsulation, Polymorphism dan Abstraction. Inheritance bersifat krusial karena memiliki efek langsung pada bagaimana mendesain class-class.

Konsep ini sebenarnya memiliki tujuan yaitu ketika membuat suatu class maka hanya perlu menspesifikasikan apa yang menjadi perbedaan antara suatu class dengan class lainnya, kemudian secara otomatis Inheritance ini akan memberikan akses otomatis terhadap informasi yang terkandung dari class lainnya. Keyword untuk Inheritance atau **pewarisan** adalah **"Extends"**.

Class yang mewariskan disebut dengan ***Superclass*** dan class yang menerima pewarisan disebut dengan ***Subclass***.

Contoh implementasinya seperti berikut ini:

```java
public class B extends A {
...
}
```

Penjelasan:

Contoh di atas memberitahukan kompiler Java bahwa kita ingin mengextend class A ke class B. Dimana class B merupakan sebuah ***Subclass*** (class turunan) dari class A. Sedangkan class A merupakan "parent class" dari class B.

Java hanya memperkenankan adanya "Single Inheritance". Konsep ini hanya memperbolehkan suatu subclass mempunyai satu parent class. dengan konsep single inheritance ini, masalah pewarisan akan dapat diamati dengan mudah.

Suatu Parent Class dapat tidak mewariskan sebagian anggotanya kepada ***subclass***-nya. Sejauh mana anggota dapat diwariskan ke class lain, ataupun suatu member dapat diakses dari class lain, sangat berhubungan dengan ***access control*** (kontrol pengaksesan). Di dalam Java, access control dapat digambarkan dalam tabel seperti berikut ini:

| Modifier | Class yang sama |  Package yang sama | Subclass  | Class manapun |
| ----------- | ----------- | ----------- | ----------- | ----------- |
| private | ✔️ |  |  |  | 
| default | ✔️ | ✔️ |  |  |
| protected | ✔️ | ✔️ | ✔️ |  |
| public | ✔️ | ✔️ | ✔️ | ✔️ |

Kata kunci "Super" dipakai untuk merujuk pada member dari ***Parent Class***, bagaimana kata kunci ***this*** yang dipakai untuk merujuk pada anggota dari class itu sendiri.

Berikut ini beberapa hal yang harus diingat ketika menggunakan pemanggilan construktor super yaitu:

1. Pemanggil super() => harus dijadikan pernyataan pertama dalam Constructor.
2. Pemanggil super() => hanya dapat digunakan dalam definisi Constructor.
3. Termasuk construktor this() dan pemanggil super() => tidak boleh terjadi dalam Constructor yang sama.

Contohnya seperti ini:

```java
public class Siswa {

  private int nilai;
  
  public setNilai(int nilai) {
    this.nilai=nilai;
  }
  
}
```
<hr>

## Praktikum

### 1. Percobaan (1)

**Menggunakan kata kunci super**

> Berikut ini listing penggunaan kata kunci super untuk membedakan atribut superclass dengan atribut subclass.

Code:

> Class Bentuk : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/Bentuk.java)

```java
package modul6.percobaan;

public class Bentuk {
    protected int p, l;
}

```

> Class Persegi : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/Persegi.java)

```java
package modul6.percobaan;

public class Persegi extends Bentuk {
    protected int p, l;

    public void setSuperP(int p){
        super.p = p;
    }

    public  void setSuperL(int l){
        super.l = l;
    }

    public void setP(int p){
        this.p = p;
    }

    public void setL(int l){
        this.l = l;
    }

    public void getLuas(){
        System.out.println("Luas Super\t: " + (super.p * super.l));
        System.out.println("Luas\t\t: " + (this.p * this.l));
    }
}
```

> Class PersegiTest : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/PersegiTest.java)

```java
package modul6.percobaan;

public class PersegiTest {
    public static void main(String[] args) {
        Persegi kotak = new Persegi();

        kotak.setSuperP(5);
        kotak.setSuperL(10);

        kotak.setP(3);
        kotak.setL(13);

        kotak.getLuas();
    }
}

```

Output Percobaan 1:
```
Luas Super : 50
Luas : 39
```


### 2. Percobaan (2)

**Mendefinisikan Superclass dan Subclass**
> Buatlah 3 Class dalam Project kalian kemudian beri nama dan isi sebagai berikut:

Code:

> Class Person : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/Person.java)

```java
package modul6.percobaan;

public class Person {
    protected String name;
    protected String address;

    public Person(){
        System.out.println("Inside Person : Constructor");
        name = " ";
        address = " ";
    }

    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
```

> Class Student : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/Student.java)

```java
package modul6.percobaan;

public class Student extends Person{
    public Student(){
//        super("ini nama", "ini alamat");
//        super();
        System.out.println("Inside Student : Constructor");
    }
```

> Class InheritDemo : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/InheritDemo.java)

```java
package modul6.percobaan;

public class InheritDemo {
    public static void main(String[] args) {
        Student siswa = new Student();

    }
}
```

Output Percobaan 2:

```
Inside Person:Constructor
Inside Student:Constructor
```

### 3. Percobaan (3)

**Kontrol Pengaksesan**

> Cobalah listing program berikut ini:

Code:

> Class B : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/B.java)

```java
package modul6.percobaan;

public class B extends A{
    private int z;

    public void setZ(int z) {
        this.z = z;
    }

    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
}
```

> Class A : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/A.java)

```java
package modul6.percobaan;

public class A {
//  private int x;  -> ini salah karena bersifat private sehingga tidak dapat dipanggil pada class lain
//  private int y;  -> ini salah karena bersifat private sehingga tidak dapat dipanggil pada class lain
    protected int x;
    protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void getNilai(){
        System.out.println("nilai x : " + x + " nilai y : " + y);
    }
}
```

> Class InheritanceTest : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/InheritanceTest.java)

```java
package modul6.percobaan;

public class InheritanceTest {
    public static void main(String[] args) {
        A ortu = new A();
        B anak = new B();

        System.out.println("Superclass");
        ortu.setX(10);
        ortu.setY(20);
        ortu.getNilai();

        System.out.println("\nSubclass");
        anak.setX(5);
        anak.setY(4);
        anak.setZ(50);
        anak.getNilai();
        anak.getJumlah();
    }
}
```

Output Percobaan 3:
```
Superclass
nilai x : 10 nilai y : 20

Subclass
nilai x : 5 nilai y : 4
Jumlah : 59

Process finished with exit code 0
```

### 4. Percobaan (4)

**Konstruktor tidak diwariskan**

> Buatlah class kosong bernama Parent seperti berikut ini:

Code:

> Class Parent : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/Parent.java)

```java
package modul6.percobaan;

public class Parent {

}
```

> Class Child : [File disini](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul6/src/modul6/percobaan/Child.java)

```java
package modul6.percobaan;

public class Child extends Parent{
    int x;

    public Child(){
        super();
        x = 5;
      // super(); -> pemanggilan konstruktor harus di baris pertama pada subclass
    }
}
```

<hr>

## Kesimpulan

Kesimpulan dari Praktikum Konsep Inheritance ini bahwa keuntungan menggunakan konsep Inheritance adalah menghindari adanya penggunakan kode yang sama atau duplikat pada ***subclass***, karena ***subclass*** bisa menggunakan method yang dimiliki oleh ***superclass*** atau disebut pada Java dikenal dengan ***Overriding Method***. Pengimplementasian pada kode dapat mengurangi jumlah kode pemrograman dan proses koding akan lebih clear sehingga mudah dipahami. Konsep ini mempermudah para programmer untuk memperluas suatu objek tanpa harus membuat fungsi baru. 😊






