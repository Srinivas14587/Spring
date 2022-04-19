package tnsif.c2tc.b09.Service;

import java.util.List;

import tnsif.c2tc.b09.entity.MallAdmin;



public interface MallAdminService {
	public MallAdmin addMallAdmin (MallAdmin M) ;
	 public MallAdmin deleteMallAdmin(int id);
	 public MallAdmin updateMallAdmin(MallAdmin M);
	 public MallAdmin getMallAdmin (int  id);
	 public List<MallAdmin> getMallAdmins();
	//int deleteMallAdmin(MallAdmin M);

}
