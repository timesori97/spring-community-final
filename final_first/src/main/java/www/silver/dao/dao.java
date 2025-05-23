package www.silver.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import www.silver.VO.memberVO;

@Repository
public class dao implements IF_dao {
	
	@Inject
	private SqlSession sqlsession;
	

	@Override
	public List<memberVO> selectall() {
		
		  List<memberVO> mlist = sqlsession.selectList("www.silver.dao.IF_dao.selectall");
		
		return mlist;
	}

	@Override
	public void insertone(memberVO mvo) {
		
		sqlsession.insert("www.silver.dao.IF_dao.insertone", mvo);
		
	}

	@Override
	public void deleteone(String id) {
		sqlsession.delete("www.silver.dao.IF_dao.deleteone", id);
		
	}

	@Override
	public void update(memberVO mvo) {
		
		sqlsession.update("www.silver.dao.IF_dao.updateone", mvo);
		
	}

	@Override
	public memberVO selectone(String id) {
		
		
		return sqlsession.selectOne("www.silver.dao.IF_dao.selectone",id);
	}
	
	
	
}
