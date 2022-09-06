package iitu.edu.wmelonback.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author Ulan
 * @date 9/6/2022
 */

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class MelonNotFoundException extends Exception{

    public MelonNotFoundException() {
        super();
    }
    public MelonNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
    public MelonNotFoundException(String message) {
        super(message);
    }
    public MelonNotFoundException(Throwable cause) {
        super(cause);
    }
}
