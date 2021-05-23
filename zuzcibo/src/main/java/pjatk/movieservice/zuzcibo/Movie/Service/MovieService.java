package pjatk.movieservice.zuzcibo.Movie.Service;

import org.springframework.stereotype.Service;
import pjatk.movieservice.zuzcibo.Movie.Model.Movie;
import pjatk.movieservice.zuzcibo.Movie.Repository.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    private final MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public Movie getMovieById(Long id){
        return movieRepository.findById(id).orElseThrow(RuntimeException::new);
    }

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }

    public Movie addMovie(Movie movie){
        return movieRepository.save(movie);
    }

    public void deleteMovie(Long id){
        if (movieRepository.findById(id).isPresent()){
            movieRepository.deleteById(id);
        }
    }

    public Movie editMovie(Long id, Movie editedMovie) throws Exception {
        if(movieRepository.existsById(id)){
            return movieRepository.save(editedMovie);
        }else{
            throw new Exception("Movie not found");
        }


    }


//    public List<Movie> allMovies(){
//        return List.of(new Movie(1L, "To", Category.Horror, "2017"));
//    }
//    public Movie getMovieById(Long id){
//        return new Movie(id, "Harry Potter", Category.Horror, "2000");
//    }
//
//    public Movie addMovie(Movie movie){
//        return movie;
//    }
//
//    public Movie editMovie(Long id, Movie movie) {
//        return new Movie(id, movie.getName(), movie.getCategory(), movie.getYear());
//    }
//
//    public void deleteMovie(Long id){
//
//    }
}
