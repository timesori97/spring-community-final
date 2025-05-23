package www.silver.dao;

import java.util.List;

import www.silver.VO.memberVO;

public interface IF_dao {

	public List<memberVO> selectall();
	public void insertone(memberVO mvo);
	public void deleteone(String id);
	public memberVO selectone(String id);
	public void update(memberVO mvo);
	
}
