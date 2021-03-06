package com.coder.springbootdomecollection.mapper;

import com.coder.springbootdomecollection.model.SysMenu;
import com.coder.springbootdomecollection.model.SysRole;
import com.coder.springbootdomecollection.model.SysUser;

import java.util.List;

public interface SysUserMapper {

    SysUser selectByPrimaryKey(Integer id);

    List<SysUser> selectByVo(SysUser sysUser);

    SysUser selectByProperty(SysUser sysUser);

    int deleteByPrimaryKey(Integer id);

    int deleteByVo(SysUser sysUser);

    int insert(SysUser sysUser);

    int insertSelective(SysUser sysUser);

    int insertToBatch(List<SysUser> sysUsers);

    int updateByPrimaryKeySelective(SysUser sysUser);

    int updateByPrimaryKey(SysUser sysUser);

    int findCount(SysUser sysUser);

    List<SysRole> selectRoleByPrimaryKey(Integer id);

    List<SysMenu> selectMenuByPrimaryKey(Integer id);

}