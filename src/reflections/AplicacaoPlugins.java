package reflections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.lang.reflect.*;

public class AplicacaoPlugins {
    private static List<FiltroTexto> filtros = new ArrayList<>();

    public static void main(String[] args) throws Exception {
        // Carrega os plugins
        carregarPlugins();

        // Lê o texto do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = scanner.nextLine();

        // Aplica os filtros
        for (FiltroTexto filtro : filtros) {
            texto = filtro.filtrar(texto);
        }

        // Exibe o resultado final
        System.out.println("Resultado: " + texto);
    }

    private static void carregarPlugins() throws Exception {
        // Procura as classes dos plugins no diretório "plugins"
        String dirPlugins = "plugins";
        ClassLoader carregador = AplicacaoPlugins.class.getClassLoader();
        for (String nomeClasse : buscarClassesNoDiretorio(dirPlugins)) {
            // Carrega a classe
            Class<?> classe = carregador.loadClass(nomeClasse);
            // Verifica se a classe implementa a interface FiltroTexto
            if (FiltroTexto.class.isAssignableFrom(classe)) {
                // Cria uma instância da classe
                FiltroTexto filtro = (FiltroTexto) classe.getDeclaredConstructor().newInstance();
                // Registra o filtro
                filtros.add(filtro);
                System.out.println("Plugin carregado: " + filtro.getClass().getName());
            }
        }
    }

    private static List<String> buscarClassesNoDiretorio(String diretorio) {
        List<String> nomesClasses = new ArrayList<>();
        String caminho = AplicacaoPlugins.class.getResource(diretorio).getPath();
        for (String nomeArquivo : new java.io.File(caminho).list()) {
            if (nomeArquivo.endsWith(".class")) {
                nomesClasses.add(diretorio.replace('/', '.') + nomeArquivo.substring(0, nomeArquivo.length() - 6));
            }
        }
        return nomesClasses;
    }
}
