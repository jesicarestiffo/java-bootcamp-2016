package topic5.topic5;

import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.dao.BasicDAO;
import com.mongodb.MongoClient;

public class List2DAO extends BasicDAO <List2DAO, String>
{  
		 
	public List2DAO (Morphia morphia, MongoClient mongoClient, String dbName)
	{       
		        
		    	super(mongoClient, morphia, dbName);   
	}
		 
		

}
