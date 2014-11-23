package com.pollpost.poll.common;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * This the interface Design for the Poll Service
 * @author COOLSKC
 * */
public interface PollService {

	/**
	 * This method will return the _id for an username
	 * */
	public int findUserByUsername(String username,DBCollection collection);
	
	/**
	 * This method wil get all the related poll for an user
	 * */
	public DBCursor getPollByUserId(int id,DBCollection collection);
	
	/**
	 * This method will get all the comment for a specific post
	 * */	
	public DBCursor getCommentsForPoll(int pollId,DBCollection collection);
	
	/**
	 * This method will create a poll for a specific user.
	 * */
	public void createPoll(int userId,DBObject dbObject);
	
	/**
	 * This Method will delete a poll. 
	 * */
	public void deletePoll(DBObject dbObject);
	
}
