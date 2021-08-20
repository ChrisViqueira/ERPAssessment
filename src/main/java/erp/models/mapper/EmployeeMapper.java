package erp.models.mapper;

import erp.models.dto.EmployeeDTO;
import erp.models.entity.Employee;
import erp.models.entity.Manager;
import erp.models.entity.MidLevelEmployee;
import erp.models.entity.PartTimeEmployee;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public class EmployeeMapper {

    public Employee toEntity(EmployeeDTO dto) {
        switch (dto.getLevel()) {
            case MANAGER:
                return new Manager(dto.getName(), dto.getDateHired());
            case MID:
                return new MidLevelEmployee(dto.getName(), dto.getDateHired());
            default:
                return new PartTimeEmployee(dto.getName(), dto.getDateHired());
        }
    }
}
