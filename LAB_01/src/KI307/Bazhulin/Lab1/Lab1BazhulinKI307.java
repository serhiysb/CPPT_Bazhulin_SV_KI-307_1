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
    System.out.print("\nInput filler symbol: ");
    filler = scan.nextLine();
    
    arr = new char[nRows][];
    for(int i = 0; i < nRows; i++)
    {
    	arr[i]= new char[i < nRows/2 ? i + 1 : (i+1) - nRows/2];
    	
    	if(i+1==nRows/2||i==nRows-1)
    	{
    		
    		for(int j = 0; j<arr[i].length;j++)
    		{
    			arr[i][j] = '*';
    		}
    		
    		
    	}
    	else
    	{
    		for(int j = 0; j<arr[i].length;j++)
    		{
    			arr[i][j] = (char) filler.codePointAt(0);
    		}
    	}
    }
    exit:
      
    	for(int i = 0; i< nRows;i++)
    	{
    		if(i<nRows/2)
			{
    			for(int j = 0; j<nRows;j++)
        		{
    				if(j<arr[i].length)
    				{
    					System.out.print(arr[i][j]);
    					fout.print(arr[i][j]);
    				}
    				
    				else
    				{
    					System.out.print(" ");
    					fout.print(" ");
    				}
        		}
    			System.out.print("\n");
    			fout.print("\n");
			}
    		else
    		{
    			int k = 0;
    			for(int j=0;j<nRows;j++)
    			{
    				if(j<nRows/2)
    				{
    					System.out.print(" ");
    					fout.print(" ");
    				}
    				else
    				{
    					if(k<arr[i].length)
    					{
    						System.out.print(arr[i][k]);
    						fout.print(arr[i][k]);
    						k++;
    						
    					}
    					else
    					{
    						System.out.print(" ");
    						fout.print(" ");
    					}
    				}
   				
    			}
    			System.out.print("\n");
    			fout.print("\n");
    		}
    	}
    	
    	
      System.out.print("\n");
      fout.print("\n");
    
    fout.flush();
    fout.close();
  }
}








