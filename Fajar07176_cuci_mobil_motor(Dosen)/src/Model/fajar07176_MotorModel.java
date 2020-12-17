package Model;

import Entity.Fajar07176_MotorEntity;
import java.util.ArrayList;
import java.util.Scanner;
public class fajar07176_MotorModel implements fajar07176_ModelInterfaces{
    private ArrayList <Fajar07176_MotorEntity> motorEntityArrayList;
    Scanner input = new Scanner(System.in); 
    
    public fajar07176_MotorModel(){
        motorEntityArrayList = new ArrayList<Fajar07176_MotorEntity>();
    }
    public void insertMotor07176(Fajar07176_MotorEntity motor){
        motorEntityArrayList.add(motor);
    }
    @Override
     public void view(){
     for (int x=0; x<motorEntityArrayList.size(); x++){
         System.out.println("Nomor Kendaraan : "+motorEntityArrayList.get(x).getNomorkendaraan07176());
         System.out.println("Nama pemilik :    "+motorEntityArrayList.get(x).getNamaPemilik07176());
         System.out.println("Merek kendaraan : "+motorEntityArrayList.get(x).getfajar07176_merekmotor());
         System.out.println("Warna Kendaraan : "+motorEntityArrayList.get(x).getfajar07176_warnamotor());
         System.out.println();
        }
     }
     public void hapus(){
         String fajar07176_nomormotor;
         System.out.print("Pilih nomer yang dihapus: ");
         fajar07176_nomormotor = input.next();
            for (int i=0; i<motorEntityArrayList.size(); i++){
                if(fajar07176_nomormotor.equals(motorEntityArrayList.get(i).getNomorkendaraan07176())){
                motorEntityArrayList.remove(i);
            System.out.println("Data telah terhapus");
           }
        }
     }
     public void update(){
        int update;
        String nomor07176,nama07176,merek07176,warna07176;   
            view();
                System.out.println("ingin menganti data index ke : ");
                update = input.nextInt();
                System.out.println("pilih data yang diupdate: ");
                System.out.print("Masukan nomor: ");nomor07176 = input.next();
                motorEntityArrayList.get(update).setNomorkendaraan07176(nomor07176);
                System.out.print("Masukan nama: ");nama07176 = input.next();
                motorEntityArrayList.get(update).setNamaPemilik07176(nama07176);
                System.out.print("Masukan merek: ");merek07176 = input.next();
                motorEntityArrayList.get(update).setfajar07176_merekmotor(merek07176);
                System.out.print("Masukan warna: ");warna07176 = input.next();
                motorEntityArrayList.get(update).Setfajar07176_warnamotor(warna07176);
     
  }
}