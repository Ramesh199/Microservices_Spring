package com.plantplaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.plantplaces.dto.SpecimenDTO;
import com.plantplaces.service.ISpecimenService;

@Controller
public class PlantPlacesController {
	
	@Autowired
	private ISpecimenService specimenServiceStub;
	
	@RequestMapping("/savespecimen")
	public String saveSpecimen(SpecimenDTO specimenDTO) {
		
		
		return "start";
	}
	
	@RequestMapping(value="/start", method=RequestMethod.GET, headers= {"content-type=text/json"})
	@ResponseBody
	public SpecimenDTO readJSON(Model model) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchbyId(43);
		model.addAttribute("specimenDTO", specimenDTO);
		return specimenDTO;
	}

	@RequestMapping("/start")
	
	public String read(Model model) {
		model.addAttribute("specimenDTO", new SpecimenDTO());
		return "start";
	}
	@RequestMapping(value="/start", headers ={"content-type=text/json"})
	public String readHeader() {
		return "start";
	}
	/**
	 * 
	 * @return
	 */
	@RequestMapping(value="/start", method=RequestMethod.GET, params ={"loyalty=blue"})
	public String readBlue() {
		return "start";
	}
	
	@RequestMapping(value="/addspecimen", method=RequestMethod.GET)
	public String addSpecimen(Model model, @RequestParam(value="lattitude", required=false, defaultValue="0.0") String lattitude) {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchbyId(43);
		specimenDTO.setLattitude(lattitude);
		model.addAttribute("specimenDTO", specimenDTO);
		return "start";
	}
	@RequestMapping(value="/start", params ={"loyalty=silver"})
	public ModelAndView readSilver() {
		SpecimenDTO specimenDTO = specimenServiceStub.fetchbyId(43);
		specimenDTO.setSpecimenId(1001);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("start");
		modelAndView.addObject("specimenDTO", specimenDTO);
		return modelAndView;
	}
	
	@PostMapping("/start")
	public String write() {
		return "start";
	}

}
