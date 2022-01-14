package tn.enig.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import tn.enig.UserPrincipal;
import tn.enig.dao.IUser;
import tn.enig.model.User;
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	IUser userDAO;
	public void setUserDAO(IUser userDAO) {
		this.userDAO = userDAO;
	}
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userDAO.findByUserName(username);
		if (user==null)
			throw new UsernameNotFoundException("User 404");
		return new UserPrincipal(user);
	}

}
