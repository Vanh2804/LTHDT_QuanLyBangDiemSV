import java.util.*;
import java.io.*;

public class BangDiem implements Serializable{
	private String maBangDiem;
	private String ngayLap;
	private String namHoc;
	GiaoVien gv;
	MonHoc mh;
	ArrayList<SinhVien> lstSV;
	
	public void nhap() {
		System.out.print("\nNhap ma bang diem: ");
		this.maBangDiem = new Scanner(System.in).nextLine();
		System.out.print("Nhap ngay lap: ");
		this.ngayLap = new Scanner(System.in).nextLine();
		System.out.print("Nhap nam hoc: ");
		this.namHoc = new Scanner(System.in).nextLine();
		gv = new GiaoVien();
		mh = new MonHoc();
		mh.nhap();
		gv.nhap();
		int n;
		System.out.print("Nhap so sinh vien: ");
		n = new Scanner(System.in).nextInt();
		lstSV = new ArrayList<SinhVien>(n);
		for(int i=0; i<n ; ++i) {
			System.out.println("_STT: " + (i+1));
			SinhVien x = new SinhVien();
			x.nhap();
			lstSV.add(x);
		}
	}
	
	public void xuat() {
		System.out.printf("\n%15s %12s", "Ma bang diem: ", this.maBangDiem);
		System.out.printf("\n %15s %12s", this.ngayLap, this.namHoc);
		mh.xuat();
		gv.xuat();
		for(SinhVien i:lstSV)
			i.xuat();
	}
	
	public void suaDiem() {
		String s;
		float x;
		System.out.print("Nhap ma sinh vien can sua: ");
		s = new Scanner(System.in).nextLine();
		System.out.print("1. Sua diem chuyen can");
		System.out.print("\n2. Sua diem giua ky");
		System.out.print("\n3. Sua diem thi");
		System.out.print("\nChon: ");
		int op = new Scanner(System.in).nextInt();
		System.out.print("Nhap diem: ");
		x = new Scanner(System.in).nextInt();
		for(SinhVien it:lstSV) {
			if(it.getMaSV().equals(s)==true) {
				if(op == 1)
					it.setDiemCC(x);
				else if(op == 2)
					it.setDiemGK(x);
				else if(op == 3)
					it.setDiemThi(x);
				else 
					System.out.println("Nhap sai!");
			}
		}
		System.out.println("Sua thanh cong...");
	}
	
	public String getTenMH() {
		return mh.getTenMH();
	}
	
	public void svHocLai() {
		for(SinhVien it:lstSV) {
			if(it.tinhDiem() < 4) {
				it.xuat();
			}
		}
	}
	
	public void themSV() {
		SinhVien x = new SinhVien();
		x.nhap();
		lstSV.add(x);
	}
	
	public void xoaSV(){
		String s;
		System.out.print("Nhap ma sinh vien muon xoa: ");
		s = new Scanner(System.in).nextLine();
		for(SinhVien it:lstSV) {
			if(it.getMaSV().equals(s) == true) {
				lstSV.remove(it);
				break;
			}
		}
	}
	
	public void svDiemcaoNhat() {
		float f = 0;
		for(SinhVien it:lstSV) {
			if(it.tinhDiem() > f) {
				f = it.tinhDiem();
			}
		}
		
		for(SinhVien it:lstSV) {
			if(it.tinhDiem() == f) {
				it.xuat();
			}
		}
	}
	
	public void sapXepSVTheoTen() {
		Collections.sort(lstSV, new SinhVien_Compar());
		System.out.println("\nSap xep thanh cong...");
	}
	
	public float tbDiem() {
		float s = 0;
		for(SinhVien i:lstSV) {
			s += i.tinhDiem();
		}
		return s/lstSV.size();
	}
		
	public void timKiemSV() {
		String s;
		System.out.print("Nhap ma sinh vien: ");
		s = new Scanner(System.in).nextLine();
		for(SinhVien it:lstSV) {
			if(it.getMaSV().equals(s)) {
				it.xuat();
			}
		}
	}
	
	public String getMaBangDiem() {
		return maBangDiem;
	}

	public void setMaBangDiem(String maBangDiem) {
		this.maBangDiem = maBangDiem;
	}

	public String getNgayLap() {
		return ngayLap;
	}

	public void setNgayLap(String ngayLap) {
		this.ngayLap = ngayLap;
	}

	public String getNamHoc() {
		return namHoc;
	}

	public void setNamHoc(String namHoc) {
		this.namHoc = namHoc;
	}
	
}
