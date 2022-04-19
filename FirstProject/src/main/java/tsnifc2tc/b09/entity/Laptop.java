package tsnifc2tc.b09.entity;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
 private int  lid;
 private String lname;
public int getLid() {
	return lid;
}
public void setLid(int lid) {
	this.lid = lid;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
  public void Show()
  {
	  System.out.println("in laptop class");
  }
 
}
