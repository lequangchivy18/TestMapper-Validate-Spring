package vy.com.fa.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "POSITION")
public class Position {
	@Id
	private String positionId;
	@Column
	private String positionName;
	@Column
	private int expYear;
	
	@ManyToOne
	@JoinColumn(name = "peopleId", nullable = false)
	private People peopleId;

	public Position() {
		super();
	}

	public Position(String positionId, String positionName, int expYear, People peopleId) {
		super();
		this.positionId = positionId;
		this.positionName = positionName;
		this.expYear = expYear;
		this.peopleId = peopleId;
	}

	public String getPositionId() {
		return positionId;
	}

	public void setPositionId(String positionId) {
		this.positionId = positionId;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public int getExpYear() {
		return expYear;
	}

	public void setExpYear(int expYear) {
		this.expYear = expYear;
	}

	public People getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(People peopleId) {
		this.peopleId = peopleId;
	}

}
