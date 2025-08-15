public class UberEats implements NavigateSystem {
    private String restuarantName;
    private NavigateImpl navigateImpl;
    public UberEats(String restuarantName, NavigateImpl navigateImpl){
        this.restuarantName = restuarantName;
        this.navigateImpl = navigateImpl;
    }

//    public void setNavigateImpl(NavigateImpl navigateImpl) {
//        this.navigateImpl = navigateImpl;
//    }

    @Override
    public void NavigateTo(String dst) {
        System.out.print("Uber Eats delivery from " + restuarantName + " to " + dst + " using ");
        navigateImpl.Navigate(dst);
    }
}
