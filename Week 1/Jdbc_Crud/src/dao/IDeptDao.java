package dao;

import java.util.List;

import entity.Dept;

public interface IDeptDao {
	public int insert (Dept dept);
	public int update (Dept dept);
	
	public int deleteOne (int dno);
	public int selectOne (int dno);

	public List<Dept> selectAll();


}
