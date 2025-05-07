package week5.classesStatic;

public class NameFormatter {

    // Private constructor to prevent instantiation
    private NameFormatter() {
    }

    // Format with only first and last name
    public static String format(String firstName, String lastName) {
        return String.format("%s, %s", lastName, firstName);
    }

    // Format with all parts
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix) {
        StringBuilder formatted = new StringBuilder();

        if (!prefix.isEmpty()) {
            formatted.append(prefix);
            formatted.append(" ");
        }

        if (!firstName.isEmpty()) {
            formatted.append(firstName);
            formatted.append(" ");
        }

        if (!middleName.isEmpty()) {
            formatted.append(middleName);
            formatted.append(" ");
        }

        if(!lastName.isEmpty()){
            formatted.append(lastName);
            formatted.append(" ");
        }

        if (!suffix.isEmpty()) {
            formatted.append(suffix);
            formatted.append(" ");
        }

        return formatted.toString();
    }

    // Format a fullName string like: "Dr. Mel B Johnson, PhD"
    public static String format(String fullName) {
        return fullName;
    }


}
