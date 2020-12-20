package stepsDefinitions;
import base.BaseUtil;
import static com.jayway.restassured.module.jsv.JsonSchemaValidator.*;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
public class MetereologiaSteps extends BaseUtil {
    private String name;
    private String endpoint = "data/2.5/weather?q=Diadema&appid=7f6cfd29e6c8ae48cb7799465987ead7";
    private BaseUtil base;

    public MetereologiaSteps(BaseUtil base) {
        this.base = base;
    }

    public MetereologiaSteps() {

    }

    @Dado("^que eu possua o dados metereológicos das cidades$")
    public void que_eu_possua_o_dados_metereologicos_das_cidades() throws Throwable {

        name = "Diadema";

    }

    @Quando("^eu realizar a requisição no endpoint$")
    public void eu_realizar_a_requisicao_no_endpoint() throws Throwable {
        System.out.println("URL SOLICITADA:::::::::: " + base.urlDigital + endpoint + name);
        base.response = base.request.get(base.urlDigital + endpoint + name);
    }

    @Entao("^a api me retorna as seções de dados metereológicos$")
    public void a_api_me_retorna_as_secoes_de_dados_metereologicos() throws Throwable {

        // System.out.println(response.body().asString());
        base.response.then().statusCode(200).assertThat()
                .body(matchesJsonSchemaInClasspath("schema_lista_metereologia.json")); // validacao do schema
    }

}
