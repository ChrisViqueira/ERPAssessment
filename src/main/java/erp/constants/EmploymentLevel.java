package erp.constants;

import lombok.Getter;

@Getter
public enum EmploymentLevel {
    MANAGER     (3),
    MID         (2),
    PART_TIME   (1);

    private final int value;

    EmploymentLevel(int value) {
        this.value = value;
    }
}
