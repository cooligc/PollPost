package com.pollpost.group.common;

import java.util.List;

import com.mongodb.BasicDBObject;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;

/**
 * This class will do the CURD Operation for a Specific Group
 * @author COOLSKC
 * */
public class AbstractGroup implements Group{

	/**
	 * This method will create a Group for an user
	 * */
	public void createGroup(List<Long> groupUserList, Long userId,
			DBCollection collection) {
		DBObject dbObject = new BasicDBObject("_id",userId).append("userGroup", groupUserList);
		collection.save(dbObject);
	}

	public void deleteGroup(Long groupId, Long userId,Long deletedUserId, DBCollection collection) {
		//Get the the collection of an user
		DBObject dbObject = collection.findOne(new BasicDBObject("_id",userId));
		List<Long> users = (List<Long>) dbObject.get("userGroup");
		users.remove(deletedUserId);
		
		
	}

	public void updateGroup(List<Long> integers, boolean isDelete,
			Long userId, DBCollection collection) {
		// TODO Auto-generated method stub
		
	}

	public DBCursor getGroupDetails(Long userId, DBCollection collection) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
