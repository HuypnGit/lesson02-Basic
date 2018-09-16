package huy.dev;

import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {		
				System.out.println("nhap so a vao : ");
				int a= new Scanner(System.in).nextInt();
				System.out.println("nhap so b vao : ");
				int b= new Scanner(System.in).nextInt();
				int Tong;
				double Hieu;
				double Thuong;
				int Tich;
				Tong = a+b;
				Hieu = a/b;
				Tich =a*b;
				Thuong=a-b;
				System.out.println("Tong cua "+a+" a "+b+" la "+Tong);
				System.out.println("Hieu cua "+a+" a "+b+" la "+Hieu);
				System.out.println("Tich cua "+a+" a "+b+" la "+Tich);
				System.out.println("Thuong cua "+a+" a "+b+" la "+Thuong);
		}
}
