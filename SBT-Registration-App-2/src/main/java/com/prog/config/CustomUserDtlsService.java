package com.prog.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CurrencyEditor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.prog.entity.Userdtls;
import com.prog.repository.UserRepository;

public class CustomUserDtlsService implements UserDetailsService {
	
	@Autowired
	private UserRepository repo;
	
	@Override
	public UserDetails loadUserByUsername(String em) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		try {
			
		Userdtls u=	repo.findByEmail(em);
		if(u==null)
		{
			throw new UsernameNotFoundException("No User");
		}
		else
		{
			return new CustomUserDtls(u);
		}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		
		
		return null;
	}

}
