package KI307.Bazhulin.Lab5;

import java.util.Scanner;

import java.io.*;

/**
 * Тут реалізований клас Calco, який рахує Ctg введеного числа
 * @author Serhiy Bazhulin KI-307
 * @version 1.0
 * @since version 1.0
 */
public class Calco {
	private double res;
   
    public void calculate(double x) throws ArithmeticException
    {
    	if (Math.tan(x) == 0) {
          throw new ArithmeticException("Exception: Tan is equal to 0!!!\n");
      } else {
          res = 1 / Math.tan(x);
      }
    }
    
    public void writeResTxt(String fileName) throws FileNotFoundException
    {
    	PrintWriter f = new PrintWriter(fileName);
    	f.printf("%f ",res);
    	f.close();
    }
    
    public void readResTxt(String fileName)
    {
    	try
    	{
    		File f = new File (fileName);
    		if (f.exists())
    		{
    			Scanner s = new Scanner(f);
    			res = s.nextDouble();
    			s.close();
    		}
    		else
    			throw new FileNotFoundException("File " + fileName + "not found");
    		}
    	catch (FileNotFoundException ex)
    	{
    		System.out.print(ex.getMessage());
    	}
    }
    
    public void writeResBin(String fileName) throws FileNotFoundException, IOException
    {
    	DataOutputStream f = new DataOutputStream(new FileOutputStream(fileName));
    	f.writeDouble(res);
    	f.close();
    }

    public void readResBin(String fileName) throws FileNotFoundException, IOException
    {
    	DataInputStream f = new DataInputStream(new FileInputStream(fileName));
    	res = f.readDouble();
    	f.close();
    }
    
    public double getResult()
    {
    	return this.res;
    }
}
