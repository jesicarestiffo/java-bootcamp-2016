package topic5.topic5;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;


	 
	
	public class CourseDAO extends BasicDAO <Course, String>
	{   
	 
		public CourseDAO (Morphia morphia, MongoClient mongoClient, String dbName)
	    {       
	        
	    	super(mongoClient, morphia, dbName);   
	    }
	 
	}

