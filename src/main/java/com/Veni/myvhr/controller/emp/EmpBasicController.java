package com.Veni.myvhr.controller.emp;



import com.Veni.myvhr.pojo.Employee;
import com.Veni.myvhr.pojo.RespPageBean;
import com.Veni.myvhr.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Date;
import java.util.List;


@RestController
@RequestMapping("/employee/basic")
public class EmpBasicController {
    @Autowired
    EmployeeService employeeService;
    /**
     * get 请求 就调用 该方法  返回一个 RespPageBean  请求数据库的数据长度和具体的数据  使用list存储
     * @param page
     * @param size
     * @param employee
     * @param beginDateScope
     * @return
     */
//    @GetMapping("/")
//    public RespPageBean getEmployeeByPage(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer size, Employee employee, Date[] beginDateScope) {
//        return employeeService.getEmployeeByPage(page, size, employee,beginDateScope);
//    }

    @GetMapping("/emps")
    public RespPageBean getEmployeeByPage() {
        return employeeService.getEmployeeByPage();
    }
//    /employee/basic/test
    @GetMapping("/test")
    public RespPageBean getEmployeeTest() {
        RespPageBean pageBean = new RespPageBean();
        pageBean.setTotal(4l);
        return pageBean;
    }

    public static void main(String[] args) {
        EmpBasicController controller = new EmpBasicController();
        RespPageBean bean = controller.getEmployeeByPage();
        System.out.println(bean);
    }



}
