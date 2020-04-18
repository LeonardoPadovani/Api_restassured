package rest.Tests;

import org.junit.Test;
import static io.restassured.RestAssured.*;

import java.util.HashMap;
import java.util.Map;

import br.ce.lpadovani.rest.core.BaseTest;

public class LojinhaApi extends BaseTest {
	@Test
	public void AcessarProdutosSemToken() {
	given()
	.when()
	  .get("/produto")
	.then()
	  .statusCode(401);	
		
	}
	
	@Test
	public void InserirUsuarioComSucesso() {
		Map <String, String> usuario = new HashMap<>();
		usuario.put("usuarionome", "Leonardo Padovani");
		usuario.put("usuariologin", "leonardo.padovani");
		usuario.put("usuariosenha", "123456");
		
	given().
	  body(usuario)
	.when()
	  .post("/usuario")
	.then()
	  .statusCode(201);	
	 	
	}
	
	

}
