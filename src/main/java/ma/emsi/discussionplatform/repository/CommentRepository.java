package ma.emsi.discussionplatform.repository;

import ma.emsi.discussionplatform.model.Comment;
import ma.emsi.discussionplatform.model.Post;
import ma.emsi.discussionplatform.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {
    List<Comment> findByPost(Post post);

    List<Comment> findAllByUser(User user);
}
