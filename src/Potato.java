public class Potato {
private String girlName;

public Potato (String name){
	girlName=name;
}

public void setName (String name){
	girlName=name;
	
}
public String getName(){
	return girlName;
}
public void saying () {
	System.out.printf("Your first gf was %s\n", getName());
}
}
