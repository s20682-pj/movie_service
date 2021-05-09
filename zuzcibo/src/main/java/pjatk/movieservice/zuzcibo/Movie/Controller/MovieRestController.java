package pjatk.movieservice.zuzcibo.Movie.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.movieservice.zuzcibo.Movie.Model.Movie;
import pjatk.movieservice.zuzcibo.Movie.Service.MovieService;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieRestController {
    private MovieService movieService;

    public MovieRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    public ResponseEntity<List<Movie>> allMovies() {
        return ResponseEntity.ok(movieService.allMovies());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> getMovieById(@PathVariable Long id){
        return ResponseEntity.ok(movieService.getMovieById(id));
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> editMovie(@PathVariable Long id, @RequestBody Movie movie){
        return ResponseEntity.ok(movieService.editMovie(id,movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovie(@PathVariable Long id){
        return ResponseEntity.ok().build();
    }
}
