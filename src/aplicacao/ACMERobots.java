package aplicacao;
import dados.*;

import java.util.*;

public class ACMERobots {
    private List<Robo> robos;
    private List<Cliente> clientes;
    private List<Locacao> locacoes;

    public ACMERobots() {
        robos = new ArrayList<>();
        clientes = new ArrayList<>();
        locacoes = new ArrayList<>();
        inicializarDados();
    }

    public List<Robo> getRobos() {
        return robos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void inicializarDados() {
        // Robos pré cadastrados
        robos.add(new Domestico(1, "Roomba", 10, 1));
        robos.add(new Industrial(2, "Robotic Arm", 90, "Automação"));
        robos.add(new Agricola(3, "AgriBot", 50, 10, "Colheita"));

        // Clientes pré cadastrados
        clientes.add(new Individual(101, "Maria da Silva", "123.456.789-00"));
        clientes.add(new Empresarial(102, "Empresa XYZ", 2000));
    }

    public void cadastrarLocacao(Locacao locacao) throws Exception {
        for (Locacao loc : locacoes) {
            if (loc.getNumero() == locacao.getNumero())
                throw new Exception("Número de locação já existe.");
        }
        locacoes.add(locacao);
    }
}