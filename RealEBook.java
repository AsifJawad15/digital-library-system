public class RealEBook implements EBook {
    private String filename;
    private String content;
    
    public RealEBook(String filename) {
        this.filename = filename;
        loadFromFile();
    }
    
    private void loadFromFile() {
        System.out.println("Loading " + filename);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        this.content = "Content of " + filename;
    }
    
    @Override
    public void display() {
        System.out.println("Displaying: " + content);
    }
}