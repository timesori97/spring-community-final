package www.silver.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import www.silver.VO.memberVO;
import www.silver.dao.IF_dao;

@Service
public class service implements IF_service {

	@Inject
	private IF_dao dao;

	@Override
	@Transactional
	public void insertone(memberVO mvo) {
		
		dao.insertone(mvo);
		
	}


	@Override
	public memberVO selectone(String id) {
		
		return dao.selectone(id);
		
	}

	@Override
	public memberVO viewDetail(String id) {
			memberVO m = dao.selectone(id);
		return m;
	}
	
	
	

}
