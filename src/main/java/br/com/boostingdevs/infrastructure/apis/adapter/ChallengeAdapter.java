package br.com.boostingdevs.infrastructure.apis.adapter;

import br.com.boostingdevs.domain.Challenge;
import br.com.boostingdevs.infrastructure.dtos.ChallengeDto;

import java.util.List;

public class ChallengeAdapter {

    private ChallengeAdapter() {}

    public static List<ChallengeDto> toListDto(List<Challenge> challenges){
        return challenges.stream().map(ChallengeAdapter::toDto).toList();
    }

    public static ChallengeDto toDto(Challenge challenge){
        return ChallengeDto.builder()
                .name(challenge.getName())
                .subtitle(challenge.getSubtitle())
                .description(challenge.getDescription())
                .tags(challenge.getTags())
                .level(challenge.getLevel())
                .figma(challenge.getFigma())
                .ideas(challenge.getIdeas())
                .github(challenge.getGithub())
                .userStories(challenge.getUserStories())
                .iframe(challenge.getIframe())
                .areas(challenge.getAreas())
                .image(challenge.getImage())
                .categories(challenge.getCategorie())
                .build();
    }
}
