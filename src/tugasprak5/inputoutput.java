package tugasprak5;

import java.util.Scanner;

public class inputoutput {

    String nama;
    float uang;
    int lama;
    float bbiasa, ttl1;
    float bbonus;
    operasi op;
    
    public inputoutput(){
        op = new operasi();
        inputData();
    }
    public void inputData(){
        System.out.println("Selamat Datang Di Aplikasi Proyeksi Perhitungan Tabungan");
        System.out.println("BANK SUKA KAYA");
        System.out.println("Chandra Purnama W - 21120117130070");
        System.out.println("Jeremia J - 21120117140031");
        System.out.println("Kelompok 45 Shift 3");
        Scanner nama1 = new Scanner(System.in);
        System.out.print("Masukkan nama anda = ");
        nama = nama1.next();
        System.out.println("Bunga bank saat ini 5% (flat) tiap bulan ");
        System.out.print("Masukkan jumlah uang yang anda hendak tabung = Rp. ");
        Scanner uang1 = new Scanner(System.in);
        uang = uang1.nextInt();
        System.out.print("Masukkan lama waktu menabung (bulan) ");
        Scanner lama1 = new Scanner(System.in);
        lama = lama1.nextInt();
        op.uang = this.uang;
        op.lama = this.lama; 
    }
    
    public void normal(){
        bbiasa = op.biasa();
    }
    public void bonus(){
        bbonus = op.bonus();
    }
    public void bungatot(){
        ttl1 = op.total1();
    }
    public void tampilbunga(){
        float bungatotal;
        bungatotal = bbonus + bbiasa;
        System.out.println("Bunga biasa (tiap bulan) = "+bbiasa);
        System.out.println("Bunga bonus = "+bbonus);
        System.out.println("Bunga dari bunga biasa = "+ttl1);
        System.out.println("Bunga total (bunga biasa + bunga bonus) = "+bungatotal);
        float totalsemua;
        totalsemua = uang + bungatotal;
        System.out.println("Jadi total tabungan anda adalah = "+totalsemua);
    }
    }
    
