package berlari;

import java.util.Scanner;

public class Berlari { //Class

    public static void main(String[] args) { //Method
        Scanner inStr = new Scanner (System.in); //Object
        Scanner inInt = new Scanner (System.in); //Object
        OopBerlari data[] = new OopBerlari[4];
        for (int i=1;i<4;i++){
            data[i]=new OopBerlari();
            System.out.print("Masukkan nama mahasiswa "+(i)+"                      : ");
            data[i].setNama(inStr.nextLine());
            System.out.print("Masukkan NIM mahasiswa "+(i)+"                       : ");
            data[i].setNIM(inStr.nextLine());
            System.out.print("Masukkan jumlah putaran mahasiswa              : ");
            data[i].setJumlahPutaran(inInt.nextInt());
            System.out.print("Masukkan waktu putaran mahasiswa (dalam menit) : "); 
            data[i].setWaktuPutaran(inInt.nextInt());
            System.out.println("=================================================");
        }
        for (int i=1;i<4;i++){
            System.out.print(data[i].getNama()+" ");
            System.out.println(data[i].getHasil());
        }
        if (data[1].getWaktuPutaran()<data[2].getWaktuPutaran())
        {
            if (data[1].getWaktuPutaran()<data[3].getWaktuPutaran())
                System.out.println(data[1].getNama()+" yang tercepat");
            else
                System.out.println(data[3].getNama()+" yang tercepat");
        }
        else
            System.out.println(data[2].getNama()+" yang tercepat");   
    }  
}
