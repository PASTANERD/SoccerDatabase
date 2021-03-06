package com.soccerdb.oldschool.db.dao;

import java.util.List;

import com.soccerdb.oldschool.db.entity.Match;
import com.soccerdb.oldschool.db.source.ImplAbstractDAO;

public class ImplMatchDAO extends ImplAbstractDAO<Match, Integer> implements MatchDAO{

	public ImplMatchDAO() {
		super();
		namespace = "com.soccerdb.oldschool.db.dao.MatchDAO";
	}
	@Override
	public List<Match> selectByGameId(int game_id) throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectById", game_id);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Match> selectByClubId(int club_id) throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectById",club_id);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Match> selectBySeasonId(int season_id) throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectById",season_id);
		}finally {
			session.close();
		}
	}
	@Override
	public List<Match> selectByIsHome(boolean is_home) throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectByIsHome",is_home);
		}finally {
			session.close();
		}
	}

	@Override
	public List<Match> selectORderByGameId() throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByGameId");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Match> selectORderByClubId() throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderByClubId");
		}finally {
			session.close();
		}
	}
	@Override
	public List<Match> selectORderBySeasonId() throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			return session.selectList(namespace + ".selectOrderBySeasonId");
		}finally {
			session.close();
		}
	}
	@Override
	public void deleteMatch(Match match) throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			session.delete(namespace + ".deleteMatch", match);
		}finally {
			session.close();
		}
	}
	@Override
	public void updateMatch(Match match) throws Exception {
		
		try {
			session = getSqlSessionFactory().openSession();
			session.update(namespace + ".updateMatch", match);
		}finally {
			session.close();
		}
	}
	
}
