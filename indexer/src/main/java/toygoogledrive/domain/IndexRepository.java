package toygoogledrive.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import toygoogledrive.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel = "indices", path = "indices")
public interface IndexRepository
    extends PagingAndSortingRepository<Index, Long> {}
