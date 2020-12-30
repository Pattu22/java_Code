import java.io.*;
class task2
{
    public static void main(String args[]) throws IOException
	{
	   File f1=new File("F:\\file handling\\task2\\entry1.txt");
	   File f2=new File("F:\\file handling\\task2\\entry2.txt");
	   File f3=new File("F:\\file handling\\task2\\result.txt");
	   
	    String data1,data2;
	   PrintWriter pw=new PrintWriter("F:\\file handling\\task2\\result.txt");
	   FileReader fr1=new FileReader(f1);
	   BufferedReader br1=new BufferedReader(fr1);
	   FileReader fr2=new FileReader(f2);
	   BufferedReader br2=new BufferedReader(fr2);
	   data1=br1.readLine();
	  data2=br2.readLine();
	   while((data1!=null) || (data2!=null))
	   {  
          
		   pw.println(data1);
		   data1=br1.readLine();
		   pw.println(data2);
		   data2=br2.readLine();
	   }
	    System.out.println("TASK DONE");
	   br1.close();
	   br2.close();
	   pw.close();
	}
}	