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
