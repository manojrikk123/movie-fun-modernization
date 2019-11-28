package org.superbiz.moviefun;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /*
    private final MoviesBean moviesBean;
    private final AlbumsRepository albumsBean;
    private final MovieFixtures movieFixtures;
    private final AlbumFixtures albumFixtures;

    public HomeController(MoviesBean moviesBean, AlbumsRepository albumsBean, MovieFixtures movieFixtures, AlbumFixtures albumFixtures) {
        this.moviesBean = moviesBean;
        this.albumsBean = albumsBean;
        this.movieFixtures = movieFixtures;
        this.albumFixtures = albumFixtures;
    }

     */

    @GetMapping("/")
    public String index() {
        return "index";
    }

    /*
    @GetMapping("/setup")
    public String setup(Map<String, Object> model) {
        for (MovieInfo movie : movieFixtures.load()) {
            moviesBean.addMovieInfo(movie);
        }

        for (Album album : albumFixtures.load()) {
            albumsBean.addAlbum(album);
        }

        model.put("movies", moviesBean.getMovieInfos());
        model.put("albums", albumsBean.getAlbums());

        return "setup";
    }

     */
}
