package com.nt.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Product;
import com.nt.repository.ProductRepository;

import ch.qos.logback.core.model.Model;

@Controller
public class ProductController {

	@Autowired
	private ProductRepository repo;

	@GetMapping("/")
	public String inHome() {
		return "home";
	}

	@PostMapping("/saveProduct")
	public String saveProduct(Map<String, Product> map, Product pr) {
		System.out.println(pr);
		repo.save(pr);
		map.put("p1", pr);
		return "saved";
	}

	@GetMapping("/delete")
	public String deleteProduct(RedirectAttributes attr, @RequestParam("id") Integer id) {
		Optional<Product> pr = repo.findById(id);
		if (pr.isPresent()) {
			repo.delete(pr.get());
			attr.addFlashAttribute("msg", "Record is deleted(Temporary)");
		} else {
			throw new IllegalArgumentException("Invalid id");
		}

		return "redirect:/";
	}
	
	@GetMapping("/retrive")
	public String retriveProductData(Map<String,Object> map) {
		 List<Product> list = repo.findAll();
		
		map.put("data", list);
		return "retrived_data";
	}
}
