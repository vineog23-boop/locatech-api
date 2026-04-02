
/**
 * Implementação da interface VeiculoRepository.
 * Responsável por executar as operações de banco de dados
 * relacionadas à entidade Veiculo via JdbcClient.
 *
package br.com.fiap.localtech.localtech.repository;
import br.com.fiap.localtech.localtech.entities.Veiculo;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

// @Repository → Spring registra essa classe como bean
// e injeta automaticamente onde VeiculoRepository for declarado
@Repository
public class VeiculoRepositoryImp implements VeiculoRepository {

    private final JdbcClient jdbcCliente;

    public VeiculoRepositoryImp(JdbcClient jdbcCliente) {
        this.jdbcCliente = jdbcCliente;
    }

    @Override
    public Optional<Veiculo> findById(Long id) {
        // SELECT — busca um veículo pelo id
        // .optional() → retorna vazio se não encontrar (evita NullPointerException)
        String sql = """
                SELECT id, marca, modelo, placa, ano, cor, valor_diaria
                FROM veiculos
                WHERE id = :id
                """;
        return jdbcCliente.sql(sql)
                .param("id", id)
                .query(Veiculo.class)
                .optional();
    }

    @Override
    public List<Veiculo> findAll(int size, int offset) {
        // SELECT — busca todos os veículos com paginação
        // size → quantos registros por página
        // offset → a partir de qual registro começa
        String sql = """
                SELECT id, marca, modelo, placa, ano, cor, valor_diaria
                FROM veiculos
                ORDER BY id
                LIMIT :size OFFSET :offset
                """;
        return jdbcCliente.sql(sql)
                .param("size", size)
                .param("offset", offset)
                .query(Veiculo.class)
                .list();
    }

    @Override
    public Integer save(Veiculo veiculo) {
        // INSERT — salva um novo veículo no banco
        // retorna 1 se salvou, 0 se falhou
String sql = """
        INSERT INTO veiculos (marca, modelo, placa, ano, cor, valor_diaria)
        VALUES (:marca, :modelo, :placa, :ano, :cor, :valor_diaria)
        """;

return jdbcCliente.sql(sql)
        .param("marca", veiculo.getMarca())
        .param("modelo", veiculo.getModelo())
        .param("placa", veiculo.getPlaca())
        .param("ano", veiculo.getAno())
        .param("cor", veiculo.getCor())
        .param("valor_diaria", veiculo.getValorDiaria())
        .update();
    }

    @Override
    public Integer update(Veiculo veiculo, Long id) {
        // UPDATE — atualiza todos os campos do veículo pelo id
        // retorna 1 se atualizou, 0 se não encontrou
        String sql = """
                UPDATE veiculos
                SET marca = :marca,
                    modelo = :modelo,
                    placa = :placa,
                    ano = :ano,
                    cor = :cor,
                    valor_diaria = :valorDiaria
                WHERE id = :id
                """;
        return jdbcCliente.sql(sql).param("marca", veiculo.getMarca()).param("modelo", veiculo.getModelo())
                .param("placa", veiculo.getPlaca())
                .param("ano", veiculo.getAno())
                .param("cor", veiculo.getCor())
                .param("valorDiaria", veiculo.getValorDiaria())
                .param("id", id)
                .update();
    }

    @Override
    public Integer delete(Long id) {
        // DELETE — remove o veículo pelo id
        // retorna 1 se deletou, 0 se não encontrou
        String sql = """
                DELETE FROM veiculos
                WHERE id = :id
                """;
        return jdbcCliente.sql(sql)
                .param("id", id)
                .update();
    }
}



