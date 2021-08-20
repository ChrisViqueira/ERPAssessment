package erp.controllers;

import erp.models.dto.EmployeeDTO;
import erp.models.entity.Employee;
import erp.models.mapper.EmployeeMapper;
import erp.repository.EmployeeRepository;
import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping(value = "/api/q2")
@Api(value = "API to play around with the new Employee class.")
public class EmployeeController {

    private final EmployeeMapper employeeMapper;

    private final EmployeeRepository employeeRepository;

    @PutMapping("/addEmployee")
    @ResponseStatus(HttpStatus.CREATED)
    public void addEmployee(@RequestBody EmployeeDTO dto) {
        employeeRepository.saveAndFlush(employeeMapper.toEntity(dto));
    }

    @GetMapping("/getEmployee/{empId}")
    @ResponseStatus(HttpStatus.OK)
    public Employee getEmployee(@PathVariable Long empId) {
        Employee employee = employeeRepository.getById(empId);
        return employee;
    }

    @DeleteMapping("/removeEmployee/{empId}")
    @ResponseStatus(HttpStatus.OK)
    public void removeEmployee(@PathVariable Long empId) {
        employeeRepository.deleteById(empId);
    }
}
