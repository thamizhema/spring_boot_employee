package com.hd.emp.service.impl;

import com.hd.emp.dto.EmployeeDto;
import com.hd.emp.entity.Employee;
import com.hd.emp.mapper.EmployeeMapper;
import com.hd.emp.repository.EmployeeRepository;
import com.hd.emp.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
@AllArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee =employeeRepository.save(employee);

        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }
}
