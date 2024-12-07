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
public class TiepThi extends NhanVien{
    Scanner in = new Scanner(System.in);
    double doanhSo, hueHong;
    
    public TiepThi(){
    }
    
    public TiepThi(String ma, String hoTen, double luong, double doanhSo, double hueHong){
        super(ma,hoTen,luong);
        this.doanhSo = doanhSo;
        this.hueHong = hueHong;
    }
    
    public double getThuNHap(){
        return luong + doanhSo * hueHong;
    }
    
    @Override
    public void xuat(){
        super.xuat();
        System.out.println("Của riêng TT: " + doanhSo*hueHong);
    }
    
    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Doanh số: ");
        doanhSo = in.nextDouble();
        System.out.println("Huê Hồng: ");
        hueHong = in.nextDouble();
    }
}
