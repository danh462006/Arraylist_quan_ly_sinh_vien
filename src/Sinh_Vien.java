import javax.swing.text.Style;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Sinh_Vien {
    private static Scanner sc = new Scanner(System.in);
    private static ArrayList<Sinh_Vien> dssv = new ArrayList<>();
    private String name;
    private int msv;
    private String alass;
    private double diem;
    public Sinh_Vien(String name ,String alass,double diem , int msv){
        this.name=name;
        this.alass=alass;
        this.diem=diem;
        this.msv=msv;
    }
    public void danh_sach(){

        System.out.println("Vui long nhap so hoc sinh ban muon them: ");
        int dem = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <dem ; i++) {
            Sinh_Vien sv = new Sinh_Vien("","",0,0);
            sv.NhapTT();
            dssv.add(sv);
        }
    }
    public void NhapTT(){
        System.out.println("Ma Sinh Vien: ");
        msv = sc.nextInt();
        sc.nextLine();
        System.out.println("Ten sv:");
        name = sc.nextLine();
        System.out.println("lop sv: ");
        alass = sc.nextLine();
        System.out.println("Diem Trung Binh : ");
        diem = sc.nextDouble();
        sc.nextLine();
    }
    public void XuatTT(){
        System.out.println(" Danh Sach Sinh Vien ");
        for(Sinh_Vien sv : dssv){
            System.out.println( "Ma Sinh Vien:"+sv.msv+"\n"+"Ten Sinh Vien: " + sv.name + "\n"+"Lop: " + sv.alass + "\n"+"Diem Trung Binh: " + sv.diem);
        }
    }
    public void XoaTT(){
        System.out.println("Nhap Ma Sinh Vien Muon Xoa: ");
        int m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i <dssv.size() ; i++) {
            if (dssv.get(i).msv == m ){
                dssv.remove(i);
                System.out.println("da xoa sinh vien ma so: "+m);
                break;
            }
        }
        System.out.println("Khong tim thay ma so Sinh Vien ban vua nhap"+"\n");
    }
}
