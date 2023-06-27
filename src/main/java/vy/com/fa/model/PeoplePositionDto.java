package vy.com.fa.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class PeoplePositionDto {

	@NotBlank(message = "Chưa nhập peopleId")
	private String id;

	@NotBlank(message = "Chưa nhập name")
	private String name;

	@NotBlank(message = "Chưa nhập age")
	private String age;

	@NotBlank(message = "Chưa nhập positionId")
	private String positionId;

	@NotBlank(message = "Chưa nhập positionName")
	private String positionName;

	@NotNull(message = "Chưa nhập expYear")
	private int expYear;

	public PeoplePositionDto() {
		super();
	}

	public PeoplePositionDto(String id, String name, String age, String positionId, String positionName, int expYear) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.positionId = positionId;
		this.positionName = positionName;
		this.expYear = expYear;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

}
