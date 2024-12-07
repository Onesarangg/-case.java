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
public class NhanVien {
    Scanner in = new Scanner(System.in);
    String ma, hoTen;
    double luong;
    
    public NhanVien(){}
    
    public NhanVien(String ma, String hoTen, double luong){
        this.ma = ma;
        this.hoTen = hoTen;
        this.luong = luong;
    }
    public double getThuNhap(){
        return luong;
    }
    public double getThue(){
        if (getThuNhap() < 9) {
            return 0;
        }else if (getThuNhap() >= 9 && getThuNhap() <= 15){
            return getThuNhap()*0.1;
        }else {return getThuNhap()*0.12;}
        }
    public void xuat(){
        System.out.println("_________");
        System.out.println("Ma: " + ma +" Họ Tên: "+ hoTen +" Lương: "+ luong);
        System.out.println("Tổng thu: "+getThuNhap()+" Thuế: "+getThue());
    }
    public void nhap(){
        System.out.println("Nhập mã nhân viên: ");
        ma = in.nextLine();
        System.out.println("Nhập họ tên Nhân viên: ");
        hoTen = in.nextLine();
        System.out.println("Nhập lương nhân viên: ");
        luong = in.nextDouble();
    }
        String className = this.getClass().getName();
    
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    

   
}