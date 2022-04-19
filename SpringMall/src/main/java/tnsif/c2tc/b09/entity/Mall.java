package tnsif.c2tc.b09.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Mall {
	@Id
		private int id;
		//private MallAdmin mallAdmin;
		private String mallname;
		private String location;
		//private List<Shop> shops;
		public long getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMallName() {
			return mallname;
		}
		public void setMallName(String mallName) {
			this.mallname = mallName;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		@Override
		public String toString() {
			return "Mall [id=" + id + ", mallName=" + mallname + ", location=" + location + "]";
		}
		
}
