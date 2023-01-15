package com.Veni.myvhr.service;

import com.Veni.myvhr.mapper.EmployeeMapper;
import com.Veni.myvhr.pojo.Employee;
import com.Veni.myvhr.pojo.RespPageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    EmployeeMapper employeeMapper;


    SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
    SimpleDateFormat monthFormat = new SimpleDateFormat("MM");
    DecimalFormat decimalFormat = new DecimalFormat("##.00");

    public RespPageBean getEmployeeByPage() {
        Long total = 10l;
        RespPageBean bean = new RespPageBean();
        System.out.println(bean);
        List<Employee> data = employeeMapper.getEmployeeByPage();
//        List<Employee> data = new ArrayList<>();

        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }
    public RespPageBean getEmployeeByPage(Integer page, Integer size, Employee employee, Date[] beginDateScope) {
        if (page != null && size != null) {
            // 非空判断 然后就 得到page  索引号
            page = (page - 1) * size;
        }
        List<Employee> data = employeeMapper.getEmployeeByPage(page, size, employee, beginDateScope);
//        for (Employee datum : data) {
//            System.out.println(datum);
//        }
        Long total = employeeMapper.getTotal(employee, beginDateScope);
        System.out.println(total);
        RespPageBean bean = new RespPageBean();
        bean.setData(data);
        bean.setTotal(total);
        return bean;
    }

    /**
     * 返回当前最大的工号
     * @return
     */
//    public Integer maxWorkID() {
//        return employeeMapper.maxWorkID();
//    }


}
