import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

import java.io.FileWriter;
import java.io.FileNotFoundException;

public class HWProject {
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String strload;
        Scanner scannerload = new Scanner(System.in);
        
        System.out.println("�п�J�ɦW");
        strload = scannerload.nextLine();
        try {
           FileReader fr = new FileReader(strload+".txt");
           BufferedReader br = new BufferedReader(fr);
           String strtxt[] = br.readLine().split(",");		//�r����� �s�J�}�C
           
           br.close();
           System.out.println("�ɦW:"+strload+".txt");
           System.out.println("�аݭn1.���W �٬O2.����");
           System.out.println("�п�J1�άO2");
           int chose = scannerload.nextInt();

           switch(chose) {

             case 1:
            	 int a[] = new int[strtxt.length]; 
                 for(int i=0;i<strtxt.length;++i){  
              	 a[i] = Integer.valueOf(strtxt[i]); 
              	 } 
           	     Arrays.sort(a);

           	  String strsave;
              System.out.println("�п�J�s���ɦW");
              Scanner scannersave = new Scanner(System.in);
              strsave = scannersave.next();
              FileWriter fw = new FileWriter(strsave+".txt");

              fw.write(Arrays.toString(a));
              fw.flush();
              fw.close();
              scannersave.close();
             break; 

   	         case 2:
   	        	int b[] = new int[strtxt.length]; 
                for(int i=0;i<strtxt.length;++i){  
             	 b[i] = Integer.valueOf(strtxt[i]); 
             	 } 
   	        	Arrays.sort(b);
   	        	
   	        	
   	        	String strsave2;
   	            System.out.println("�п�J�s���ɦW");
   	            Scanner scannersave2 = new Scanner(System.in);
   	            strsave2 = scannersave2.next();
   	            FileWriter fw2 = new FileWriter(strsave2+".txt");
   	            
   	            for(int i=b.length-1;i>=0;i--)
           	    fw2.write(b[i]+",");
             
   	            fw2.flush();
   	            fw2.close();
   	            scannersave2.close();
   	         break; 
   	         default:
   	    	     System.out.println("��J���~");
             }
           scannerload.close();
           
        } catch (FileNotFoundException e) {
        	   // TODO Auto-generated catch block
        	   e.printStackTrace();
        } catch (IOException e) {
        	   // TODO Auto-generated catch block
        	   e.printStackTrace();
        	  }
	}
	

}
           

        
        
        
        
      
        


