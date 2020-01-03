package com.atlas.OAuth.service;

import com.atlas.OAuth.dto.OauthPrivilegeDTO;

import java.util.List;

public interface OauthPrivilegeService {

    public List<OauthPrivilegeDTO> getPrivilegeByUserId(String id);
}
