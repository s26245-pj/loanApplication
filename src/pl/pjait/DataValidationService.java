package pl.pjait;

public class DataValidationService {

    public static boolean partOfNameValidation(String namePart){
        return namePart.matches("^[A-ZĄĆĘÓŁŃŻŹa-ząćęółńźż]{2,}+$");
    }

    public static boolean nipValidation(String nip) {
        return nip.matches("^\\d{10}$");
    }

    public static boolean peselValidation(String pesel) {
        return pesel.matches("^\\d{11}$");
    }

    public static boolean bankAccountNumberValidation(String bankAccountNumber) {
        return bankAccountNumber.matches("^\\d{26}$");
    }
    /*
    public static boolean dateOfBirthValidation() {

    }
    */

    public static boolean genderValidation(String gender, String pesel) {
        return pesel.substring(pesel.length() - 2).matches("[02468]")
                && gender.matches("^(?i)Female$") ||
                pesel.substring(pesel.length() - 2).matches("[13579]")
                && gender.matches("^(?i)Male$");
    }

}
