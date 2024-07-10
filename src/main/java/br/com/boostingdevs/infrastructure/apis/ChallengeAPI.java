package br.com.boostingdevs.infrastructure.apis;

import br.com.boostingdevs.application.challenges.FindAllChallengesUserCase;
import br.com.boostingdevs.application.challenges.FindChallengeUseCase;
import br.com.boostingdevs.infrastructure.apis.adapter.ChallengeAdapter;
import io.smallrye.mutiny.Uni;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.core.Response;

@Path("/challenges")
public class ChallengeAPI {

    private final FindAllChallengesUserCase findAllChallengesUserCase;
    private final FindChallengeUseCase findChallengeUseCase;

    @Inject
    public ChallengeAPI(final FindAllChallengesUserCase findAllChallengesUserCase,
                        final FindChallengeUseCase findChallengeUseCase) {
        this.findAllChallengesUserCase = findAllChallengesUserCase;
        this.findChallengeUseCase = findChallengeUseCase;
    }


    @GET
    public Uni<Response> getAll(){
        return Uni.createFrom()
                .item(Response.ok(findAllChallengesUserCase.getAll()
                        .map(ChallengeAdapter::toListDto)).build());
    }

    @GET
    @Path("/{id}")
    public Uni<Response> findById(@PathParam("id") Long id){
        return Uni.createFrom()
                .item(Response.ok(findChallengeUseCase.findById(id)
                        .map(ChallengeAdapter::toDto)).build());
    }
}
