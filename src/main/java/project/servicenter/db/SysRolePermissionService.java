package project.servicenter.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.daocenter.dao.SysRolePermissionMapper;

@Service
public class SysRolePermissionService {
    
    @Autowired
    private SysRolePermissionMapper sysRolePermissionMapper;

}
