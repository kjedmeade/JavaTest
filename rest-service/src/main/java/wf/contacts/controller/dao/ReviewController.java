package wf.contacts.controller.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import wf.contacts.model.Review;
import wf.contacts.model.User;

@RestController
public class ReviewController {


		@Autowired
		private RestTemplate restTemplate;

		private final String USER_API = "https://api.yelp.com/v3/businesses/Ne9IVmO5KFaevaKEHR-ttg/reviews";

		@GetMapping("/reviews/{id}")
		public Review consumeReviews(@PathVariable Integer id) {
			String url = USER_API + "/{id}";
			return restTemplate.getForObject(url, Review.class, id);
		}

//		@GetMapping("/reviews")
//		public Review[] consumeAllReviews() {
//			
//			return restTemplate.getForObject(USER_API, Review[].class);
//			
//
//		}
	}

