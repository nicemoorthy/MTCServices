package com.selva.mtc.service.utility;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoDatabase;

public class MongoDBUtility {

	public void getConnection() {
		MongoClientURI uri = new MongoClientURI("mongodb+srv://admin:admin@mtccluster-y391f.mongodb.net/mtc");
		MongoClient mongoClient = new MongoClient(uri);
		MongoDatabase database = mongoClient.getDatabase("mtc");

	}

}
