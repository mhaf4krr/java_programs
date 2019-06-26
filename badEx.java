void doRisky() throws BadException{
    if(true){
        BadException b = new BadException();
    }
}

public class badEx {
    void f() throws BadException{
        doRisky();
    }
}