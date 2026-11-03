package sokolov.dev.controller.exception;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Throwable.class)
    public ResponseEntity<ExceptionResponse> handleException(Throwable throwable) {
        HttpStatus status = HttpStatus.UNPROCESSABLE_CONTENT;
        ExceptionResponse responseBody = new ExceptionResponse(status.value(), throwable.getMessage());
        return new ResponseEntity<>(responseBody, buildHeaders(), status);
    }

    private HttpHeaders buildHeaders(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        return headers;
    }
}
