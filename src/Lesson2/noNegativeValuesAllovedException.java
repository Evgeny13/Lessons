package Lesson2;

import java.io.FileNotFoundException;

public class noNegativeValuesAllovedException extends FileNotFoundException {
    public noNegativeValuesAllovedException(String message) {
        super(message);
    }
}
