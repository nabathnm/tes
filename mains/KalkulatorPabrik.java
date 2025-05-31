import java.util.Scanner;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=============================================");
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan");
        System.out.println("NABATH NUUR MUHAMMAD");
        System.out.println("245150700111031");
        System.out.println("=============================================");
        System.out.println("Donat dengan lubang");
        System.out.println("=============================================");
        
        // Input untuk Torus (Donat dengan lubang)
        System.out.print("Isikan Radius : ");
        double radiusMajor = scanner.nextDouble();
        
        System.out.print("Isikan radius : ");
        double radiusMinor = scanner.nextDouble();
        
        Torus donatLubang = new Torus(radiusMajor, radiusMinor);
        
        System.out.println("=============================================");
        donatLubang.printInfo();
        System.out.println("=============================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("=============================================");
        // Input untuk Sphere (Donat tanpa lubang)
        System.out.print("Isikan radius : ");
        double radiusSphere = scanner.nextDouble();
        
        Sphere donatTanpaLubang = new Sphere(radiusSphere);
        
        System.out.println("=============================================");
        donatTanpaLubang.printInfo();
        System.out.println("=============================================");
        
        scanner.close();
    }
}