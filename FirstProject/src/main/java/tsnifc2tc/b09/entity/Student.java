package tsnifc2tc.b09.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class Student {

	private int uid;
	private String name;
	@Autowired
	Laptop l;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void  display(){
		System.out.println("in student class");
		l.Show();
	}
}
