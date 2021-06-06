package pjatk.movieservice.zuzcibo.Movie.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pjatk.movieservice.zuzcibo.Movie.Model.Movie;

import java.util.List;
import java.util.Optional;

public interface MovieRepository extends JpaRepository<Movie, Long> {

/*    @Override
    Optional<Movie> findById(Long aLong);

    @Override
    List<Movie> findAll();

    @Override
    <S extends Movie> S save(S s);

    @Override
    void delete(Movie movie);*/

}
