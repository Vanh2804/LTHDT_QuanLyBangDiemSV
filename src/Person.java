import java.io.Serializable;
import java.util.Scanner;

public class Person implements Serializable{
	private String hoTen;
	private String ngaySinh;
	
	public void nhap() {
		System.out.print("Nhap ho ten: ");
		hoTen = new Scanner(System.in).nextLine();
		System.out.print("Nhap ngay sinh: ");
		ngaySinh = new Scanner(System.in).nextLine();
	}
	
	public void xuat() {
		System.out.printf("\n%15s %12s", this.hoTen, this.ngaySinh);
	}

	public String getHoTen() {
		return hoTen;
	}
	
}
