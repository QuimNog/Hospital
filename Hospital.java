package hospital;


import java.util.LinkedList;
import java.util.Collections;


public class Hospital{
	protected LinkedList< Administrative > admins;
	protected LinkedList< Doctor > doctors;
	protected LinkedList< Patient > patients;
	protected LinkedList< Room > rooms;
	protected LinkedList< Visit > visits;
	protected String name;
     
	public Hospital( String name1 ){
		name = name1;
                admins = new LinkedList<>();
                doctors = new LinkedList<>(); 
                patients= new LinkedList<>();
                visits= new LinkedList<>();
                rooms = new LinkedList<>();
                
	}
	
	public void addAdmin( Administrative a ){	
            admins.add(a);
	}

	public Administrative getAdmin( int idx ){
		return admins.get(idx);
                
	}
	
	public void addDoctor( Doctor d ){
		doctors.add(d);
	}

	public Doctor getDoctor( int idx ){
		return doctors.get(idx);
	}

	public void addRoom( int id ){
                Room newroom; 
                newroom = new Room(id);
                rooms.add(newroom);
	}

	public Room getRoom( int idx ){
		return rooms.get(idx);
	}	
	
	public LinkedList< Room > getRooms(){
		return rooms; 	
	}
	
	public void addResident(  int id, String name, int age ){
		Patient newresident;
                newresident = new Resident(id, name, age);
                this.patients.add(newresident);
                
                this.admins.get(0).assignBed(((Resident)newresident));
                
                //System.out.println("The resident "+name+" has been added\n");
                
	}
	
	public void addVisitor( int id, String name, int age ){
		Patient newvisitor; 
                newvisitor = new Visitor(id,name,age);
                this.patients.add(newvisitor);
                //System.out.println("The visitor "+name+" has been added\n");
	}
	
	public void addVisit( Visit v ){
		visits.add(v);
	}
	
	public Visit getVisit( int idx ){
		return visits.get(idx);
	}
	
	public Patient getPatient( int idx ){
		return patients.get(idx);
	}

	public void deletePatient( int idx ){
		patients.remove(idx);
	}
	
	public void assignBeds( int adminIdx ){
                int i;
                
                for(i=0; i<patients.size();i++){
                    Patient aux = patients.get(i);
                    if(aux instanceof Resident){
                        admins.get(adminIdx).assignBed(((Resident)aux)); 
                        
                    }
                }
	}

	public void sortPatients(){
		Collections.sort(patients);
                
	}
	
	public String toString(){
            String n= null;
            n= name+ ":\n";
            n+= "Doctors:\n";
            for(int i= 0;i<doctors.size();i++){
                n+=doctors.get(i).toString()+"\n";
            }
            n+="Administrative:\n";
            for(int i=0; i< admins.size();i++){
                n+= admins.get(i).toString()+"\n";
            }
            
            n+="Patients:\n";
            for(int i=0; i<this.patients.size(); i++){
                if(this.patients.get(i) instanceof Resident){
                    Resident r1 = ((Resident)this.patients.get(i));
                    n+="Resident: "+r1.toString()+" )\n"; 
                }
                else if(this.patients.get(i) instanceof Visitor){
                    Visitor v1 = ((Visitor)this.patients.get(i));
                    n+="Visitor: "+v1.toString()+")\n";
                }
                
                
            }
            
            
            return n;
            
                
	
        }
        

}
