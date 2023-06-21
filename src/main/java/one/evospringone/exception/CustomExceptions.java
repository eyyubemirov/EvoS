package one.evospringone.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;
//@ControllerAdvice annotasiyasını sinfə əlavə etdiyiniz zaman həmin sinif qlobal istisna işləyicisinə çevrilir.
@ControllerAdvice
public class CustomExceptions extends ResponseEntityExceptionHandler {
    //ResponseEntityExceptionHandler klasi daxilindeki qalan exceptionlari avtomatik handl etsin
@ExceptionHandler(Exception.class)
    public final ResponseEntity<Object> handleAllException(Exception ex, WebRequest request) throws Exception {
        ExceptionDetalis exceptionDetalis =new ExceptionDetalis(LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
  return new ResponseEntity<>(exceptionDetalis, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
