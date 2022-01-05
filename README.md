# 20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2

# Tugas Besar : SnackGame

## Praktikum Pemrograman 2

<hr>

### Daftar Nama Kelompok

| No. | Nama | NIM | Kelas  |
| ----------- | ----------- | ----------- | ----------- |
| 1 | Amita Putry Prasasti | 20104014 | SE-04-A |
| 2 | Afifatunni'mah | 20104007 | SE-04-A |
| 3 | Raihan Febriyansah | 20104102 | SE-04-A |
| 4 | Wahyu Triono | 20104001 | SE-04-A |

<hr>

## Pendahuluan

+  **Pengertian SnackGame**

`SnackGame` adalah sebuah permainan ular sederhana  menggunakan bahasa pemrograman Java OOP (Object Oriented Programming). Konsep permainan ini yaitu si pemain akan mengendalikan sebuah mahluk yang menyerupai ular yang akan bergerak mengitari sebuah bidang berbentuk kotak, dengan tujuan mengambil makanan yang aslinya berbentuk dot atau titik. Selama bermain, si pemain harus berusaha untuk tidak menabrak dinding, karena setiap kali si pemain memakan makanan, ekornya akan bertambah panjang. Kontrol-pun sangat mudah, yakni hanya atas, bawah, kiri dan kanan, ular akan berjalan secara otomatis dan tidak dapat dihentikan.

</br>

+ **Arti Nama 'SnackGame'**

Arti nama dari `SnackGame` yaitu terdiri dari kata `Snack` yang berarti `Camilan` dan `Game` yang berarti `Permainan`. Makna dari dua frasa tersebut yaitu `SnackGame` ini merupakan sebuah game (permainan) yang membawa ular untuk terus memakan umpan (camilan). Sehingga pemain akan membuat ular untuk terus makan agar mendapatkan poin yang besar. Selain itu, pengucapan (improvisasi) kata `Snack` yang mirip dengan kata `Snake` yang berarti Ular. 

</br>

+ **Manfaat dan Tujuan**

Adapun manfaat dan tujuan dari pembuatan "SnackGame" ini yaitu :

| No. | Tujuan | Manfaat |
| ----------- | ----------- | ----------- |
| 1 | Melatih konsentrasi | Menerapkan materi pada Java OOP |
| 2| Melatih kemampuan motorik | Memenuhi Tugas Besar Mata kuliah Praktikum Pemrograman 2 |
| 3 | Mengembangkan kemampuan untuk problem solving | Menciptakan Media yang dapat menghibur |
| 4 | Sebagai media penghibur | - |

<hr>

## Dasar Teori

+ **Java OOP (Object Oriented Programming)**

`Java` adalah bahasa pemrograman yang biasa digunakan untuk mengembangkan bagian back-end dari software, aplikasi Android, dan juga website.  `Java` juga merupakan bahasa pemrograman tingkat tinggi yang berorientasi objek (OOP). `OOP` merupakan kepanjangan dari `Object Oriented Programming`. OOP merupakan suatu metode pemrograman yang berorientasi kepada objek. Dalam bahasa Indonesia OOP dikenal dengan `PBO (Pemrograman Berorientasi Objek)`. OOP bertujuan untuk mempermudah pengembangan sebuah program. Ia memiliki variabel dan fungsi yang dibungkus ke dalam `objek` ataupun `class`. Keduanya dapat saling berinteraksi sehingga membentuk sebuah program.

 </br>

+ **Materi-materi Java OOP**

Berikut ini adalah materi-materi PBO yang diimplementasikan pada pembuatan program `SnackGame` yaitu:

#### 📘 Modul 3 : Pengenalan Pemrograman Berorientasi Objek (PBO)

1. Class ☑️

`Class` bertugas untuk mengumpulkan prosedur/fungsi dan variabel dalam satu tempat. `Class` merupakan blueprint dari sebuah objek atau cetakan untuk membuat objek. Berikut penerapan   Class pada `SnackGame` yaitu:

> Class "MainGame" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/MainGame.java)

```java
package snackGame;

public class MainGame {
...
}
```

> Class "GameFrame" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GameFrame.java)

