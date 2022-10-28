package exceptions;

public class DuplicateName extends Exception{
    public DuplicateName(){super("Name must be unique!");}
}
