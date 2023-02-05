package k23.CarDatabase.Week1And2.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import k23.CarDatabase.Week1And2.domain.Friend;

@Controller
public class FriendController {

	private List<Friend> friends = new ArrayList<>();

	@GetMapping("/index")
	public String index(Model model) {
		model.addAttribute("friends", friends);
		return "index";
	}

	@PostMapping("/index")
	public String addFriend(@RequestParam("firstName") String firstName, @RequestParam("lastName") String lastName,
			Model model) {
		friends.add(new Friend(firstName, lastName));
		model.addAttribute("friends", friends);
		return "index";
	}
}