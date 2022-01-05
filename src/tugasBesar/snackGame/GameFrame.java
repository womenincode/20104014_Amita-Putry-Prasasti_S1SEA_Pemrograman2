package tugasBesar.snackGame;

import javax.swing.*;

public class GameFrame extends JFrame {
    GameFrame(){
        this.add(new GamePanel());                              //mendeklarasikan object class GamePanel
        this.setTitle("Snack Game - Created by : Amita, Afifa, Raihan, Wahyu");  //memberikan judul pada game panel
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //membuat tombol close untuk game panel
        this.setResizable(false);                               //mengatur ukuran panel tidak dapat di ubah dengan drag kursor
        this.pack();                                            //mengatur tata letak di dalam panel
        this.setVisible(true);                                  //mengatur visibilas panel
        this.setLocationRelativeTo(null);                       //mengatur lokasi jendela panel
    }
}
