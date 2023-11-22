package edutechTeam.edutech.repository;

import edutechTeam.edutech.dto.EduDto;
import edutechTeam.edutech.dto.GovernDto;
import edutechTeam.edutech.entity.Government;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface GovernRepository extends JpaRepository<Government, Long> {

    List<Government> findAll();

    @Query("select title, content, image from Government")
    List<GovernDto> findList();

    Optional<Government> findById(Long id);
}
