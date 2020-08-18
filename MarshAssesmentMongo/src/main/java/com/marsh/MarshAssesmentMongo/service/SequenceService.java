package com.marsh.MarshAssesmentMongo.service;

import com.marsh.MarshAssesmentMongo.exception.SequenceException;

public interface SequenceService {
	
	int getNextSequenceId(String key) throws SequenceException;

}
