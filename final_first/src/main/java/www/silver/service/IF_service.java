package www.silver.service;

import java.util.List;

import www.silver.VO.memberVO;

public interface IF_service {

	public void insertone(memberVO mvo);
	public memberVO selectone(String id);
	public memberVO viewDetail(String id);
	
}
