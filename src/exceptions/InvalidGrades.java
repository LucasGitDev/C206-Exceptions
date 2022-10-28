package exceptions;

public class InvalidGrades extends Exception{
    public InvalidGrades(){super("Grade must be between 0 and 100!");}
}