```java
package snackGame;
public class GameFrame extends JFrame {
...
}

```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {    
...
}
```

</br>

2. Atribut ☑️

`Atribut` merupakan bagian dari sebuah kelas yang masih berhubungan erat dari kelas tersebut. Atribut bisa juga disebut sebagai properti atau properties dari sebuah class. Penerapan Atribut pada `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
public class GamePanel extends JPanel implements ActionListener {                  
    static final int SCREEN_WIDTH = 600;                                              
    static final int SCREEN_HEIGHT = 600;                                        
    static final int UNIT_SIZE = 25;                                              
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE); 
    static final int DELAY = 175;                                                      
    final int x[] = new int[GAME_UNITS];                                                
    final int y[] = new int[GAME_UNITS];                                                
    private int bodyParts = 6;                                                          
    private int applesEaten;                                                            
    private int appleX;                                                                 
    private int appleY;                                                               
    private boolean running = false;                                                    
    private char direction = 'R';    
    
    ....
}
```

</br>

3. Method ☑️

`Method` berperan menjelaskan bagaimana suatu atribut beraksi. Peran yang dimaksud berupa tingkah laku (behavior) yang dapat digambarkan oleh suatu method. Penerapan Method-method pada Program `SnackGame` yaitu:

> Class "MainGame" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/MainGame.java)

```java
package snackGame;

public class MainGame {
    //method main
    public static void main(String[] args) {
        ...
    }
}

```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {                      

    public GamePanel () {
      ...
    }

    public void startGame() {
       ...
    }

    public void paintComponent(Graphics g) {
        ...
    }

    public void draw(Graphics g) {
       ...
    }

    public void newApple() {
        ...
    }

    public void move() {
        ...
    }

    public void checkApple() {                                                      
        ...
    }

    public void checkCollisions() {                                               
       ...
    }

    public void gameOver(Graphics g) {
        ...
    }

    @Override
    public void actionPerformed(ActionEvent e) {                                
        ...
    }

    //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        ...
    }
}

```
</br>

4. Object ☑️

`Objek` (Object) adalah sebuah variabel instance yang merupakan wujud dari class. `Instance` merupakan wujud dari sebuah kelas. Sebuah objek digambarkan dengan `variable` dan `method`.
Penerapan Object pada program `SnackGame` yaitu:

> Class "GameFrame" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GameFrame.java)

```java
package snackGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame(){
        //mendeklarasikan object class GamePanel
        this.add(new GamePanel());
    }
}
```

</br>

####  📘 Modul 4 : Dasar Pemrograman Berorientasi Objek (PBO)

1. Information Hiding ☑️

`Information Hiding` adalah menyembunyikan attribute suatu objek dari objek lain. Informasi dari `class` disembunyikan dari anggota-anggota lainnya agar 'class' lain tidak dapat mengaksesnya. Implementasi pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
    private int bodyParts = 6;                      
    private int applesEaten;                        
    private int appleX;
    private int appleY;                     
    private boolean running = false;                
    private char direction = 'R';                 
```

2. Encapsulation (Enkapsulasi) ☑️

`Encapsulation` (Enkapsulasi) adalah suatu cara untuk menyembunyikan implementasi detail dari suatu class. Enkapsulasi mempunyai dua hal mendasar, yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
public void draw(Graphics g) {
   ...
   //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
   FontMetrics metrics = getFontMetrics(g.getFont());
   ...
    }
    
public void gameOver(Graphics g) {
        //Score
        ...
        //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
        FontMetrics metrics1 = getFontMetrics(g.getFont());                          
        g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
        ...
        
        //Game Over text
        ...
        //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
        FontMetrics metrics2 = getFontMetrics(g.getFont());                          
        ...
    }
```

</br>

3. Constructor ☑️

`Constructor` adalah suatu method yang pertama kali dijalankan pada saat pembuatan suatu obyek. Konstruktor ini merupakan method yang berfungsi untuk menginisialisasi variabel-variabel instans yang akan di miliki oleh objek. Konstruktor dipanggil pada saat proses instansiasi kelas menjadi objek. Berikut penerapan `constructor` pada program `SnackGame` yaitu:

> Class "GameFrame" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GameFrame.java)

