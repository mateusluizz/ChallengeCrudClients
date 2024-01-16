package com.devsuperior.dscrudclients.dto;

import com.devsuperior.dscrudclients.models.Client;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor

public class ClientDTO {

    private Long id;
    @Size(min = 3, max = 80, message = "Field must have between 3 and 80 characters")
    @NotBlank(message = "Required Field")
    private String name;
    @Size(min = 11, max = 11, message = "Cpf must have 11 numbers")
    private String cpf;
    @PositiveOrZero(message = "Field must have just 0 or positive numbers")
    @Digits(integer = 12, fraction = 2, message = "Field must have max 12 digits and 2 fractional")
    private Double income;
    @PastOrPresent(message = "Can't use future dates")
    private LocalDate birthDate;
    @PositiveOrZero(message = "Field must have just 0 or positive numbers")
    private Integer children;

    public ClientDTO(Client model) {
        id = model.getId();
        name = model.getName();
        cpf = model.getCpf();
        income = model.getIncome();
        birthDate = model.getBirthDate();
        children = model.getChildren();
    }
}
