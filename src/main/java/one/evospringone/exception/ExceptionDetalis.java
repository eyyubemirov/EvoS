package one.evospringone.exception;

import java.time.LocalDateTime;

public record ExceptionDetalis(
        LocalDateTime timeStamp,
        String message,
        String details
) {
}
