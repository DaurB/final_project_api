package test;

import models.User;
import models.UserData;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static spec.Specs.*;

public class UsersApiTest {

    @Test
    @DisplayName("Creating a new user")
    void createUserTest() {
        User user = new User();
        user.setName("dauren");
        user.setJob("qa");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .post("/users")
                .then()
                .spec(responseStatus201)
                .log().body()
                .extract().as(User.class);
        assertEquals(response.getName(), user.getName());
        assertEquals(response.getJob(), user.getJob());
    }

    @Test
    @DisplayName("Updating user data")
    void updateUserTest() {
        User user = new User();
        user.setName("dauren");
        user.setJob("qa automation");

        User response = given()
                .spec(request)
                .body(user)
                .when()
                .put("/users/2")
                .then()
                .spec(responseStatus200)
                .log().body()
                .extract().as(User.class);
        assertEquals(response.getName(), user.getName());
        assertEquals(response.getJob(), user.getJob());
    }

    @Test
    @DisplayName("User search")
    void singleUserTest() {

        UserData response = given()
                .spec(request)
                .when()
                .get("/users/2")
                .then()
                .spec(responseStatus200)
                .log().body()
                .extract().as(UserData.class);

        assertEquals("2", response.getUser().getId());
        assertEquals("janet.weaver@reqres.in", response.getUser().getEmail());
        assertEquals("Janet", response.getUser().getFirstName());
        assertEquals("Weaver", response.getUser().getLastName());
    }
}
