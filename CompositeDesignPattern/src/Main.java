public class Main {
    public static void main(String[] args) {
        Directory movies = new Directory("Movies");
        File file = new File("Bahubali");
        movies.add(file);

        Directory ActionMovies = new Directory("ActionMovies");
        File Salaar = new File("Salaar");
        ActionMovies.add(Salaar);

        movies.add(ActionMovies);

        movies.ls();
    }
}