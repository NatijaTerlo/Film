public class Main {
        public static void main(String[] args) {
            // Opret en film med titel og udgivelsesår
            Film minFilm = new Film("En Fantastisk Film", 2022);

            // Opret en producer
            Film.Producer minProducer = new Film.Producer("John Doe");

            // Knyt producer til film
            minFilm.knytProducerTilFilm(minProducer);

            // Udskriv filminformation inklusive producer
            System.out.println("Filminformation:");
            System.out.println("Filmtitel: " + minFilm.getFilmtitel());
            System.out.println("Udgivelsesår: " + minFilm.getUdgivelsesår());
            System.out.println(minFilm.hentProducerInformation());
        }
    }
