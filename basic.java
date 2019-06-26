public class basic {
    public static void main(String[] args){
        try {
            int x = 5/0;
        }

        catch(Exception e){
            System.out.print(e);
        }
    }
}