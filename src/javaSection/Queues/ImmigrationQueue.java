package javaSection.Queues;

//import java.util.Date;

public class ImmigrationQueue {
	private int qLength;
	singleNode first, last;
	
	public ImmigrationQueue(){
		qLength = 0;
		first = null;
		last=null;
	}
	
	// Function to add new visitor in the queue
	public void addVisitor(String visitorName, String dOB, String passportNumber, 
			String citizenshipCountry, String visaType, String visitingReason, String dateOfEntry){
		
		singleNode temp = new singleNode(visitorName, dOB, passportNumber, citizenshipCountry, visaType, visitingReason, dateOfEntry);
		
		//if there is no one in the queue
		if(qEmpty() == true){
			first = temp;
		}	
		else{
			last.setNextNode(temp);
		}
		last = temp;
		qLength++;
	}
	
	// Function to remove the visitor from queue after he is interviewed
	public void attendedVisitor(){
		if(qEmpty() == true){
			System.out.println("There is no visitor to be attended.");
		}
		else{
			String currentVisitor = this.first.getVisitorName();
			System.out.println("Attending Visitor " + currentVisitor);
			// Add VISIOR DETAILS
			
			//
			first = first.getNextNode();
			qLength--;
			System.out.println(currentVisitor + " Visitor removed from Queue.");
		}
	}
	
	// Function to return the number of the Visitors to be attended by Immigration Officers
	public void queueSize(){
		System.out.println("There are "+ qLength + " Visitors in the Queue.");
		
	}
	
	
	public boolean qEmpty(){
		if(qLength == 0){
			return true;
		}
		else{
			return false;
		}
	}
}
