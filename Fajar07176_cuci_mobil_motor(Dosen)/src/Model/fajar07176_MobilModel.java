package Model;

import Entity.Fajar07176_MobilEntity;
import java.util.ArrayList;
import java.util.Scanner;
public class fajar07176_MobilModel implements fajar07176_ModelInterfaces{
   private ArrayList <Fajar07176_MobilEntity> mobilEntityArrayList;
   Scanner input = new Scanner(System.in);
    public fajar07176_MobilModel(){
        mobilEntityArrayList = new ArrayList<Fajar07176_MobilEntity>();
    }
    public void insertMobil(Fajar07176_MobilEntity mobil){
        mobilEntityArrayList.add(mobil);
    }
    @Override
     public void view(){
     for(Fajar07176_MobilEntity mobilEntity : mobilEntityArrayList){
            System.out.print("Nomor :"+mobilEntity.getNomorMobil07176());
            System.out.print("\nNama Pemilik : "+mobilEntity.getNamaPemilikMobil07176());
            System.out.print("\nMerek mobil : "+mobilEntity.getfajar07176_merekmobil());
            System.out.print("\nWarna mobil : "+mobilEntity.getfajar07176_warnamobil());
            System.out.println();
        }
     }
     public void hapus(){
          String fajar07176_nomormobil;
         System.out.print("Pilih nomer yang dihapus: ");
         fajar07176_nomormobil = input.next();
            for (int i=0; i<mobilEntityArrayList.size(); i++){
                if(fajar07176_nomormobil.equals(mobilEntityArrayList.get(i).getNomorMobil07176())){
                mobilEntityArrayList.remove(i);
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
                System.out.println("Masukkan data baru: ");
                System.out.print("Masukan nomor: ");nomor07176 = input.next();
                mobilEntityArrayList.get(update).setNomorMobil07176(nomor07176);
                System.out.print("Masukan nama: ");nama07176 = input.next();
                mobilEntityArrayList.get(update).setNamaPemilikMobil07176(nama07176);
                System.out.print("Masukan merek: ");merek07176 = input.next();
                mobilEntityArrayList.get(update).setfajar07176_merekmobil(merek07176);
                System.out.print("Masukan warna: ");warna07176 = input.next();
                mobilEntityArrayList.get(update).setfajar07176_warnamobil(warna07176);
     
  }
}

