package com.apap.tu03.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.apap.tu03.model.MovieModel;

@Service
public class InMemoryMovieService implements MovieService {

	private List<MovieModel> archiveMovie;
	
	public InMemoryMovieService() {
		archiveMovie = new ArrayList<>();
	}
	
	@Override
	public void addMovie(MovieModel movie) {
		archiveMovie.add(movie);
	}
	
	@Override
	public List<MovieModel> getMovieList() {
		return archiveMovie;
	}

	@Override
	public MovieModel getMovieDetail(String id) {
		// TODO Auto-generated method stub
		for(int i = 0; i < archiveMovie.size(); i++) {
			MovieModel movieModel = archiveMovie.get(i);
			if(movieModel.getId().equals(id)) {
				return movieModel;
			}
		}
		return null;
		
	}
	
	@Override
	public MovieModel updateMovie(String id, int duration) {
		// TODO Auto-generated method stub
		for(int i = 0; i < archiveMovie.size(); i++) {
			MovieModel movieModel = archiveMovie.get(i);
			if(movieModel.getId().equals(id)) {
				movieModel.setDuration(duration);
				return movieModel;
			}
		}
		return null;
		
	}
	
	
	@Override
	public MovieModel deleteMovie(String id) {
		// TODO Auto-generated method stub
		for(int i = 0; i < archiveMovie.size(); i++) {
			MovieModel movieModel = archiveMovie.get(i);
			if(movieModel.getId().equals(id)) {
				movieModel = null;
				return movieModel;
			}
		}
		return null;
		
	}
	

}
