package pl.pjait;

import javax.xml.crypto.Data;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {


        //******************** TESTING WRONG FORMAT
        LoanApplication wrongTest = new LoanApplication("Mihail3","b0zy$kowski", "12345AHA901",
                                                "1998-12-04","1234567890XX",
                                        "12345678901234567890123456bad", "Female");

        System.out.println("\n\n");

        //****************** TESTING CORRECT FORMAT
        LoanApplication correctTest = new LoanApplication("Michał","Brzęczyszczykiewicz", "94011256731",
                "1994-01-12","1234567890", "12345678901234567890123456", "male");


    }
}
