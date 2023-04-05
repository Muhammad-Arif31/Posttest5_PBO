/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package posttest5;

/**
 *
 * @author User
 */
public final class KapalPenumpang extends Kapal {
    
    //sub-class kapal penumpang dari class kapal
    private int quantity;
    
    public KapalPenumpang(int no,String nama,String warna,int price,String negara){
        super(no, nama, warna, price, negara);
        this.quantity = quantity;
    }
    
    public KapalPenumpang(){
        this.quantity = 0;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    @Override
    public final void Sukses(){
        System.out.println("Data Kapal ditambahkan ke dalam Daftar");
    }
    
    @Override
    public final void Gagal(){
        System.out.println("Data Kapal dihapus dari Daftar");
    }
    
    @Override
    public final void Diubah(){
        System.out.println("Data Kapal dalam daftar telah diupdate ");
    }
}
