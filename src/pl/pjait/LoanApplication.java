package pl.pjait;

public class LoanApplication {

    private String firstName;
    private String surName;
    private String pesel;
    private String nip;
    private String bankAccountNumber;
    private String dateOfBirth;
    private String gender;


    public LoanApplication (String firstName, String surName, String pesel,
                            String dateOfBirth, String nip, String bankAccountNumber,
                            String gender) {
        DataValidationService dataValidationService = new DataValidationService();


        if(dataValidationService.partOfNameValidation(firstName)){
            this.firstName = firstName;
            System.out.println("Name successfully saved...");
        } else {
            System.out.println("Wrong first name format");
        }


        if(dataValidationService.partOfNameValidation(surName)){
            this.surName = surName;
            System.out.println("Second name successfully saved...");
        } else {
            System.out.println("Wrong surname format");
        }


        if(dataValidationService.peselValidation(pesel)){
            this.pesel = pesel;
            System.out.println("Pesel successfully saved...");
        } else {
            System.out.println("Wrong pesel format");
        }


        if(dataValidationService.dateOfBirthValidation(dateOfBirth, pesel)){
            this.dateOfBirth = dateOfBirth;
            this.pesel = pesel;
            System.out.println("Date of birth successfully saved...");
        } else {
            System.out.println("Date of birth doesn't match pesel, try again");
        }


        if(dataValidationService.nipValidation(nip)){
            this.nip = nip;
            System.out.println("Nip successfully saved...");
        } else {
            System.out.println("Wrong nip format");
        }


        if(dataValidationService.partOfNameValidation(firstName)){
            this.gender = gender;
            System.out.println("Gender successfully saved...");
        } else {
            System.out.println("Gender does not match");
        }
    }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
