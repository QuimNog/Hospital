package hospital;


import java.util.LinkedList;
import java.util.Date;

public class Administrative extends Person// Add code here
{

	private Hospital hospital;	
	
	public Administrative( int id, String name, Hospital hospital1 ){
                super(id,name);
                hospital = hospital1; 
	}
	
	public void addVisit( Date d, String s, Doctor doc, Patient p ){
                Visit newVisit = new Visit(d, s, doc, p);
                hospital.addVisit(newVisit);
                doc.addVisit(newVisit);
                p.addVisit(newVisit);   
	}

	public boolean assignBed( Resident resident  ){
            for(int i=0;i<hospital.getRooms().size();i++){
                Room aux= hospital.getRoom(i);
                if(aux.isAvailable()){
                    resident.assignRoom(aux);
                    Bed newbed = aux.getAvailableBed(); 
                    resident.assignBed(newbed);
                    
                    return true;
                }
            } 
            return false;  
	}
	
	public String toString(){ 	
            String n= "Administrative "+ name+" (ID "+ id +" )";
            return n;
 	}
}
