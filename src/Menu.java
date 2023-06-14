import java.io.IOException;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DSBangDiem ds = new DSBangDiem();
		int n=0;
		do {
			System.out.println("\n--------MENU--------");
			System.out.println("1. Nhap danh sach bang diem");
			System.out.println("2. Hien danh sach bang diem");
			System.out.println("3. Luu danh sach bang diem vao file BangDiem.dat");
			System.out.println("4. Doc danh sach bang diem tu file BangDiem.dat");
			System.out.println("5. Sua diem sinh vien");
			System.out.println("6. Tim sinh vien co mon hoc lai(diem tong < 4)");
			System.out.println("7. Them sinh vien vao bang diem");
			System.out.println("8. Xoa sinh vien tu bang diem");
			System.out.println("9. Tim sinh vien diem cao nhat cua bang diem");
			System.out.println("10. Sap xep danh sach sinh vien theo ten");
			System.out.println("11. Tinh trung bình diem cua cac bang diem");
			System.out.println("12. Tim kiem sinh vien cua bang diem");
			System.out.println("0. Thoat");
			System.out.print("Moi ban chon: ");
			n = new Scanner(System.in).nextInt();
			switch(n) {
			case 1: 
				ds.nhap();
				break;
			case 2: 
				ds.xuat();
				break;
			case 3: 
				ds.luuFile();
				break;
			case 4: 
				ds.docFile();
				break;
			case 5: 
				ds.suaDiem();
				break;
			case 6: 
				ds.timKiemSVHocLai();
				break;
			case 7: 
				ds.themSVBD();
				break;
			case 8:
				ds.xoaSVBD();
				break;
			case 9:
				ds.svDiemCaoNhatBD();
				break;
			case 10:
				ds.sapXepSVTheoTenBD();
				break;
			case 11: 
				ds.tbDiemBD();
				break;
			case 12: 
				ds.timKiemSVBD();
				break;
			case 0:
				break;
			default:
				System.out.println("Nhap sai!");
			}
		}while(n!=0);
	}
}
