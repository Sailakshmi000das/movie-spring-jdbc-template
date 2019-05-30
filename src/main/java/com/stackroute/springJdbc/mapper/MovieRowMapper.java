package com.stackroute.springJdbc.mapper;

import com.stackroute.springJdbc.domain.Movie;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MovieRowMapper implements RowMapper<Movie> {

    @Override
    public Movie mapRow(final ResultSet rs, final int rowNum) throws SQLException {
        final Movie movie = new Movie();
        movie.setId(rs.getInt("id"));
        movie.setMovieName(rs.getString("movieName"));
        movie.setActorName(rs.getString("actorName"));
        movie.setReleaseYear(rs.getInt("releaseYear"));
        movie.setRatings(rs.getFloat("ratings"));
        return movie;
    }
}
