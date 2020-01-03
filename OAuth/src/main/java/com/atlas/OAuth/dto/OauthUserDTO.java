package com.atlas.OAuth.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class OauthUserDTO implements Serializable {
    private String id;
    private String username;
    private String password;
    private Boolean enabled;
    private String firstName;
    private String lastName;
    private String mailAddress;
    private String avatar;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createdDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updatedDate;
}
