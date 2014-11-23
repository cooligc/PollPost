package com.pollpost.group.common;

import java.util.List;

import com.mongodb.DBCollection;
import com.mongodb.DBCursor;

/**
 * This is the Design for the
 * 
 * @author COOLSKC
 * */
public interface Group {
	
	/**
	 * This Method will create a Group
	 * */
	public void createGroup(List<Long> groupUserList,Long userId,DBCollection collection);
	
	/**
	 * This Method will delete a Group
	 * */
	public void deleteGroup(Long groupId,Long userId,Long deletedUserId,DBCollection collection);
	
	/**
	 * This Method will update a Group Details
	 * */
	public void updateGroup(List<Long> integers,boolean isDelete,Long userId,DBCollection collection); 
	
	/**
	 * This Method will retrive all the data for a group
	 * */
	public DBCursor getGroupDetails(Long userId,DBCollection collection);
}
