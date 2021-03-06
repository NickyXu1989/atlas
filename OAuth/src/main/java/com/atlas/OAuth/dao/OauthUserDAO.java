package com.atlas.OAuth.dao;

import com.atlas.OAuth.dto.OauthUserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OauthUserDAO {
    public List<OauthUserDTO> getAllUsers();
    public OauthUserDTO findUserByUsername(String username);
    public OauthUserDTO findUserByEmail(String mailAddress);
    public int saveUser(OauthUserDTO userDTO);
    public int countUserByName(String username);
}
