package com.turing.tshirtshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.turing.tshirtshop.entity.User;
import com.turing.tshirtshop.payload.PagedResponse;
import com.turing.tshirtshop.payload.UserIdentityAvailability;
import com.turing.tshirtshop.payload.UserProfile;
import com.turing.tshirtshop.repository.RoleRepository;
import com.turing.tshirtshop.repository.UserRepository;
import com.turing.tshirtshop.security.CurrentUser;
import com.turing.tshirtshop.security.UserPrincipal;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    private UserRepository userRepository;
    
    
    

	@Autowired
	RoleRepository roleRepository;

   
    private static final Logger logger = LoggerFactory.getLogger(UserController.class);

    @GetMapping("/user/me")
    @PreAuthorize("hasAnyRole('ROLE_ADMIN', 'ROLE_USER_TRIADOR', 'ROLE_USER_FINALIZADOR')")
    public UserProfile getCurrentUser(@CurrentUser UserPrincipal currentUser) {
//         User user = userRepository.findByUsername(currentUser.getUsername())
//                 .orElseThrow(() -> new RuntimeException("User", "username", currentUser.getUsername()));
//         UserProfile userProfile = new UserProfile(user.getId(), user.getUsername(), user.getName(), null, user.getEmail(), user.getRole());
//         return userProfile;
    	return null;
    }

    @GetMapping("/user/checkUsernameAvailability")
    public UserIdentityAvailability checkUsernameAvailability(@RequestParam(value = "username") String username) {
        Boolean isAvailable = !userRepository.existsByUsername(username);
        return new UserIdentityAvailability(isAvailable);
    }

    @GetMapping("/user/checkEmailAvailability")
    public UserIdentityAvailability checkEmailAvailability(@RequestParam(value = "email") String email) {
        Boolean isAvailable = !userRepository.existsByEmail(email);
        return new UserIdentityAvailability(isAvailable);
    }

    @GetMapping("/users/{username}")
    public UserProfile getUserProfile(@PathVariable(value = "username") String username) {
//        User user = userRepository.findByUsername(username)
//                .orElseThrow(() -> new ResourceNotFoundException("User", "username", username));
//        UserProfile userProfile = new UserProfile(user.getId(), user.getUsername(), user.getName(), null, user.getEmail(), user.getRole());
//        return userProfile;
    	return null;
    }
    
    @GetMapping("/users/all")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public PagedResponse<UserProfile> findAll() {
        List<User> users = userRepository.findAll();
        if ( users!=null ) {
        	List<UserProfile> listaProfiles = new ArrayList<UserProfile>();
        	users.forEach(user->listaProfiles.add(new UserProfile(user.getId(), user.getUsername(), user.getName(), null, user.getEmail(), user.getRole()) ));
        	return new PagedResponse<UserProfile>(listaProfiles);
        } 
        return null;
    }
    
    @GetMapping("/users/finalizadores")
    @PreAuthorize("hasRole('ROLE_USER_TRIADOR')")
    public PagedResponse<UserProfile> findFinalizadores() {
//    	Role userRole = roleRepository.findByName(RoleName.ROLE_USER_FINALIZADOR)
//                .orElseThrow(() -> new AppException("User Role not set."));
//        Set<User> users = userRepository.findByRoles(userRole);
//        if ( users!=null ) {
//        	List<UserProfile> listaProfiles = new ArrayList<UserProfile>();
//        	users.forEach(user->listaProfiles.add(new UserProfile(user.getId(), user.getUsername(), user.getName(), null, user.getEmail(), user.getRole()) ));
//        	return new PagedResponse<UserProfile>(listaProfiles);
//        } 
        return null;
    }
}
