import java.io.Serializable;
import java.util.Scanner;

public class SinhVien extends Person implements Serializable{
	private String maSV;
	private String lop;
	private float diemCC;
	private float diemGK;
	private float diemThi;
	
	public SinhVien(String maSV, String lop, float diemCC, float diemGK, float diemThi) {
		super();
		this.maSV = maSV;
		this.lop = lop;
		this.diemCC = diemCC;
		this.diemGK = diemGK;
		this.diemThi = diemThi;
	}

	public SinhVien() {
		super();
	}

	public void nhap() {
		super.nhap();
		System.out.print("Nhap ma sinh vien: ");
		maSV = new Scanner(System.in).nextLine();
		System.out.print("Nhap lop: ");
		lop = new Scanner(System.in).nextLine();
		System.out.print("Nhap diem chuyen can: ");
		diemCC = new Scanner(System.in).nextFloat();
		System.out.print("Nhap diem giua ky: ");
		diemGK = new Scanner(System.in).nextFloat();
		System.out.print("Nhap diem thi: ");
		diemThi = new Scanner(System.in).nextFloat();
	}
	
	public void xuat() {
		super.xuat();
		System.out.printf("%15s", this.maSV);
		System.out.printf("%10s", this.lop);
		System.out.printf("%6.1f", this.diemCC);
		System.out.printf("%6.1f", this.diemGK);
		System.out.printf("%6.1f", this.diemThi);
	}
	
	public float tinhDiem() {
		return 0.1f*this.diemCC + 0.2f*this.diemGK + 0.7f*this.diemThi;
	}

	public void setDiemGK(float diemGK) {
		this.diemGK = diemGK;
	}

	public void setDiemCC(float diemCC) {
		this.diemCC = diemCC;
	}

	public void setDiemThi(float diemThi) {
		this.diemThi = diemThi;
	}

	public String getMaSV() {
		return maSV;
	}
}
