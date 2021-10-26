# Modul 2 : Dasar Pemrograman Java

## Dasar Teori

<li>Keyword dalam Java</li>
  Kata kunci adalah identifier yang telah dipesan untuk 
didefinisikan  sebelumnya  oleh  Java  untuk  tujuan  tertentu.  Anda  tidak 
dapat  menggunakan  keyword  sebagai  nama  variabel,  class,  method. 
Berikut Ini Keyword Java : 
<br>

| Abstrak | Default | if  | private | throws | 
| ----------- | ----------- | ----------- | ----------- |----------- |
| boolean | do | import | public | Try |
| break | double | int | return | void | 
| byte | else | static | short | while | 
| case | extends | long | super | const | 
| catch | final | native | switch | For | 
| char | finally | new | this | Continue |
| class | float | package | throw | Transient |
  
<li>Tipe Dasar</li>
  Java mempunyai 8 tipe dasar, yaitu boolean, char, byte, short, int, 
long, float, dan double. Spesifikasi panjang bit dan range untuk masing- 
masing tipe adalah sebagai berikut:
<br>

| Tipe | Panjang Bit |  Range |
| ----------- | ----------- | ----------- |
| Boolean | 16  | - | 
| Char  | 16 | 0 – 216-1 |
| Byte  | 8 | -27 – 27-1  | 
| Short | 16  | -215 – 215-1  | 
| Int | 32  | -231 – 231-1 |
| Long | 64 | -263 – 263-1 |
| Float | 32 |  -  |
| Double | 64 | - | 

<br>
Nilai default untuk masing-masing tipe adalah sebagai berikut:

| Tipe | Nilai Default |
| ----------- | ----------- |
| Boolean | False | 
| Char | ‘\u0000’ |
| Byte |  0  | 
| Short | 0 | 
| Int | 0 | 
| Long |  0L |
| Float | 0.0F | 
| Double |  0.0 |

<br>

<li>Variabel</li>
  Variabel  adalah  item  yang  digunakan  data  untuk  menyimpan 
pernyataan  objek.  Variabel  memiliki  tipe  data  dan  nama.  Tipe  data menandakan  tipe  nilai  yang  dapat  dibentuk  oleh  variabel  itu  sendiri. 
Nama variabel harus mengikuti aturan untuk identifier. 
Berikut Aturan penamaan variable :
1. Diawali dengan : huruf/abjad atau karakter mata uang atau underscore(_)
2. Terdiri dari huruf/abjad, angka dan underscore
3. Tidak boleh mengandung karakter khusus atau spasi
4. Tidak boleh diawali dengan angka.

<br></br>
  
<li>Casting dan Promotion</li>
  Casting  diperlukan  untuk  mengkonversi  dari  suatu  tipe  ke  tipe 
data yang lebih kecil panjang bitnya. Sedangkan promotion terjadi pada 
saat mengkonversi dari suatu tipe data ke tipe data yang lebih panjang 
bitnya.
<br>
Contoh :

```
int p = (int) 10L;
long i = 10;
```

<hr>

## Praktikum

Soal :
1. Menganalisa batasan maksimum suatu tipe
2. Anak Ayam
3. A + B - C

Jawaban:
1. [Jawaban Soal No.1](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/BigInteger.java)

#### Penjelasan
```java
long p = 2147483648
```
Sintax diatas jika dicoba akan menampilkan error seperti berikut ini:
```
java: integer number too large: 2147483648
```
Akibat dari error tersebut adalah Data yang berada di variabel P dibaca tipe data integer, sehingga jika ingin mendeklarasikan angka dengan jumlah banyak harus menggunakan huruf (suffix) L kapital, agar angka membaca variabel P dengan tipe data Long dan angka yang diinputkan dapat berjumlah banyak.


2. [Jawaban Soal No.2](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/AnakAyam.java)

#### Penjelasan
```java
  while (anak > 0) {
            System.out.println("Anak ayam turun " + anak);
            anak--;

            if (anak != 0) {
                System.out.println("Mati 1 tinggal " + anak);
            } else {
                System.out.println("Mati 1 tinggal Induknya");
            }
        }
```
Pada Sintax diatas melakukan sebuah pengkondisian untuk melakukan pengurangan secara berulang pada kondisi dimana anak ayam terus berkurang jika anak ayam tidak sama dengan nol (!=0) hingga pada kondisi terakhir, jika anak ayam telah habis di kurang '1', maka yang tersisa adalah "induknya".


3. [Jawaban Soal No.3](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/modul2/src/modul2/latihan/BilanganAbc.java)

#### Penjelasan

Pada sintax di bawah ini merupakan perintah untuk melakukan input data sebanyak data yang diinginkan, kemudian data yang dimasukkan akan disimpan ke dalam variabel array.
```java
 System.out.print("Masukkan Jumlah Testcase: ");
        t = input.nextInt();
        a = new int[t];
        b = new int[t];
        c = new int[t];
        
```
Kemudian, pada sintax di bawah ini yaitu perintah untuk melakukan perulangan dalam menginputkan angka/bilangan pada variabel A, B dan C.
```java
for (int i = 0; i < t; i++) {
            System.out.print("\nMasukkan A" + (i + 1) + " : ");
            a[i] = input.nextInt();
            System.out.print("Masukkan B" + (i + 1) + " : ");
            b[i] = input.nextInt();
            System.out.print("Masukkan C" + (i + 1) + " : ");
            c[i] = input.nextInt();
        }
 ```
 
Dan, terakhir sintax di bawah ini yaitu untuk melakukan pengoperasian dalam penjumlahan dan pengurangan pada angka yang telah di masukkan ke dalam variabel array. Sintax di bawah ini menggunakan perulangan karena data yang dioperasikan lebih dari satu inputan.
```java
for (int i = 0; i < t; i++) {
            System.out.print("\nA" + (i + 1) + " + B" + (i + 1) + " - C" + (i + 1) + " = ");
            System.out.println(a[i] + b[i] - c[i]);
        }
 ```
 
 <hr>
 
 ## Kesimpulan
 
Kesimpulan dari Praktikum Modul 2 ini adalah memperhatikan tipe data dalam pengimplementasian sintax/kode sangat penting diperhatikan, karena jika salah dalam menggunakan tipe data maka program dapat mengalami error dan tidak dapat dijalankan seperti soal nomor 1. 
