import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.Scanner;
 
public class cWriteFile2
{
	private String[] _textarray;
	private String msCount;
	private int mnCount;
	
	 public void initFile()
	    {
	        final String fileName="file2.txt";
	        String text;
	        
	         
	        
	        try
	        {
	            File objFile=new File(fileName);
	            if(objFile.exists()==false)
	            {
	                if(objFile.createNewFile())
	                {
	                    System.out.println("File created successfully.");
	                }
	                else
	                {
	                    System.out.println("File creation failed!!!");
	                    System.exit(0);
	                }
	            }
	             
	              
	            //instance of FileWriter 
	            FileWriter objFileWriter = new FileWriter(objFile.getAbsoluteFile());
	            //instnace (object) of BufferedReader with respect of FileWriter
	            BufferedWriter objBW = new BufferedWriter(objFileWriter);
	            //write into file
	            objBW.write("START\n");
	  	        objBW.close();
	             
	            System.out.println("File saved.");
	        }
	        catch (Exception Ex)
	        {
	            System.out.println("Exception : " + Ex.toString());
	        }
	    }
	 
	 public void printFile()
	    {
	        final String fileName="file2.txt";
	         
	        try
	        {
	            File objFile=new File(fileName);
	            if(objFile.exists()==false)
	            {
	                System.out.println("File does not exist!!!");
	                System.exit(0);
	            }
	             
	            //reading content from file
	            String text;
	            int val;
	         
	            FileReader objFR=new FileReader(objFile.getAbsoluteFile());
	            BufferedReader objBR=new BufferedReader(objFR);
	            //read text from file
	            System.out.println("Content of the file is: ");
	            while((text=objBR.readLine())!=null)
	            {
	                System.out.println(text);
	            }
	             
	            objBR.close();          
	        }
	        catch (Exception Ex)
	        {
	            System.out.println("Exception : " + Ex.toString());
	        }
	    }
	 
	 public void writeFile(String _text)
    {
        final String fileName="file2.txt";
        String text;
        
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                System.out.println("File does not exist!!!");
                System.exit(0);
            }
             
            //reading content from file
            int val;
         
            FileReader objFR=new FileReader(objFile.getAbsoluteFile());
            BufferedReader objBR=new BufferedReader(objFR);
            //read text from file
             mnCount=0;
            _textarray = new String[100];
            while((text=objBR.readLine())!=null)
            {
            	_textarray[mnCount]=text;
            	mnCount++;
            }
             
            objBR.close();          
        }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
  
        
        try
        {
            File objFile=new File(fileName);
            if(objFile.exists()==false)
            {
                if(objFile.createNewFile())
                {
                    System.out.println("File created successfully.");
                }
                else
                {
                    System.out.println("File creation failed!!!");
                    System.exit(0);
                }
            }
             
              
            //instance of FileWriter 
            FileWriter objFileWriter = new FileWriter(objFile.getAbsoluteFile());
            //instnace (object) of BufferedReader with respect of FileWriter
            BufferedWriter objBW = new BufferedWriter(objFileWriter);
            //write into file
            for(int i=1;i<=mnCount;i++) {
            	objBW.write(_textarray[i-1]+"\n");
            }
             objBW.write(_text+"\n");
            objBW.close();
             
         }
        catch (Exception Ex)
        {
            System.out.println("Exception : " + Ex.toString());
        }
    }
}