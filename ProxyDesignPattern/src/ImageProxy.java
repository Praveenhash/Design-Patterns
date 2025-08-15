public class ImageProxy implements Image{
    private String fileName;
    private RealImage realImage;

    public ImageProxy(String fileName){
        this.fileName = fileName;
        this.realImage = null;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
