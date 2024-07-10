package br.com.boostingdevs.application.challenges;

import br.com.boostingdevs.domain.Challenge;
import io.smallrye.mutiny.Uni;

import java.util.List;

public interface FindAllChallengesUserCase {

    Uni<List<Challenge>> getAll();
}
