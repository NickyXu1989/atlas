package com.atlas.OAuth.service.impl;

import com.atlas.OAuth.dao.OauthPrivilegeDAO;
import com.atlas.OAuth.dto.OauthPrivilegeDTO;
import com.atlas.OAuth.service.OauthPrivilegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OauthPrivilegeServiceImpl implements OauthPrivilegeService {

    @Autowired
    private OauthPrivilegeDAO oauthPrivilegeDAO;

    @Override
    public List<OauthPrivilegeDTO> getPrivilegeByUserId(String id) {
        return oauthPrivilegeDAO.getPrivilegeByUserId(id);
    }
}
