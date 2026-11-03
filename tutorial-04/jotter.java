import java.util.*;
public class jotter{
    public static void main(String[]args){
        Scanner tekan=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sent=tekan.nextLine();
        String terbalik="";
        for(int i=sent.length()-1;i>=0;i--){
            terbalik+=sent.charAt(i);
        }
        System.out.println("Reverse : "+terbalik);
    }
}