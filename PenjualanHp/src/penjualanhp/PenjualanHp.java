/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualanhp;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Visensius Dony
 */
public class PenjualanHp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String merk=null;
        Integer transaksi=0,harga=0,jumlah=0,totalHarga=0;
        dataPenjualan(merk,transaksi,harga,jumlah,totalHarga);
       
    }
    public static void dataPenjualan(String merk,Integer transaksi,Integer harga,Integer jumlah,Integer totalHarga){
        List<String>listMerk = new ArrayList<>();
        List<Integer>listHarga = new ArrayList<>();
        List<Integer>listJumlah = new ArrayList<>();
        List<Integer>listTotal = new ArrayList<>();
        List<String>listBonus = new ArrayList<>();
        
        Integer varian;//[1] 3/32, [2] 4/64, [3]6/128
        Integer totalBayar=0;
        String bonus;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Transaksi: ");
        transaksi = scan.nextInt();
        
        for(int i=0;i<transaksi;i++){
            System.out.print("\nPilih Kode Handphone (A.Asus,S.Samsung,O.Oppo,V.Vivo,X.Xiaomi,R.Realme): ");
            String kode = scan.next();
            kode = kode.toUpperCase();
            switch(kode){
                case "A": listMerk.add("Asus");
                          System.out.print("Masukkan Jumlah Unit: ");
                          jumlah = scan.nextInt();
                          listJumlah.add(jumlah);
                          System.out.print("Masukkan Varian Hp [1] 3/32, [2] 4/64, [3]6/128: ");
                          varian = scan.nextInt();
                          if(varian == 1){
                              harga = 1500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 2){
                              harga = 2500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                                  listBonus.add(bonus);
                              }else{
                                  bonus = "Belum Dapat Bonus";
                                  listBonus.add(bonus);
                              }
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 3){
                              harga = 4000000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else{
                              System.out.println("varian yang dipilih salah");
                          }
                          totalBayar=totalBayar+totalHarga;
                            break;
                case "S": listMerk.add("Samsung");
                          System.out.print("Masukkan Jumlah Unit: ");
                          jumlah = scan.nextInt();
                          listJumlah.add(jumlah);
                          System.out.print("Masukkan Varian Hp [1] 3/32, [2] 4/64, [3]6/128: ");
                          varian = scan.nextInt();
                          if(varian == 1){
                              harga = 1500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 2){
                              harga = 2500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                                  listBonus.add(bonus);
                              }else{
                                  bonus = "Belum Dapat Bonus";
                                  listBonus.add(bonus);
                              }
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 3){
                              harga = 4000000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else{
                              System.out.println("varian yang dipilih salah");
                          }
                          totalBayar=totalBayar+totalHarga;
                            break;
                case "O": listMerk.add("Oppo");
                          System.out.print("Masukkan Jumlah Unit: ");
                          jumlah = scan.nextInt();
                          listJumlah.add(jumlah);
                          System.out.print("Masukkan Varian Hp [1] 3/32, [2] 4/64, [3]6/128: ");
                          varian = scan.nextInt();
                          if(varian == 1){
                              harga = 1500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 2){
                              harga = 2500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                                  listBonus.add(bonus);
                              }else{
                                  bonus = "Belum Dapat Bonus";
                                  listBonus.add(bonus);
                              }
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 3){
                              harga = 4000000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else{
                              System.out.println("varian yang dipilih salah");
                          }
                          totalBayar=totalBayar+totalHarga;
                            break;
                case "V": listMerk.add("Vivo");
                          System.out.print("Masukkan Jumlah Unit: ");
                          jumlah = scan.nextInt();
                          listJumlah.add(jumlah);
                          System.out.print("Masukkan Varian Hp [1] 3/32, [2] 4/64, [3]6/128: ");
                          varian = scan.nextInt();
                          if(varian == 1){
                              harga = 1500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 2){
                              harga = 2500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                                  listBonus.add(bonus);
                              }else{
                                  bonus = "Belum Dapat Bonus";
                                  listBonus.add(bonus);
                              }
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 3){
                              harga = 4000000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else{
                              System.out.println("varian yang dipilih salah");
                          }
                          totalBayar=totalBayar+totalHarga;
                            break;
                case "X": listMerk.add("Xiaomi");
                          System.out.print("Masukkan Jumlah Unit: ");
                          jumlah = scan.nextInt();
                          listJumlah.add(jumlah);
                          System.out.print("Masukkan Varian Hp [1] 3/32, [2] 4/64, [3]6/128: ");
                          varian = scan.nextInt();
                          if(varian == 1){
                              harga = 1500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 2){
                              harga = 2500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                                  listBonus.add(bonus);
                              }else{
                                  bonus = "Belum Dapat Bonus";
                                  listBonus.add(bonus);
                              }
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 3){
                              harga = 4000000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else{
                              System.out.println("varian yang dipilih salah");
                          }
                          totalBayar=totalBayar+totalHarga;
                            break;
                case "R": listMerk.add("Realme");
                          System.out.print("Masukkan Jumlah Unit: ");
                          jumlah = scan.nextInt();
                          listJumlah.add(jumlah);
                          System.out.print("Masukkan Varian Hp [1] 3/32, [2] 4/64, [3]6/128: ");
                          varian = scan.nextInt();
                          if(varian == 1){
                              harga = 1500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 2){
                              harga = 2500000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                                  listBonus.add(bonus);
                              }else{
                                  bonus = "Belum Dapat Bonus";
                                  listBonus.add(bonus);
                              }
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else if(varian == 3){
                              harga = 4000000;
                              listHarga.add(harga);
                              if(jumlah>1&&varian>1){
                                  bonus = "Dapat Bonus Powerbank";
                              }else{
                                  bonus = "Belum Dapat Bonus";
                              }
                              listBonus.add(bonus);
                              totalHarga = jumlah*harga;
                              listTotal.add(totalHarga);
                          }else{
                              System.out.println("varian yang dipilih salah");
                          }
                          totalBayar=totalBayar+totalHarga;
                            break;            
                default : System.out.println("Kode Hp salah");
                            break;
            }
            
        }
        System.out.println("\nMerk\tJumlah\tHarga\tTotal\tBonus");
        for (int i = 0; i < transaksi; i++) {
            System.out.print(listMerk.get(i));
            System.out.print("\t"+listJumlah.get(i));
            System.out.print("\t"+listHarga.get(i));
            System.out.print("\t"+listTotal.get(i));
            System.out.println("\t"+listBonus.get(i));
        }
        System.out.println("Total Bayar setelah PPN: "+bayarSetelahPpn(totalBayar));
    }
    
    public static Integer bayarSetelahPpn(Integer totalBayar){
       Integer bayarTotal=0;
       bayarTotal =(int)(0.01*totalBayar)+totalBayar;
       return bayarTotal;
    }
}
