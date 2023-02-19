package bai.lap2;

import java.util.Scanner;

public class bai7 {
    public static void docso()
    {
        int a,b,c;
        Scanner sc = new Scanner (System.in);
        System.out.print(" nhap ba chu so");
        a= sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        switch(a)
        {
            case 0 -> System.out.print("  ");
            case 1 -> System.out.print(" mot tram ");
            case 2 -> System.out.print(" hai tram ");
            case 3 -> System.out.print(" ba tram ");
            case 4 -> System.out.print(" bon tram ");
            case 5 -> System.out.print(" nam tram ");
            case 6 -> System.out.print(" sau tram ");
            case 7 -> System.out.print(" bay tram ");
            case 8 -> System.out.print(" tam tram ");
            case 9 -> System.out.print(" chim tram ");
             default -> System.out.println("vui long nhap lai");
        }
         switch(b) 
         {
            case 0 -> System.out.print(" le ");
            case 1 -> System.out.print(" muoi ");
            case 2 -> System.out.print(" hai muoi ");
            case 3 -> System.out.print(" ba muoi ");
            case 4 -> System.out.print(" bon muoi ");
            case 5 -> System.out.print(" nam muoi ");
            case 6 -> System.out.print(" sau muoi ");
            case 7 -> System.out.print(" bay muoi ");
            case 8 -> System.out.print(" tam muoi ");
            case 9 -> System.out.print(" chim muoi ");
         default -> System.out.println("vui long nhap lai");
         }     
        switch(c)   
        {
            case 0 -> System.out.print(" ");
            case 1 -> System.out.print(" mot ");
            case 2 -> System.out.print(" hai  ");
            case 3 -> System.out.print(" ba  ");
            case 4 -> System.out.print(" bon  ");
            case 5 -> System.out.print(" nam  ");
            case 6 -> System.out.print(" sau  ");
            case 7 -> System.out.print(" bay  ");
            case 8 -> System.out.print(" tam  ");
            case 9 -> System.out.print(" chin ");
            default -> System.out.println("vui long nhap lai");
        }
    }
    public static void main (String[] arg)
    {
        docso();
    }
}
