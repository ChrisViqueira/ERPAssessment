package erp.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import erp.constants.EmploymentLevel;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "EMPLOYEE_POSITION")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public abstract class Employee {
    @Id
    @GeneratedValue
    @Column(name = "emp_id")
    private Long id;

    @Column
    private String name;

    @Column
    private Date dateHired;

    @Column
    private int level;

    public Employee(String name, Date dateHired, EmploymentLevel level) {
        this.name = name;
        this.dateHired = dateHired;
        this.level = level.getValue();
    }
}
