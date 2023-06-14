import java.io.Serializable;
import java.util.Scanner;

public class MonHoc implements Serializable{
	private String tenMH;
	private int soTin;
	
	public void nhap() {
		System.out.print("Nhap ten mon hoc: ");
		tenMH = new Scanner(System.in).nextLine();
		System.out.print("Nhap so tin chi: ");
		soTin = new Scanner(System.in).nextInt();
	}
	
	public void xuat() {
		System.out.printf("\n%15s %12d", this.tenMH, this.soTin);
	}
	
	public String getTenMH() {
		return this.tenMH;
	}
}
