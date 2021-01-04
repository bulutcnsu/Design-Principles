
public class EmailService  {
	
	public void addReceipe() {
		System.out.println("Receipe is added");
	}
	
	
	public boolean send(NetworkCloud cloud, VirusFilter filter) {
	if(cloud.isAddingCloud() && filter.passDMARC()) {
		
		return true;		
	}
	else {
		return false;
	}	
	}

}
