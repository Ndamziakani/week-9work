package Week_9_Employee_Management.payload.request;

import Week_9_Employee_Management.entity.enums.Absent;
import Week_9_Employee_Management.entity.enums.Present;
import Week_9_Employee_Management.entity.enums.Reasons;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AttendanceRequest {

    private Long employeeId;

    @Enumerated(enumType.STRING)
    private Present present;

    @Enumerated(EnumType.STRING)
    private Absent absent;

    @Enumerated(EnumType.STRING)
    private Reasons reasons;

}