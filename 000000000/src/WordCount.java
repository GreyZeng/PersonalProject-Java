public class WordCount {
    public static void main(String[] args) {
        if (null == args) {
            System.out.println("warning: none args");
            System.exit(-1);
        }
        Lib.process(args[0]);
    }
}
