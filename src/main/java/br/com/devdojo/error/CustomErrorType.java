package br.com.devdojo.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomErrorType {
    private String errorMessage;

    public CustomErrorType(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
