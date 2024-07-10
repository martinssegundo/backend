package br.com.boostingdevs.infrastructure.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;

import java.util.List;

@Builder
public record ChallengeDto(
        @JsonProperty("id") Long id,
        @JsonProperty("name") String name,
        @JsonProperty("subtitle") String subtitle,
        @JsonProperty("description") String description,
        @JsonProperty("tags") List<String> tags,
        @JsonProperty("level") String level,
        @JsonProperty("figma") String figma,
        @JsonProperty("ideas") String ideas,
        @JsonProperty("github") String github,
        @JsonProperty("userStories") List<String> userStories,
        @JsonProperty("iframe") String iframe,
        @JsonProperty("areas") List<String> areas,
        @JsonProperty("image") String image,
        @JsonProperty("categories") List<String> categories
) {}
