package com.techelevator;

import com.techelevator.dao.FilmDao;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * FilmSearchController
 */
@Controller
public class FilmSearchController {

	@Autowired
	FilmDao filmDao;

	@RequestMapping("/filmList")
	public String showFilmSearchForm() {
		return "filmList";
	}

	@RequestMapping("/filmListResult")
	public String searchFilms(HttpServletRequest request, @RequestParam String genre, 
			@RequestParam(required = false) Integer minimumLength, @RequestParam(required = false) 
			Integer maximumLength) { 
		
		
		if(minimumLength== null) { minimumLength = 0; } 
		
		if(maximumLength== null) { maximumLength = 5000; }
	

		request.setAttribute("listOfFilms", filmDao.getFilmsBetween(genre, minimumLength, maximumLength));

		return "filmList";
	}

}