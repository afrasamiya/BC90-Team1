package com.torryharris.ItemList.Controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.torryharris.ItemList.entities.Details;
//import com.torryharris.ItemList.entities.userDetails;
import com.torryharris.ItemList.repository.userRepo;

@Controller
public class formController {
	
	@Autowired
	private userRepo repo;
	
	 
	
	
	@GetMapping("/register")
	public String RegistrationForm(Model model)
	{
		model.addAttribute("userData",new Details());
		return "Register";
	}
	@GetMapping("/")
	public String home(Model m)
	{
		
		return "home";
	}
	@GetMapping("/signup")
	public String signup()
	{
		
		return "signup";
	}
//	@PostMapping("/Submit")
//	public String submit(@ModelAttribute("userData") userDetails user)
//	{
//		System.out.println(user);
//		repo.save(user);
//		return "Success";
//	}
	@GetMapping("/Login")
	public String login()
	{
		
		return "Login";
	}
	
	@PostMapping("/home")
	public String submit(@ModelAttribute("userData") Details user, HttpSession session)
	{
		String present=repo.existsByuserName(user.getUserName());
		System.out.println("optional : "+present  );
		if(present.equals("true"))
		{
			System.out.println("Username "+ user.getUserName()+" already exists.Try using login..");
			session.setAttribute("message2","Username "+user.getUserName()+ " Already exists.Try using login...!!!");
			return "redirect:/signup";
		}
		
		System.out.println(user);
		
		repo.save(user);
		session.setAttribute("message","Registered Successfully");
		return "redirect:/signup";
		
	}
	
	@PostMapping("/log")
	public String afterLogin(@RequestParam("userName") String userName,@RequestParam("password") String password,HttpSession session,Model m,Model model,Details d)
	{
		boolean status=false;
		
		
		d=repo.findByuserNameAndPassword(userName, password);
		
		String n=d.getName();
		
		System.out.println("Name of user : "+ n);
		String name=repo.existsByuserName(userName);
		if(name.equals("true"))
		{
			String pass=repo.findPasswordByuserName(userName);
			
			if(pass.equals(password))
			{
				status=true;
				System.out.println(userName + " have successfully logged in");
				session.setAttribute("message",userName +" have logged in successfully");
				m.addAttribute("name",n);
				m.addAttribute("userName",d.getUserName());
				return "afterLogin";
			}
			System.out.println("Something went wrong");
			
		}
		return "home" ;
	}
	
	@GetMapping("/owner")
	public String owner()
    {
		return "owner";
		}
	
	@GetMapping("/after")
	public String afterlogin()   {
		return "afterLogin";
		}
	
	
	@GetMapping("/afterRent")
	public String afterRent()   {
		return "afterRent";
		}
	@GetMapping("/houses")
	public String houses()   {
		return "houses";
		}
	
	@GetMapping("/payment")
	public String pay()   {
		return "payments";
		}
	
	@GetMapping("/afterPayment")
	public String afterPay()   {
		return "afterPayment";
		}
}
