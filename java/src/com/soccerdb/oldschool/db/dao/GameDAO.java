package com.soccerdb.oldschool.db.dao;
import java.util.List;
import java.util.Date;

import com.soccerdb.oldschool.db.entity.Game;
import com.soccerdb.oldschool.db.source.GenericDAO;

public interface GameDAO extends GenericDAO<Game, Integer>{
    //TODO please give dditional methods for 'Game' entity.
	public List<Game> selectAll() throws Exception;
	public List<Game> selectByGameTime(Date game_time) throws Exception;
	public List<Game> selectByPlace(String place) throws Exception;
	public List<Game> selectByWeather(String weather) throws Exception;
	public List<Game> selectByExtended(boolean is_extended) throws Exception;
	public List<Game> selectByShootOut(boolean is_shoot_out) throws Exception;
	public List<Game> selectByGameType(String type) throws Exception;
	
	public void updateGame(Game game) throws Exception;
	public void deleteGame(Game game) throws Exception;
	
	
	public List<Game> selectByScoreUpper (int game_score) throws Exception;
	public List<Game> selectByScoreLower (int game_score) throws Exception;
	public List<Game> selectByThrowingUpper (int game_throwing) throws Exception;
	public List<Game> selectByThrowingLower (int game_Throwing) throws Exception;
	public List<Game> selectByFoulUpper (int game_foul) throws Exception;
	public List<Game> selectByFoulLower (int game_foul) throws Exception;
	public List<Game> selectByCardUpper (int game_card) throws Exception;
	public List<Game> selectByCardLower (int game_card) throws Exception;
	public List<Game> selectByCornerKickUpper (int game_corner_kick) throws Exception;
	public List<Game> selectByCornerKickLower (int game_corner_kick) throws Exception;
	public List<Game> selectByFreekickUpper (int game_freekick) throws Exception;
	public List<Game> selectByFreekickLower (int game_freekick) throws Exception;
	public List<Game> selectByPenaltykickUpper (int game_penalty_kick) throws Exception;
	public List<Game> selectByPenaltykickLower (int game_penalty_kick) throws Exception;
	public List<Game> selectByBallOccupationUpper (int game_ball_occupation) throws Exception;
	public List<Game> selectByBallOccupationLower (int game_ball_occupation) throws Exception;
	public List<Game> selectByUniformColor (String game_uniform_color) throws Exception;
	
	public int countAll() throws Exception;
	public int countByGameTime(Date game_time) throws Exception;
	public int countByPlace(String place) throws Exception;
	public int countByWeather(String weather) throws Exception;
	public int countByExtended(boolean is_extended) throws Exception;
	public int countByShootOut(boolean is_shoot_out) throws Exception;
	public int countByGameType(String type) throws Exception;
	public int countByScoreUpper (int game_score) throws Exception;
	public int countByScoreLower (int game_score) throws Exception;
	public int countByThrowingUpper (int game_throwing) throws Exception;
	public int countByThrowingLower (int game_Throwing) throws Exception;
	public int countByFoulUpper (int game_foul) throws Exception;
	public int countByFoulLower (int game_foul) throws Exception;
	public int countByCardUpper (int game_card) throws Exception;
	public int countByCardLower (int game_card) throws Exception;
	public int countByCornerKickUpper (int game_corner_kick) throws Exception;
	public int countByCornerKickLower (int game_corner_kick) throws Exception;
	public int countByFreekickUpper (int game_freekick) throws Exception;
	public int countByFreekickLower (int game_freekick) throws Exception;
	public int countByPenaltykickUpper (int game_penalty_kick) throws Exception;
	public int countByPenaltykickLower (int game_penalty_kick) throws Exception;
	public int countByBallOccupationUpper (int game_ball_occupation) throws Exception;
	public int countByBallOccupationLower (int game_ball_occupation) throws Exception;
	public int countByUniformColor (String game_uniform_color) throws Exception;
	
	
	public List<Game> selectOrderByScore () throws Exception;
	public List<Game> selectOrderByBonus () throws Exception;
	public List<Game> selectOrderByBallOccupation () throws Exception;
	public List<Game> selectOrderByCard () throws Exception;
	public List<Game> selectOrderByCornerkick () throws Exception;
	public List<Game> selectOrderByPenaltykick () throws Exception;
	public List<Game> selectOrderByThrowing () throws Exception;
}