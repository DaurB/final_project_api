package test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static spec.Specs.*;

public class DeleteTest {

    @Test
    @DisplayName("Deleting a user")
    void deleteUserTest() {
        given()
                .spec(request)
                .when()
                .delete("/users/2")
                .then()
                .spec(responseStatus204);
    }
}
