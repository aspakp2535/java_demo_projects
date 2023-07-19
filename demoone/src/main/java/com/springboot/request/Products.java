package com.springboot.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Products {
   
   @JsonProperty("Name")
    private String name;
   @JsonProperty("Description")
    private String description;
    // Add more fields as needed
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Products [name=" + name + ", description=" + description + "]";
	}
	
    
}
