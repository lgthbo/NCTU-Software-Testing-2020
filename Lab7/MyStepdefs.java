import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class MyStepdefs {
    String isItFriday(String today){
        return "Nope";
    }
    String today;
    String actualAnswer;
    @Given("today is Sunday")
    public void todayIsSunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void iAskWhetherItSFridayYet() {
        actualAnswer = isItFriday(today);
    }

    @Then("I should be told {string}")
    public void iShouldBeTold(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }
}
