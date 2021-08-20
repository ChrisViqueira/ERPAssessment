package erp.models.dto;

import erp.constants.EmploymentLevel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@Data
@ApiModel(value = "The DTO for the Employee entity.")
public class EmployeeDTO {

    @ApiModelProperty(dataType = "String", example = "Chris", required = true, position = 0)
    private String name;

    @ApiModelProperty(dataType = "Date", example = "2021-01-12", required = true, position = 1)
    private Date dateHired;

    @ApiModelProperty(dataType = "EmploymentLevel", example = "MANAGER", required = true, position = 2)
    private EmploymentLevel level;
}
