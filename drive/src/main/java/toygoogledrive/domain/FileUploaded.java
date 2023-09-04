package toygoogledrive.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import toygoogledrive.domain.*;
import toygoogledrive.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createdDate;
    private String type;
    private String userId;

    public FileUploaded(File aggregate) {
        super(aggregate);
    }

    public FileUploaded() {
        super();
    }
}
//>>> DDD / Domain Event
