package tnsif.c2tc.b09.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.b09.Repo.MallRepo;
import tnsif.c2tc.b09.entity.Mall;
@Service
public class MallServiceImpl implements MallService {
@Autowired
MallRepo Mr;
	@Override
	public Mall addMall(Mall M) {
		return Mr.save(M);
		
	}

	@Override
	public int deleteMall(Mall M) {
		Mr.delete(M);
		return 0;
	}

	@Override
	public Mall updateMall(Mall M) {
		
		return Mr.save(M);
	}

	@Override
	public Mall getMall(int id) {
		Mall M=Mr.findById(id).get();
		return M;
	}
/*
	@Override
	public List<Mall> getMalls() {
		Mall M=Mr.findAll();
		return M;
	}*/

	@Override
	public List<Mall> getMalls() {
		// TODO Auto-generated method stub
		return null;
	}

	///*@Override
	//public List<Mall> getMalls() {
		//Mr.findAll();
		//return M ;
	}


