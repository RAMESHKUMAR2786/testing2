package com.example.demo;
import org.springframework.web.bind.annotation.RequestMapping;
@org.springframework.web.bind.annotation.RestController
public class RestController {
 
	@RequestMapping("/api/hello")
 public String greet() {
  return "Hello  DEVELOPER APP works Fine!!!";
 }
 
 @RequestMapping("/api/login")
 public String login() {
  return "Login !";
 }
}