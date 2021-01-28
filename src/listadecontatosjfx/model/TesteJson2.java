/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadecontatosjfx.model;

import org.json.JSONException;
import org.json.JSONObject;

/**
 *
 * @author Raquel
 */
public class TesteJson2 {
    public static void main(String[] args) {
        /* -------------------------------------------------------
	 * TESTE 2
	 * cria um JSONObject a partir de uma string
	 * -------------------------------------------------------*/

	//string json
	String json_str = "{\"titulo\":\"Os Arquivos JSON\",\"ano\":1998,\"genero\":\"Ficção\"}";

	//instancia um novo JSONObject passando a string como entrada
	JSONObject my_obj = new JSONObject(json_str);

	//recupera campo por campo com o método get() e imprime cada um
	String titulo = my_obj.getString("titulo");
	Integer ano = my_obj.getInt("ano");
	String genero = my_obj.getString("genero");

	System.out.println("titulo: " + titulo);
	System.out.println("ano: " + ano);
	System.out.println("genero: " + genero);
    }
}
