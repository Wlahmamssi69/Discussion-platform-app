package ma.emsi.discussionplatform.repository;

import ma.emsi.discussionplatform.model.Post;
import ma.emsi.discussionplatform.model.User;
import ma.emsi.discussionplatform.model.Vote;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VoteRepository extends JpaRepository<Vote, Long> {
    Optional<Vote> findTopByPostAndUserOrderByVoteIdDesc(Post post, User currentUser);
}