```java
package snackGame;

public class GameFrame extends JFrame {  //Class

    GameFrame(){  // ini adalah constructor
        ...  // isi dari constructor
    }
       // isi dari class
}
```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {  //Class                    

    public GamePanel () {   //ini adalah constructor
      ...  // isi constructor
    }
      // isi dari class
 }
 ```
 
 </br>

#### 📘 Modul 5 : Mengelola Class

1. Kata kunci "This" ☑️

Kata kunci ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci `this` sangat berguna untuk menunjukkan suatu member dalam class-nya sendiri. `This` dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk konstruktor. Berikut penerapan pada program `SnackGame` yaitu:

> Class "GameFrame" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GameFrame.java)

```java
package snackGame;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());                              
        this.setTitle("Snack Game - Created by : Kelompok 3");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_ CLOSE);    
        this.setResizable(false);                               
        this.pack();                                            
        this.setVisible(true);                                  
        this.setLocationRelativeTo(null);                       
    }
    
}
```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
package snackGame;

public class GamePanel extends JPanel implements ActionListener {                  

    public GamePanel () {   
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));              
        this.setBackground(Color.DARK_GRAY);                                            
        this.setFocusable(true);                                                        
        this.addKeyListener(new MyKeyAdapter());
    }
    
 }
 ```
</br>

#### 📘 Modul 6 : Konsep Inheritance

1. Inheritance ☑️

`Inheritance` merupakan salah satu dari 4 konsep Pemrograman Java yang fundamental Java. Inheritance bersifat krusial karena memiliki efek langsung pada bagaimana mendesain class-class. Konsep ini sebenarnya memiliki tujuan yaitu ketika membuat suatu class maka hanya perlu menspesifikasikan apa yang menjadi perbedaan antara suatu class dengan class lainnya, kemudian secara otomatis Inheritance ini akan memberikan akses otomatis terhadap informasi yang terkandung dari class lainnya. Keyword untuk Inheritance atau pewarisan adalah "Extends". Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
package snackGame;

//Inheritance
public class GamePanel extends JPanel implements ActionListener {                  
      ...
       //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        @Override                                                        
        public void keyPressed(KeyEvent e) {
           
             
        }
    }
 }
 ```
 </br>
 
2. Kata kunci "Super" ☑️

Kata kunci `"Super"` dipakai untuk merujuk pada member dari Parent Class, bagaimana kata kunci this yang dipakai untuk merujuk pada anggota dari class itu sendiri.  Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
package snackGame;

//Inheritance
public class GamePanel extends JPanel implements ActionListener {                  
      ...
    public void paintComponent(Graphics g) {
        super.paintComponent(g); //kata kunci super                                    
        draw(g);                                                           
    }
}
```

</br>

#### 📘 Modul 7 : Overloading dan Overriding

1. Overriding ☑️

`Overriding` merupakan suatu keadaan dimana kelas anak dapat mengubah atau bisa kita bilang memodifikasi atau memperluas data dan method pada kelas induk. Keuntungan Overriding : dapat menambahkan sifat / atribut pada kelas induk nya. Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

`Parent Class : `

> Class "KeyAdapter.java"

```java
public abstract class KeyAdapter implements KeyListener {
    
    public void keyPressed(KeyEvent e) {
    ...
    }
    
}
```

`Parent Class : `

> Class Interface "ActionListener.java"

```java
public interface ActionListener extends EventListener {

    public void actionPerformed(ActionEvent e);

}
```

`SubClass :`

```java
 //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        //Overriding method KeyPressed
        @Override                                                                   
        public void keyPressed(KeyEvent e) {
        ...
        }    
    }
     
    //Overriding pada method actionPerformed yaitu untuk memulai berjalannya game
    @Override
    public void actionPerformed(ActionEvent e) {                                   
       ...
    }
```

</br>

#### 📘 Modul 8 : Polimorfisme

1. Polimorfisme ☑️

`Polymorphism` (polimorfisme) adalah kemampuan untuk mempunyai beberapa bentuk class yang berbeda. Polimorfisme ini terjadi pada saat suatu obyek bertipe parent class, akan tetapi pemanggilan constructornya melalui `subclass`. Berikut penerapan pada program `SnackGame` yaitu:

`Parent Class : `

> Class "KeyAdapter.java"

```java
public abstract class KeyAdapter implements KeyListener {
    
    public void keyPressed(KeyEvent e) {
    ...
    }
    
}
```

`Parent Class : `

> Class Interface "ActionListener.java"

```java
public interface ActionListener extends EventListener {

    public void actionPerformed(ActionEvent e);

}
```

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

