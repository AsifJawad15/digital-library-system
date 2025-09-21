public class EBookProxy implements EBook {
    private String filename;
    private RealEBook realEBook;
    
    public EBookProxy(String filename) {
        this.filename = filename;
        this.realEBook = null;
    }
    
    @Override
    public void display() {
        if (realEBook == null) {
            System.out.println("First access - loading " + filename);
            realEBook = new RealEBook(filename);
        }
        realEBook.display();
    }
}