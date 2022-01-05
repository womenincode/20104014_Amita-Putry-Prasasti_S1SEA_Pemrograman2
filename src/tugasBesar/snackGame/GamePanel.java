package tugasBesar.snackGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener{
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
        timer = new Timer(DELAY, this);                                         //Timer sebagai class abstact dengan parameter DELAY
        timer.start();                                                                  //Memanggil objek timer untuk memulai set waktu
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); //kata kunci super                                    //membuat class painComponent
        draw(g);                                                                       //memanggil method draw(g)
    }

    public void draw(Graphics g) {

        if (running) {
            /*for(int i=0;i<SCREEN_HEIGHT/UNIT_SIZE;i++) {                           //perulangan untuk membuat sebuah line/garis untuk mengukur ular dan besar umpan
                g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
                g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
            }*/
            g.setColor(Color.red);
            g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);

            //untuk mengatur snake body (tubuh ular)
            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    g.setColor(new Color(45, 180, 0));                      //mengatur warna body snake dengan 2 warna
                    //g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255))); //mengatur warna body snake dengan banyak warna
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);                     //memberi bentuk pada makanan ular yaitu oval
                }
            }
            g.setColor(Color.WHITE);                                                  //mengatur warna putih pada bacaan skor
            g.setFont(new Font("Arial", Font.BOLD, 40));                    //mengatur font, jenis font, dan ukuran font pada teks Skor
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
        g.setFont( new Font("Ink Free",Font.BOLD, 40));                     //mengatur font, jenis font dan ukuran font text score
        FontMetrics metrics1 = getFontMetrics(g.getFont());                          //pada class FontMetrics ini menggunakan enkapsulasi untuk mendeklarasikan "metrics" untuk mendapatkan font yang diberikan ke method Graphics
        g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());

        //Game Over text
        g.setColor(Color.red);                                                       //mengatur warna merah untuk text game over
        g.setFont( new Font("Ink Free",Font.BOLD, 75));                     //mengatur font, jenis font dan ukuran font text "Game Over"
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
