/**
 * 
 */
package com.sk.tutorial.jersey.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Shaji
 *
 */
@XmlRootElement
public class Todo {
	private String summary;
	private String description;
	public final String getSummary() {
		return summary;
	}
	public final void setSummary(String summary) {
		this.summary = summary;
	}
	public final String getDescription() {
		return description;
	}
	public final void setDescription(String description) {
		this.description = description;
	}
	
}
