package pjatk.movieservice.zuzcibo.Movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.movieservice.zuzcibo.Movie.Model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
