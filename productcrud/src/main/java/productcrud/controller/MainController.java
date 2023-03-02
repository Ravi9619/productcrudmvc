package productcrud.controller;

import org.apache.taglibs.standard.lang.jstl.test.beans.PublicBean1;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import productcrud.model.Product;

@Controller
public class MainController {
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/add-product")
	public String addProduct(Model m) {
		m.addAttribute("title", "Add Product");
		return "add_product_form";
	}
	
	//handle add product form
	@RequestMapping(value = "/handle-product",method = RequestMethod.POST)
	public RedirectView handleProduct(@ModelAttribute Product product) {
		System.out.println(product);
		RedirectView redirectView = new RedirectView();
		return redirectView;
	}
}
