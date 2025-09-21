public class Main {
    public static void main(String[] args) {
        System.out.println("Digital Library System Demo\n");
        
        EBook book1 = new EBookProxy("Java.pdf");
        EBook book2 = new EBookProxy("DataStructures.pdf");
        
        System.out.println("Student 1:");
        book1.display();
        
        System.out.println("\nStudent 2:");
        book1.display();
        
        System.out.println("\nStudent 3:");
        book2.display();
        
        System.out.println("\nStudent 4:");
        book2.display();
    }
}