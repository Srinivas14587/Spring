package tnsif.c2tc.b09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MallAdmin {
	@Id
		private int  id;
		private String name;
		private String password;
		
		private int phone;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public int  getPhone() {
			return phone;
		}
		public void setPhone(int  phone) {
			this.phone = phone;
		}
		@Override
		public String toString() {
			return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", phone=" + phone + "]";
		}
		
}
