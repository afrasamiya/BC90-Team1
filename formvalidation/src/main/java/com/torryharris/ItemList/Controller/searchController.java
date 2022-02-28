package com.torryharris.ItemList.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.torryharris.ItemList.entities.Images;
import com.torryharris.ItemList.entities.houses;
import com.torryharris.ItemList.repository.houseRepo;
import com.torryharris.ItemList.repository.imageRepo;

@Controller
public class searchController {
	
	@Autowired
	private houseRepo hrepo;
	
	@Autowired
	private imageRepo irepo;
	
	@GetMapping("/search")
	public String search(@Param("city") String city,Model m,houses h)
	{
		List<houses> l=hrepo.search(city);
		String owner=h.getOname();
		System.out.println("owner : "+owner);
		m.addAttribute("City",city);
		m.addAttribute("Result",l);
		System.out.println("hello ashu");
		System.out.println("city : "+city);
		l.stream().forEach(e-> System.out.println(e));
		
		return "searchHome" ;
	}
	
	@GetMapping("/demo")
	public String searchhome(@Param("city") String city,Model m,houses h)
	{
		List<houses> l=hrepo.search(city);
		String owner=h.getOname();
		System.out.println("owner : "+owner);
		m.addAttribute("City",city);
		m.addAttribute("Result",l);
		System.out.println("hello ashu");
		System.out.println("city : "+city);
		l.stream().forEach(e-> System.out.println(e));
		
		return "demo" ;
	}
	

}
