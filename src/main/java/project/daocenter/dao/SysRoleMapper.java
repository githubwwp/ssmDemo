package project.daocenter.dao;

import project.entity.db.SysRole;

public interface SysRoleMapper {
    int deleteByPrimaryKey(String roleCode);

    int insert(SysRole record);

    int insertSelective(SysRole record);

    SysRole selectByPrimaryKey(String roleCode);

    int updateByPrimaryKeySelective(SysRole record);

    int updateByPrimaryKey(SysRole record);
}