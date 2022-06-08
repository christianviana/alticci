package pt.alticelabs;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
class AlticciResourceTest {

	@Test
    void test0() {
        given()
                .when().get("/alticci/0")
                .then()
                .statusCode(200)
                .body(is("0"));
    }
	
    @Test
    void test1() {
        given()
                .when().get("/alticci/1")
                .then()
                .statusCode(200)
                .body(is("1"));
    }
    
    
    @Test
    void test10() {
        given()
                .when().get("/alticci/10")
                .then()
                .statusCode(200)
                .body(is("9"));
    }
    
    @Test
    void test20() {
        given()
                .when().get("/alticci/20")
                .then()
                .statusCode(200)
                .body(is("151"));
    }
 
    @Test
    void test404() {
        given()
                .when().get("/alticci/aa")
                .then()
                .statusCode(404);
                
    }
    
    
    
}