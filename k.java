import java.io.*;
import java.io.File;
public class k {

	public static void main(String[] args) throws IOException{
		File f1=new File("C:/Users/KALIA/kkk.txt");
		File f2=new File("C:/Users/KALIA/kkk.txt");
		if(!f1.exists())
		{
			f1.createNewFile();
		}
		if(!f2.exists())
		{
			f2.createNewFile();
		}
		FileOutputStream fout=new FileOutputStream(f1);
		String s="this data is of file1 and will be copy to file 2";
		char ch[]=s.toCharArray();
		int i=0;
		for(i=0;i<s.length();i++)
		{
			fout.write(ch[i]);
		}
		FileInputStream fin=new FileInputStream(f1);
		FileOutputStream fout2=new FileOutputStream(f2);
		i=fin.read();
		while(i!=-1)
		{
			fout2.write((char)i);
			System.out.println(i+" : "+(char)i);
			i=fin.read();
			
		}
		fin.close();
		fout.close();
		fout2.close();
	}

}