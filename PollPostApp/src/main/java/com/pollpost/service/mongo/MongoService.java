package com.pollpost.service.mongo;

import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;
import com.pollpost.mongo.common.AbstractMongo;

/**
 * This is the endpont for Mongo Collection extraction, DB Connection,DB Selection
 * 
 * @author COOLSKC
 * */
@Service("mongo")
public class MongoService extends AbstractMongo{
	
	
	@Override
	public DBCollection getCollection(DB db, String collection) {
		return super.getCollection(db, collection);
	}
	
	@Override
	public MongoClient getMongoClient() throws MongoException,
			UnknownHostException {
		return super.getMongoClient();
	}

	@Override
	public DB getDB(MongoClient client, String db) {
		return super.getDB(client, db);
	}
	
	@Override
	public MongoClient getMongoClient(String host, String port)
			throws MongoException, UnknownHostException {
		return super.getMongoClient(host, port);
	}
}
