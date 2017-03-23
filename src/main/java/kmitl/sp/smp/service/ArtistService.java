package kmitl.sp.smp.service;

import kmitl.sp.smp.entity.Artist;
import kmitl.sp.smp.repository.ArtistRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jo on 3/24/2017.
 */
@Service
public class ArtistService {
    private final ArtistRepository artistRepository;

    @Inject
    public ArtistService(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    public List<Artist> getAllArtist() {
        Iterable<Artist> artistIterator = artistRepository.findAll();
        List<Artist> artistNameList = new ArrayList<>();
        artistIterator.forEach(artistNameList::add);
        return artistNameList;
    }
}
