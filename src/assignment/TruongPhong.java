/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;

/**
 *
 * @author One
 */
public class TruongPhong extends NhanVien{
    Scanner in = new Scanner(System.in);
    double tienTn;
    
    public TruongPhong(){
        
    }
    
    public TruongPhong(String ma, String hoTen, double luong, double tienTn){
       super(ma,hoTen,luong);
       this.tienTn = tienTn;
    }
    
    public double getThuNHap(){
        return luong + tienTn;
    }
        @Override
    public void xuat(){
        super.xuat();
        System.out.println("Của riêng TP: " + tienTn);
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Tiền trách nhiệm: ");
        tienTn = in.nextDouble();
    }
}

