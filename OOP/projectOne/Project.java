package projectOne;

public class Project {
	 private String name;
	 private String description;
	
	public Project() {
		this.name="defult";
		this.description="defult des";
	}
		
	public Project(String name) {
	this.name= name;
	}

	public Project(String name, String description) {
		this.name= name;
		this.description=description;
	}
	
public String elevatorPitch () {
	return this.name + "," + this.description;
}

public String getName () {
	return this.name ;
}
public String getDescription () {
	return this.description ;
}


public void setName (String name) {
	this.name= name;
}

public void setDescription (String description) {
	this.description= description;
}

}
