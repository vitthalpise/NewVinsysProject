package com.vinisys.serviceInterface;

import java.util.List;

import com.vinisys.model.User;

public interface UserInterface {

	public void savaData(User u);
	
	public List<User> getAll();

	public User getSingle(String uname, String pass);

	public void deleteData(int uid);

	public User getdata(Integer uid);

	public void updateData(User u);

}
