package topic5.topic5;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Id;
import org.mongodb.morphia.annotations.Property;

public abstract class Base
{
	 
    @Id
    @Property("id")
    protected ObjectId id;
 
    public Base()
    {
        super();
    }
 
    public ObjectId getId() 
    {
        return id;
    }
 
    public void setId(String j) 
    {
        this.id = new ObjectId(j);
    }
 

 
}