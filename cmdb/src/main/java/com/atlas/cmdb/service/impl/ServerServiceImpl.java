package com.atlas.cmdb.service.impl;

import com.atlas.cmdb.dao.ServerDAO;
import com.atlas.cmdb.dto.ServerDTO;
import com.atlas.cmdb.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServerServiceImpl implements ServerService {

    @Autowired
    private ServerDAO serverDAO;

    @Override
    public List<ServerDTO> getAllServers(){
        return serverDAO.getAllServers();
    }
}
