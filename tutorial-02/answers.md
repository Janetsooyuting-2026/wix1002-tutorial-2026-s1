# Tutorial 02 — Answers

### Q1

public class T2Q1 {
    public static void main(String[] args) {
        System.out.print("Knowledge");
        System.out.print("is");
        System.out.println("Power");
        
        System.out.println ("Knowledge\nis\nPower");
    }
}

### Q2

public class T2Q2 {
    public static void main(String[] args) {
        System.out.println("\"RAM\" is Random Acess Memory.");
    }
}

### Q3

public class T2Q3 {
    public static void main(String[] args) {
        System.out.println("\t the real Tab");
        System.out.println("\\t is to show the syntax.");
    }
}

### Q4

public class T2Q4 {
    public static void main(String[] args) {
        String haha = "No code, Just choose the suitable Data Type";
        System.out.println (haha);
    }
}

### Q5

public class T2Q5 {
    public static void main(String[] args) {
        System.out.println("===Data Casting===");
        int num=300;
        System.out.printf("Let it be double like %.2f%n ok", (double)num);
    }   
}

### Q6

import java.util.*;

public class T2Q6 {
    public static void main(String[] args) {
        Scanner tekan = new Scanner(System.in);
        System.out.print("Enter weight(kg): ");
        double w = tekan.nextDouble();
        System.out.print("Enter height(m): ");
        double h = tekan.nextDouble();
        double bmi = w/(h*h);
        System.out.printf("BMI : %.2f",bmi);
        System.out.println("");
    }
}

### Q7

import java.util.*;

public class T2Q7 {
    public static void main(String[] args) {
        Scanner tekan = new Scanner (System.in);
        System.out.print("Diameter : ");
        double dia = tekan.nextDouble();
        
        double rad = dia/2;
        double area = Math.PI *rad*rad;
        System.out.printf("Area : %.2f Square Units",area);
        System.out.println("");
    }
}