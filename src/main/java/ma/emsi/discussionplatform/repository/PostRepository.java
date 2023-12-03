package ma.emsi.discussionplatform.repository;

import ma.emsi.discussionplatform.model.Post;
import ma.emsi.discussionplatform.model.Subreddit;
import ma.emsi.discussionplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    List<Post> findAllBySubreddit(Subreddit subreddit);

    List<Post> findByUser(User user);
}
