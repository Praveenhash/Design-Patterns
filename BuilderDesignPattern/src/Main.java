public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        DellDesktop dellDesktopBuilder = new DellDesktop();
        Desktop dellDesktop = director.BuildDesktop(dellDesktopBuilder);

//        HPDesktop hpDesktopBuilder = new HPDesktop();
//        Desktop hpDesktop = director.BuildDesktop(hpDesktopBuilder);

        dellDesktop.display();
//        hpDesktop.display();
    }
}