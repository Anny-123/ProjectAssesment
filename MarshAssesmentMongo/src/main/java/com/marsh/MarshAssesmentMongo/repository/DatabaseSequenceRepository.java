package com.marsh.MarshAssesmentMongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.marsh.MarshAssesmentMongo.model.DatabaseSequence;

@Repository
public interface DatabaseSequenceRepository extends MongoRepository<DatabaseSequence, Integer> {

}
