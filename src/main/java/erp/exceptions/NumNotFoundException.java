package erp.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NumNotFoundException extends RuntimeException {
    public NumNotFoundException() {
        super("Please enter a positive integer greater than 0.");
    }
}
