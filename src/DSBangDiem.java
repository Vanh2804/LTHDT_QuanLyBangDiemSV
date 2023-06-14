import java.util.*;
import java.io.*;

public class DSBangDiem implements Serializable{
	ArrayList<BangDiem> lstBD;
	
	public void nhap() {
		int n=0;
		System.out.print("Nhap so bang diem can quan ly: ");
		n = new Scanner(System.in).nextInt();
		lstBD = new ArrayList<BangDiem>(n);
		for(int i=0; i<n; ++i) {
			System.out.println("\nBANG DIEM: " + (i+1));
			BangDiem x = new BangDiem();
			x.nhap();
			lstBD.add(x);
		}
	}
	
	public void xuat() {
		for(BangDiem i:lstBD) {
			i.xuat();
		}
	}
	
	public void luuFile() throws IOException {
		File f = new File("BangDiem.dat");
		
		FileOutputStream fout = new FileOutputStream(f);
		ObjectOutputStream objout = new ObjectOutputStream(fout);
		
		objout.writeObject(lstBD);
		
		fout.close();
		objout.close();
		System.out.println("Luu file thanh cong...");
	}
	
	@SuppressWarnings("unchecked")
	public void docFile() throws IOException, ClassNotFoundException {
		File f = new File("BangDiem.dat");
		
		FileInputStream fin = new FileInputStream(f);
		ObjectInputStream objin = new ObjectInputStream(fin);
		
		lstBD = new ArrayList<BangDiem>();
		lstBD = (ArrayList)objin.readObject();
		
		fin.close();
		objin.close();
		System.out.println("Doc file thanh cong chon 2 de xem...");
	}
	
	
	public void suaDiem() {
		String s;
		System.out.print("Nhap ma bang diem: ");
		s = new Scanner(System.in).nextLine();
		for(BangDiem it:lstBD) {
			if(it.getMaBangDiem().equals(s)) {
				it.suaDiem();
				break;
			}
		}
	}
	
	public void timKiemSVHocLai() {
		String s;
		System.out.print("Nhap ma bang diem: ");
		s = new Scanner(System.in).nextLine();
		for(BangDiem it:lstBD) {
			if(it.getMaBangDiem().equals(s)) {
				System.out.println("Danh sach sinh vien hoc lai mon: " + it.getTenMH());
				it.svHocLai();
				break;
			}
		}
	}
	
	public void themSVBD() {
		String s;
		System.out.print("Nhap ma bang diem: ");
		s = new Scanner(System.in).nextLine();
		for(BangDiem it:lstBD) {
			if(it.getMaBangDiem().equals(s)) {
				it.themSV();
				break;
			}
		}
		System.out.println("Them sinh vien thanh cong...");
	}
	
	public void xoaSVBD() {
		String s;
		System.out.print("Nhap ma bang diem: ");
		s = new Scanner(System.in).nextLine();
		for(BangDiem it:lstBD) {
			if(it.getMaBangDiem().equals(s)) {
				it.xoaSV();
				break;
			}
		}
		System.out.println("Xoa sinh vien thanh cong...");
	}
	
	public void svDiemCaoNhatBD() {
		String s;
		System.out.print("Nhap ma bang diem: ");
		s = new Scanner(System.in).nextLine();
		for(BangDiem it:lstBD) {
			if(it.getMaBangDiem().equals(s)) {
				System.out.println("Sinh vien diem cao nhat mon hoc: " + it.getTenMH());
				it.svDiemcaoNhat();
				break;
			}
		}
	}
	
	public void sapXepSVTheoTenBD() {
		String s;
		System.out.print("Nhap ma bang diem: ");
		s = new Scanner(System.in).nextLine();
		for(BangDiem it:lstBD) {
			if(it.getMaBangDiem().equals(s)) {
				it.sapXepSVTheoTen();
				break;
			}
		}
	}
	
	public void tbDiemBD() {
		for(BangDiem i:lstBD) {
			System.out.print("\nDiem trung binh mon " + i.getTenMH() + ": ");
			System.out.printf("%3.2f", i.tbDiem());
		}
	}
	
	public void timKiemSVBD() {
		String s;
		System.out.print("Nhap ma bang diem: ");
		s = new Scanner(System.in).nextLine();
		for(BangDiem it:lstBD) {
			if(it.getMaBangDiem().equals(s)) {
				it.timKiemSV();
			}
		}
	}
}
