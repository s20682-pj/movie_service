package pjatk.movieservice.zuzcibo.Movie.Service;

import org.springframework.stereotype.Service;
import pjatk.movieservice.zuzcibo.Movie.Model.Category;
import pjatk.movieservice.zuzcibo.Movie.Model.Movie;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> allMovies(){
        return List.of(new Movie(1L, "To", Category.Horror, "2017"));
    }
    public Movie getMovieById(Long id){
        return new Movie(id, "Harry Potter", Category.Horror, "2000");
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
