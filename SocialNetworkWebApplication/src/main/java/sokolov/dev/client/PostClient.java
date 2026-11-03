package sokolov.dev.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import sokolov.dev.entity.dto.PostDto;
import sokolov.dev.entity.dto.PostsContainerDto;
import sokolov.dev.entity.dto.request.CreatePostRequest;
import sokolov.dev.entity.dto.request.UpdatePostRequest;

@Component
public class PostClient {

    private final RestTemplate restTemplate;

    @Value("${post.client.base-url}")
    private String baseUrl;

    @Autowired
    public PostClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PostsContainerDto findAll(){
        return restTemplate.getForObject(baseUrl, PostsContainerDto.class);
    }

    public PostDto findById(int id){
        return restTemplate.getForObject(baseUrl + "/" + id, PostDto.class);
    }

    public PostDto save(CreatePostRequest request){
        return restTemplate.postForObject(baseUrl, request, PostDto.class);
    }

    public PostDto updateById(int id, UpdatePostRequest request){
//        restTemplate.put(baseUrl + "/" + id, request);
        return restTemplate.exchange(baseUrl + "/" + id,
                HttpMethod.PUT,
                new HttpEntity<>(request),
                PostDto.class
        ).getBody();

    }

    public void deleteById(int id){
        restTemplate.delete(baseUrl + "/" + id);
    }
}
