package toygoogledrive.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import toygoogledrive.domain.*;
import toygoogledrive.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class FileIndexed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String keywords;

    public FileIndexed(Index aggregate) {
        super(aggregate);
    }

    public FileIndexed() {
        super();
    }
}
//>>> DDD / Domain Event
