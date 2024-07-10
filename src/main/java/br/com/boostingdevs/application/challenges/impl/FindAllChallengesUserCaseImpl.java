package br.com.boostingdevs.application.challenges.impl;

import br.com.boostingdevs.application.challenges.FindAllChallengesUserCase;
import br.com.boostingdevs.domain.Challenge;
import br.com.boostingdevs.infrastructure.configs.BoostApplicationScoped;
import br.com.boostingdevs.infrastructure.persistence.challenges.ChallengeEntity;
import io.smallrye.mutiny.Uni;

import java.util.List;

@BoostApplicationScoped
public class FindAllChallengesUserCaseImpl implements FindAllChallengesUserCase {

    @Override
    public Uni<List<Challenge>> getAll() {
        return ChallengeEntity
                .listAll()
                .map(list -> list.stream()
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
                        }).toList());
    }
}
