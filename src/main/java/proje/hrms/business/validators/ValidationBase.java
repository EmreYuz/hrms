package proje.hrms.business.validators;

import proje.hrms.entities.concretes.Candidate;

import java.util.Locale;

public class ValidationBase {

    public static boolean confirmPassword(Candidate candidate) {
        return candidate.getPassword().equals(candidate.getPasswordAgain());
    }

    public static boolean checkEmailDomain(String email, String website) {
        var emailParameters = email.split("@");

        var domain = emailParameters[emailParameters.length - 1];
        return domain.equals(website.toLowerCase(Locale.ROOT));
    }
}
