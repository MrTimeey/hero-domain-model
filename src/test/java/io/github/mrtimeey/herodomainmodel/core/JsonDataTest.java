package io.github.mrtimeey.herodomainmodel.core;

import de.skuzzle.test.snapshots.Snapshot;
import de.skuzzle.test.snapshots.data.json.JsonSnapshot;
import de.skuzzle.test.snapshots.junit5.EnableSnapshotTests;
import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import io.github.mrtimeey.herodomainmodel.model.Gender;
import io.github.mrtimeey.herodomainmodel.model.Identity;
import io.github.mrtimeey.herodomainmodel.model.LivingStatus;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.junit.jupiter.api.Test;

import java.util.List;

import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.ALIVE;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.DECEASED;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.FORMERLY_DECEASED;

@EnableSnapshotTests
public class JsonDataTest {

   @Test
   void validateHeroJsonStructure(Snapshot snapshot) {
      List<SuperHero> exampleHeros = createHeros();

      snapshot.assertThat(exampleHeros)
            .as(JsonSnapshot.json)
            .matchesSnapshotStructure();
   }

   private List<SuperHero> createHeros() {
      return List.of(
            createSuperHero(
                  "Carol Susan Jane Denvers",
                  "Captain Marvel",
                  Gender.FEMALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Roy Thomas, Gene Colan",
                              "Marvel Super-Heroes #13 (December, 1967) (As Carol Danvers)",
                              "Ms. Marvel #1 (October, 1976) (As Ms. Marvel)",
                              "Uncanny X-Men #164 (December, 1982) (As Binary)",
                              "Avengers (Vol. 3) #4 (March, 1998) (As Warbird)",
                              "Avenging Spider-Man #9 (July, 2012) (As Captain Marvel)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")),
            createSuperHero(
                  "Peter Benjamin Parker",
                  "Spider-Man",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              "Amazing Fantasy #15 (June, 1962)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Dr. Robert Bruce Banner",
                  "Hulk",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                              "Incredible Hulk #1 (March, 1962)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Sakaaran")
            ),
            createSuperHero(
                  "Thor Odinson",
                  "Thor",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Don Rico, Hy Rosen, Stan Lee, Jack Kirby, Larry Lieber",
                              "Venus #11 (July, 1950) (Golden Age)",
                              "Journey Into Mystery #83 (June, 1962) (Silver Age)"
                        ),
                        ALIVE, FORMERLY_DECEASED),
                  createPersonalInformation(Identity.NO_DUAL, "Asgardian")),
            createSuperHero(
                  "Anthony Edward " +
                        "'Tony' Stark",
                  "Iron Man",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Larry Lieber, Don Heck, Jack Kirby",
                              "Tales of Suspense #39 (December, 1962)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Bulgarian")
            ),
            createSuperHero(
                  "Janet Van Dyne",
                  "Wasp",
                  Gender.FEMALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Ernest Hart, Jack Kirby",
                              "Tales to Astonish #44 (March, 1963)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Scott Edward Harris Lang",
                  "Ant-Man",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "David Michelinie, John Byrne",
                              "Avengers #181 (December, 1978) (As Scott Lang)",
                              "Marvel Premiere #47 (January, 1979) (As Ant-Man)"
                        ),
                        ALIVE, FORMERLY_DECEASED),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Clinton Francis 'Clint' Barton",
                  "Hawkeye",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Don Heck",
                              "Tales of Suspense #57 (June, 1964) (As Hawkeye)",
                              "Avengers #63 (February, 1969) (As Goliath)",
                              "Captain America #179 (August, 1974) (As Golden Archer)",
                              "New Avengers #27 (February, 2007) (As Ronin)"
                        ),
                        ALIVE, FORMERLY_DECEASED),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Wanda Django Maximoff",
                  "Scarlet Witch",
                  Gender.FEMALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                              "X-Men #4 (January, 1964)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Serbian")
            ),
            createSuperHero(
                  "Natalia Alianovna 'Natasha' Romanova",
                  "Black Widow",
                  Gender.FEMALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Don Rico, Don Heck",
                              "Tales of Suspense #52 (January, 1964)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "Russian, Soviet")
            ),
            createSuperHero(
                  "Steven Grant 'Steve' Rogers",
                  "Captain America",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Joe Simon, Jack Kirby",
                              "Captain America Comics #1 (December, 1940)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Unrevealed",
                  "Mister Negative",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Dan Slott, Phil Jimenez",
                              "Free Comic Book Day 2007 (Spider-Man) #1 (May, 2007)"
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.SECRET, "Chinese")
            ),
            createSuperHero(
                  "Dr. Otto Gunther Octavius",
                  "Doctor Octopus",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              "Amazing Spider-Man #3 (April, 1963) (As Doctor Octopus)",
                              "Amazing Spider-Man #697 (November, 2012) (As Spider-Man)",
                              "Amazing Spider-Man (Vol. 4) #25 (March, 2017) (As Superior Octopus)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Jason Philip Macendale, Jr.",
                  "Hobgoblin",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              "Amazing Spider-Man #3 (April, 1963) (As Doctor Octopus)",
                              "Amazing Spider-Man #697 (November, 2012) (As Spider-Man)",
                              "Amazing Spider-Man (Vol. 4) #25 (March, 2017) (As Superior Octopus)"
                        ),
                        DECEASED
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Frederick 'Fred' Myers",
                  "Boomerang",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                              "Tales to Astonish #81 (April, 1966)"
                        ),
                        DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Australien")
            ),
            createSuperHero(
                  "Adrian Toomes",
                  "Vulture",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                              "Amazing Spider-Man #2 (February, 1963)"
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Maxwell 'Max' Dillon",
                  "Electro",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              "Amazing Spider-Man #9 (November, 1963)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Sergei Nikolaevich Kravinoff",
                  "Kraven the Hunter",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              "Amazing Spider-Man #15 (May, 1964)"
                        ),
                        DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "Russian")
            ),
            createSuperHero(
                  "Quentin Beck",
                  "Mysterio",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              "Amazing Spider-Man #2 (February, 1963) (As Quentin Beck)",
                              "Amazing Spider-Man #13 (March, 1964) (As Mysterio)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "William Baker",
                  "Sandman",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              "Amazing Spider-Man #4 (June, 1963)"
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Benjamin 'Ben' Reilly",
                  "Chasm",
                  Gender.MALE,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Gerry Conway, Ross Andru", "Amazing Spider-Man #149 (July, 1975) (As Spider-Clone)",
                              "Spider-Man #52 (September, 1994) (As Scarlet Spider)",
                              "Sensational Spider-Man #0 (January, 1996) (As Spider-Man)",
                              "Free Comic Book Day 2016 (Captain America) #1 (May, 2016) (As The Jackal)",
                              "Amazing Spider-Man (Vol. 5) #93 (March, 2022) (As Chasm)"
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Loki Laufeyson",
                  "Loki",
                  Gender.FLUID,
                  createAppearance(
                        "Earth-616",
                        createCreation(
                              "Kieron Gillen, Stephanie Hans",
                              "Journey Into Mystery #622 (April, 2011)"
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.PUBLIC, "Jotun")
            )
      );
   }

   private static SuperHero createSuperHero(String name, String currentAlias, Gender gender, Appearance appearance, PersonalInformation personalInformation) {
      return SuperHero.of(
            name,
            currentAlias,
            gender,
            appearance,
            personalInformation
      );
   }

   private static Appearance createAppearance(String reality, Creation creation, LivingStatus... livingStatuses) {
      return Appearance.of(
            reality,
            creation,
            livingStatuses
      );
   }

   private static Creation createCreation(String creators, String... appearances) {
      return Creation.of(
            creators,
            appearances
      );
   }

   private static PersonalInformation createPersonalInformation(Identity identity, String citizenship) {
      return PersonalInformation.of(
            identity,
            citizenship
      );
   }

}
