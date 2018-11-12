package com.google.codeu.data;

import java.util.UUID;

/** This class represents a single message posted by a user. */
public class Message {

	private UUID id;
	private String user;
	private String text;
	private long timestamp;

	/** Constructs a new Message posted by user with text content.
	 *  Generates a random ID and uses the current system time for timestamp.
	 */
	public Message(String user, String text) {
		this(UUID.randomUUID(), user, text, System.currentTimeMillis());
	}
	
	public Message(UUID id, String user, String text, long timestamp) {
		this.id = id;
		this.user = user;
		this.text = text;
		this.timestamp = timestamp;
	}
	
	public UUID getId() {
		return id;
	}

	public String getUser() {
		return user;
	}

	public String getText() {
		return text;
	}

	public long getTimestamp() {
		return timestamp;
	}
}
