package cloud.simple.service.dao;

import cloud.simple.service.model.SysAdminUser;
import cloud.simple.service.util.MyMapper;

import java.util.List;

public interface SysAdminUserDao extends  MyMapper<SysAdminUser>  {

   List<SysAdminUser> selectAll();
}