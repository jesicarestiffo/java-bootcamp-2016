package topic2.exercise1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class RecentFileList 
{

	private File[] files;
	private File f;
	private int cont = 0;

	public RecentFileList() 
	{
		files = new File[15];
	}

	public void openFile(String file) 
	{
		// TODO Auto-generated method stub
		f = new File(file);
		String line;
		if (f.exists()) 
		{

			putFile(f);

			BufferedReader buff = null;
			try 
			{
				buff = new BufferedReader(new FileReader(f));
				
				while ((line = buff.readLine()) != null) 
				{
					System.out.println(line);
				}
				
			}
			
			catch (IOException e) 
			{
				System.err.println(e);
			}
			
			finally 
			{

				try 
				{
					buff.close();

				} 
				
				catch (IOException e) 
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} 
		
		else 
		{
			System.out.println("no existe el archivo");
		}
	}

	public int getCont() 
	{
		return cont;
	}

	private void putFile(File f) 
	{
		if (existFile(f) == true)
			putExistFile(f);
		else 
		{
			if (cont == 15) 
			{
				for (int i = 14; i > 0; i--) 
				{
					files[i] = files[i - 1];
				}
				files[0] = f;
			} 
			
			else
				files[cont++] = f;
		}
	}

	private boolean existFile(File file1) 
	{
		boolean exist = false;
		for (File file2 : files) 
		{
			if (file1.equals(file2)) 
			{
				exist = true;
			}
		}
		return exist;
	}

	private void putExistFile(File file1)
	{
		int num = -1;
		for (File file2 : files) 
		{
			num++;
			if (file1.equals(file2)) 
			{

				for (int i = num; i > 0; i--)
				{
					files[i] = files[i - 1];
				}
				files[0] = file1;
			}
		}
	}

	private File[] getFiles() 
	{
		return files;
	}

	public String showList() 
	{
		// TODO Auto-generated method stub
		return Arrays.toString(getFiles());
	}

}