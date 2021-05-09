package pjatk.movieserive.zuzcibo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    public List<Movie> allMovies(){
        return List.of(new Movie(1L, "To", "horror", "2017"));
    }
    public Movie getMovieById(Long id){
        return new Movie(id, "Harry Potter", "horror", "2000");
    }

    public Movie addMovie(Movie movie){
        return movie;
    }
}
