package tw.wuyuhsi.model;

import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserProfilesService userProfilesService;

	

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserProfiles userProfiles = userProfilesService.findByName(username);
		
		return new User(userProfiles.getName(), userProfiles.getPassword(), Collections.emptyList());
	}

}
