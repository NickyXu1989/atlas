package com.atlas.OAuth.service;

import com.atlas.OAuth.dto.OauthUserDTO;

import java.util.List;

public interface OauthUserService {

    public List<OauthUserDTO> getAllUsers();
    public int saveUser(OauthUserDTO userDTO);
}

