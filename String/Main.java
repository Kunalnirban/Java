public class Main {
    public static void main(String[] args) {
        int a;
        String s  = "Kunal Yadav";

        System.out.println("Length of String S = " + s.length());

        StringBuffer sb = new StringBuffer("Hello ");

        // Append
        sb.append("World!");
        System.out.println(sb);

        //Insert
        sb.insert(5, " Java");
        System.out.println(sb);

        // Replace
        sb.replace(5, 10, " HTML");
        System.out.println(sb);

        //delete
        sb.delete(5, 10);
        System.out.println(sb);
    }    
}
