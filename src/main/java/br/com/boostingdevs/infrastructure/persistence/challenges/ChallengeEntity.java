package br.com.boostingdevs.infrastructure.persistence.challenges;

import io.quarkus.hibernate.reactive.panache.PanacheEntity;
import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(schema = "boostdevs",name = "challenge")
public class ChallengeEntity extends PanacheEntityBase {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "challenge_seq")
    @SequenceGenerator(name = "challenge_seq", sequenceName = "challenge_sequence", allocationSize = 1)
    private int id;

    private String name;

    private String subtitle;

    private String description;

    @ElementCollection
    @CollectionTable(name = "challenge_tags", joinColumns = @JoinColumn(name = "challenge_id"))
    @Column(name = "tag")
    private List<String> tags;

    private String level;

    private String figma;

    private String ideas;

    private String github;

    @ElementCollection
    @CollectionTable(name = "challenge_user_stories", joinColumns = @JoinColumn(name = "challenge_id"))
    @Column(name = "user_story")
    private List<String> userStories;

    private String iframe;

    @ElementCollection
    @CollectionTable(name = "challenge_areas", joinColumns = @JoinColumn(name = "challenge_id"))
    @Column(name = "area")
    private List<String> areas;

    private String image;

    @ElementCollection
    @CollectionTable(name = "challenge_categories", joinColumns = @JoinColumn(name = "challenge_id"))
    @Column(name = "category")
    private List<String> categories;
}
