/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2013 the original author or authors.
 */
package org.assertj.examples.data;

import static java.lang.String.format;

import org.assertj.core.api.AbstractAssert;
import org.assertj.core.api.Assertions;


/**
 * {@link Team} specific assertions - Generated by CustomAssertionGenerator.
 */
public class TeamAssert extends AbstractAssert<TeamAssert, Team> {

  /**
   * Creates a new </code>{@link TeamAssert}</code> to make assertions on actual Team.
   * @param actual the Team we want to make assertions on.
   */
  public TeamAssert(Team actual) {
    super(actual, TeamAssert.class);
  }

  /**
   * An entry point for TeamAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one's can write directly : <code>assertThat(myTeam)</code> and get specific assertion with code completion.
   * @param actual the Team we want to make assertions on.
   * @return a new </code>{@link TeamAssert}</code>
   */
  public static TeamAssert assertThat(Team actual) {
    return new TeamAssert(actual);
  }

  /**
   * Verifies that the actual Team's players contains the given BasketBallPlayer elements.
   * @param players the given elements that should be contained in actual Team's players.
   * @return this assertion object.
   * @throws AssertionError if the actual Team's players does not contain all given BasketBallPlayer elements.
   */
  public TeamAssert hasPlayers(BasketBallPlayer... players) {  
    // check that actual Team we want to make assertions on is not null.
    isNotNull();

    // check that given BasketBallPlayer varargs is not null.
    if (players == null) throw new AssertionError("Expecting players parameter not to be null.");
    
    // check with standard error message (see commented below to set your own message).
    Assertions.assertThat(actual.getPlayers()).contains(players);

    // uncomment the 4 lines below if you want to build your own error message :
    // WritableAssertionInfo assertionInfo = new WritableAssertionInfo();
    // String errorMessage = "my error message";
    // assertionInfo.overridingErrorMessage(errorMessage);
    // Iterables.instance().assertContains(assertionInfo, actual.getTeamMates(), teamMates);
    
    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Team has no players.
   * @return this assertion object.
   * @throws AssertionError if the actual Team's players is not empty.
   */
  public TeamAssert hasNoPlayers() {  
    // check that actual Team we want to make assertions on is not null.
    isNotNull();

    // we overrides the default error message with a more explicit one
    String errorMessage = format("\nExpected :\n  <%s>\nnot to have players but had :\n  <%s>", actual, actual.getPlayers());
    
    // check
    if (!actual.getPlayers().isEmpty()) throw new AssertionError(errorMessage);
    
    // return the current assertion for method chaining
    return this;
  }
  

}
