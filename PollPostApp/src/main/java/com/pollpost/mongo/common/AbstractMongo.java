package com.pollpost.mongo.common;

import java.net.UnknownHostException;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.pollpost.constraints.StringConstraints;

/**
 * This is the abstract Design for the MongoClient
 * @author COOLSKC
 * */
public class AbstractMongo implements Mongo{

	/**
	 * This method will create a MongoClient after giveing the Host and Port Number
	 * 
	 * @param host as {@link String}
	 * @param port as {@link String}
	 * @return {@link MongoClient}
	 * */
	public MongoClient getMongoClient(String host, String port)
			throws MongoException, UnknownHostException {
		return new MongoClient(host,Integer.parseInt(port));
	}

	/**
	 * This method internally takes host as localhost and default port i.e 27017 as port Number
	 * 
	 * @param db as {@link String}
	 * @return {@link MongoClient}
	 * */
	
	public MongoClient getMongoClient() throws MongoException,
			UnknownHostException {
		return new MongoClient(StringConstraints.DEFAULT_HOST,27017);
	}

	/**
	 * This method will return the DB Object using the db name from the MongoClient
	 * 
	 * @param client as {@link MongoClient}
	 * @param db as {@link String}
	 * @return {@link DB}
	 * */
	public DB getDB(MongoClient client, String db) {
		return client.getDB(db);
	}

	/**
	 * This method will take DB and will extract the specific collection 
	 * 
	 * @param db as {@link DB}
	 * @param collection as {@link String}
	 * @return {@link DBCollection}
	 * */
	public DBCollection getCollection(DB db,String collection) {
		return db.getCollection(collection);
	}
	
	
}
