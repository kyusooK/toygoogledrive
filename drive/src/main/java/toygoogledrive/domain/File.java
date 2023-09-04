package toygoogledrive.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import toygoogledrive.DriveApplication;
import toygoogledrive.domain.FileUploaded;

@Entity
@Table(name = "File_table")
@Data
//<<< DDD / Aggregate Root
public class File {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long size;

    private Date createdDate;

    private String type;

    private String userId;

    @PostPersist
    public void onPostPersist() {
        FileUploaded fileUploaded = new FileUploaded(this);
        fileUploaded.publishAfterCommit();
    }

    public static FileRepository repository() {
        FileRepository fileRepository = DriveApplication.applicationContext.getBean(
            FileRepository.class
        );
        return fileRepository;
    }

    //<<< Clean Arch / Port Method
    public void upload() {
        //implement business logic here:

    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
