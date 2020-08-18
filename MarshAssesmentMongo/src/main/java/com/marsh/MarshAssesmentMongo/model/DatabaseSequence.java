package com.marsh.MarshAssesmentMongo.model;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sequence")
public class DatabaseSequence {
 
	
    public DatabaseSequence(String id, int seq) {
		super();
		this.id = id;
		this.seq = seq;
	}

	@Id
    private String id;
 
    private int seq;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSeq() {
		return seq;
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}
 
    //getters and setters omitted
    
    
}
