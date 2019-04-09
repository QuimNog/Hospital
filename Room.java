package hospital;


import java.util.LinkedList;

public class Room{
	protected LinkedList< Bed > beds;
	private int roomID;
	
	public Room( int ID ){
		beds = new LinkedList<>();
                roomID = ID;
	}
        public int getID(){
            return roomID;
        }
	
	public void addBed( int bedID ){
            
            Bed newBed = new Bed(bedID, this);
            beds.add(newBed);
	}
	
	public Bed getBed( int idx ){
		return beds.get(idx);
	}
	
	public Bed getAvailableBed(){
            for(int i=0; i< beds.size();i++){
                if(beds.get(i).isAvailable()){
                    return beds.get(i);
                } 
            }
            return null; 
	}
	
	public boolean isAvailable(){
            for(int i=0; i< beds.size();i++){
                if(beds.get(i).isAvailable()){
                    return true;
                } 
            }
            return false; 
	}
	
	public String listBeds(){
		String n=null;
                int numberOfBeds; 
                numberOfBeds = beds.size();
                int i; 
                for(i=0; i<beds.size(); i++){
                    n += beds.get(i).toString();
                }
                return n;     
	}

	public String toString(){ 
		String n = null;
                n = ", room "+roomID+"\n";
                
                return n;
	}
}
