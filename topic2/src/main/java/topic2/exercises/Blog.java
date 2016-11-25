package topic2.exercise1;

import static org.junit.Assert.*;

import java.io.IOException;
import org.junit.Before;
import org.junit.Test;

public class Blog
{

		
		
		@Before
		public void setUp() throws Exception 
		{
			BlogSoftware.Blog.setEntriesNull();
			
			for (int j=1; j<=11; j++)
			{
				
				Blog.getInstance().newEntry(new Entry("Title " +j, "This is entry number "+j));
				

			}
			
			
		}
		
		private static Object getInstance() 
		{
			// TODO Auto-generated method stub
			return null;
		}

		
		@Test	
		public void addEntry() throws IOException 
		{	
			 System.out.println("");
			 System.out.println("Test 1: Post new entry");
			 Blog.getInstance().newEntry(new Entry ("New entry","This is a new entry"));
			 /*First entry in the list must be the last one posted*/
			 assertTrue(Blog.getInstance().getEntries().get(0).getTitle().equals("New entry"));
			 Blog.getInstance().showRecentEntries();
		}
		
		
		@Test	
		public void deleteEntry() throws IOException 
		{		
			 System.out.println("");
			 System.out.println("Test 2: Delete existing entry");
			 Blog.getInstance().deleteEntry("Title 5");
			 /*Title 5 mustn't appear in this position*/
			 assertFalse(Blog.getInstance().getEntries().get(6).getTitle().equals("Title 5"));
			 Blog.getInstance().showRecentEntries();
		}
		
		
		@Test
		public void showRecentEntries() throws IOException
		{
			 System.out.println("");
			 System.out.println("Test 3: Show recent entries");
			 assertTrue(Blog.getInstance().getEntries().get(0).getTitle().equals("Title 11"));
			 Blog.getInstance().showRecentEntries();
		}

		
		
}