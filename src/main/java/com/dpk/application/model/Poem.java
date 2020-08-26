package com.dpk.application.model;

public class Poem {

	private String id;
	private String author;
	private String title;
	private String poem;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPoem() {
		return poem;
	}
	public void setPoem(String poem) {
		this.poem = poem;
	}
	@Override
	public String toString() {
		return "Poem [id=" + id + ", author=" + author + ", title=" + title + ", poem=" + poem + "]";
	}

	
}
