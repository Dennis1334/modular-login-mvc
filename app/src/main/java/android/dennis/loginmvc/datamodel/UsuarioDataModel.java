package android.dennis.loginmvc.datamodel;

import android.util.Log;

public class UsuarioDataModel {

    public static final String TABELA = "usuario";

    public static final String ID = "id";
    public static final String NOME = "nome";
    public static final String EMAIL = "email";
    public static final String SENHA = "senha";

    public static final String queryCriarTabela = "";

    public static String criarTabela(){
        queryCriarTabela += "CREATE TABLE " + TABELA + "(";
        queryCriarTabela += ID + "int primary key autoincrement";
        queryCriarTabela += NOME + "text";
        queryCriarTabela += EMAIL + "texte";
        queryCriarTabela += SENHA + "texte";
        queryCriarTabela += ")";

        Log.i("tabela", "criarTabela: " + queryCriarTabela);
        return queryCriarTabela;

    }
}