package com.Veni.myvhr.mapper;

import com.Veni.myvhr.pojo.Employee;
import org.apache.ibatis.annotations.Param;


import java.util.Date;
import java.util.List;

public interface EmployeeMapper {

    List<Employee> getEmployeeByPage();

    List<Employee> getEmployeeByPage(@Param("page") Integer page, @Param("size") Integer size, @Param("emp") Employee employee,@Param("beginDateScope") Date[] beginDateScope);

    Long getTotal(@Param("emp") Employee employee,@Param("beginDateScope") Date[] beginDateScope);


}
