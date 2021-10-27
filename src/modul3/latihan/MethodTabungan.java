package modul3.latihan;

public class MethodTabungan {
    int saldo;

    public MethodTabungan(int saldo){
        this.saldo = saldo;
    }

    public int getSaldo(){
        return saldo;
    }

    public int simpanUang(int jumlah){
        return saldo = saldo + jumlah;
    }

    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah < 0) {
            return false;
        } else {
            saldo -= jumlah;
            return true;
        }
    }

}
