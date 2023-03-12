package com.counteryservice.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author Rajnish Kumar Ranjan
 *
 */
@Entity
@Table(name="Contery_Table")
public class Countery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long countryId;
	private String counteryName;
	private String counteryCapital;

	public Countery() {
		super();

	}

	public Countery(long countryId, String countryName, String countryCapital) {
		super();
		this.countryId = countryId;
		this.counteryName = countryName;
		this.counteryCapital = countryCapital;
	}

	public long getCountryId() {
		return countryId;
	}

	public void setCountryId(long countryId) {
		this.countryId = countryId;
	}

	public String getCountryName() {
		return counteryName;
	}

	public void setCountryName(String countryName) {
		this.counteryName = countryName;
	}

	public String getCountryCapital() {
		return counteryCapital;
	}

	public void setCountryCapital(String countryCapital) {
		this.counteryCapital = countryCapital;
	}

	@Override
	public String toString() {
		return "Countery [countryId=" + countryId + ", countryName=" + counteryName + ", countryCapital="
				+ counteryCapital + "]";
	}

}
