public class Main {
    public static void main(String[] args) {
        GoogleMaps googleMaps = new GoogleMaps();
        AppleMaps appleMaps = new AppleMaps();

        UberRide uberRide = new UberRide("Praveenkumar", googleMaps);
        UberEats uberEats = new UberEats("Meghana Foods", googleMaps);



//        uberRide.setNavigateImpl(googleMaps);
//        uberEats.setNavigateImpl(appleMaps);

        uberRide.NavigateTo("Uttarahalli");
        uberEats.NavigateTo("Jayanagar");
    }
}