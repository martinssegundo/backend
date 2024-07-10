package br.com.boostingdevs.application.challenges.impl;

import br.com.boostingdevs.application.challenges.FindChallengeUseCase;
import br.com.boostingdevs.domain.Challenge;
import br.com.boostingdevs.infrastructure.configs.BoostApplicationScoped;
import br.com.boostingdevs.infrastructure.persistence.challenges.ChallengeEntity;
import io.smallrye.mutiny.Uni;

@BoostApplicationScoped
public class FindChallengeUseCaseImpl implements FindChallengeUseCase {



    @Override
    public Uni<Challenge> findById(Long id) {
        return ChallengeEntity.findById(id)
                .map(item -> {
                    var convertItem = (ChallengeEntity) item;
                    return new Challenge(convertItem.getName(),
                            convertItem.getSubtitle(),
                            convertItem.getDescription(),
                            convertItem.getTags(),
                            convertItem.getLevel(),
                            convertItem.getFigma(),
                            convertItem.getIdeas(),
                            convertItem.getGithub(),
                            convertItem.getUserStories(),
                            convertItem.getIframe(),
                            convertItem.getAreas(),
                            convertItem.getImage(),
                            convertItem.getCategories());
                });
    }
}
