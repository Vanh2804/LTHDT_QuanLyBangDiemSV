import java.io.Serializable;
import java.util.Scanner;

public class GiaoVien extends Person implements Serializable{
	private String hocVi;
	private String hocHam;
	private String chuyenNganh;
	
	public GiaoVien() {
		super();
	}

	public GiaoVien(String hocVi, String hocHam, String chuyenNganh) {
		super();
		this.hocVi = hocVi;
		this.hocHam = hocHam;
		this.chuyenNganh = chuyenNganh;
	}
	
	public void nhap() {
		System.out.println("Nhap thông tin giao vien giang day");
		super.nhap();
		System.out.print("Nhap hoc vi: ");
		hocVi = new Scanner(System.in).nextLine();
		System.out.print("Nhap hoc ham: ");
		hocHam = new Scanner(System.in).nextLine();
		System.out.print("Nhap chuyen nganh: ");
		chuyenNganh = new Scanner(System.in).nextLine();
	}
	
	public void xuat() {
		super.xuat();
		System.out.printf("\n%15s %12s", this.hocVi, this.hocHam);
		System.out.printf("\n%15s", this.chuyenNganh);
	}
}
