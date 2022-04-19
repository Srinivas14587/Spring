package tnsif.c2tc.b09.Service;

import java.util.List;

import tnsif.c2tc.b09.entity.Mall;

public interface MallService {
    public Mall addMall(Mall M);
    public int  deleteMall(Mall M);
    public Mall updateMall(Mall M);
    public Mall getMall( int id );
    public List<Mall> getMalls();
   
}
