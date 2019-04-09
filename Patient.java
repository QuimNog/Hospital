package hospital;


import java.util.LinkedList;
import java.util.Date;

public class Patient extends Person implements Comparable<Patient>{
	protected Date admissionDate;
	protected Integer age;
	protected LinkedList<Visit> visits;

	public Patient( int id, String name, int age1 ){
		super(id,name);
                age = age1;
                visits = new LinkedList<>();
        }
	
	public void addVisit( Visit v ){
		visits.add(v);
                //System.out.println("the visit hhas been added to the patient "+name+" and the doctor is "+v.getDoctor().getName());
	}
		
	public void setAdmissionDate( Date d ){
		admissionDate =d;
	}
	
	public Date getAdmissionDate(){
		return admissionDate;
	}
	
	public void setAge( Integer age1 ){
                age=age1;
	}
	
	public Integer getAge(){
		return age;	
	}
        public LinkedList <Visit> getVisits (){
            return visits;
        }
	public int compareTo( Patient p ){      //take into account age and visits
		if(p.getAge()< age){
                    return -1;
                }
                if (p.getAge()== age){
                    if(p.getVisits().size()< visits.size()){
                        return -1;
                    }
                    else return 1;
                }
                else{
                        return 0;
                }
	}
	
	public String toString(){
            
                String n="";  
                return n+= name+"ID("+id+", age "+age;
	}
}
