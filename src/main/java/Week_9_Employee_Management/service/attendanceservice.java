package Week_9_Employee_Management.service;

import Week_9_Employee_Management.payload.request.AttendanceRequest;
import Week_9_Employee_Management.payload.request.EmployeeRequest;
import Week_9_Employee_Management.payload.response.ApiResponse;
import Week_9_Employee_Management.payload.response.AttendanceResponse;
import Week_9_Employee_Management.payload.response.EmployeeResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AttendanceService {

    ResponseEntity<ApiResponse<AttendanceResponse>> addAttendance(AttendanceRequest request);

    ResponseEntity<ApiResponse<List<AttendanceResponse>>> getAttendanceByEmployeeId(Long employeeId);

}