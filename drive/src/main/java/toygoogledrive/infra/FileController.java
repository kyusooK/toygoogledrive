package toygoogledrive.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import toygoogledrive.domain.*;

//<<< Clean Arch / Inbound Adaptor

@RestController
// @RequestMapping(value="/files")
@Transactional
public class FileController {

    @Autowired
    FileRepository fileRepository;

    @RequestMapping(
        value = "files/{id}/upload",
        method = RequestMethod.PUT,
        produces = "application/json;charset=UTF-8"
    )
    public File upload(
        @PathVariable(value = "id") Long id,
        HttpServletRequest request,
        HttpServletResponse response
    ) throws Exception {
        System.out.println("##### /file/upload  called #####");
        Optional<File> optionalFile = fileRepository.findById(id);

        optionalFile.orElseThrow(() -> new Exception("No Entity Found"));
        File file = optionalFile.get();
        file.upload();

        fileRepository.save(file);
        return file;
    }
}
//>>> Clean Arch / Inbound Adaptor
