# Modul 7 : Overloading Dan Overriding

## Praktikum Pemrograman 2

<hr>

## Dasar Teori

**<li>Overloading</li>**

Overloading merupakan suatu Function yang memiliki parameter, dan function tersebut dapat memiliki nama function yang sama dengan yang lainnya dengan syarat jumlah parameter mesti berbeda atau bisa situasi di mana beberapa rutin dalam sebuah program dapat mempunyai nama sama tetapi berbeda jenis parameter dan/atau jenis return value.

Ciri-ciri Overloading yaitu:

1. Nama Method harus sama
2. Daftar parameter harus berbeda
3. Return type boleh sama,juga boleh berbeda.

Contohnya:
```java
public void print( String temp) {
  System.out.println("Name:" + name);
  System.out.println("Address:" + address); 
  System.out.println("Age:" + age);
}

public void print(double eGrade, double mGrade, doublesGrade) {
  System.out.println("Name:" + name);
  System.out.println("Math Grade:" + mGrade);
  System.out.println("English Grade:" + eGrade);
  System.out.println("Science Grade:" + sGrade);
}
```

</br>


**<li>Overriding</li>**

Overriding merupakan suatu keadaan dimana kelas anak dapat mengubah atau bisa kita bilang memodifikasi atau memperluas data dan method pada kelas induk.
Keuntungan Overriding : dapat menambahkan sifat / atribut pada kelas induk nya.

Ciri-ciri Overriding yaitu:

1. Nama Method harus sama
2. Daftar parameter harus sama
3. Return type harus sama

Contohnya:
```java
//Parent Class
class Dulu {
  public String RupiahVsDolar() {
  System.out.println(“Rp 10.000”);
  }
}

//Child Class/Sub Class
class Sekarang extends Dulu {
  public String RupiahVsDolar() {
  System.out.println(“Rp 14.000”);
  }
}
```

</br>
<hr>

## Praktikum


**1. Percobaan (1)**

**Melakukan Overloading pada Method**

***Soal: Tulislah listing program berikut ini dan amati yang terjadi pada saat terjadinya overloading pada method.***

> Class A (Parent Class) : [File here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/A.java)

```java
package modul7.percobaan;

public class A {

}
```

> Class B (Sub Class) : [File here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/B.java)

```java
package modul7.percobaan;

public class B extends A{
}
```

> Class C (Sub Class) : [File here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/C.java)
```java
package modul7.percobaan;

public class C extends B{
}
```

> Class Overload : [File here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/Overload.java)

```java
package modul7.percobaan;

public class Overload {
    void myOverload(A a) {
        System.out.println("Overload.myOverload(A a)");
    }

    void myOverload(B b) {
        System.out.println("Overload.myOverload(B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload();
        C c = new C();

        o.myOverload(c);
    }
}
```

Output:

> "C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" ...
> 
> Overload.myOverload(B b)
> 
> Process finished with exit code 0

Penjelasan class Overload:
> 
> Statement di atas akan menjalankan myOverload(B b), karena method tersebut lebih "dekat" dengan method yang dicari bila dibandingkan dengan myOverload(A a).

</br>

**2. Percobaan (2)**

**Melakukan Overloading pada method.**

***Soal: Tulislah listing program berikut ini dan amati yang terjadi pada saat
terjadinya overloading pada method.***

> Class Overload1 : [Link here](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul7/src/modul7/percobaan/Overload1.java)

```java
package modul7.percobaan;

public class Overload1 {
    void myMethod(short a) {
        System.out.println("short");
    }

    void myMethod(int i){
        System.out.println("int");
    }

    void myMethod(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
    }
}
```

Output:

> "C:\Program Files\Java\jdk1.8.0_281\bin\java.exe" ...
> 
> short
> 
> Process finished with exit code 0

Penjelasan Class Overload1:

> Statement di atas akan menjalankan hasil(output) "short" karena variabel yang dipanggil yaitu 'b' bertipe data byte. Tipe data byte berdekatan dengan tipe data short.

</br>
<hr>

## Kesimpulan

Kesimpulan dari Praktikum Overloading dan Overriding ini yaitu ***Overloading*** dan ***Overriding*** merupakan istilah yang sering terdengar di dalam konsep pemrograman yang beriorientasi objek atau PBO. ***Overloading*** dan ***Overriding*** memiliki manfaat dan kegunaan yang sangat banyak dimana dapat membuat sebuah program dengan terstruktur yang baik dan lebih mudah dibandingkan dengan pemrograman prosedural. ***Overloading*** adalah sebuah konsep pemrograman di mana beberapa method dengan nama yang sama pada suatu kelas namun memiliki parameter yang berbeda. Sedangkan ***Overriding*** adalah sebuah kondisi dimana method ada di class utama (Parent Class) digunakan kembali pada Sub Class (class anak). ***Overloading*** biasanya terjadi pada method-method dengan class yang sama, sedangkan ***Overriding*** biasanya terjadi pada method dengan class yang berbeda dan lebih identik dengan konsep pewarisan (inheritance).

