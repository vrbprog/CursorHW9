public class Main {
    public static void main(String[] args) {
        String string = new String("Init string ");
        while (true){
            string = string.concat(string);
        }
    }
}
