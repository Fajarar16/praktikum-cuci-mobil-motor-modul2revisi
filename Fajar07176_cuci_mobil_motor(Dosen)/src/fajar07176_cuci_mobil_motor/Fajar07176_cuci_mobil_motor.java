package fajar07176_cuci_mobil_motor;

import Entity.*;
import Model.*;
import java.util.Scanner;

public class Fajar07176_cuci_mobil_motor {
    private static fajar07176_MobilModel mobilModel = new fajar07176_MobilModel();
    private static fajar07176_MotorModel motorModel = new fajar07176_MotorModel();
    static Scanner input = new Scanner(System.in);
    
public static void main(String[] args) {
    
    System.out.println("Selamat Datang di tempat cuci motor&mobil");
    int fajar07176_pilih;
    int fajar07176_pil;
    do{
        System.out.println("Pilih Menu :"
                          +"\n1. Input Data"
                          +"\n2. Tampilkan Data"
                          +"\n3. Hapus Data"
                          +"\n4. Update Data"
                          +"\n5. Exit");
        System.out.print("Pilih : ");
        fajar07176_pilih = input.nextInt();
        switch(fajar07176_pilih){
            
                case 1 : System.out.println("1. Data Motor"+"\n2. Data Mobil");
                         System.out.print("Pilih 1/2 : ");
                         fajar07176_pil = input.nextInt();
                         if(fajar07176_pil==1){
                                fajar07176_inputMotor();
                         }else if(fajar07176_pil==2){
                                fajar07176_inputMobil();
                         }else{
                                System.out.println("Pilihan tidak ada");
                         }break;
                case 2 : System.out.println("Tampilan data cuci motor&mobil");
                         fajar07176_view();
                         break;
                case 3 : System.out.println("1. Data Motor"+"\n2. Data Mobil");
                         System.out.print("Pilih 1/2 : ");
                         fajar07176_hapus();
                         break;
                case 4 : System.out.println("1. Data Motor"+"\n2. Data Mobil");
                         System.out.print("Pilih 1/2 : ");
                         fajar07176_update();
                         break;
                }
        }while(fajar07176_pilih!=5);
  }  
    static void fajar07176_inputMotor(){
        System.out.print("Masukan Nomer motor: ");
        String fajar07176_nomormotor = input.next();
        System.out.print("Masukan Pemilik motor: ");
        String fajar07176_pemilikmotor = input.next();
        System.out.print("Masukan Merek motor: ");
        String fajar07176_merekmotor = input.next();
        System.out.print("Masukan warna motor: ");
        String fajar07176_warnamotor = input.next();
        motorModel.insertMotor07176(new Fajar07176_MotorEntity(fajar07176_nomormotor,fajar07176_pemilikmotor,fajar07176_merekmotor,fajar07176_warnamotor));
    }
    static void fajar07176_inputMobil(){
        System.out.println("Masukan Nomer Mobil");
        String fajar07176_nomormobil = input.next();
        System.out.println("Masukan Pemilik Mobil");
        String fajar07176_pemilikmobil = input.next();
        System.out.println("Masukan Merek Mobil");
        String fajar07176_merekmobil = input.next();
        System.out.println("Masukan Warna Mobil");
        String fajar07176_warnamobil = input.next();
        mobilModel.insertMobil(new Fajar07176_MobilEntity(fajar07176_nomormobil,fajar07176_pemilikmobil,fajar07176_merekmobil,fajar07176_warnamobil));
    }
    static void fajar07176_view(){
        motorModel.view();
        mobilModel.view();
    }
    static void fajar07176_hapus(){
        int fajar07176_pil = input.nextInt();
        if(fajar07176_pil==1){
            motorModel.hapus();
        }else if(fajar07176_pil==2){
            mobilModel.hapus();
       }
    }
    static void fajar07176_update(){
        int fajar07176_pil = input.nextInt();
        if(fajar07176_pil==1){
            motorModel.update();
        }else if(fajar07176_pil==2){
            mobilModel.update();
       }
    }
}