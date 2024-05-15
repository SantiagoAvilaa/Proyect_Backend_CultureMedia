package culturemedia.exception;

public class DurationNotValidException extends CultureMediaException {
    public DurationNotValidException(String message) {
        super(message);
    }

    public DurationNotValidException(String title, Double duration) {
        super("error with title: " + title + ", and duration: " + duration);
    }
}
