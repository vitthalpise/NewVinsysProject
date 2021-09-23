package com.vinisys.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.vinisys.model.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer>{

	User findByUnameAndPass(String uname, String pass);

}

