package com.aurionpro.project.services;


import java.util.List;

import com.aurionpro.project.dto.AdminDto;
import com.aurionpro.project.entities.Admin;


public interface AdminService {

	String updateEmailById(int adminId, String email);
    
}
