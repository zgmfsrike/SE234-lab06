package camt.se234.unittest.exception;

/**
 * Created by Dto on 3/20/2017.
 */
public class OldDateException extends RuntimeException {
    public OldDateException(String s) {
        super(s);
    }

    public OldDateException() {
        super();
    }
}
