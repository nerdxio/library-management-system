package com.example.library.error;

import java.time.LocalDateTime;
import java.util.List;

public record ExceptionResponse(String message, boolean status, List<String> details, LocalDateTime time) {
}
