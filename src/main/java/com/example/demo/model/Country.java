package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Country {

	private int country_id;
	private String country_name;
	
	@JsonIgnore
	private String country_logo;

	public Country() {
		super();
	}

	public Country(int country_id, String country_name, String country_logo) {
		super();
		this.country_id = country_id;
		this.country_name = country_name;
		this.country_logo = country_logo;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public String getCountry_name() {
		return country_name;
	}

	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}

	public String getCountry_logo() {
		return country_logo;
	}

	public void setCountry_logo(String country_logo) {
		this.country_logo = country_logo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + country_id;
		result = prime * result + ((country_logo == null) ? 0 : country_logo.hashCode());
		result = prime * result + ((country_name == null) ? 0 : country_name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (country_id != other.country_id)
			return false;
		if (country_logo == null) {
			if (other.country_logo != null)
				return false;
		} else if (!country_logo.equals(other.country_logo))
			return false;
		if (country_name == null) {
			if (other.country_name != null)
				return false;
		} else if (!country_name.equals(other.country_name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Country [country_id=" + country_id + ", country_name=" + country_name + ", country_logo=" + country_logo
				+ "]";
	}

}
