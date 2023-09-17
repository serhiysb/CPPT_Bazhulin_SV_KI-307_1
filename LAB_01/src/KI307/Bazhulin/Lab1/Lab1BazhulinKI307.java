package KI307.Bazhulin.Lab1;
import java.io.*;
import java.util.*;

/**
* Class Lab2BazhulinKI307 implements a task, form laboratory work №2
*
* @author SERHIY BAZHULNI
* @version 1.0
* @since version 1.0
*
*/

public class Lab1BazhulinKI307 {
	
	/**
	* Static method main is enter point in application
	*
	* @param args
	* @throws FileNotFoundException
	*
	*/

	
  public static void main(String[] args) throws FileNotFoundException {
    
    int nRows;
    char[][] arr;
    String filler;

    Scanner scan = new Scanner(System.in);
    File dataFile = new File("MyFile.txt");
    PrintWriter fout = new PrintWriter(dataFile);
    
    System.out.print("Input size of matrix: ");
    nRows = scan.nextInt();
    scan.nextLine();
    
    arr = new char[nRows][];
    for(int i = 0; i < nRows; i++)
    {
    arr[i]= new char[i+1];
    }
    
    System.out.print("\nInput filler symbol: ");
    filler = scan.nextLine();
    exit:
      
    for(int i = 0; i < nRows; i++) {
      for(int j = 0; j < i+1; j++) {
    	  if(i<nRows/2 || (j>nRows/2-1 && i>nRows/2-1))
    	  {
    		  if(filler.length() == 1) {
    	          arr[i][j] = (char) filler.codePointAt(0);
    	          System.out.print(arr[i][j] + " ");
    	          fout.print(arr[i][j]+" ");
    	          }
    	        else if (filler.length() == 0) {
    	          System.out.print("\nNo filler symbol entered");
    	          break exit;
    	        }
    	        else {
    	          System.out.print("\nToo many filler symbols");
    	          break exit;
    	  }
        }
    	  else
		  {
			  System.out.print("  ");
			  fout.print("  ");
		  }
      }
      System.out.print("\n");
      fout.print("\n");
    }
    fout.flush();
    fout.close();
  }
}








