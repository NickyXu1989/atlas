package com.atlas.cmdb.dao;

import com.atlas.cmdb.dto.ServerDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Mapper
public interface ServerDAO {
    public List<ServerDTO> getAllServers();
}
