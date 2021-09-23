package com.vinisys.serviceImplements;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vinisys.model.User;
import com.vinisys.repository.UserRepository;
import com.vinisys.serviceInterface.UserInterface;

@Service
public class UserClass implements UserInterface{
@Autowired
private UserRepository repo;

@Override
public void savaData(User u) {
   repo.save(u);	
}

@Override
public List<User> getAll() {
List<User> list=repo.findAll();
return list;
}

@Override
public User getSingle(String uname, String pass) {

	User u=repo.findByUnameAndPass(uname,pass);
	return u;
}

@Override
public void deleteData(int uid) {
repo.deleteById(uid);	
}

@Override
public User getdata(Integer uid) {
	
	User u=repo.findById(uid).get();
	return u;
}

@Override
public void updateData(User u) {
repo.save(u);	
}




}
