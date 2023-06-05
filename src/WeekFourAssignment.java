public class WeekFourAssignment {

    public static void main(String args[]) {
        String firstName = "abraham";
        String lastName = "lincoln";

        String primaryPhone = "555-123-1245";
        String secondaryPhone = "555.123.1246";

        // Print results.
        System.out.print("Name: " + getFullName(firstName,lastName)+"\nPrimary Phone: "
        + phone(primaryPhone)+"\nSecondary Phone: " + phone(secondaryPhone));
    }

    //method to sanitize names
    public static String getFullName(String firstNameInput, String lastNameInput) {
        return formatName(firstNameInput) + " " + formatName(lastNameInput);
    }
    public static String formatName(String nameInput) {
        return nameInput.substring(0, 1).toUpperCase() + nameInput.substring(1);
    }
    //method to sanitize phone numbers
    public static String phone(String phoneInput) {
        return phoneInput.replace("-","").replace("(","").replace(
                ")","").replace(".","");
    }
}