`SubClass :`

```java
 //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        //Overriding method KeyPressed
        @Override                                                                   
        public void keyPressed(KeyEvent e) {
        ...
        }    
    }
     
    //Overriding pada method actionPerformed yaitu untuk memulai berjalannya game
    @Override
    public void actionPerformed(ActionEvent e) {                                   
       ...
    }
```

</br>  

#### 📘 Modul 9 : Exception

1. Blcok try-catch ☑️

Untuk menangani Exception dalam program, dengan meletakkan kode program yang memungkinkan terjadinya exception di dalam `blok-try`, diikuti dengan blok catch yang menentukan jenis exception yang ingin ditangani. Berikut penerapan pada program `SnackGame` yaitu:

> Class "GamePanel" [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)

```java
package snackGame;

//Inheritance
public class GamePanel extends JPanel implements ActionListener {                  
      ...
        // block try-catch
        try {
            if(x[0] < 0) {                                                           //mengecek apabila kepala ular menyentuh dinding kiri
                running = false;
            }
            if(x[0] > SCREEN_WIDTH) {                                                //mengecek apabila kepala ular menyentuh dinding kanan
                running = false;
            }
            if(y[0] < 0) {                                                           //mengecek apabila kepala ular menyentuh dindisng atas
                running = false;
            }
            if(y[0] > SCREEN_HEIGHT) {                                               //mengecek apabila kepala ular menyentuh dinding bawah
                running = false;
            }
        } catch (Exception e) {                                                      //apabila ular tidak berjalan, maka berhenti.
            if(!running) {
                timer.stop();
            }
        }                                                         
    }
}
```

</br>

+ **Tools yang Digunakan**

Adapun tools yang digunakan pada pemrograman `SnackGame` yaitu `IntelliJ IDEA` (Intelligent Code Editor). `IntelliJ IDEA` memiliki editor yang mendukung code completion, sebuah fitur yang dapat membantu kita untuk menuliskan kode dengan cepat. `IntelliJ IDEA` menganalisa konteks dari kode yang ditulis sehingga dapat memberikan saran penyelesaian pengetikan kode dengan tepat. Selain itu, `IntelliJ IDEA` mendukung refactoring yang saling terintegrasi yang memudahkan kita untuk meminimalisir kesalahan yang terjadi ketika adanya perubahan dalam proyek yang sedang dikembangkan.

<hr>

## Implementasi

`Source Code Program`

+ **Class MainGame.java [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/MainGame.java)**

```java
package snackGame;

public class MainGame {

    public static void main(String[] args) {
        //Memanggil Class GameFrame
        new GameFrame();
    }
}
```

+ **Class GameFrame.java [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GameFrame.java)**

```java
package snackGame;

import javax.swing.JFrame;

public class GameFrame extends JFrame {

    GameFrame(){
        this.add(new GamePanel());                                              //mendeklarasikan object class GamePanel
        this.setTitle("Snack Game - Created by : Amita, Afifa, Raihan, Wahyu"); //memberikan judul pada game panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);                    //membuat tombol close untuk game panel
        this.setResizable(false);                                               //mengatur ukuran panel tidak dapat di ubah dengan drag kursor
        this.pack();                                                            //mengatur tata letak di dalam panel
        this.setVisible(true);                                                  //mengatur visibilas panel
        this.setLocationRelativeTo(null);                                       //mengatur lokasi jendela panel
    }
}
```

