package com.atlas.OAuth.dao;

import com.atlas.OAuth.dto.OauthPrivilegeDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface OauthPrivilegeDAO {
    public List<OauthPrivilegeDTO> getPrivilegeByUserId(String id);
}
