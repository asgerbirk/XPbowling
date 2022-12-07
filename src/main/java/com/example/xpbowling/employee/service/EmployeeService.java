package com.example.xpbowling.employee.service;

import com.example.xpbowling.employee.model.Employee;
import com.example.xpbowling.employee.repository.EmployeeRepository;
import com.example.xpbowling.equipment.model.Equipment;
import com.example.xpbowling.equipment.repository.EquipmentRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;


    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }



    public Employee findById(Long id){
        return employeeRepository.findById(id).orElseThrow(() -> new IllegalStateException("no employee with that id " + id));
    }

    public Employee create(Employee employee){
        return employeeRepository.save(employee);
    }

    public void deleteEmployee(Long id){
        boolean checkIfEquipmentExists = employeeRepository.existsById(id);
        if(!checkIfEquipmentExists){
            throw new IllegalStateException("does not exist " + id);
        }
        employeeRepository.deleteById(id);
    }

    public Employee update(Long id, Employee employee){
        return employeeRepository.save(employee);
    }
}
