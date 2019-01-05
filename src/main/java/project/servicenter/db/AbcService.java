package project.servicenter.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.daocenter.dao.SysRoleMapper;
import project.entity.db.SysRole;

@Service
public class AbcService {

    @Autowired
    private SysRoleMapper sysRoleMapper;

    public void testMybatis() {
        SysRole sysRole = sysRoleMapper.selectByPrimaryKey("administrator");
        System.out.println(sysRole.getRoleCode() + ".....");
    }

}
