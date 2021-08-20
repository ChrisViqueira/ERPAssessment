package erp.models.entity;

import erp.constants.EmploymentLevel;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import java.util.Date;

@NoArgsConstructor
@Entity
public class MidLevelEmployee extends Employee {
    public MidLevelEmployee(String name, Date dateHired) {
        super(name, dateHired, EmploymentLevel.MID);
    }
}
