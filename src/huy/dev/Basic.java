package huy.dev;

import java.util.Scanner;

import java.util.Scanner;
public class Basic {
		
		public static void main(String[] args) {
			System.out.println("nhap so a vao : ");
			float a= new Scanner(System.in).nextInt();
			System.out.println("nhap so b vao : ");
			float b= new Scanner(System.in).nextInt();
			System.out.println("nhap so a vao : ");
			float c= new Scanner(System.in).nextInt();
			Basic.giaiptb2(a,b,c);

		}
		public static void giaiptb2(float a, float b, float c) {
	        if (a == 0) {
	            if (b == 0) {
	                System.out.println("Phuong trinh vo nghiem");
	            } else {
	                System.out.println("Phuong trinh co 1 nghiem: "
	                        + "x = " + (-c / b));
	            }
	            return;
	        }
	        float delta = b*b - 4*a*c;
	        float x1;
	        float x2;
	        if (delta > 0) {
	            x1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
	            x2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
	            System.out.println("Pt co 2 nghiem la : "
	                    + "x1 = " + x1 + " và x2 = " + x2);
	        } else if (delta == 0) {
	            x1 = (-b / (2 * a));
	            System.out.println("Pt co nghiem kep la : "
	                    + "x1 = x2 = " + x1);
	        } else {
	            System.out.println("Pt vo nghiem!");
	        }
	    }
	}

