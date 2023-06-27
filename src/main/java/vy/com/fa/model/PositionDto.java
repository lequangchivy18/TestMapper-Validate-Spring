package vy.com.fa.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PositionDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Chưa nhập positionId")
	private String positionId;

	@NotBlank(message = "Chưa nhập positionName")
	private String positionName;

	@NotNull(message = "Chưa nhập expYear")
	private int expYear;

	@NotBlank(message = "Chưa nhập peopleId")
	private String peopleId;

	public PositionDto() {
		super();
	}

	public PositionDto(String positionId, String positionName, int expYear, String peopleId) {
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

	public String getPeopleId() {
		return peopleId;
	}

	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}

	@Override
	public String toString() {
		return "PositionDto [positionId=" + positionId + ", positionName=" + positionName + ", expYear=" + expYear
				+ ", peopleId=" + peopleId + "]";
	}
}
