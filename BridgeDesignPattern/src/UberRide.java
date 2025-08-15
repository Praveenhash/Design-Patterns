public class UberRide implements NavigateSystem{
    private String riderName;
    private NavigateImpl navigateImpl;
    public UberRide(String riderName, NavigateImpl navigateImpl){
        this.riderName = riderName;
        this.navigateImpl = navigateImpl;
    }
//    public void setNavigateImpl(NavigateImpl navigateImpl){
//        this.navigateImpl = navigateImpl;
//    }
    @Override
    public void NavigateTo(String dst) {
        System.out.print("Uber ride with " + riderName + " to " + dst + " using ");
        navigateImpl.Navigate(dst);
    }
}
