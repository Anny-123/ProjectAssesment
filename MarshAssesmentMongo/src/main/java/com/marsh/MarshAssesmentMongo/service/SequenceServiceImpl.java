package com.marsh.MarshAssesmentMongo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.FindAndModifyOptions;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.marsh.MarshAssesmentMongo.exception.SequenceException;
import com.marsh.MarshAssesmentMongo.model.DatabaseSequence;

@Service
public class SequenceServiceImpl implements SequenceService{

	
	@Autowired
	private MongoOperations mongoOperation;

	@Override
	public int getNextSequenceId(String key) throws SequenceException {

	  //get sequence id
	  Query query = new Query(Criteria.where("_id").is(key));

	  //increase sequence id by 1
	  Update update = new Update();
	  update.inc("seq", 1);

	  //return new increased id
	  FindAndModifyOptions options = new FindAndModifyOptions();
	  options.returnNew(true);

	  //this is the magic happened.
	  DatabaseSequence seqId =
            mongoOperation.findAndModify(query, update, options, DatabaseSequence.class);

	  //if no id, throws SequenceException
          //optional, just a way to tell user when the sequence id is failed to generate.
	  if (seqId == null) {
		throw new SequenceException("Unable to get sequence id for key : " + key);
	  }

	  return seqId.getSeq();

	}

}
