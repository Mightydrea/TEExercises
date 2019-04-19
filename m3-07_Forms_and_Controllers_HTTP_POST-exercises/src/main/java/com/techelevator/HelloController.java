package com.techelevator;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.techelevator.model.Review;
import com.techelevator.model.ReviewDao;

@Controller 
public class HelloController {
	
	@Autowired
	private ReviewDao reviewDao;

	@RequestMapping("/")
	public String displayGreeting(HttpServletRequest request) {
		
		List<Review> review = reviewDao.getAllReviews();
		request.setAttribute("reviews", review);
		return "greeting";
	}
	
	@RequestMapping("/greeting")
	public String displayHomepage(HttpServletRequest request) {
		
		List<Review> review = reviewDao.getAllReviews();
		request.setAttribute("reviews", review);
		return "greeting";
		
	}
	
	//Directory for homepage link
	@RequestMapping("/submitReview")
	public String submitReview(HttpServletRequest request) { 
		
		return "submitReview";
	}
	
	@RequestMapping(path="/retrieveUserInput", method= RequestMethod.GET)
	public String submitReviewInput(HttpServletRequest request) {
		
		return "greeting";
	}
	
	@RequestMapping(path="/submitUserReview", method= RequestMethod.POST)
	public String submitReviewResponse(HttpServletRequest request) {
		
		Review review = new Review();
		String username = request.getParameter("usernameInput");
		String rating = request.getParameter("userRatingInput"); 
		String title = request.getParameter("userTitleInput"); 
		String text = request.getParameter("userTextInput");
		
		
		review.setUsername(username);
		review.setRating(Integer.parseInt(rating));
		review.setTitle(title);
		review.setText(text);
		review.setDateSubmitted(LocalDateTime.now());
		
		reviewDao.save(review);
		
		return "redirect:/greeting";
	}
	
	
}


