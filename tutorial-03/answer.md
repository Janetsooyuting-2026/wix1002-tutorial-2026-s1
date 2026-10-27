# Tutorial 02 — Answers

### Q1
(a)
boolean check* 8 == 27;
System.out.println("3 x 8 == 27: " + check);

(b)
if (number % 2 == 0) {
    System.out.println(number + " is even");
} else {
    System.out.println(number + " is odd");
}

(CCCC)
if (ch >= 'A' && ch <= 'Z') {
    System.out.println(ch + " is a capital letter");
} else {
    System.out.println(ch + " is not a capital letter");
}

(DDDD)
if (first.compareToIgnoreCase(second) <= 0) {
    System.out.println(first + " " + second);
} else {
    System.out.println(second + " " + first);
}

(e)
switch (day) {
    case 0:
        System.out.println("Sunday");
        break;
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thursday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    default:
        System.out.println("Invalid day");
}
### Q2
(a)
if (num1 == num2){
    System.out.println("Number 1 is equal to number 2.");}

(b)
if (x > y && x > z){
    System.out.println("x is the largest number");}

(CCCC)
String s1 = "Math" , s2 = "Science";
if (s1.equals(s2)){
    System.out.println("They are equal strings.");}
else{
    System.out.println("They are not equal strings.");}

(d)
if (x > 0 || y > 0){
    System.out.println("Either x or y is positive");}

### Q3
(a)
#####
$$$$$

(b)
#####
$$$$$

(c)
$$$$$

(d)
empty

### Q4
```
import java.util.*;

public class T3Q4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = keyboard.nextInt();
        int b = keyboard.nextInt();
        int c = keyboard.nextInt();

        int biggest = a;
        if (b > biggest) {
            biggest = b;
        }
        if (c > biggest) {
            biggest = c;
        }
        System.out.println("The biggest number is " + biggest);
    }
}
```
### Q5
```
import java.util.*;

public class T3Q5 {
    public static void main(String[] args) {
        Scanner tekan= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = tekan.nextInt();

        if(year % 4 == 0 ){
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
```