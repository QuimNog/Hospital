package hospital;

public class Person{
	public int id;
	public String name;
	
	public Person( int i, String n ){
		id = i;
                name = n;
	}
	
	public int getID(){
		return id;
	}
	public String getName(){
		return name;	
	}
	public void setID( int i ){
		id=i;
	}
	public void setName( String n ){
		name =n;
	}
	public String toString(){
		return "hello";
	}
}
