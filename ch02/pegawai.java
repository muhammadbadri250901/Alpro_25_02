package ch02;

public class pegawai{
       String nik;
       String nama;
       String jabatan;
       String isAktif;

       public String getNik() {
           return nik;
       } 

       public String getNama() {
            return nama;
       }

       public String getJabatan() {
            return jabatan;
       }

       public boolean isAktif() {
            return isAktif;            
       }

      
       public void cetak() {
              System.out.println("NIK : " + nik);
              System.out.println("Nama : " + nama);
              System.out.println("Jabatan : " + jabatan);
              System.out.println("Status : " + isAktif);


      }


}