public class Validator {
    public static boolean isValidTitle(String title) {
        return title != null && !title.trim().isEmpty();
    }

    public static boolean isValidDescription(String description) {
        return description != null && !description.trim().isEmpty();
    }
}

