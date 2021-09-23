package com.vinisys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vinisys.model.User;
import com.vinisys.serviceInterface.UserInterface;

@RestController
public class UserControl {
	
	@Autowired
	UserInterface hs;
	
	@PostMapping("/insert")
	public String savaData(@RequestBody User u)
	{
		hs.savaData(u);
		return " succesfully inserted.......";
	}
	@GetMapping("/getall")
	public List<User> getAll()
	{
		List<User> list=hs.getAll();
		return list;
	}
	@GetMapping("/getSingleData/{uname}/{pass}")
	public User getSingle(@PathVariable("uname")String uname,@PathVariable("pass")String pass)
	{
		User u=hs.getSingle(uname,pass);
		return u;
	}
	@DeleteMapping("/delete/{uid}")
	public String deleteData(@PathVariable("uid") int uid)
	{
		hs.deleteData(uid);
		return "delete Record";
	}
	@GetMapping("/get/{uid}")
	public User getdata(@PathVariable("uid") Integer uid)
	{
		User list=hs.getdata(uid);
		return list;
		
	}
	@PutMapping("/updateData")
	public String updateData(@RequestBody User u)
	{
		hs.updateData(u);
	return "Update Data......";	
	}
}
