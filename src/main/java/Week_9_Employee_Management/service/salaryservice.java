package Week_9_Employee_Management.service;

import Week_9_Employee_Management.payload.request.SalaryRequest;
import Week_9_Employee_Management.payload.response.ApiResponse;
import Week_9_Employee_Management.payload.response.SalaryResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface SalaryService {

    ResponseEntity<ApiResponse<SalaryResponse>> addSalary(SalaryRequest request);

    ResponseEntity<ApiResponse<List<SalaryResponse>>> getSalaryByEmployeeId(Long employeeId);

}