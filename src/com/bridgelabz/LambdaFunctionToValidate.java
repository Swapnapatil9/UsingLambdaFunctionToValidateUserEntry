package com.bridgelabz;

public class LambdaFunctionToValidate {
    @FunctionalInterface
        public interface Validate{
         public boolean validateName(String name);
        }
        public static Validate validateFirstName(){
        return firstName -> firstName.matches("[A-Z]{1}[a-z]{2,}");
        }
         public static Validate validateLastName(){
         return lastName -> lastName.matches("[A-Z]{1}[a-z]{2,}");
        }
         public static Validate validateEmail(){
         return email -> email.matches("^[A-Za-z0-9+_.-]+@[a-zA-Z0-9._]+$");
        }
        public static Validate validateMobileFormat(){
        return mobileFormat -> mobileFormat.matches("[0-9]{2}\s[0-9]{10}");
        }
        public static Validate validatePassword(){
        return password -> password.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*\\W).{8,}$");
        }

    public static void main(String[] args) {
        boolean isValidateFirstName= validateFirstName().validateName("Swapna");
        System.out.println(isValidateFirstName);

        boolean isValidateLastName= validateLastName().validateName("Patil");
        System.out.println(isValidateLastName);

        boolean isValidateEmail= validateEmail().validateName("swapnapatil629@gmail.com");
        System.out.println(isValidateEmail);

        boolean isValidateMobileFormat= validateMobileFormat().validateName("91 7896325411");
        System.out.println(isValidateMobileFormat);

        boolean isValidatePassword= validatePassword().validateName("#Swapna1@Patil");
        System.out.println(isValidatePassword);
    }
}
