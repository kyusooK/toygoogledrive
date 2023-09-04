package toygoogledrive.domain;

import java.util.*;
import lombok.*;
import toygoogledrive.domain.*;
import toygoogledrive.infra.AbstractEvent;

@Data
@ToString
public class FileUploaded extends AbstractEvent {

    private Long id;
    private String name;
    private Long size;
    private Date createdDate;
    private String type;
    private String userId;
}
