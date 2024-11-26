package Week_9_Employee_Management.service;

import Week_9_Employee_Management.payload.request.LeaveRequest;
import Week_9_Employee_Management.payload.response.ApiResponse;
import Week_9_Employee_Management.payload.response.LeaveResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LeaveService {

    ResponseEntity<ApiResponse<LeaveResponse>> addLeave(LeaveRequest request);

    ResponseEntity<ApiResponse<List<LeaveResponse>>> getLeavesByEmployeeId(Long employeeId);
}