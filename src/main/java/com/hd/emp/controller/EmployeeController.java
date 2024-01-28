package com.hd.emp.controller;

import com.hd.emp.dto.EmployeeDto;
import com.hd.emp.entity.Employee;
import com.hd.emp.service.EmployeeService;
import com.hd.emp.service.impl.EmployeeServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("/emp")
public class EmployeeController {
private EmployeeService employeeService;


@PostMapping
public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto){
    EmployeeDto savedEmployee = employeeService.createEmployee(employeeDto);

    return  new ResponseEntity<>(savedEmployee, HttpStatus.CREATED);
}

}
