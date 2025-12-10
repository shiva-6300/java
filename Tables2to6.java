public class Tables2to6 {
    public static void main(String[] args) {
        
        for (int i = 50; i <= 60; i++) {        // Loop for tables 2 to 6
            System.out.println("Table of " + i + ":");
            
            for (int j = 1; j <= 10; j++) {   // Loop for each table (1 to 10)
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            
            System.out.println(); // Blank line after each table
        }
    }
}
