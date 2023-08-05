package com.goCash.dto.request;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.goCash.enums.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonDeserialize
public class UserRegistrationRequest {
    @NotBlank(message = "firstName cannot be empty")
    @Pattern(regexp = "[a-zA-Z]*", message = "FirstName can only have letters")
    @Size(message = "FirstName character length cannot be less than 3 and more than 100", min = 3, max = 100)
    private String firstName;
    @NotBlank(message = "Lastname cannot be empty")
    @Pattern(regexp = "[a-zA-Z]*", message = "lastName can only have letters")
    @Size(message = "Lastname character length cannot be less than 3 and more than 100", min = 3, max = 100)
    private String lastName;
    @NotBlank(message = "email cannot be empty")
    @Email(message = "Must be a valid email!")
    private String email;
    @NotBlank(message = "phone number cannot be empty")
    @Size(message = "phone number is required")
    private String phoneNumber;
    @NotBlank(message = " password cannot be empty")
    @Size(message = "Password must be greater than 6 and less than 20", min = 6, max = 20)
    private String password;
    @NotBlank(message = "Confirm Password cannot be empty")
    @Size(message = "Confirm Password must be greater than 6 and less than 20", min = 6, max = 20)
    private String confirmPassword;
    @NotBlank(message = "Address cannot be empty")
    private String address;
    @NotNull(message = "Gender cannot be empty")
    private Gender gender;
    @NotBlank(message = "Date of birth cannot be empty")
    private String dateOfBirth;
    @NotBlank(message = "BVN  cannot be empty")
    private String bvn;

}
