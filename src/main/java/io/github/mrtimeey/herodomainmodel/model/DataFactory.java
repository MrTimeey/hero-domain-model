package io.github.mrtimeey.herodomainmodel.model;

import java.util.List;

import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.ALIVE;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.DECEASED;
import static io.github.mrtimeey.herodomainmodel.model.LivingStatus.FORMERLY_DECEASED;

public final class DataFactory {

   public static SuperHero captainMarvel() {
      return SuperHero.of(
            "Carol Susan Jane Denvers",
            "Captain Marvel",
            Gender.FEMALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                        "Roy Thomas, Gene Colan",
                        "Marvel Super-Heroes #13 (December, 1967) (As Carol Danvers)",
                        "Ms. Marvel #1 (October, 1976) (As Ms. Marvel)",
                        "Uncanny X-Men #164 (December, 1982) (As Binary)",
                        "Avengers (Vol. 3) #4 (March, 1998) (As Warbird)",
                        "Avenging Spider-Man #9 (July, 2012) (As Captain Marvel)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "American"
            )
      );
   }

   public static SuperHero peterParker() {
      return SuperHero.of(
            "Peter Benjamin Parker",
            "Spider-Man",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                        "Stan Lee, Steve Ditko",
                        "Amazing Fantasy #15 (June, 1962)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.SECRET,
                  "American"
            )
      );
   }

   public static SuperHero hulk() {
      return SuperHero.of(
            "Dr. Robert Bruce Banner",
            "Hulk",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                        "Stan Lee, Jack Kirby",
                        "Incredible Hulk #1 (March, 1962)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "American, Sakaaran"
            )
      );
   }

   public static SuperHero thor() {
      return SuperHero.of(
                  "Thor Odinson",
            "Thor",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                              "Don Rico, Hy Rosen, Stan Lee, Jack Kirby, Larry Lieber",
                        "Venus #11 (July, 1950) (Golden Age)",
                              "Journey Into Mystery #83 (June, 1962) (Silver Age)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.NO_DUAL,
                        "Asgardian"
            )
      );
   }

   public static SuperHero ironMan() {
      return SuperHero.of(
                        "Anthony Edward 'Tony' Stark",
            "Iron Man",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                    "Stan Lee, Larry Lieber, Don Heck, Jack Kirby",
                        "Tales of Suspense #39 (December, 1962)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "American, Bulgarian"
            )
      );
   }
   public static SuperHero wasp() {
      return SuperHero.of(
                              "Janet Van Dyne",
            "Wasp",
            Gender.FEMALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                    "Stan Lee, Ernest Hart, Jack Kirby",
                        "Tales to Astonish #44 (March, 1963)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "American"
            )
      );
   }

   public static SuperHero antMan() {
      return SuperHero.of(
                                    "Scott Edward Harris Lang",
            "Ant-Man",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                          "David Michelinie, John Byrne",
                        "Avengers #181 (December, 1978) (As Scott Lang)",
                              "Marvel Premiere #47 (January, 1979) (As Ant-Man)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "American"
            )
      );
   }

   public static SuperHero hawkeye() {
      return SuperHero.of(
                                          "Clinton Francis 'Clint' Barton",
            "Hawkeye",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                                "Stan Lee, Don Heck",
                        "Tales of Suspense #57 (June, 1964) (As Hawkeye)",
                              "Avengers #63 (February, 1969) (As Goliath)",
                              "Captain America #179 (August, 1974) (As Golden Archer)",
                              "New Avengers #27 (February, 2007) (As Ronin)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "American"
            )
      );
   }

   public static SuperHero scarletWitch() {
      return SuperHero.of(
                                                "Wanda Django Maximoff",
            "Scarlet Witch",
            Gender.FEMALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                                "Stan Lee, Jack Kirby",
                        "X-Men #4 (January, 1964)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "American, Serbian"
            )
      );
   }

   public static SuperHero blackWidow() {
      return SuperHero.of(
                                                      "Natalia Alianovna 'Natasha' Romanova",
            "Black Widow",
            Gender.FEMALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                                "Stan Lee, Don Rico, Don Heck",
                        "Tales of Suspense #52 (January, 1964)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "Russian, Soviet"
            )
      );
   }

   public static SuperHero captainAmerica() {
      return SuperHero.of(
                                                      "Steven Grant 'Steve' Rogers",
            "Captain America",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                                "Joe Simon, Jack Kirby",
                        "Captain America Comics #1 (December, 1940)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "American"
            )
      );
   }

   public List<SuperHero> avengers() {
      return List.of(blackWidow(), thor(), hawkeye(), ironMan(), hulk(), captainAmerica());
   }

   public static SuperHero mrNegative() {
      return SuperHero.of(
            "Unrevealed",
            "Mister Negative",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                        "Dan Slott, Phil Jimenez",
                        "Free Comic Book Day 2007 (Spider-Man) #1 (May, 2007)"
                  ),
                  ALIVE
            ),
            PersonalInformation.of(
                  Identity.SECRET,
                  "Chinese"
            )
      );
   }

   public static SuperHero docOc() {
      return SuperHero.of(
                  "Dr. Otto Gunther Octavius",
            "Doctor Octopus",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                              "Stan Lee, Steve Ditko",
                        "Amazing Spider-Man #3 (April, 1963) (As Doctor Octopus)",
                              "Amazing Spider-Man #697 (November, 2012) (As Spider-Man)",
                              "Amazing Spider-Man (Vol. 4) #25 (March, 2017) (As Superior Octopus)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "American"
            )
      );
   }

   public static SuperHero hobgoblin() {
      return SuperHero.of(
                        "Jason Philip Macendale, Jr.",
            "Hobgoblin",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                              "Stan Lee, Steve Ditko",
                        "Amazing Spider-Man #3 (April, 1963) (As Doctor Octopus)",
                              "Amazing Spider-Man #697 (November, 2012) (As Spider-Man)",
                              "Amazing Spider-Man (Vol. 4) #25 (March, 2017) (As Superior Octopus)"
                  ),
                  DECEASED
            ),
            PersonalInformation.of(
                  Identity.SECRET,
                  "American"
            )
      );
   }

   public static SuperHero boomerang() {
      return SuperHero.of(
                              "Frederick 'Fred' Myers",
            "Boomerang",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                    "Stan Lee, Jack Kirby",
                        "Tales to Astonish #81 (April, 1966)"
                  ),
                  DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "American, Australien"
            )
      );
   }

   public static SuperHero vulture() {
      return SuperHero.of(
                                    "Adrian Toomes",
            "Vulture",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                    "Stan Lee, Jack Kirby",
                        "Amazing Spider-Man #2 (February, 1963)"
                  ),
                  ALIVE
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "American"
            )
      );
   }

   public static SuperHero electro() {
      return SuperHero.of(
                                          "Maxwell 'Max' Dillon",
            "Electro",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                          "Stan Lee, Steve Ditko",
                        "Amazing Spider-Man #9 (November, 1963)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "American"
            )
      );
   }

   public static SuperHero kraven() {
      return SuperHero.of(
                                          "Sergei Nikolaevich Kravinoff",
            "Kraven the Hunter",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                          "Stan Lee, Steve Ditko",
                        "Amazing Spider-Man #15 (May, 1964)"
                  ),
                  DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "Russian"
            )
      );
   }

   public static SuperHero mysterio() {
      return SuperHero.of(
                                          "Quentin Beck",
            "Mysterio",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                          "Stan Lee, Steve Ditko",
                        "Amazing Spider-Man #2 (February, 1963) (As Quentin Beck)",
                        "Amazing Spider-Man #13 (March, 1964) (As Mysterio)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                        "American"
            )
      );
   }

   public static SuperHero sandman() {
      return SuperHero.of(
                                                "William Baker",
            "Sandman",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                                          "Stan Lee, Steve Ditko",
                        "Amazing Spider-Man #4 (June, 1963)"
                  ),
                  ALIVE
            ),
            PersonalInformation.of(
                  Identity.SECRET,
                        "American"
            )
      );
   }

   public static List<SuperHero> sinisterSix() {
      return List.of(docOc(), vulture(), electro(), kraven(), mysterio(), sandman());
   }

   public static SuperHero benReilly() {
      return SuperHero.of(
            "Benjamin 'Ben' Reilly",
            "Chasm",
            Gender.MALE,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                        "Gerry Conway, Ross Andru",
                        "Amazing Spider-Man #149 (July, 1975) (As Spider-Clone)",
                        "Spider-Man #52 (September, 1994) (As Scarlet Spider)",
                        "Sensational Spider-Man #0 (January, 1996) (As Spider-Man)",
                        "Free Comic Book Day 2016 (Captain America) #1 (May, 2016) (As The Jackal)",
                        "Amazing Spider-Man (Vol. 5) #93 (March, 2022) (As Chasm)"
                  ),
                  ALIVE, FORMERLY_DECEASED
            ),
            PersonalInformation.of(
                  Identity.SECRET,
                  "American"
            )
      );
   }

   public static SuperHero loki() {
      return SuperHero.of(
            "Loki Laufeyson",
            "Loki",
            Gender.FLUID,
            Appearance.of(
                  "Earth-616",
                  Creation.of(
                        "Kieron Gillen, Stephanie Hans",
                        "Journey Into Mystery #622 (April, 2011)"
                  ),
                  ALIVE
            ),
            PersonalInformation.of(
                  Identity.PUBLIC,
                  "Jotun"
            )
      );
   }


}

