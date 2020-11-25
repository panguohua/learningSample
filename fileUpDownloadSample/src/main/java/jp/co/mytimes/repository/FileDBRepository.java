package jp.co.mytimes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jp.co.mytimes.model.FileDB;


@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
