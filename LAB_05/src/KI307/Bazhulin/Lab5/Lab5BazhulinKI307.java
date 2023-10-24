package KI307.Bazhulin.Lab5;

import java.io.*;
import java.util.Scanner;

/**
 * Дана програма є класом драйвером який тестує роботу класу Calco, а також записує дані у файли
 * @author Serhiy Bazhulin KI-307
 * @version 1.0
 * @since version 1.0
*/

public class Lab5BazhulinKI307 {
    public static void main(String[] args)throws IOException {
        double x;
        String fileNameTxt = "resText.txt";
        String fileNameBin = "resBin.bin";
        Calco calco = new Calco();
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        x = s.nextDouble();
        calco.calculate(x);
        
        System.out.print("Result is: "+calco.getResult()+"\n");
        calco.writeResTxt(fileNameTxt);
        calco.writeResBin(fileNameBin);
        
        calco.readResTxt(fileNameTxt);
        System.out.print("Result of text file: "+calco.getResult()+"\n");
        calco.readResBin(fileNameBin);
        System.out.print("Result of bin file: "+calco.getResult()+"\n");
        
    }
}
