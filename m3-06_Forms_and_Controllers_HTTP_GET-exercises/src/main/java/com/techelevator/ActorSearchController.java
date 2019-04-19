package com.techelevator;

import javax.servlet.http.HttpServletRequest;

import com.techelevator.dao.ActorDao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ActorSearchController {

	@Autowired
	private ActorDao actorDao;

	@RequestMapping("/actorList")
	public String showSearchActorForm() {
		return "actorList";
	}

	@RequestMapping("/actorListResult")
	public String searchActors(HttpServletRequest request) {

		String actor = request.getParameter("actor");
		request.setAttribute("listOfActors", actorDao.getMatchingActors(actor));

		return "actorList";
	}
}
