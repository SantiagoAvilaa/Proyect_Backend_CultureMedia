package culturemedia.exception;

public class VideoNotFoundException extends CultureMediaException{
    public VideoNotFoundException(String message) {
        super(message);
    }

    public VideoNotFoundException() {
        super("Error con el título: ");
    }
}
