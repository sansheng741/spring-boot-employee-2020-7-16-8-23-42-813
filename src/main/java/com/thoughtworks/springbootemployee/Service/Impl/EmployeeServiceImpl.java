package com.thoughtworks.springbootemployee.Service.Impl;

import com.thoughtworks.springbootemployee.Service.EmployeeService;
import com.thoughtworks.springbootemployee.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by CHENCO9 on 7/28/2020 5:03 PM
 */
@Service("EmployeeService")
public class EmployeeServiceImpl implements EmployeeService {
    @Override
    public List<Employee> selectAllEmployees() {
        return null;
    }

    @Override
    public Employee selectEmployeeById(Integer id) {
        return null;
    }

    @Override
    public void delEmployeeById(Integer id) {

    }

    @Override
    public void updateEmployeeById(Integer id, Employee employee) {

    }

    @Override
    public void addEmployee(Employee employee) {

    }
}
