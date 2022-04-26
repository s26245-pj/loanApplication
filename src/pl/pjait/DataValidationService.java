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

    public static boolean dateOfBirthValidation(String dateOfBirth, String pesel) {
        String yearFromDate = dateOfBirth.substring(2, 4);
        String monthFromDate = dateOfBirth.substring(5, 7);
        String dayFromDate = dateOfBirth.substring(8, 10);
        String yearFromPesel = pesel.substring(0, 2);
        String monthFromPesel = pesel.substring(2, 4);
        String dayFromPesel = pesel.substring(4, 6);

        return Integer.parseInt(yearFromDate) == Integer.parseInt(yearFromPesel) &&
                Integer.parseInt(monthFromDate) == Integer.parseInt(monthFromPesel)
                && Integer.parseInt(dayFromDate) == Integer.parseInt(dayFromPesel);

    }


    public static boolean genderValidation(String gender, String pesel) {
        return pesel.substring(pesel.length() - 2).matches("[02468]")
                && gender.matches("^(?i)Female$") ||
                pesel.substring(pesel.length() - 2).matches("[13579]")
                && gender.matches("^(?i)Male$");
    }

}
