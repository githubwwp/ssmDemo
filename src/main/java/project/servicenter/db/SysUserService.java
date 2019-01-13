package project.servicenter.db;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.daocenter.dao.SysUserMapper;
import project.entity.db.SysUser;

@Service
public class SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    public SysUser selectByPrimaryKey(Integer id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

}
