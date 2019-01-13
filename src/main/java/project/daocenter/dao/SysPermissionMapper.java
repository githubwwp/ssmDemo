package project.daocenter.dao;

import project.entity.db.SysPermission;

public interface SysPermissionMapper {
    int deleteByPrimaryKey(String pCode);

    int insert(SysPermission record);

    int insertSelective(SysPermission record);

    SysPermission selectByPrimaryKey(String pCode);

    int updateByPrimaryKeySelective(SysPermission record);

    int updateByPrimaryKey(SysPermission record);
}