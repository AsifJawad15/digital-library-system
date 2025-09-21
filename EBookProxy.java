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
    
    @Override
    public String getTitle() {
        if (realEBook == null) {
            return filename.replace(".pdf", "");
        }
        return realEBook.getTitle();
    }
    
    @Override
    public int getSize() {
        if (realEBook == null) {
            System.out.println("Loading to get size: " + filename);
            realEBook = new RealEBook(filename);
        }
        return realEBook.getSize();
    }
}