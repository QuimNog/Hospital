package hospital;



public class Resident extends Patient// Add code here
{
	private Room room;
	private Bed bed;
        

	public Resident ( int id, String name, int age ){
            super(id, name,age);
            
		
	}
	
	public void assignRoom( Room r ){
		room=r;
                
                System.out.println("the room has been assigned");
	}
	
	public void assignBed( Bed b ){
		bed =b;	
                //System.out.println("a bed has been assigned");
	}
	
	public Doctor getDoctor(){
            return visits.get(0).getDoctor();
	}
	
	public String toString(){
		String n="";
                n+=super.toString();
                if(room == null){
                    if(bed == null){
                        n+="No rooom and no bed"; 
                    }
                    else{
                       n+="No room, yes bed: "+bed.toString();
                    }
                }
                else{
                    if(bed == null){
                        n+= "No bed, yes room: "+room.toString(); 
                    }
                    else{
                    n+= room.toString()+bed.toString();    
                    }
                    
                }
                
                
                return n;
                
	}
}
