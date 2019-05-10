package com.soccerdb.oldschool.db.dao;
import java.util.List;

import com.soccerdb.oldschool.db.entity.Match;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface MatchDAO extends GenericDAO<Match, Integer>{
    //TODO please give aditional methods for 'Match' entity.
	public List<Match> selectByGameId(int game_id) throws Exception; 
	public List<Match> selectByClubId(int club_id) throws Exception; 
	public List<Match> selectBySeasonId(int season_id) throws Exception; 
    public void deleteMatch(Match match) throws Exception;
}