+ **Class GamePanel.java [(Link here)](https://github.com/womenincode/20104014_Amita-Putry-Prasasti_S1SEA_Pemrograman2/blob/tugasBesar/src/tugasBesar/snackGame/GamePanel.java)**

```java
package snackGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {                       //Kelas GamePanel mewarisi kelas JPanel dan Implement pada interface ActionListener
    static final int SCREEN_WIDTH = 600;                                                //ukuran untuk panjang layar panel game
    static final int SCREEN_HEIGHT = 600;                                               //ukuran untuk lebar layar panel game
    static final int UNIT_SIZE = 25;                                                    //menentukan ukuran lebar ular dan umpan
    static final int GAME_UNITS = (SCREEN_WIDTH*SCREEN_HEIGHT)/(UNIT_SIZE*UNIT_SIZE);   //membagi ukuran cell pada layar panel
    static final int DELAY = 175;                                                       //Menentukan kecepatan laju ular
    final int x[] = new int[GAME_UNITS];                                                //mendeklarasikan variabel array x untuk menyimpan data ukuran bidang panel
    final int y[] = new int[GAME_UNITS];                                                //mendeklarasikan variabel array y untuk menyimpan data ukuran panjang dan dimensi ular
    private int bodyParts = 6;                                                          //menginisiasilasikan block untuk badan ular
    private int applesEaten;                                                            //variabel untuk mengatur makanan yang dimakan ular yang di mulai dari 0
    private int appleX;                                                                 //varibel x untuk makanan ular
    private int appleY;                                                                 //variabel y untuk makanan ular
    private boolean running = false;                                                    //nilai boolean untuk mengecek kondisi berjalannya game
    private char direction = 'R';                                                       //mendeklarasikan variabel "R" untuk memberikan arah ular yang bergerak ke arah yang benar
    Timer timer;                                                                        //variabel pengatur waktu untuk mengatur kecepatan bergeraknya ular
    Random random;                                                                      //variabel random berasal dari Random Function yang mengatur letak makanan ular

    public GamePanel () {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));              //mengatur dimensi panel
        this.setBackground(Color.DARK_GRAY);                                            //mengatur warna bakground panel
        this.setFocusable(true);                                                        //untuk mengaktifkan komponen di dalam panel dengan menyatakan nilai boolean di dalamnya
        this.addKeyListener(new MyKeyAdapter());                                        //membuat class MyKeyAdapter dan menambahkan KeyListener untuk mengambil respon
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;                                                                 //menyatakan dalam memulai running program
        timer = new Timer(DELAY, this);                                                 //Timer sebagai class abstact dengan parameter DELAY
        timer.start();                                                                  //Memanggil objek timer untuk memulai set waktu
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); //kata kunci super                                    //membuat class painComponent
        draw(g);                                                                       //memanggil method draw(g)
    }

    public void draw(Graphics g) {

        if (running) {
            for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {                              //perulangan untuk membuat sebuah line/garis untuk mengukur ular dan besar umpan
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
            }
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            //untuk mengatur snake body (tubuh ular)
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));                                //mengatur warna body snake dengan 2 warna
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255))); //mengatur warna body snake dengan banyak warna
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);                     //memberi bentuk pada makanan ular yaitu oval
                }
            }
            g.setColor(Color.WHITE);                                                  //mengatur warna putih pada bacaan skor
            g.setFont(new Font("Arial", Font.BOLD, 40));                              //mengatur font, jenis font, dan ukuran font pada teks Skor
            FontMetrics metrics = getFontMetrics(g.getFont());                        //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
            g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize()); //memberikan perintah kepada skor untuk menghitung makanan yang di makan ular
        } else {
            gameOver(g);                                                              //jika kondisi di atas tidak berjalan maka akan menjalankan method gameOver;
        }
    }

    public void newApple() {
        appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;             //untuk memunculkan makanan baru untuk ular secara random
        appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;            //memiliki fungsi yang sama pada appleX pada sisi yang berbeda
    }

    public void move() {
        for (int i = bodyParts; i>0; i--) {                                           //perintah untuk membuat panjang ular terus menerus,
            x[i] = x[i - 1];                                                          //nilai sumbu x dan y yang merupakan array tempat untuk menyimpan panjang ular
            y[i] = y[i - 1];
        }

        //untuk menjalankan perintah berjalannya ular
        switch (direction) {
            case 'U':                                                                //apabila menekan tombol atas/up maka ular akan berjalan ke arah atas
                y[0] = y[0] - UNIT_SIZE;
                break;
            case 'D':                                                                //apabila menekan tombol bawah/down maka ular akan berjalan ke arah bawah
                y[0] = y[0] + UNIT_SIZE;
                break;
            case 'L':                                                                //apabila menekan tombol kiri/left maka ular akan berjalan ke arah kiri
                x[0] = x[0] - UNIT_SIZE;
                break;
            case 'R':                                                                //apabila menekan tombol kanan/right maka ular akan berjalan ke arah kanan
                x[0] = x[0] + UNIT_SIZE;
                break;
        }
    }

    public void checkApple() {                                                       //method ini untuk mengecek apakah ular memakan makanan atau tidak
        if ((x[0] == appleX) && (y[0] == appleY)) {                                  //disini karena array x dan y memasukkan ukuran ular, maka jika posisi kepala ular sama dengan posisi makanannya maka ular harus memakannya
            bodyParts++;                                                             //kemudian, saat ular memakan makanannya maka panjang ular akan bertambah 1
            applesEaten++;                                                           //kemudian makanan akan di hitung ke dalam skor
            newApple();                                                              //selanjutnya akan memunculkan makanan baru
        }
    }

    public void checkCollisions() {                                                  //memeriksa tabrakan kepala ular pada dinding panel
        for(int i = bodyParts;i>0;i--) {
            if((x[0] == x[i])&& (y[0] == y[i])) {
                running = false;
            }
        }
        // block try-catch
        try {
            if(x[0] < 0) {                                                           //mengecek apabila kepala ular menyentuh dinding kiri
                running = false;
            }
            if(x[0] > SCREEN_WIDTH) {                                                //mengecek apabila kepala ular menyentuh dinding kanan
                running = false;
            }
            if(y[0] < 0) {                                                           //mengecek apabila kepala ular menyentuh dindisng atas
                running = false;
            }
            if(y[0] > SCREEN_HEIGHT) {                                               //mengecek apabila kepala ular menyentuh dinding bawah
                running = false;
            }
        } catch (Exception e) {                                                      //apabila ular tidak berjalan, maka berhenti.
            if(!running) {
                timer.stop();
            }
        }
    }

    public void gameOver(Graphics g) {
        //Score
        g.setColor(Color.red);                                                       //mengatur warna merah untuk text score
        g.setFont( new Font("Ink Free",Font.BOLD, 40));                              //mengatur font, jenis font dan ukuran font text score
        FontMetrics metrics1 = getFontMetrics(g.getFont());                          //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
        g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());

        //Game Over text
        g.setColor(Color.red);                                                       //mengatur warna merah untuk text game over
        g.setFont( new Font("Ink Free",Font.BOLD, 75));                              //mengatur font, jenis font dan ukuran font text "Game Over"
        FontMetrics metrics2 = getFontMetrics(g.getFont());                          //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
        g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2); //menampilkan text game over
    }

    @Override
    public void actionPerformed(ActionEvent e) {                                     //Overriding pada method actionPerformed yaitu untuk memulai berjalannya game
        if (running) {                                                               //jika ular dapat berjalan, maka
            move();                                                                  //memanggil method move
            checkApple();                                                            //memanggil method checkApple
            checkCollisions();                                                       //memanggil method 'checkCollisions' untuk menggerakkan kepala ular
        }
        repaint();
    }

    //inner class (inheritance)
    public class MyKeyAdapter extends KeyAdapter{
        @Override                                                                    //Overriding method KeyPressed
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:                                               //untuk mengarahkan ular ke arah kiri
                    if (direction !='R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:                                              //untuk mengarahkan ular ke arah kanan
                    if (direction !='L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:                                                 //untuk mengarahkan ular ke arah atas
                    if (direction !='D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:                                              //untuk mengarakan ular ke arah bawah
                    if (direction !='U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}

```

</br>

`Demo Program`

**Demo Program SnackGame dapat dilihat [disini.](https://drive.google.com/file/d/1aq7i-R2OW24rgE8T9YhJdxERZSN8A3Wl/view?usp=sharing)**

<hr>

## Kesimpulan

Kesimpulan dari pembuatan program `SnackGame` menggunakan bahasa pemrograman Java berbasis OOP (Object Oriented Programming) bahwa dengan menerapkan materi Pemrograman Berorientasi Objek dapat mempermudah dalam penulisan kode program. Konsep OOP adalah paradigma pemrograman yang berorientasikan kepada objek yang merupakan suatu metode dalam pembuatan program, dengan tujuan untuk menyelesaikan kompleksnya berbagai masalah program yang terus meningkat. Konsep `Information Hiding`, `Enkapsulasi`, `Constructor`, `Overriding constructor`, `kata kunci This`, `Inheritance`, `Polimorfisme`, dan `Exception` sangat bermanfaat di terapkan pada kode yang berorientasi Objek, menggunakan konsep-konsep tersebut membuat kode terlebih terstruktur dan mudah untuk dikembangkan.
