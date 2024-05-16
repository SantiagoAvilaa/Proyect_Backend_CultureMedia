package culturemedia.service.Impl;
import java.util.List;
import culturemedia.model.Video;
import culturemedia.model.View;
import culturemedia.service.CultureMediaService;
import culturemedia.repository.VideoRepository;
import culturemedia.repository.ViewsRepository;
import culturemedia.exception.VideoNotFoundException;

public class CultureMediaServiceImpl implements CultureMediaService{
    private VideoRepository videoRepository;
    private ViewsRepository viewRepository;
    public CultureMediaServiceImpl(VideoRepository videoRepository, ViewsRepository viewRepository) {
        this.videoRepository = videoRepository;
        this.viewRepository = viewRepository;
    }
    @Override
    public Video add(Video video){
        return videoRepository.save(video);
        }
    
    @Override
    public View add(View view) {
        return viewRepository.save(view);
        
    }
    @Override
    public List<Video> findAllVideos() throws VideoNotFoundException {
        List<Video> videos = videoRepository.findAll();
        if(videos.isEmpty()){
            throw new VideoNotFoundException();
        }
        
        return videos;
        
    }

    @Override
    public List<Video> find(String title) throws VideoNotFoundException {
        List<Video> videos = videoRepository.find(title);
        if(videos.isEmpty()){
            throw new VideoNotFoundException();
        }
        
        return videos;
        
    }

    @Override
    public List<Video> find(double fromDuration, double toDuration) throws VideoNotFoundException {
        List<Video> videos = videoRepository.find(fromDuration, toDuration);
        if(videos.isEmpty()){
            throw new VideoNotFoundException();
        }
        else{
            return videos;
        }
    }
}