package huynhnhathao;

import java.util.Scanner;


public class TestMang {
		//hàm kiểm tra số nguyên tố
		static boolean kiemTraSoNguyenTo(int a)
		{
			int bienDem=0;
			for (int i = 1; i < a; i++) {
				if(a%i==0)
					bienDem++;
			}
			if(bienDem==1) return true;
			else return false;
		}
		
		//hàm tính mảng số nguyên tố
		static void inMangNguyenTo(int []mang,int phanTuMang)
		{
			int []mangNguyenTo=new int[phanTuMang];
			int z=0;
			int DemSoNguyenTo=0;
			for (int i = 0; i < mang.length; i++) {
				if(kiemTraSoNguyenTo(mang[i])==true)
				{
					mangNguyenTo[z]=mang[i];
					z++;
					DemSoNguyenTo++;
				}
			}
			for (int i = 0; i < z; i++) {
				System.out.print(" "+mangNguyenTo[i]);
			}
			System.out.print("-> "+DemSoNguyenTo+" số nguyên tố");
		}
		
		//hàm tính mảng không là số nguyên tố
		static void inMangKhongNguyenTo(int []mang,int phanTuMang)
		{
			int []mangKhongNguyenTo=new int[phanTuMang];
			int z=0;
			int DemSoKhongNguyenTo=0;
			for (int i = 0; i < mang.length; i++) {
				if(kiemTraSoNguyenTo(mang[i])==false)
				{
					mangKhongNguyenTo[z]=mang[i];
							z++;
							DemSoKhongNguyenTo++;
				}
			}
			for (int i = 0; i < z; i++) {
				System.out.print(" "+mangKhongNguyenTo[i]);
			}
			System.out.print("-> "+DemSoKhongNguyenTo+" số không nguyên tố");
		}
		public static void main(String[] args) {
			int []mang;
			int PhanTu;
			int []mangChan;
			int DemSoChan=0;
			int j=0;
			int []mangLe;
			int DemSoLe=0;
			int k=0;
			
			System.out.println("nhập số phần tử:");
			Scanner sc=new Scanner(System.in);
			PhanTu=sc.nextInt();
			mang=new int[PhanTu];
			mangChan=new int[PhanTu];
			mangLe=new int[PhanTu];
			
			
			// nhập các giá trị của các phần tử trong mảng
			System.out.println("nhập các giá trị mảng:");
			for (int i = 0; i < mang.length; i++) {
				mang[i]=sc.nextInt();
				
				//kiểm tra mảng lẻ với biến tạm k
				if(mang[i]%2!=0)
				{
					mangLe[k]=mang[i];
					k++;
					DemSoLe++;
				}
				
				
				//kiểm tra mảng chẵn với biến tạm j
				if(mang[i]%2==0)
				{
					mangChan[j]=mang[i];
					j++;
					DemSoChan++;
				}
			}
			//các phần tử là số chẵn
			System.out.print("In mảng chẵn:");
			for (int i = 0; i < j; i++) {
				System.out.print(" "+mangChan[i]);
			}
			System.out.print("-> "+DemSoChan+" số chẵn");
			System.out.println();
			
			//các phần tử là số lẻ
			System.out.print("In mảng lẻ:");
			for (int i = 0; i < k; i++) {
				System.out.print(" "+mangLe[i]);
			}
			System.out.print("-> "+DemSoLe+" số lẻ");
			System.out.println();
			
			
			//các phần tử là số nguyên tố
			System.out.print("In mảng nguyên tố:");
			inMangNguyenTo(mang, PhanTu);
			System.out.println();
			
			//các phần tử không là số nguyên tố
			System.out.print("In mảng không phải là số nguyên tố:");
			inMangKhongNguyenTo(mang, PhanTu);
	}

}
