package com.pclive.demo.com.pclive.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommandController {
	
	 /** Root Command */	
	 @RequestMapping("/")
	 public String index() {
		 return "index";
	 }
	 

	 /** Header Commands */
	 
	 @RequestMapping("/national")
	 public String national() {
		 return "national";
	 }
	 
	 @RequestMapping("/international")
	 public String international() {
		 return "international";
	 }

	 @RequestMapping("/newsvideos")
	 public String videos() {
		 return "newsvideos";
	 }
	 
	 @RequestMapping("/blogs")
	 public String blogs() {
		 return "blogs";
	 }
	 
	 /** Footer Commands */
	 
	 @RequestMapping("/contact")
	 public String contacts() {
		 return "contact";
	 }
	 
	 @RequestMapping("/aboutus")
	 public String aboutus() {
		 return "aboutus";
	 }
	 
	 @RequestMapping("/disclaimer")
	 public String disclaimer() {
		 return "disclaimer";
	 }
	 
	 @RequestMapping("/advertise")
	 public String advertise() {
		 return "advertise";
	 }

	 @RequestMapping("/serviceterms")
	 public String serviceterms() {
		 return "serviceterms";
	 }
	 
	 @RequestMapping("/feedback")
	 public String feedback() {
		 return "feedback";
	 }
	 
	 @RequestMapping("/editorial")
	 public String editorial() {
		 return "editorial";
	 }
	 
	 @RequestMapping("/search")
	 public String search() {
		 return "search";
	 }
	 
	 @RequestMapping("/news1")
	 public String news1() {
		 return "news1";
	 }
	 
	 @RequestMapping("/news2")
	 public String news2() {
		 return "news2";
	 }

}
