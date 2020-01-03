package com.atlas.OAuth.config;


import com.atlas.OAuth.dao.OauthUserDAO;
import com.atlas.OAuth.dto.OauthPrivilegeDTO;
import com.atlas.OAuth.dto.OauthUserDTO;
import com.atlas.OAuth.service.OauthPrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//@Service("userDetailsService")
@Component
@Qualifier(value = "userDetailsService")
public class AuthUserDetailsService implements UserDetailsService {

    @Autowired
    private OauthUserDAO oauthUserDAO;

    @Autowired
    OauthPrivilegeService oauthPrivilegeService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        String lowerUsername = username.toLowerCase();
        OauthUserDTO user = oauthUserDAO.findUserByEmail(lowerUsername);
        if(user == null){
            throw new UsernameNotFoundException(username);
        }
//        System.out.println(user);
        Set<GrantedAuthority> grantedAuthorities = new HashSet<GrantedAuthority>();

//        获取权限
        List<OauthPrivilegeDTO> privileges = oauthPrivilegeService.getPrivilegeByUserId(user.getId());

        for(OauthPrivilegeDTO privilegeDTO : privileges) {
//            System.out.println();
            grantedAuthorities.add(new SimpleGrantedAuthority(privilegeDTO.getName()));
        }

//        System.out.println(collection);

        return new org.springframework.security.core.userdetails.User(username,user.getPassword(),grantedAuthorities);
    }
}