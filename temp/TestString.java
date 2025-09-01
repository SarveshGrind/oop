public class TestString {

    public static void concatWithString(){
        String s = "";
        long start = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            s += i;    
        }
        long end = System.currentTimeMillis();

        System.out.println("The time for concat with string is "+(end - start)+ " ms");
    }

    public static void concatWithStringbuilder(){
        StringBuilder sb = new StringBuilder("");
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();

        System.out.println("The time for concat with StringBuilder is "+(end - start)+ " ms");
    }

    public static void concatWithStringBuffer() {
        StringBuffer sb = new StringBuffer("");
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            sb.append(i);
        }
        
        long end = System.currentTimeMillis();

        System.out.println("The time for concat with StringBuffer is "+ (end - start) + " ms");
    }

    public static void main(String[] args) {
        concatWithString();
        concatWithStringbuilder();
        concatWithStringBuffer();
    }
}