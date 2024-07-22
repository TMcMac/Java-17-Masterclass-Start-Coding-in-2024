public class NextMain {
    public static void main(String[] args) {
        // Remember compile time type is the declared type ie Comedy comedy = new Comedy()
        // Runtime type is what is returned from the function/consturctor/etc of the right side of the =

        Movie movie = Movie.getMovie("A", "Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        // Object is too generic so we need to cast to comedy to use watchComedy
        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        // The compiler only knows that getMovie returns something of type movie, nopt the specific subclass
        // So watchComedy wont work without a cast even though var should figure out run time type
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();

        // here we specifically get a new comedy object so watch comedy works
        var plane = new Comedy("Airplane");
        plane.watchComedy();

        // Here we use the most generic option for compile object to have more versitle code / reduce boilerplate
        // So  we set a test to get the correct runtime object
        Object unknownObject = Movie.getMovie("C", "SpaceBalls");
        if (unknownObject.getClass().getSimpleName() == "Comedy") {
            Comedy c = (Comedy) unknownObject;
            c.watchComedy();
        } else if (unknownObject instanceof Adventure) {
            ((Adventure) unknownObject).watchAdventure();
        }
    }

}
