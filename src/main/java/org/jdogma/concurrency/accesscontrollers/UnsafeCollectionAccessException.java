package org.jdogma.concurrency.accesscontrollers;

/**
 * @author <a href="mailto:kristian.rosenvold gmail com">Kristian Rosenvold</a>
 */
public class UnsafeCollectionAccessException extends RuntimeException {

    public UnsafeCollectionAccessException(String message) {
        super(message);
    }
}