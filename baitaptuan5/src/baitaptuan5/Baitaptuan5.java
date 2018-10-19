package baitaptuan5;

class fruit{
    int size; 
    int weight; 
    String color; 
    date ngaynhap = new date(); 
    date ngayxuat = new date();
    void setngaynhap_xuat(date ngaynhap, date ngayxuat){
        this.ngaynhap = ngaynhap; 
        this.ngayxuat = ngayxuat; 
    }
}
class date{
    int date; 
    int month; 
    int year; 
    date(){}; 
    date(int date, int month, int year){
        this.date = date; 
        this.month = month; 
        this.year = year; 
    }
    void print(){
        System.out.println(date + "/" + month + "/" + year);
    }
}

class apple extends fruit{ 
    date dateNhapApple = new date(1,2,3); 
    date dateXuatApple = new date(2,3,4); 
    apple(){
        super();
        size = 12; 
        weight = 1; 
        color = "red"; 
    } 
    @Override
    void setngaynhap_xuat(date ngaynhap, date ngayxuat){
        dateNhapApple = ngaynhap; 
        dateXuatApple = ngayxuat; 
    }
    void getngaynhap_xuat(){
        dateNhapApple.print();
        dateXuatApple.print();
    }
    void getInfo(){
        System.out.println("KT: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}
class cam extends fruit{
    date dateNhapCam = new date(1,1,1); 
    date dateXuatCam = new date(2,2,2); 
    cam(){
        size = 13; 
        weight = 2; 
        color = "yellow"; 
    }
    @Override
    void setngaynhap_xuat(date ngaynhap, date ngayxuat){
        dateNhapCam = ngaynhap; 
        dateXuatCam = ngayxuat; 
    }
    void getngaynhap_xuat(){
        dateNhapCam.print();
        dateXuatCam.print();
    }
    void getInfo(){
        System.out.println("KT: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}
class camcaophong extends fruit{
    date dateNhapCamCP = new date(1,1,1); 
    date dateXuatCamCP = new date(3,3,3); 
    
    camcaophong(){
        size = 14; 
        weight = 3; 
        color = "yellow"; 
    }
    @Override
    void setngaynhap_xuat(date ngaynhap, date ngayxuat){
        dateNhapCamCP = ngaynhap; 
        dateXuatCamCP = ngayxuat; 
    }
    void getngaynhap_xuat(){
        dateNhapCamCP.print();
        dateXuatCamCP.print();
    }
    void getInfo(){
        System.out.println("KT: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}
class camsanh extends fruit{
    date dateNhapCamS = new date(1,1,1); 
    date dateXuatCamS = new date(3,3,3);
    camsanh(){
        size = 15; 
        weight = 4; 
        color = "green"; 
    }
    @Override
    void setngaynhap_xuat(date ngaynhap, date ngayxuat){
        dateNhapCamS = ngaynhap; 
        dateXuatCamS = ngayxuat; 
    }
    void getngaynhap_xuat(){
        dateNhapCamS.print();
        dateXuatCamS.print();
    }
    void getInfo(){
        System.out.println("KT: " + size);
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}

public class Baitaptuan5 {

    public static void main(String[] args) {
        apple a = new apple(); 
        a.getngaynhap_xuat();
        a.getInfo(); 
    } 
}
