public class Prog12_StringMethods {
    public static void main(String[] args) {
        String name =  "     Harry        ";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.trim().length());
        System.out.println(name.trim().substring(2));
        System.out.println(name.trim().substring(2, 4));    // 2 included 4 excluded
        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("Ha", "Le"));
        System.out.println(name.trim().startsWith("Har"));
        System.out.println(name.trim().endsWith("Har"));
        System.out.println("~~~~~~~~~~~~~~~~~~");

        String str = "Process finished with exit code 0";
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(00));
        System.out.println(str.charAt(8));
//        System.out.println(str.charAt(815));  // error
        System.out.println(str.indexOf("P"));
        System.out.println(str.indexOf("p"));

        System.out.println(name.trim().equals("harry"));
        System.out.println(name.trim().equalsIgnoreCase("Harry"));
    }
}
