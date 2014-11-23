package com.pollpost.poll.common;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * This is the service for poll related stuff.
 * 
 * @author COOLSKC
 * */
public abstract class AbstractPollService implements PollService {

	/**
	 * This metthod will return the userId for an username
	 * @param username as {@link String}
	 * @param collection as {@link DBCollection}
	 * @return {@link Integer}
	 * */
	public int findUserByUsername(String username,DBCollection collection) {
		DBObject dbObject = new BasicDBObject("username",username);		
		DBObject dbObject2 = collection.findOne(dbObject);		
		return (Integer) dbObject2.get("_id");
	}

	/**
	 * This method will return all the Commentd details for an po
	 * @param id as {@link Integer}
	 * @param collection {@link DBCollection}
	 * @return {@link DBCursor}
	 * */
	public DBCursor getPollByUserId(int userId,DBCollection collection) {
		DBObject dbObject = new BasicDBObject("userId",userId);
		
		return null;
	}

	public DBCursor getCommentsForPoll(int pollId,DBCollection collection) {
		// TODO Auto-generated method stub
		return null;
	}

}
