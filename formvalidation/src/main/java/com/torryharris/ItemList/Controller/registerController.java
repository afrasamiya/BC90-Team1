package com.torryharris.ItemList.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.torryharris.ItemList.entities.Details;
import com.torryharris.ItemList.entities.Images;
import com.torryharris.ItemList.repository.imageRepo;
import com.torryharris.ItemList.repository.userRepo;

@Controller
public class registerController {
	
	@Autowired
	private imageRepo irepo;
	
	@Autowired
	private userRepo urepo;
	
	
	@PostMapping("owner")
	public String uploadHouse(Details d,@ModelAttribute("rentData") Images img)
	{
		String validUserName=d.getUserName();
		System.out.println(validUserName);
		System.out.println(img);
		   System.out.println(img.getUserName());

	     irepo.save(img);
		
		return "afterRent";
	}

	
}
