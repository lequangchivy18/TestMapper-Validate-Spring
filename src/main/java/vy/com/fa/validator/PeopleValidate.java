package vy.com.fa.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import vy.com.fa.model.PositionDto;
import vy.com.fa.service.PeopleService;
import vy.com.fa.service.PositionService;

@Component
public class PeopleValidate implements Validator {

	@Autowired
	private PeopleService peopleService;

	@Autowired
	private PositionService positionService;

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void validate(Object target, Errors errors) {
		PositionDto myObject = (PositionDto) target;

		if (positionService.existsById(myObject.getPositionId())) {
			errors.rejectValue("positionId", null, "PositionId đã tồn tại");
		}
		
		if (!peopleService.existsById(myObject.getPeopleId()) && !"".equals(myObject.getPeopleId())) {
			errors.rejectValue("peopleId", null, "PeopleId không tồn tại");
		}
	}

}
