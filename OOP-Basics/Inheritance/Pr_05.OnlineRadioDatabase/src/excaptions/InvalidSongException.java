package excaptions;

public class InvalidSongException extends Exception {

    public InvalidSongException(String message) {
        super(message);
    }
}
