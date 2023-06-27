package vy.com.fa.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import vy.com.fa.entity.People;
import vy.com.fa.entity.Position;
import vy.com.fa.model.PeoplePositionDto;
import vy.com.fa.model.PositionDto;
import vy.com.fa.service.PeopleService;
import vy.com.fa.service.PositionService;
import vy.com.fa.validator.PeopleValidate;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private PeopleService peopleServiceImpl;

	@Autowired
	private PositionService positionServiceImpl;

	@Autowired
	PeopleValidate peopleValidate;

	@GetMapping("")
	public String showHome(Model model) {
		model.addAttribute("people", new PeoplePositionDto());
		return "home";
	}

	@PostMapping("/save")
	public String addPersonDetail(Model model, @ModelAttribute(name = "people") @Valid PeoplePositionDto dto,
			BindingResult result) {
		People people = new People(dto.getId(), dto.getName(), dto.getAge());
		Position position = new Position(dto.getPositionId(), dto.getPositionName(), dto.getExpYear(), people);
		if (result.hasErrors()) {
			return "home";
		}
		peopleServiceImpl.save(people);
		positionServiceImpl.save(position);
		return "index";
	}

	@GetMapping("/addPosition")
	public String showAddPosition(Model model) {
		model.addAttribute("positionDto", new PositionDto());
		return "addPosition";
	}

	@PostMapping("/savePosition")
	public String addPosition(Model model, @ModelAttribute(name = "positionDto") @Valid PositionDto dto,
			BindingResult result) {
//		System.out.println(dto.toString());
		peopleValidate.validate(dto, result);

		if (result.hasErrors()) {
			return "addPosition";
		}
		People people = peopleServiceImpl.getPeopleById(dto.getPeopleId());
		Position position = new Position(dto.getPositionId(), dto.getPositionName(), dto.getExpYear(), people);
		positionServiceImpl.save(position);
		return "index";
	}
}
