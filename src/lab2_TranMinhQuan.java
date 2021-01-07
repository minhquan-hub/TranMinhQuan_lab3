import jdk.swing.interop.SwingInterOpUtils;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class lab2_TranMinhQuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.print("nhap a:");
         a = sc.nextInt();
        System.out.print("nhap b:");
         b = sc.nextInt();
        if (b == 0) {
            System.out.println("error:divide by zero");
        } else {
            c = a / b;
            System.out.println(c);
        }
        /*// LAB3 CAU2
        int a, b, c;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();
        int x1, x2, x3;
        int detal = sc.nextInt();
        detal = b * b - 4 * a * c

        if (detal < 0) {
            System.out.println("phuong trinh vo nghiem");
        } else if (detal = 0) {
            System.out.println("x1=x2=" + (-b / 2a));
        } else {
            System.out.println("x3=" +);
        }
        //LAB3 CAU3
        float a, b, c, d;
        float Max, Min;
        System.out.print("Nhap a: ");
        a = sc.nextFloat();
        System.out.print("Nhap b: ");
        b = sc.nextFloat();
        System.out.print("Nhap c: ");
        c = sc.nextFloat();
        System.out.print("Nhap d: ");
        d = sc.nextFloat();

        Max = a;
        Min = a;

        if (b > Max) {
            Max = b;
        } else if (c > Max) {
            Max = c;
        } else {
            Max = d;
        }
        if (b < Min) {
            Min = b;
        } else if (c < Min) {
            Min = c;
        } else {
            Min = d;
        }

        System.out.println("gia tri Max:" + Max);
        System.out.println("gia tri Min:" + Min);

        // LAB3 CAU4
        int a, b, c;
        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();

        if (a > b && a > c) {
            if (a > (b + c)) {
                System.out.println("a,b,c hop thanh mot tam giac");
            }
        } else if (b > c) {
            if (b > (a + c)) {
                System.out.println("a,b,c hop thanh mot tam giac");
            }
        } else {
            if (c > (a + b)) {
                System.out.println("a,b,c hop thanh mot tam giac");
            }
        }

        // LAB3 CAU5
        float a;
        System.out.print("so km khach hang di: ");
        a = sc.nextFloat();

        if (a < 1) {
            System.out.println("so tien:" + (a * 15000) + "d");
        } else if (1 < a <= 5) {
            System.out.println("so tien:" + (a * 13500) + "d");
        } else if (a > 5) {
            System.out.println("so tien:" + (a * 11000)"d");
        } else if (a > 120) {
            System.out.println("so tien:" + (a * 11000 * 0.1) + "d");
        }

        // LAB3 CAU6

        String kytu;
        System.out.print("Nhap chu cai: ");
        kytu = sc.nextLine();

        if ('a' <= kytu && kytu <= 'z' || 'A' <= kytu && kytu <= 'Z') {
            if (kytu.equals("a,A,o,O,e,E,u,U,i,I")) {
                System.out.println("ki tu nhap vao la nguyen am");
            } else {
                System.out.println("ky tu nhap vao la phu am");
            }
        } else {
            System.out.println("khong phai ky tu");
        }

        // LAB3 CAU7

        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\tMENU");
        System.out.println("==================");
        System.out.println(String.format("1. CF\n" + "2. C\n" + "3. HDJ\n" + "4. DREAMWAVER\n" + "5. RDBMS\n" + "6. LEARN JAVA BY EXAMPLE"));
        System.out.println("==================");
        System.out.print("Chon: ");
        int MENU = sc.nextInt();

        switch (MENU){
            case 1:
                System.out.println("Ban chon CF!");break;
            case 2:
                System.out.println("Ban chon C!");break;
            case 3:
                System.out.println("Ban chon HDJ!");break;
            case 4:
                System.out.println("Ban chon DREAMWAVER!");break;
            case 5:
                System.out.println("Ban chon RDBMS!");break;
            case 6:
                System.out.println("Ban chon LEARN JAVA BY EXAMPLE!");break;
            default:
                System.out.println("Ban vui long chon lai");
        }*/
        //
        }
    }

