package tn.enig.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.enig.model.User;
@Repository
public interface IUser extends JpaRepository<User, Integer>{

	public User findByUserName(String username);
	
}
