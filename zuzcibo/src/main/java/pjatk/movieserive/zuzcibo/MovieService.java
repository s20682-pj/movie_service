package pjatk.movieserive.zuzcibo;

import org.springframework.stereotype.Service;

import java.util.List;
import static pjatk.movieserive.zuzcibo.Category.*;

@Service
public class MovieService {

    public List<Movie> allMovies(){
        return List.of(new Movie(1L, "To", Horror, "2017"));
    }
    public Movie getMovieById(Long id){
        return new Movie(id, "Harry Potter", Horror, "2000");
    }

    public Movie addMovie(Movie movie){
        return movie;
    }

    public Movie editMovie(Long id, Movie movie) {
        return new Movie(id, movie.getName(), movie.getCategory(), movie.getYear());
    }

    public void deleteMovie(Long id){

    }
}
