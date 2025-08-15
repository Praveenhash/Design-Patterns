public class RealImage implements Image{
    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFileFromDisk();
    }
    public void loadFileFromDisk(){
        System.out.println("Loading the Image from disk "+fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying the Image "+fileName);
    }
}
