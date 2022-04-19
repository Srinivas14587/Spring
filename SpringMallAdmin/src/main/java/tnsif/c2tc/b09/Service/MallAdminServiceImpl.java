package tnsif.c2tc.b09.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import tnsif.c2tc.b09.Repo.MallAdminRepo;
import tnsif.c2tc.b09.entity.MallAdmin;
@Service
public class MallAdminServiceImpl implements MallAdminService {
	@Autowired
public MallAdminRepo Mr;
	

	@Override
	public MallAdmin deleteMallAdmin(int id ) {
		
		MallAdmin MA=Mr.findById(id).get();
		 Mr.delete(MA);
		 return MA;
	}

	@Override
	public MallAdmin updateMallAdmin(MallAdmin M) {
		
		return Mr.save(M);
	}


	@Override
	public List<MallAdmin> getMallAdmins() {
		
		return null;
	}

	@Override
	public MallAdmin getMallAdmin(int id) {
		MallAdmin M=Mr.findById(id).get();
		return M ;
	}

	@Override
	public MallAdmin addMallAdmin(MallAdmin M) {
		
		return Mr.save(M);
	}
}
	


