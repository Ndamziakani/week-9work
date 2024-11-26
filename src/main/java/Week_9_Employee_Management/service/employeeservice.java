package Week_9_Employee_Management.service;

import Week_9_Employee_Management.payload.request.EmployeeRequest;
import Week_9_Employee_Management.payload.response.ApiResponse;
import Week_9_Employee_Management.payload.response.EmployeeResponse;
import org.springframework.http.ResponseEntity;

public interface EmployeeService {

    ResponseEntity<ApiResponse<EmployeeResponse>> registerEmployee(EmployeeRequest request);

    ResponseEntity<ApiResponse<EmployeeResponse>> findEmployeeById(Long employeeId);
}