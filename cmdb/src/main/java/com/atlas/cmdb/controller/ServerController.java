package com.atlas.cmdb.controller;

import com.atlas.cmdb.dto.ServerDTO;
import com.atlas.cmdb.service.ServerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ServerController {

    @Autowired
    private ServerService serverService;

    @RequestMapping(value = "/allServers", method = RequestMethod.GET)
    @PreAuthorize("hasAuthority('view_demo')")
    public Map<String, Object> getAllServers() {
        Map<String, Object> result = new HashMap<>();
        List<ServerDTO> servers = serverService.getAllServers();
        result.put("server", servers);
        return result;
//        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//        return "cmdb. current user:" + auth.getName();
    }
}
