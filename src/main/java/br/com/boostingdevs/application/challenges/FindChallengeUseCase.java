package br.com.boostingdevs.application.challenges;

import br.com.boostingdevs.domain.Challenge;
import io.smallrye.mutiny.Uni;

public interface FindChallengeUseCase {
    Uni<Challenge> findById(Long id);
}
