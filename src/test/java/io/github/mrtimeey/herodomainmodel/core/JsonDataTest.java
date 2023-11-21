package io.github.mrtimeey.herodomainmodel.core;

import de.skuzzle.test.snapshots.ForceUpdateSnapshots;
import de.skuzzle.test.snapshots.Snapshot;
import de.skuzzle.test.snapshots.data.json.JsonSnapshot;
import de.skuzzle.test.snapshots.junit5.EnableSnapshotTests;
import io.github.mrtimeey.herodomainmodel.model.Appearance;
import io.github.mrtimeey.herodomainmodel.model.ArtInformation;
import io.github.mrtimeey.herodomainmodel.model.Creation;
import io.github.mrtimeey.herodomainmodel.model.Gender;
import io.github.mrtimeey.herodomainmodel.model.Identity;
import io.github.mrtimeey.herodomainmodel.model.LivingStatus;
import io.github.mrtimeey.herodomainmodel.model.PersonalInformation;
import io.github.mrtimeey.herodomainmodel.model.SuperHero;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Roy Thomas, Gene Colan",
                              Appearance.of("Marvel Super-Heroes #13", "December, 1967", "Carol Danvers"),
                              Appearance.of("Ms. Marvel #1","October, 1976", "Ms. Marvel"),
                              Appearance.of("Uncanny X-Men #164","December, 1982","Binary"),
                              Appearance.of("Avengers (Vol. 3) #4","March, 1998","Warbird"),
                              Appearance.of("Avenging Spider-Man #9","July, 2012", "Captain Marvel")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")),
            createSuperHero(
                  "Peter Benjamin Parker",
                  "Spider-Man",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                               Appearance.of("Amazing Fantasy #15" ,"June, 1962")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Dr. Robert Bruce Banner",
                  "Hulk",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                               Appearance.of("Incredible Hulk #1" ,"March, 1962")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Sakaaran")
            ),
            createSuperHero(
                  "Thor Odinson",
                  "Thor",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Don Rico, Hy Rosen, Stan Lee, Jack Kirby, Larry Lieber",
                              Appearance.of("Venus #11", "July, 1950")
                        ),
                        ALIVE, FORMERLY_DECEASED),
                  createPersonalInformation(Identity.NO_DUAL, "Asgardian")),
            createSuperHero(
                  "Anthony Edward " +
                        "'Tony' Stark",
                  "Iron Man",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Larry Lieber, Don Heck, Jack Kirby",
                               Appearance.of("Tales of Suspense #39" ,"December, 1962")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Bulgarian")
            ),
            createSuperHero(
                  "Janet Van Dyne",
                  "Wasp",
                  Gender.FEMALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Ernest Hart, Jack Kirby",
                               Appearance.of("Tales to Astonish #44" ,"March, 1963")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Scott Edward Harris Lang",
                  "Ant-Man",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "David Michelinie, John Byrne",
                               Appearance.of("Avengers #181","December, 1978","Scott Lang"),
                               Appearance.of("Marvel Premiere #47","January, 1979","Ant-Man")
                        ),
                        ALIVE, FORMERLY_DECEASED),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Clinton Francis 'Clint' Barton",
                  "Hawkeye",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Don Heck",
                              Appearance.of("Tales of Suspense #57", "June, 1964" ,"Hawkeye"),
                              Appearance.of("Avengers #63", "February, 1969" ,"Goliath"),
                              Appearance.of("Captain America #179","August, 1974" ,"Golden Archer"),
                              Appearance.of("New Avengers #27", "February, 2007" ,"Ronin")
                        ),
                        ALIVE, FORMERLY_DECEASED),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Wanda Django Maximoff",
                  "Scarlet Witch",
                  Gender.FEMALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                               Appearance.of("X-Men #4" ,"January, 1964")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Serbian")
            ),
            createSuperHero(
                  "Natalia Alianovna 'Natasha' Romanova",
                  "Black Widow",
                  Gender.FEMALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Don Rico, Don Heck",
                               Appearance.of("Tales of Suspense #52" ,"January, 1964")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "Russian, Soviet")
            ),
            createSuperHero(
                  "Steven Grant 'Steve' Rogers",
                  "Captain America",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Joe Simon, Jack Kirby",
                              Appearance.of("Captain America Comics #1", "December, 1940")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Unrevealed",
                  "Mister Negative",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Dan Slott, Phil Jimenez",
                              Appearance.of("Free Comic Book Day 2007 (Spider-Man) #1", "May, 2007")
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.SECRET, "Chinese")
            ),
            createSuperHero(
                  "Dr. Otto Gunther Octavius",
                  "Doctor Octopus",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              Appearance.of("Amazing Spider-Man #3", "April, 1963", "Doctor Octopus"),
                              Appearance.of("Amazing Spider-Man #697", "November, 2012", "Spider-Man"),
                              Appearance.of("Amazing Spider-Man (Vol. 4) #25", "March, 2017", "Superior Octopus")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Jason Philip Macendale, Jr.",
                  "Hobgoblin",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              Appearance.of("Amazing Spider-Man #3", "April, 1963", "Doctor Octopus"),
                              Appearance.of("Amazing Spider-Man #697", "November, 2012", "Spider-Man"),
                              Appearance.of("Amazing Spider-Man (Vol. 4) #25", "March, 2017", "Superior Octopus")
                        ),
                        DECEASED
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Frederick 'Fred' Myers",
                  "Boomerang",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                              Appearance.of("Tales to Astonish #81", "April, 1966")
                        ),
                        DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American, Australien")
            ),
            createSuperHero(
                  "Adrian Toomes",
                  "Vulture",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Jack Kirby",
                              Appearance.of("Amazing Spider-Man #2", "February, 1963")
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Maxwell 'Max' Dillon",
                  "Electro",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              Appearance.of("Amazing Spider-Man #9", "November, 1963")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "Sergei Nikolaevich Kravinoff",
                  "Kraven the Hunter",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              Appearance.of("Amazing Spider-Man #15", "May, 1964")
                        ),
                        DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "Russian")
            ),
            createSuperHero(
                  "Quentin Beck",
                  "Mysterio",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              Appearance.of("Amazing Spider-Man #2", "February, 1963", "Quentin Beck"),
                              Appearance.of("Amazing Spider-Man #13", "March, 1964", "Mysterio")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.PUBLIC, "American")
            ),
            createSuperHero(
                  "William Baker",
                  "Sandman",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Stan Lee, Steve Ditko",
                              Appearance.of("Amazing Spider-Man #4", "June, 1963")
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Benjamin 'Ben' Reilly",
                  "Chasm",
                  Gender.MALE,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Gerry Conway, Ross Andru",
                              Appearance.of("Amazing Spider-Man #149", "July, 1975", "Spider-Clone"),
                              Appearance.of("Spider-Man #52", "September, 1994", "Scarlet Spider"),
                              Appearance.of("Sensational Spider-Man #0", "January, 1996", "Spider-Man"),
                              Appearance.of("Free Comic Book Day 2016 (Captain America) #1", "May, 2016", "The Jackal"),
                              Appearance.of("Amazing Spider-Man (Vol. 5) #93", "March, 2022", "Chasm")
                        ),
                        ALIVE, FORMERLY_DECEASED
                  ),
                  createPersonalInformation(Identity.SECRET, "American")
            ),
            createSuperHero(
                  "Loki Laufeyson",
                  "Loki",
                  Gender.FLUID,
                  createArtInformation(
                        "Earth-616",
                        createCreation(
                              "Kieron Gillen, Stephanie Hans",
                              Appearance.of("Journey Into Mystery #622", "April, 2011")
                        ),
                        ALIVE
                  ),
                  createPersonalInformation(Identity.PUBLIC, "Jotun")
            )
      );
   }

   private static SuperHero createSuperHero(String name, String currentAlias, Gender gender, ArtInformation artInformation, PersonalInformation personalInformation) {
      return SuperHero.of(
            name,
            currentAlias,
            gender,
            artInformation,
            personalInformation
      );
   }

   private static ArtInformation createArtInformation(String reality, Creation creation, LivingStatus... livingStatuses) {
      return ArtInformation.of(
            reality,
            creation,
            livingStatuses
      );
   }

   private static Creation createCreation(String creators, Appearance... appearances) {
      return Creation.of(
            Arrays.stream(creators.split(",")).toList(),
            Arrays.stream(appearances).toList()
      );
   }

   private static PersonalInformation createPersonalInformation(Identity identity, String citizenship) {
      return PersonalInformation.of(
            identity,
            citizenship
      );
   }

}
