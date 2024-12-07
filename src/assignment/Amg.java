/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author One
 */
public class Amg { 
        Scanner in = new Scanner(System.in);
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
    
        
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        String matim;
        String timxoa, timup;
        int so;
        do {            
            System.out.println("          --------MENU--------");
            System.out.println("1. Nhập danh sách nhân viên từ bàn phím.");
            System.out.println("2. Xuất danh sách nhân viên ra màn hình.");
            System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.");
            System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.");
            System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.");
            System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.");
            System.out.println("7. Sắp xếp nhân viên theo họ và tên.");
            System.out.println("8. Sắp xếp nhân viên theo thu nhập.");
            System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.");
            System.out.println("10. Thoát chương trình.\n");

            System.out.println("Mời bạn nhập chương trình: ");
            so = in.nextInt();
            System.out.println("--------------------------------------------------------");
            switch (so){
                case 1:{
                    System.out.println("1. Nhập danh sách nhân viên từ bàn phím.\n");
                    System.out.println("Bạn quản lý bao nhiêu NV: ");
                    int chon = in.nextInt();

                    for (int i = 0; i < chon; i++) {
                        System.out.println("Chức vụ của NV: \n1.NV bình thường \n2.NV Tiếp Thị \n3.Trưởng Phòng");
                        int cv = in.nextInt();
                        if (cv == 1) { 
                            NhanVien v = new NhanVien();
                            v.nhap();
                            nv.add(v);
                        } else { 
                            if (cv == 2) {
                                TiepThi t = new TiepThi();
                                t.nhap();
                                nv.add(t);
                            } else {
                                if (cv == 3) {
                                    TruongPhong tp = new TruongPhong();
                                    tp.nhap();
                                    nv.add(tp);
                                } else {
                                    System.out.println("Không có chức vụ này trong công ty.");
                                }
                            }
                        }
                    }
                break;
                }
                case 2:{
                    System.out.println("2. Xuất danh sách nhân viên ra màn hình.\n");
                    for (NhanVien x : nv) {
                        x.xuat();
                    }
                    break;
                }
                case 3:{
                    System.out.println("3. Tìm và hiển thị nhân viên theo mã nhập từ bàn phím.\n");
                    System.out.println("Nhập mã bạn muốn tìm: ");
                    in.nextLine();
                    matim = in.nextLine();
                    for (NhanVien n : nv) {
                        if(n.ma.equalsIgnoreCase(matim)){
                            n.xuat();
                        }
                    }
                    break;
                }
                case 4:{
                    System.out.println("4. Xóa nhân viên theo mã nhập từ bàn phím.\n");
                    System.out.println("Nhập mã bạn muốn tìm để xóa: ");
                    in.nextLine();
                    timxoa = in.nextLine();
                    for (NhanVien xoa : nv) {
                        if(xoa.ma.equalsIgnoreCase(timxoa)){
                            nv.remove(xoa);
                        }
                    } 
                    System.out.println("DS hiện tại: ");
                    for (NhanVien con : nv) {
                        con.xuat();
                    } 
                    break;
                }
                case 5:{
                    System.out.println("5. Cập nhật thông tin nhân viên theo mã nhập từ bàn phím.\n");
                    System.out.println("Nhập mã NV bạn muốn tìm để cập nhật: ");
                    in.nextLine();
                    timup = in.nextLine();
                    for (int i = 0; i < nv.size() ; i++) {
                        if (nv.get(i).getMa().equalsIgnoreCase(timup)){
                            System.out.println("Mời bạn nhập thông tin mới: ");
                            NhanVien up = new NhanVien();
                            up.nhap();
                            nv.remove(i);
                            nv.add(i, up);
                        }
                    }
                    System.out.println("DS đã cập nhật: ");
                    for (NhanVien upmoi : nv) {
                        upmoi.xuat();
                    } 
                    break;
                }
                case 6:{
                    System.out.println("6. Tìm các nhân viên theo khoảng lương nhập từ bàn phím.\n");
                    double lbe, llon;
                    System.out.println("Nhập khoảng lương mà bạn muốn tìm: ");
                    lbe = in.nextDouble();
                    llon = in.nextDouble();
                    ArrayList<NhanVien> klNV = new ArrayList<NhanVien>();
                    for (NhanVien kl : nv) {
                        if (kl.getLuong() >= lbe && kl.getLuong() <= llon) {
                            klNV.add(kl);
                        }
                    }
                    System.out.println("DS nhân viên tìm được theo khoảng lương: ");
                    for (NhanVien lNV : klNV) {
                        lNV.xuat();
                    }
                    break;
                }
                case 7:{
                    System.out.println("7. Sắp xếp nhân viên theo họ và tên.\n");
                    sst();
                    System.out.println("DS nhân viên đượ sắp xếp theo họ và tên: ");
                        for (NhanVien sst : nv) {
                            sst.xuat();
                    }
                    break;
                }
                case 8:{
                    System.out.println("8. Sắp xếp nhân viên theo thu nhập.\n");
                    sstn();
                    System.out.println("DS nhân viên tìm được theo khoảng lương: ");
                        for (NhanVien sstn : nv) {
                            sstn.xuat();
                    }
                    break;
                }
                case 9:{
                    System.out.println("9. Xuất 5 nhân viên có thu nhập cao nhất.\n");
                    break;
                }
                case 10:{
                    break;
                }
                    default:
                        System.out.println("Số không hợp lệ");
            }
        } while (so!=10);
    }
    public static void sst() {
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        Comparator<NhanVien> sst = new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien t1, NhanVien t2) {
                return t1.getHoTen().compareTo(t2.getHoTen());
            } 
        };
        Collections.sort(nv, sst);
    }
    
    public static void sstn() {
        ArrayList<NhanVien> nv = new ArrayList<NhanVien>();
        Comparator<NhanVien> sstn = new Comparator<NhanVien>(){
            @Override
            public int compare(NhanVien tn1, NhanVien tn2){
                return tn1.getThuNhap()<tn2.getThuNhap()?1:-1;
            }
        };
        Collections.sort(nv, sstn);
    }
        
                
    
    
        
    
}