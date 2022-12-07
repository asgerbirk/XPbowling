package com.example.xpbowling.employee.controller;

import com.example.xpbowling.employee.model.Employee;
import com.example.xpbowling.employee.service.EmployeeService;
import com.example.xpbowling.equipment.model.Equipment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/employees")
@CrossOrigin
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping
    public ResponseEntity<List<Employee>> getAllEquipment(){
        return ResponseEntity.ok().body(employeeService.getAllEmployees());
    }


    @PostMapping
    public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee){
        return ResponseEntity.ok().body(employeeService.create(employee));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> findById(@PathVariable("id") Long id){
        return ResponseEntity.ok().body(employeeService.findById(id));
    }

    @PutMapping("/{id}")
    ResponseEntity<Employee> update(@PathVariable Long id, @Valid @RequestBody Employee employee){
        return ResponseEntity.ok().body(employeeService.update(id, employee));
    }


    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteEquipment(@PathVariable("id") Long id){
        employeeService.deleteEmployee(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
