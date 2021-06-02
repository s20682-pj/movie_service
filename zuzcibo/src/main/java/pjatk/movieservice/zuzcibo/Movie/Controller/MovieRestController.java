package pjatk.movieservice.zuzcibo.Movie.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pjatk.movieservice.zuzcibo.Movie.Model.Movie;
import pjatk.movieservice.zuzcibo.Movie.Service.MovieService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movies")
public class MovieRestController {
    final MovieService movieService;

    public MovieRestController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping()
    public ResponseEntity<List<Movie>> findAll() {
        return ResponseEntity.ok(movieService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Movie> findById(@PathVariable Long id){
        return ResponseEntity.ok(movieService.findById(id));
    }

    @PostMapping
    public ResponseEntity<Movie> addMovie(@RequestBody Movie movie){
        return ResponseEntity.ok(movieService.addMovie(movie));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Movie> editMovie(@PathVariable Long id, @RequestBody Movie movie) throws Exception{
        return ResponseEntity.ok(movieService.editMovie(id,movie));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteMovieById(@PathVariable Long id){
        movieService.deleteMovieById(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}/available")
    public ResponseEntity<Movie> changeAvailability(@PathVariable Long id) throws Exception{
        return ResponseEntity.ok(movieService.changeAvailability(id));
    }
}
