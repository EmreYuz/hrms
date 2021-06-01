package proje.hrms.business.validators;

import proje.hrms.entities.concretes.Candidate;

import java.util.Locale;

public class ValidationBase {

    public static boolean confirmPassword(Candidate candidate) {
        return candidate.getPassword().equals(candidate.getPasswordAgain());
    }

    public static boolean checkEmailAndDomain(String email, String website) {
        String[] emailArr = email.split("@", 2);
        String domain = website.substring(4, website.length());

        if (emailArr[1].equals(domain)) {

            return true;
        }

        return false;
    }
}
