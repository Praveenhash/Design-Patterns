public class Director {
    public Desktop BuildDesktop(DesktopBuilder desktopBuilder){
        desktopBuilder.buildMotherBoard();
        desktopBuilder.buildProcessor();
        desktopBuilder.buildMemory();
        desktopBuilder.buildStorage();
        desktopBuilder.buildGraphicsCard();
        return desktopBuilder.getDesktop();
    }
}
