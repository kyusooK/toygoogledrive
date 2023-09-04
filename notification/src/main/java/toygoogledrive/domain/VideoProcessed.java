package toygoogledrive.domain;

import java.util.*;
import lombok.*;
import toygoogledrive.domain.*;
import toygoogledrive.infra.AbstractEvent;

@Data
@ToString
public class VideoProcessed extends AbstractEvent {

    private Long id;
    private Long fileId;
    private String url;
}
