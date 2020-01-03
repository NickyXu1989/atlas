package com.atlas.cmdb.dto;

import lombok.Data;

@Data
public class ServerDTO {
    public String id;
    public String hostname;
    public String ip;
    public String ipv6;
//    public String networkDomainId;
//    public String serverGroupId;
}
