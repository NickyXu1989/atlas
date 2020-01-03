package com.atlas.cmdb.service;

import com.atlas.cmdb.dto.ServerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ServerService {
    public List<ServerDTO> getAllServers();
}