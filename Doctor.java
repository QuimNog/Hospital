package hospital;


import java.util.LinkedList;

public class Doctor extends Person		// Add code here
{
	private LinkedList< String > specialities;
	private LinkedList< Visit > visits;

	public Doctor( int id, String name ){
		super(id, name);
                specialities = new LinkedList<>();
                visits = new LinkedList<>();
	}
	
	public void addSpeciality( String s ){
		specialities.add(s);
	}
	
	public void addVisit( Visit v ){
		visits.add(v);
	}
	
	public void listSpecialities(){
		String s = toString()+" has specialities: ";
                int i;
                System.out.println(s);
                for(i=0; i<specialities.size(); i++){
                    System.out.println(specialities.get(i));
                }       
	}
	
	public void listVisits(){
		String n=null;
                int numberOfVisits; 
                numberOfVisits = visits.size();
                int i; 
                System.out.println(this.toString()+" has the following visits:");
                for(i=0; i<visits.size(); i++){
                    Visit aux = visits.get(i);
                    
                    System.out.println("Patient: "+aux.patient.name+
                            "\n On the: "+aux.date+
                            "\n The summary os the visit is: "+aux.summary);
                }
                	
        }
	
	public String toString(){ 
		
                return "Doctor "+name+" (ID "+id+" )";
	}
}
